package cn.zhangjingyao.service.demo;

import cn.zhangjingyao.entity.PageData;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 类名称:DemoService
 * 创建时间:2019-04-11
 *
 * @author
 */
@org.springframework.stereotype.Service
public interface DemoService {

	/**
	 * 新增
	 * @param pd PageData
	 * @throws Exception Exception
	 */
	public void save(PageData pd)throws Exception;

	/**
	 * 批量新增
	 * @param list PageData List
	 * @throws Exception Exception
	 */
	public void save(List<PageData> list)throws Exception;

    /**
     * 删除
     * @param pd PageData
     * @throws Exception Exception
     */
	public void delete(PageData pd)throws Exception;

    /**
     * 批量删除
     * @param list PageData List
     * @throws Exception Exception
     */
	public void delete(List<PageData> list)throws Exception;

    /**
     * 修改
     * @param pd PageData
     * @throws Exception Exception
     */
	public void edit(PageData pd)throws Exception;

	/**
	 * 批量修改
     * @param list PageData List
     * @throws Exception Exception
     */
	public void edit(List<PageData> list)throws Exception;

    /**
	 * 分页查询
     * @param pd PageData
     * @return PageInfo
     * @throws Exception Exception
     */
	public PageInfo<PageData> listPage(PageData pd)throws Exception;

    /**
     * 查询(全部)
     * @param pd PageData
     * @return PageData List
     * @throws Exception Exception
     */
	public List<PageData> listAll(PageData pd)throws Exception;

    /**
     * 通过id获取数据
     * @param pd PageData
     * @return PageData
     * @throws Exception Exception
     */
	public PageData findById(PageData pd)throws Exception;

    /**
     * 批量删除
     * @param arrayDataIds Id数组
     * @throws Exception Exception
     */
	public void deleteAll(String[] arrayDataIds)throws Exception;
	
}

