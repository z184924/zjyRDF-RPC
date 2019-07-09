package cn.zhangjingyao.dao;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author
 */
public interface DAO {
	
	/**
	 * 保存对象
	 * @param str Mapper名及sql名 eg: DemoMapper.save
	 * @param obj 传入sql的对象
	 * @return sql执行后的返回对象
	 * @throws Exception Exception
	 */
	public Object save(String str, Object obj) throws Exception;
	
	/**
	 * 修改对象
	 * @param str Mapper名及sql名 eg: DemoMapper.update
	 * @param obj 传入sql的对象
	 * @return sql执行后的返回对象
	 * @throws Exception Exception
	 */
	public Object update(String str, Object obj) throws Exception;
	
	/**
	 * 删除对象 
	 * @param str Mapper名及sql名 eg: DemoMapper.delete
	 * @param obj 传入sql的对象
	 * @return sql执行后的返回对象
	 * @throws Exception Exception
	 */
	public Object delete(String str, Object obj) throws Exception;

	/**
	 * 查找对象(单行结果)
	 * @param str Mapper名及sql名 eg: DemoMapper.findById
	 * @param obj 传入sql的对象
	 * @return sql执行后的结果
	 * @throws Exception Exception
	 */
	public Object findForObject(String str, Object obj) throws Exception;

	/**
	 * 查找对象(多行结果)
	 * @param str Mapper名及sql名 eg: DemoMapper.findByName
	 * @param obj 传入sql的对象
	 * @return sql执行后的结果
	 * @throws Exception Exception
	 */
	public Object findForList(String str, Object obj) throws Exception;

	/**
	 * 查找对象封装成Map
	 * @param sql sql
	 * @param obj 传入sql的对象
	 * @param key mapKey
	 * @return 查询结果Map
	 * @throws Exception Exception
	 */
	public Object findForMap(String sql, Object obj, String key) throws Exception;

	/**
	 * 整合新增
	 * @param paramString 参数名
	 * @param paramList	参数列表
	 * @throws Exception Exception
	 */
	public abstract void batchInsert(String paramString, List paramList)throws Exception;
	
}
