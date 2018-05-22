package com.springboot.jwt.integration.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * Created by nydiarra on 06/05/17.
 */
@Configuration
public class AdditionalWebConfig/* extends WebSecurityConfigurerAdapter */ {
    /**
     * Allowing all origins, headers and methods here is only intended to keep this example simple. This is not a default recommended configuration. Make adjustments as necessary to your use case.
     *
     */
    @Bean
    public FilterRegistrationBean corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }

    // @Bean
    // public TokenStore tokenStore() {
    // return new InMemoryTokenStore();
    // }
    //
    // @Bean
    // protected JwtAccessTokenConverter jwtTokenEnhancer() {
    // JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
    // Resource resource = new ClassPathResource("public.cert");
    // String publicKey = null;
    // try {
    // publicKey = new String(FileCopyUtils.copyToByteArray(resource.getInputStream()));
    // }
    // catch (IOException e) {
    // throw new RuntimeException(e);
    // }
    // converter.setVerifierKey(publicKey);
    // return converter;
    // }
    //
    // @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    // @Override
    // public AuthenticationManager authenticationManagerBean() throws Exception {
    // return super.authenticationManagerBean();
    // }
}
