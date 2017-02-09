package test.Service;

import org.springframework.stereotype.Service;

/**
 * Created by Leith on 2017/2/8.
 */
@Service
public interface UserService {
    public boolean login(String username,String password);
}
