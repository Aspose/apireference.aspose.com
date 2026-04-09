---
title: WindowHandle
second_title: Aspose.3D für Java API-Referenz
description: Kapselter Fenster-Handle für verschiedene Plattformen.
type: docs
weight: 232
url: /de/java/com.aspose.threed/windowhandle/
---

**Inheritance:**
java.lang.Object
```
public class WindowHandle
```

Kapselter Fenster-Handle für verschiedene Plattformen.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromWayland(long display, long surface)](#fromWayland-long-long-) | Erstelle [WindowHandle](../../com.aspose.threed/windowhandle) aus einer Wayland-Oberfläche |
| [fromWin32(long hWnd)](#fromWin32-long-) | Die native HWND-Instanz in einer Windows-Umgebung. |
| [fromXlib(long display, long window)](#fromXlib-long-long-) | Erstelle [WindowHandle](../../com.aspose.threed/windowhandle) aus einem Xlib-Fenster |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### fromWayland(long display, long surface) {#fromWayland-long-long-}
```
public static WindowHandle fromWayland(long display, long surface)
```


Erstelle [WindowHandle](../../com.aspose.threed/windowhandle) aus einer Wayland-Oberfläche

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| display | long | Die Anzeigeinstanz des Wayland-Servers |
| Oberfläche | long | Der Handle der Oberfläche |

**Returns:**
[WindowHandle](../../com.aspose.threed/windowhandle)
### fromWin32(long hWnd) {#fromWin32-long-}
```
public static WindowHandle fromWin32(long hWnd)
```


Die native HWND-Instanz in einer Windows-Umgebung.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| hWnd | long | Der Handle des nativen Win32-Fensters |

**Returns:**
[WindowHandle](../../com.aspose.threed/windowhandle)
### fromXlib(long display, long window) {#fromXlib-long-long-}
```
public static WindowHandle fromXlib(long display, long window)
```


Erstelle [WindowHandle](../../com.aspose.threed/windowhandle) aus einem Xlib-Fenster

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| display | long | Die Anzeigeinstanz des X-Servers |
| Fenster | long | Der Handle des Fensters |

**Returns:**
[WindowHandle](../../com.aspose.threed/windowhandle)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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
public final void wait(long arg0)
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

