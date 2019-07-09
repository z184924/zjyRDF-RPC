package cn.zhangjingyao.serviceimpl.demo;

import cn.zhangjingyao.dao.DaoImpl;
import cn.zhangjingyao.entity.PageData;
import cn.zhangjingyao.service.demo.DemoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 类名称:DemoService
 * 创建时间:2019-04-11
 *
 * @author
 */
@org.apache.dubbo.config.annotation.Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DaoImpl dao;
	
	/**
	 * 新增
	 * @param pd PageData
	 * @throws Exception Exception
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void save(PageData pd)throws Exception{
		dao.save("DemoMapper.save", pd);
	}

	/**
	 * 批量新增
	 * @param list PageData List
	 * @throws Exception Exception
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void save(List<PageData> list)throws Exception{
		for (PageData pd:list) {
			dao.save("DemoMapper.save", pd);
		}
	}

    /**
     * 删除
     * @param pd PageData
     * @throws Exception Exception
     */
    @Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void delete(PageData pd)throws Exception{
		dao.delete("DemoMapper.delete", pd);
	}

    /**
     * 批量删除
     * @param list PageData List
     * @throws Exception Exception
     */
    @Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void delete(List<PageData> list)throws Exception{
        for (PageData pd:list) {
			dao.delete("DemoMapper.delete", pd);
		}
	}

    /**
     * 修改
     * @param pd PageData
     * @throws Exception Exception
     */
	@Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void edit(PageData pd)throws Exception{
		dao.update("DemoMapper.edit", pd);
	}

	/**
	 * 批量修改
     * @param list PageData List
     * @throws Exception Exception
     */
    @Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void edit(List<PageData> list)throws Exception{
        for (PageData pd:list) {
			dao.update("DemoMapper.edit", pd);
		}
	}

    /**
	 * 分页查询
     * @param pd PageData
     * @return PageInfo
     * @throws Exception Exception
     */
	@Override
	public PageInfo<PageData> listPage(PageData pd)throws Exception{
        PageHelper.startPage(pd.getInt("pageNum"),pd.getInt("pageSize"));
        List<PageData> list = (List<PageData>) dao.findForList("DemoMapper.listAll", pd);
        return new PageInfo(list);
	}

    /**
     * 查询(全部)
     * @param pd PageData
     * @return PageData List
     * @throws Exception Exception
     */
	@Override
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("DemoMapper.listAll", pd);
	}

    /**
     * 通过id获取数据
     * @param pd PageData
     * @return PageData
     * @throws Exception Exception
     */
	@Override
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("DemoMapper.findById", pd);
	}

    /**
     * 批量删除
     * @param arrayDataIds Id数组
     * @throws Exception Exception
     */
    @Override
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	public void deleteAll(String[] arrayDataIds)throws Exception{
		dao.delete("DemoMapper.deleteAll", arrayDataIds);
	}
	
}

