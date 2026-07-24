---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page for Java API 参考"
description: "描述 PageDeviceColorSpaceUsage 功能选项。"
type: docs
weight: 10
url: /zh/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

描述 PageDeviceColorSpaceUsage 功能选项。
## 字段

| 字段 | 描述 |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | 如果设备确定由  PageDeviceColorSpaceProfileURI  参数指定的配置文件可以用作设备颜色空间配置文件，则使用相同配置文件的所有元素都被视为已经在设备颜色空间中指定。 |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | 如果 PageDeviceColorSpaceProfileURI 参数指定的配置文件的通道数与设备的基色数量匹配，则应使用它来替代设备内部的颜色管理，以用于所有元素。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 将一系列项目添加到此选项的项目列表末尾。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 获取元素名称。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


如果设备确定由 PageDeviceColorSpaceProfileURI 参数指定的配置文件可以用作设备颜色空间配置文件，则使用相同配置文件的所有元素将被视为已在设备颜色空间中指定。所有其他元素必须使用为该元素指定的配置文件。如果该配置文件不能用作设备颜色空间配置文件，使用该配置文件的元素必须像使用任何其他颜色配置文件的元素一样进行颜色管理。

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


如果 PageDeviceColorSpaceProfileURI 参数指定的配置文件的通道数与设备的基色数量匹配，则应使用它来代替设备内部的颜色管理，以用于所有元素。使用此配置文件的元素被视为位于设备颜色空间中，不会再进行颜色管理。

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


将一系列项目添加到此选项的项目列表末尾。每个项目必须是 ScoredProperty 或 Property 实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 要添加的项目列表。 |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
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
### getName() {#getName--}
```
public String getName()
```


获取元素名称。

**Returns:**
java.lang.String
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

