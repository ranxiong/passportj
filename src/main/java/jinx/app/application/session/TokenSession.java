package jinx.app.application.session;

import jinx.app.application.ISession;

import java.util.UUID;

/**
 * Created by Administrator on 2016/1/19.
 */
public class TokenSession implements ISession{
    @Override
    public String getSessionId() {
        return UUID.randomUUID().toString();
    }
}
