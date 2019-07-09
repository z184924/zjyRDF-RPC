package cn.zhangjingyao.service.system;

import cn.zhangjingyao.entity.PageData;
import com.github.pagehelper.PageInfo;

import java.util.List;


/**
 * @author
 */
@org.springframework.stereotype.Service
public interface RoleService {
    /**
     * 新增
     *
     * @param pd
     * @throws Exception
     */
    public void save(PageData pd) throws Exception;

    /**
     * 批量新增
     *
     * @param list
     * @throws Exception
     */
    public void save(List<PageData> list) throws Exception;

    /**
     * 删除
     *
     * @param pd
     * @throws Exception
     */
    public void delete(PageData pd) throws Exception;

    /**
     * 批量删除
     *
     * @param list
     * @throws Exception
     */
    public void delete(List<PageData> list) throws Exception;

    /**
     * 修改
     *
     * @param pd
     * @throws Exception
     */
    public void edit(PageData pd) throws Exception;

    /**
     * 批量修改
     *
     * @param list
     * @throws Exception
     */
    public void edit(List<PageData> list) throws Exception;

    /**
     * 分页查询
     *
     * @param pd
     * @return
     * @throws Exception
     */
    public PageInfo<PageData> listPage(PageData pd) throws Exception;

    /**
     * 查询(全部)
     *
     * @param pd
     * @return
     * @throws Exception
     */
    public List<PageData> listAll(PageData pd) throws Exception;

    /**
     * 通过id获取数据
     *
     * @param pd
     * @return
     * @throws Exception
     */
    public PageData findById(PageData pd) throws Exception;

    /**
     * 批量删除
     *
     * @param arrayDataIds
     * @throws Exception
     */
    public void deleteAll(String[] arrayDataIds) throws Exception;

    /**
     * 查询用户角色关系
     *
     * @param pd
     * @return
     * @throws Exception
     */
    public List<PageData> listUserRole(PageData pd) throws Exception;

    /**
     * 编辑用户角色关系
     *
     * @throws Exception
     */
    public void editUserRole(String roleId, List<PageData> list) throws Exception;

    /**
     * 查询角色权限关系
     *
     * @param pd
     * @return
     * @throws Exception
     */
    public List<PageData> listRoleRights(PageData pd) throws Exception;

    /**
     * 编辑角色权限关系
     *
     * @throws Exception
     */
    public void editRoleRights(String roleId, List<PageData> list) throws Exception;

    /**
     * 查询用户权限关系
     *
     * @param pd
     * @return
     * @throws Exception
     */
    public List<PageData> listUserRights(PageData pd) throws Exception;

    /**
     * 查询用户权限关系
     *
     * @param userId
     * @return
     * @throws Exception
     */
    public List<PageData> listUserRights(String userId) throws Exception;
}

