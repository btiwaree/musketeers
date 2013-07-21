
import java.awt.*;


///////////////////////////////////////////////////////////////////////////////
//class: CAppData
//

public class CAppData {
   //LookAndFeel constants
   public static final int LF_SYSTEM = 0;
   public static final int LF_WINDOWS = 1;
   public static final int LF_JAVA = 2;
   public static final int LF_MOTIF = 3;
   public static final int LF_MAC = 4;

   public static boolean bDevelop = false;

   // application name, version date, copyright, ...
   private static String strCopyright = "\u00A9 2012-2013 IAV GmbH, Chemnitz";
   private static String strAppName = "ReferenceTester";
   private static String strAppFullName = "ReferenceTester";
   private static String strVersion = "0.3";
   private static int iSubVersion = 4;
   private static int iCompile = 6938;
   private static String strDate = "2013-07-16";

   // flag indicating if the model contains unsaved changes
   private static boolean bModelNeedsToBeSaved = false;

   /** The main frame of the application.*/
   private static Frame frameMain = null;

   private static String strAppExt = "";
   private static String strAppHome = "";
   private static String strUserHome = "";

   private static boolean bTestMode = false;
   private static boolean bTestModeStarded = false;

   /** a file to be loaded at the beginning. */
   private static String strLoadFile = null;

   /** The session object. */

   /** The docking framework manager.*/

   /** The type of the look and feel.*/
   public static int iLAFType = 0;

   /** Is redirecting of the console to dialog/file enabled/disabled. */
   public static boolean bEnableConsole = false;

   /** The applications main component color and font.*/
   private static Color colorApp = null;
   private static Font fontApp = new java.awt.Font("SansSerif", 0, 12);

   private static String strLicenseUpdate;
   private static boolean bStandAlone = true;

   /** True, if the configuration is to be saved versionized.*/
   private static boolean bVersionizedConfig = false;

   /* internationalization */

   /* the exception manager */

   public static boolean IsTestMode () {
      return bTestMode;
   }

   public static void SetTestMode (final boolean bMode) {
      bTestMode = bMode;
   }

   /**
    * @return the bTestModeStarded
    */
   public static boolean isTestModeStarded () {
      return bTestModeStarded;
   }

   /**
    * @param bTestModeStarded the bTestModeStarded to set
    */
   public static void setTestModeStarded (final boolean bStart) {
      bTestModeStarded = bStart;
   }

   /**
    * Contains model unsaved changes.
    * @return
    */
   public static boolean UnsavedChanges () {
      return bModelNeedsToBeSaved;
   }

   /** The applications name.*/
   public static String AppName () {
      return AppName(false);
   }

   /** The applications Name with optional complete version information.*/
   public static String AppName (final boolean bShowVersion) {
      return strAppName + " " + Version() + (bShowVersion ? "." + SubVersion() : "") + strAppExt;
   }

   /** The long name of the application.*/
   public static String AppFullName () {
      return strAppFullName + " [" + strAppName + "]";
   }

   public static String GetAppVersion () {
      return strVersion + "." + iSubVersion + "." + iCompile;
   }

   public static String AppVersionDate () {
      return strDate;
   }

   /** The copyright information text.*/
   public static String Copyright () {
      return strCopyright;
   }

   /** The version information of this application.*/
   public static String Version () {
      return strVersion;
   }

   /** The subversion information of this application.*/
   public static String SubVersion () {
      return iSubVersion + "." + iCompile;
   }

   /** Init the applications main frame.*/
   public static void InitAppFrame (final Frame frame) {
      frameMain = frame;
   }

   /** Returns the applications main frame.*/
   public static Frame AppFrame () {
      return frameMain;
   }

   /** Returns the applications main frame.*/
   public static void AppFrame (final Frame frame) {
      frameMain = frame;
   }

   /** The applications home directory.*/
   public static String AppHome () {
      return strAppHome;
   }

   /** Returns the applications user directory.*/
   public static String UserHome () {
      return strUserHome;
   }

   /** Sets the applications user directory.*/
   public static void UserHome (final String string) {
      strUserHome = string;
   }

   /** The application id number (IAV internal).*/
   public static String AppID () {
      // TODO insert app id
      return "0029";
   }

   /** A file name to be loaded at the beginning or <code>null</code>.*/
   public static String LoadFile () {
      return strLoadFile;
   }

   /** The applications main component color.*/
   public static Color AppColor () {
      if (colorApp == null) {
         return SystemColor.control;
      }
      else {
         return colorApp;
      }
   }

   /** Returns the applications font.*/
   public static Font AppFont () {
      return fontApp;
   }

   /** Returns the token for the license update.*/
   public static String LicenseUpdate () {
      return strLicenseUpdate;
   }

   /** True, if it is embedded in the et.*/
   public static boolean StandAlone () {
      return bStandAlone;
   }

   /** True, if config data must be saved versionized.*/
   public static boolean IsVersionizedConfig () {
      return bVersionizedConfig;
   }

}
