package cn.zhangjingyao.service.system;

import cn.zhangjingyao.entity.PageData;
import cn.zhangjingyao.entity.system.User;
import com.github.pagehelper.PageInfo;

import java.util.List;


/**
 * @author
 */
@org.springframework.stereotype.Service
public interface UserService {

	/**
	 * 通过用户名密码获取数据
	 */
	public User loginUser(PageData pd)throws Exception;

	/**
	 * 新增
	 * @param pd
	 * @throws Exception
	 */
	public boolean save(PageData pd)throws Exception;

	/**
	 * 批量新增
	 * @param list
	 * @throws Exception
	 */
	public Boolean save(List<PageData> list)throws Exception;

	/**
	 * 删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception;

	/**
	 * 批量删除
	 * @param list
	 * @throws Exception
	 */
	public void delete(List<PageData> list)throws Exception;

	/**
	 * 修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception;

	/**
	 * 批量修改
	 * @param list
	 * @throws Exception
	 */
	public void edit(List<PageData> list)throws Exception;

	/**
	 * 分页查询
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageInfo<PageData> listPage(PageData pd)throws Exception;

	/**
	 * 查询(全部)
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAll(PageData pd)throws Exception;

	/**
	 * 通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception;

	/**
	 * 通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findById(String userId)throws Exception;

	/**
	 * 通过account获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByAccount(PageData pd)throws Exception;

	/**
	 * 通过account获取数据
	 * @param account
	 * @return
	 * @throws Exception
	 */
	public PageData findByAccount(String account)throws Exception;

	/**
	 * 批量删除
	 * @param arrayDataIds
	 * @throws Exception
	 */
	public void deleteAll(String[] arrayDataIds)throws Exception;

}

