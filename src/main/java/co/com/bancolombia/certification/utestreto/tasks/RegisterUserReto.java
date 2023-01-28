package co.com.bancolombia.certification.utestreto.tasks;

import co.com.bancolombia.certification.utestreto.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class RegisterUserReto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("juan").into(Personal.FIRTSNAME),
                SendKeys.of("marin").into(Personal.LASTNAME),
                SendKeys.of("yo@hotmail.com").into(Personal.EMAIL),
                SendKeys.of("July").into(Personal.MONTH),
                SendKeys.of("5").into(Personal.DAY),
                SendKeys.of("1999").into(Personal.YEAR),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SISTEMA),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAJE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BOTTONLASTFINAL),
                SendKeys.of("qwerasdf1234*").into(Complete.PASSWORD),
                SendKeys.of("qwerasdf1234*").into(Complete.CONFIRPASSWORD),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.BUTTONCOMPLETE)
        );
    }
    public static RegisterUserReto makeinformation() {
        return instrumented(RegisterUserReto.class);
    }
}
