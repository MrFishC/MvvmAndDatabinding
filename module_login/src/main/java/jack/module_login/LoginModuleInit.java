package jack.module_login;

import android.app.Application;

import jack.library_base.base.IModuleInit;
import me.goldze.mvvmhabit.utils.KLog;

/**
 * created by Jack
 * email:yucrun@163.com
 * date:19-4-16
 * describe:业务模块module-login初始化
 */
public class LoginModuleInit implements IModuleInit {

    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("业务模块初始化 -- login - onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("业务模块初始化 -- login -onInitLow");
        return false;
    }
}
