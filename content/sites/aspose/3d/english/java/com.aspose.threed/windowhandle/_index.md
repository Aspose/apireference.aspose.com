---
title: WindowHandle
second_title: Aspose.3D for Java API Reference
description: Encapsulated window handle for different platforms.
type: docs
weight: 211
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
| [fromWayland(long display, long surface)](#fromWayland-long-long-) | Create com.aspose.threed.WindowHandle from a Wayland surface |
| [fromXlib(long display, long window)](#fromXlib-long-long-) | Create com.aspose.threed.WindowHandle from an Xlib window |
| [fromWin32(long hWnd)](#fromWin32-long-) | The native HWND instance in Windows environment. |
### fromWayland(long display, long surface) {#fromWayland-long-long-}
```
public static WindowHandle fromWayland(long display, long surface)
```


Create com.aspose.threed.WindowHandle from a Wayland surface

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| display | long | The display instance of Wayland server |
| surface | long | The handle of the surface |

**Returns:**
[WindowHandle](../../com.aspose.threed/windowhandle)
### fromXlib(long display, long window) {#fromXlib-long-long-}
```
public static WindowHandle fromXlib(long display, long window)
```


Create com.aspose.threed.WindowHandle from an Xlib window

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| display | long | The display instance of the X server |
| window | long | The handle of the window |

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
