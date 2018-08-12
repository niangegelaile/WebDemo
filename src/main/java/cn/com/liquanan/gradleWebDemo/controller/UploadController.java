package cn.com.liquanan.gradleWebDemo.controller;


import cn.com.liquanan.gradleWebDemo.common.Constant;
import cn.com.liquanan.gradleWebDemo.common.HttpResult;
import cn.com.liquanan.gradleWebDemo.utils.PropertyUtil;
import org.apache.commons.fileupload.FileUploadException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/uploadPic")
    @ResponseBody
    public HttpResult<Boolean> uploadPic(
            @RequestParam MultipartFile pic)
            throws IllegalStateException, IOException {
        if (!pic.isEmpty()) {
            String path = PropertyUtil.getProperty(Constant.diskImagePath);
            String originalFileName = pic.getOriginalFilename();
            // 新的图片名称
            String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
            // 新的图片
            File newFile = new File(path + newFileName);
            // 将内存中的数据写入磁盘
            pic.transferTo(newFile);
        }
        HttpResult<Boolean> result=new HttpResult<>();
        result.setResult(true);
        return result;
    }
}
