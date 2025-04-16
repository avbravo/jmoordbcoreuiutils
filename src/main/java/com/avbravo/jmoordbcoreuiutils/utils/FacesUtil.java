/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.jmoordbcoreuiutils.utils;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

/**
 *
 * @author avbravo
 */
@Named
@RequestScoped
public class FacesUtil {
 private static String opertativeSystem = System.getProperty("os.name").toLowerCase();
    /**
     * Creates a new instance of JakartaFacesUtil
     */
 

    public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }

    public void showInfo(String msg) {
        addMessage(FacesMessage.SEVERITY_INFO, "Info Message", msg);
    }

    public void showWarn(String msg) {
        addMessage(FacesMessage.SEVERITY_WARN, "Warn Message", msg);
    }

    public void showError(String msg) {
        addMessage(FacesMessage.SEVERITY_ERROR, "Error Message", msg);
    }

    public void showSticky(String msg) {
        FacesContext.getCurrentInstance().addMessage("sticky-key", new FacesMessage(FacesMessage.SEVERITY_INFO, "Sticky Message", msg));
    }

    
       // <editor-fold defaultstate="collapsed" desc="nameOfClassAndMethod()">
    public static String nameOfClassAndMethod() {
        final StackTraceElement e = Thread.currentThread().getStackTrace()[2];
        final String s = e.getClassName();
        return s.substring(s.lastIndexOf('.') + 1, s.length()) + "." + e.getMethodName();
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="nameOfClass()">

    public static String nameOfClass() {
        final StackTraceElement e = Thread.currentThread().getStackTrace()[2];
        final String s = e.getClassName();
        return s.substring(s.lastIndexOf('.') + 1, s.length());
    }    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="nameOfMethod()">
    public static String nameOfMethod() {
        final StackTraceElement e = Thread.currentThread().getStackTrace()[2];
        final String s = e.getClassName();
        return e.getMethodName();
    }
    // </editor-fold>
    
    
       // <editor-fold defaultstate="collapsed" desc="isWindows()">
    /*
    Implementado desde el ejemplo de Mkyong
    https://mkyong.com/java/how-to-detect-os-in-java-systemgetpropertyosname/
     */
    public static boolean isWindows() {

        return (opertativeSystem.indexOf("win") >= 0);

    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="isMac()">
    public static boolean isMac() {

        return (opertativeSystem.indexOf("mac") >= 0);

    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="boolean isLinux()">
    public static boolean isLinux() {

        return (opertativeSystem.indexOf("nix") >= 0 || opertativeSystem.indexOf("nux") >= 0 || opertativeSystem.indexOf("aix") > 0);

    }
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="boolean isSolaris()">
    public static boolean isSolaris() {

        return (opertativeSystem.indexOf("sunos") >= 0);

    }
    // </editor-fold>
    
      public static String userHome() {
        return System.getProperty("user.home");

    }
      

}
