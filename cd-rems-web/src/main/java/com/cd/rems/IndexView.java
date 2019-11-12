package com.cd.rems;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: IndexView
 * @Description:
 * @Author 谢修继
 * @Copyright: Copyright (c) 2018
 * @Company:成都信通网易医疗科技发展有限公司
 * @Date 2018/9/21 14:55
 */
@Configuration
public class IndexView implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/pages/main.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
