package cn.com.liquanan.gradleWebDemo.controller;


import cn.com.liquanan.gradleWebDemo.common.Constant;
import cn.com.liquanan.gradleWebDemo.common.HttpResult;
import cn.com.liquanan.gradleWebDemo.utils.PropertyUtil;
import cn.com.liquanan.gradleWebDemo.utils.UploadUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


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
        String path = UploadUtil.upload(pic);
        HttpResult<Boolean> result = new HttpResult<>();
        result.setResult(true);
        return result;
    }
}
