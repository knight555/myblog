package com.boom.myblog.config;

import com.boom.myblog.utils.PropertiesUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {


    /**
     * 属性配置
     */
    private static PropertiesUtils pro = PropertiesUtils.getInstance();
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {


        //和页面有关的静态目录都放在项目的static目录下
//        registry.addResourceHandler("/static/**").addResourceLocations("E:\\awesome-linchangzhi\\target\\");
        //上传的图片在D盘下的OTA目录下，访问路径如：http://localhost:8081/OTA/d3cf0281-bb7f-40e0-ab77-406db95ccf2c.jpg
        //其中OTA表示访问的前缀。"file:D:/OTA/"是文件真实的存储路径
        registry.addResourceHandler("/static/**").addResourceLocations("file:"+pro.getStaticResource());
//        System.out.println("file:" + pro.getAttachmentPath());
        registry.addResourceHandler("/OTA/**").addResourceLocations("file:" + pro.getOriginImagePath());
        registry.addResourceHandler("/OTA_th/**").addResourceLocations("file:" + pro.getThumbnailImagePath());
    }
}