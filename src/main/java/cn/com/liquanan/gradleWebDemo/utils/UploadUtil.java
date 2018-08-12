package cn.com.liquanan.gradleWebDemo.utils;

import cn.com.liquanan.gradleWebDemo.common.Constant;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UploadUtil {

    public static String  upload(MultipartFile pic) throws IOException {
        String savePath="";
        if (!pic.isEmpty()) {
            String path = PropertyUtil.getProperty(Constant.diskImagePath);
            String originalFileName = pic.getOriginalFilename();
            // 新的图片名称
            String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
            // 新的图片
            File newFile = new File(path + newFileName);
            // 将内存中的数据写入磁盘
            pic.transferTo(newFile);
            savePath="/image/"+newFileName;
        }

        return savePath;
    }




}
