---
title: "XpsIccBasedColor"
second_title: "Aspose.Page용 Java API 참조"
description: "ICC 기반 색상을 캡슐화합니다."
type: docs
weight: 30
url: /ko/java/com.aspose.xps/xpsiccbasedcolor/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsColor](../../com.aspose.xps/xpscolor)
```
public final class XpsIccBasedColor extends XpsColor
```

ICC 기반 색상을 캡슐화합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getIccProfile()](#getIccProfile--) | 색상이 기반하는 ICC 프로파일 리소스를 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toColor()](#toColor--) | .NET 네이티브 표현의 ICC 기반 색상을 가져오기 위한 편리한 메서드. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getIccProfile() {#getIccProfile--}
```
public XpsIccProfile getIccProfile()
```


색상이 기반하는 ICC 프로파일 리소스를 반환합니다.

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - The ICC profile resource the color based on.
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




### toColor() {#toColor--}
```
public Color toColor()
```


.NET 네이티브 표현의 ICC 기반 색상을 가져오기 위한 편리한 메서드.

**Returns:**
java.awt.Color - System.Drawing.ColorSystem.Drawing.Color 구조체.
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
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

