---
title: "FontNotSupportedOperationException"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt eine nicht unterstützte Operationsausnahme dar."
type: docs
weight: 45
url: /de/java/com.aspose.font/fontnotsupportedoperationexception/
---
**Inheritance:**
java.lang.Object, java.lang.Throwable, java.lang.Exception, java.lang.RuntimeException, java.lang.IllegalStateException, [com.aspose.font.FontException](../../com.aspose.font/fontexception)
```
public class FontNotSupportedOperationException extends FontException
```

Stellt eine nicht unterstützte Operationsausnahme dar. Die Ausnahme kann ausgelöst werden, wenn eine Operation für einen bestimmten Schriftarttyp nicht unterstützt wird.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FontNotSupportedOperationException()](#FontNotSupportedOperationException--) | Initialisiert ein neues FontNotSupportedOperationException-Objekt. |
| [FontNotSupportedOperationException(String message)](#FontNotSupportedOperationException-java.lang.String-) | Initialisiert ein neues FontNotSupportedOperationException-Objekt. |
| [FontNotSupportedOperationException(String message, RuntimeException innerException)](#FontNotSupportedOperationException-java.lang.String-java.lang.RuntimeException-) | Initialisiert ein neues FontNotSupportedOperationException-Objekt. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addSuppressed(Throwable arg0)](#addSuppressed-java.lang.Throwable-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fillInStackTrace()](#fillInStackTrace--) |  |
| [getCause()](#getCause--) |  |
| [getClass()](#getClass--) |  |
| [getLocalizedMessage()](#getLocalizedMessage--) |  |
| [getMessage()](#getMessage--) |  |
| [getStackTrace()](#getStackTrace--) |  |
| [getSuppressed()](#getSuppressed--) |  |
| [hashCode()](#hashCode--) |  |
| [initCause(Throwable arg0)](#initCause-java.lang.Throwable-) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [printStackTrace()](#printStackTrace--) |  |
| [printStackTrace(PrintStream arg0)](#printStackTrace-java.io.PrintStream-) |  |
| [printStackTrace(PrintWriter arg0)](#printStackTrace-java.io.PrintWriter-) |  |
| [setStackTrace(StackTraceElement[] arg0)](#setStackTrace-java.lang.StackTraceElement---) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontNotSupportedOperationException() {#FontNotSupportedOperationException--}
```
public FontNotSupportedOperationException()
```


Initialisiert ein neues FontNotSupportedOperationException-Objekt.

### FontNotSupportedOperationException(String message) {#FontNotSupportedOperationException-java.lang.String-}
```
public FontNotSupportedOperationException(String message)
```


Initialisiert ein neues FontNotSupportedOperationException-Objekt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Nachricht | java.lang.String | Eine Nachricht, die den Fehler beschreibt. |

### FontNotSupportedOperationException(String message, RuntimeException innerException) {#FontNotSupportedOperationException-java.lang.String-java.lang.RuntimeException-}
```
public FontNotSupportedOperationException(String message, RuntimeException innerException)
```


Initialisiert ein neues FontNotSupportedOperationException-Objekt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Nachricht | java.lang.String | Eine Nachricht, die den Fehler beschreibt. |
| innerException | java.lang.RuntimeException | Die Ausnahme, die die aktuelle Ausnahme verursacht. |

### addSuppressed(Throwable arg0) {#addSuppressed-java.lang.Throwable-}
```
public final synchronized void addSuppressed(Throwable arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Throwable |  |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fillInStackTrace() {#fillInStackTrace--}
```
public synchronized Throwable fillInStackTrace()
```




**Returns:**
java.lang.Throwable
### getCause() {#getCause--}
```
public synchronized Throwable getCause()
```




**Returns:**
java.lang.Throwable
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getLocalizedMessage() {#getLocalizedMessage--}
```
public String getLocalizedMessage()
```




**Returns:**
java.lang.String
### getMessage() {#getMessage--}
```
public String getMessage()
```




**Returns:**
java.lang.String
### getStackTrace() {#getStackTrace--}
```
public StackTraceElement[] getStackTrace()
```




**Returns:**
java.lang.StackTraceElement[]
### getSuppressed() {#getSuppressed--}
```
public final synchronized Throwable[] getSuppressed()
```




**Returns:**
java.lang.Throwable[]
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### initCause(Throwable arg0) {#initCause-java.lang.Throwable-}
```
public synchronized Throwable initCause(Throwable arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Throwable |  |

**Returns:**
java.lang.Throwable
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### printStackTrace() {#printStackTrace--}
```
public void printStackTrace()
```




### printStackTrace(PrintStream arg0) {#printStackTrace-java.io.PrintStream-}
```
public void printStackTrace(PrintStream arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.PrintStream |  |

### printStackTrace(PrintWriter arg0) {#printStackTrace-java.io.PrintWriter-}
```
public void printStackTrace(PrintWriter arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.io.PrintWriter |  |

### setStackTrace(StackTraceElement[] arg0) {#setStackTrace-java.lang.StackTraceElement---}
```
public void setStackTrace(StackTraceElement[] arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.StackTraceElement[] |  |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

