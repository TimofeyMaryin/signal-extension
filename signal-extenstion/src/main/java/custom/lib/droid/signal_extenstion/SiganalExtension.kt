package custom.lib.droid.signal_extenstion

import android.content.Context
import com.onesignal.OneSignal
import custom.lib.droid.decrypt_helper.EncryptionHelper


object SignalExtension {
    fun setSignal(
        context: Context,
        value: String,
    ) {
        if (value.length == 36) {
            OneSignal.initWithContext(context)
            OneSignal.setAppId(value)
            OneSignal.unsubscribeWhenNotificationsAreDisabled(true)
        } else {
            throw Throwable("Введите корректные данные. Строка должна быть следующего формата: 8e66r1e8-7ec0-4151-n84e-e9434cf754c7")
        }
    }


    fun setSignalEncrypt(
        context: Context,
        value: String,
    ) {
        if (value.length == 36) {
            throw Throwable("Введите корректные данные. Строка должна быть зашифрована!")
        }
        OneSignal.initWithContext(context)
        OneSignal.setAppId(EncryptionHelper.decrypt(value, EncryptionHelper.secretKey))
        OneSignal.unsubscribeWhenNotificationsAreDisabled(true)
    }


}