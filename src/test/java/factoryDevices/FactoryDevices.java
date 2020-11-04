package factoryDevices;

/**
 * @autor : eynar.pari
 * @date : 17/10/2020.
 **/
public class FactoryDevices {

      public static IDevice make(String type){
          IDevice device;

          switch (type.toLowerCase()){
              case "android":
                  device= new Android();
                  break;
              case "ios":
                  device= new IOS();
                  break;
              case "windowsphone":
                  device=new WindowsPhone();
                    break;
              case "browserstack":
                  device= new BrowserStackAndroid();
                  break;
              case "whendo":
                  device= new AndroidWhenDo();
                  break;
              default:
                  device= new Android();
                  break;
          }
          return device;
      }
}
