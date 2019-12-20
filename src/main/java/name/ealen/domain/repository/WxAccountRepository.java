package name.ealen.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import name.ealen.domain.entity.WxAccount;

public interface WxAccountRepository extends JpaRepository<WxAccount, Integer>{

    /**
     * 根据OpenId查询用户信息
     */
    WxAccount findByWxOpenid(String wxOpenId);
}
