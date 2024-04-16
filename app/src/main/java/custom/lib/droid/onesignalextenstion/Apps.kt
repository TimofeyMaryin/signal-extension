package custom.lib.droid.onesignalextenstion

import android.app.Application
import custom.lib.droid.decrypt_helper.EncryptionHelper
import custom.lib.droid.signal_extenstion.SignalExtension

class Apps: Application() {

    override fun onCreate() {
        super.onCreate()

        SignalExtension.setSignalEncrypt(
            context = this.applicationContext,
            value = EncryptionHelper.encrypt("98e3d9b8-ed89-4a8e-9e84-85773d32c5c1")
        )
    }

}