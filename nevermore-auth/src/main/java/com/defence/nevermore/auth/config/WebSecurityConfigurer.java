package com.defence.nevermore.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Description: springSecurity 配置类
 * @Author:
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable() //禁用跨站csrf攻击防御
                .formLogin()
                    .loginPage("/loginIndex")//用户未登录时，访问任何资源都转跳到该路径，即登录页面
                    .loginProcessingUrl("/login")//登录表单form中action的地址，也就是处理认证请求的路径
                    .defaultSuccessUrl("/index")//登录认证成功后默认转跳的路径
                .and()
                .authorizeRequests()
                    .antMatchers("/loginIndex","/login").permitAll()//不需要通过登录验证就可以被访问的资源路径
                    .antMatchers("/biz1").hasAnyAuthority("biz1")  //前面是资源的访问路径、后面是资源的名称或者叫资源ID
                    .antMatchers("/biz2").hasAnyAuthority("biz2")
                    .antMatchers("/syslog").hasAnyAuthority("syslog")
                    .antMatchers("/sysuser").hasAnyAuthority("sysuser")
                    .anyRequest().authenticated();


//        http.
//                formLogin(formLogin ->
//                        formLogin.loginPage("/loginIndex").loginProcessingUrl("/login").permitAll())
//                .logout(logout ->
//                        logout.logoutUrl("/logout"))
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests.antMatchers("/login").permitAll()
//                );


    }


//    @Autowired
//    private CustomUserDetailService customUserDetailService;
//
//    @Override
//    public UserDetailsService userDetailsServiceBean() throws Exception {
//        return customUserDetailService;
//    }
//
//    @Override
//    protected UserDetailsService userDetailsService() {
//        return customUserDetailService;
//    }


    //    @Bean
//    public AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setPasswordEncoder(passwordEncoder());
//        authenticationProvider.setUserDetailsService(customUserDetailsService());
//        return authenticationProvider;
//    }
//
//
//
//
//    @Bean
//    public UserDetailsService customUserDetailsService() {
//        return new CustomUserDetailService();
//    }


   */

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("123456")).authorities("ROLE_admin");
//        auth.inMemoryAuthentication().withUser("user").password(passwordEncoder().encode("123456")).roles("user");
//    }



}
