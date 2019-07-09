package cn.zhangjingyao.security.service;

import cn.zhangjingyao.entity.PageData;
import cn.zhangjingyao.service.system.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Reference
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        User user = null;
        try {
            PageData searchPd = new PageData();
            searchPd.put("account", account);
            PageData userPageData = userService.findByAccount(searchPd);
            cn.zhangjingyao.entity.system.User entityUser = new cn.zhangjingyao.entity.system.User(userPageData);
            user = new User(entityUser.getAccount(), entityUser.getPassword(), !entityUser.getDisable(), true, true, !entityUser.getLocked(), AuthorityUtils.commaSeparatedStringToAuthorityList(entityUser.getSpecialRole()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
