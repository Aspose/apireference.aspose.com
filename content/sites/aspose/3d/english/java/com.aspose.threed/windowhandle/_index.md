---
title: WindowHandle
second_title: Aspose.3D for Java API Reference
description: Encapsulated window handle for different platforms.
type: docs
weight: 217
url: /java/com.aspose.threed/windowhandle/
---

**Inheritance:**
java.lang.Object
```
public class WindowHandle
```

Encapsulated window handle for different platforms.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromWayland(long display, long surface)](#fromWayland-long-long-) | Create [WindowHandle](../../com.aspose.threed/windowhandle) from a Wayland surface |
| [fromWin32(long hWnd)](#fromWin32-long-) | The native HWND instance in Windows environment. |
| [fromXlib(long display, long window)](#fromXlib-long-long-) | Create [WindowHandle](../../com.aspose.threed/windowhandle) from an Xlib window |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fromWayland(long display, long surface) {#fromWayland-long-long-}
```
public static WindowHandle fromWayland(long display, long surface)
```


Create [WindowHandle](../../com.aspose.threed/windowhandle) from a Wayland surface

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| display | long | The display instance of Wayland server |
| surface | long | The handle of the surface |

**Returns:**
[WindowHandle](../../com.aspose.threed/windowhandle)
### fromWin32(long hWnd) {#fromWin32-long-}
```
public static WindowHandle fromWin32(long hWnd)
```


The native HWND instance in Windows environment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| hWnd | long | The handle of the native Win32 window |

**Returns:**
[WindowHandle](../../com.aspose.threed/windowhandle)
### fromXlib(long display, long window) {#fromXlib-long-long-}
```
public static WindowHandle fromXlib(long display, long window)
```


Create [WindowHandle](../../com.aspose.threed/windowhandle) from an Xlib window

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| display | long | The display instance of the X server |
| window | long | The handle of the window |

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
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

