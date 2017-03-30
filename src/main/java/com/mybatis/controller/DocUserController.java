package com.mybatis.controller;

import com.mybatis.service.DocUserService;
import com.utils.model.Pageable;
import com.utils.vo.ResponsePageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/6
 * Time: 15:45
 */
@Controller
@RequestMapping("/user")
public class DocUserController extends  BaseController{

    @Autowired
    private DocUserService docUserService;

    @RequestMapping("/list")
    public ModelAndView pageList() {
        ModelAndView model = new ModelAndView("/user/list");
        return model;
    }

    @RequestMapping("/list_json")
    @ResponseBody
    public ResponsePageVo listJson(
            Pageable pageable) {
        try {
            return ResponsePageVo.success(docUserService.findPageByPageable(pageable));
        } catch (Exception e) {
            logger.error("分页错误", e);
            return ResponsePageVo.failed("分页错误");
        }
    }
}
