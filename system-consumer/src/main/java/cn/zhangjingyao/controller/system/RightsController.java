package cn.zhangjingyao.controller.system;

import cn.zhangjingyao.controller.base.BaseController;
import cn.zhangjingyao.entity.PageData;
import cn.zhangjingyao.service.system.RightsService;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 类名称：RightsController
 * 创建时间：2019-03-05
 *
 * @author
 */
@Controller
@RequestMapping(value = "/rights")
public class RightsController extends BaseController {

    @Reference
    private RightsService rightsService;

    /**
     * 新增或编辑
     */
    @ResponseBody
    @RequestMapping(value = "/saveOrUpdate", produces = "application/json;charset=UTF-8")
    public String saveOrUpdate() throws Exception {
        logger.info("新增或编辑Rights");
        PageData pd = this.getPageData();
        if (pd.get("rightsId") == null || "".equals(pd.get("rightsId")) || 0 == pd.getInt("rightsId")) {
            //替换字段
            pd = this.replaceAttribute(pd);
            this.rightsService.save(pd);
        } else {
            //替换字段
            pd = this.replaceAttribute(pd);
            this.rightsService.edit(pd);
        }
        return this.jsonContent("success", "保存成功");
    }

    /**
     * 新增
     */
    @ResponseBody
    @RequestMapping(value = "/save", produces = "application/json;charset=UTF-8")
    public String save() throws Exception {
        logger.info("新增Rights");
        PageData pd = this.getPageData();
        //替换字段
        pd = this.replaceAttribute(pd);
        this.rightsService.save(pd);
        return this.jsonContent("success", "保存成功");
    }

    /**
     * 删除
     */
    @ResponseBody
    @RequestMapping(value = "/delete", produces = "application/json;charset=UTF-8")
    public String delete() throws Exception {
        logger.info("删除Rights");
        PageData pd = this.getPageData();
        rightsService.delete(pd);
        return this.jsonContent("success", "删除成功");
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping(value = "/edit", produces = "application/json;charset=UTF-8")
    public String edit() throws Exception {
        logger.info("修改Rights");
        PageData pd = this.getPageData();
        //替换字段
        pd = this.replaceAttribute(pd);
        this.rightsService.edit(pd);
        return this.jsonContent("success", "保存成功");
    }

    /**
     * 分页查询列表
     *
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/listPage", produces = "application/json;charset=UTF-8")
    public Object listPage() throws Exception {
        logger.info("获取Rights列表Json");
        PageData pd = this.getPageData();
        // 分页查询列表
        PageInfo<PageData> pageInfo = this.rightsService.listPage(pd);
        return this.jsonContent("success", pageInfo);
    }

    /**
     * 根据ID查询单条数据
     */
    @RequestMapping(value = "/findById", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object findById() throws Exception {
        logger.info("根据ID获取Rights数据");
        PageData pd = this.getPageData();
        PageData resultPD = this.rightsService.findById(pd);
        return this.jsonContent("success", resultPD);
    }

    /**
     * 替换字段
     *
     * @param pd
     * @return 替换后PageData
     * @throws Exception
     */
    private PageData replaceAttribute(PageData pd) throws Exception {
        return pd;
    }
}
