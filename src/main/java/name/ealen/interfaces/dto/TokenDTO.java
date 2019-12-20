package name.ealen.interfaces.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by EalenXie on 2018/11/26 18:49.
 * DTO 返回值token对象
 */
@Data
public class TokenDTO {
    private String token;

    public TokenDTO() {
    }

    public TokenDTO(String token) {
        this.token = token;
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
