---
title: "LicenseFlags"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示一个用于 OS/2 表字段 fsType 的嵌入标志的辅助包装器。"
type: docs
weight: 59
url: /zh/java/com.aspose.font/licenseflags/
---
**Inheritance:**
java.lang.Object
```
public class LicenseFlags
```

表示 'OS/2' 表（字段 fsType）中嵌入标志的辅助包装器。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFSType()](#getFSType--) | 从 OS/2 表获取原始 fsType 值，如果表中不存在此字段则返回 0。 |
| [hashCode()](#hashCode--) |  |
| [isBitmapOnlyEmbedding()](#isBitmapOnlyEmbedding--) | 检测 fsType 是否允许仅位图嵌入。 |
| [isEditableEmbedding()](#isEditableEmbedding--) | 检测 fsType 是否允许可编辑嵌入。 |
| [isFSTypeAbsent()](#isFSTypeAbsent--) | 如果 'OS/2' 表中不存在 fsType 标志，则返回 true。 |
| [isInstallableEmbedding()](#isInstallableEmbedding--) | 检测 fsType 是否为可安装嵌入。 |
| [isNoSubsettingEmbedding()](#isNoSubsettingEmbedding--) | 检测 fsType 是否允许不子集嵌入。 |
| [isPreviewAndPrintEmbedding()](#isPreviewAndPrintEmbedding--) | 检测 fsType 是否允许预览和打印嵌入。 |
| [isReservedType()](#isReservedType--) | 检测 fsType 的保留位（位 0）是否被设置。 |
| [isRestrictedLicenseEmbedding()](#isRestrictedLicenseEmbedding--) | 检测 fsType 是否为受限许可证嵌入。 |
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
### getFSType() {#getFSType--}
```
public int getFSType()
```


从 OS/2 表获取原始 fsType 值，如果表中不存在此字段则返回 0。

**Returns:**
int - 来自 OS/2 表的原始 fsType 值，如果表中不存在此字段则为 0。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isBitmapOnlyEmbedding() {#isBitmapOnlyEmbedding--}
```
public boolean isBitmapOnlyEmbedding()
```


检测 fsType 是否允许仅位图嵌入。

**Returns:**
boolean - 检测 fsType 是否允许仅位图嵌入。
### isEditableEmbedding() {#isEditableEmbedding--}
```
public boolean isEditableEmbedding()
```


检测 fsType 是否允许可编辑嵌入。

**Returns:**
boolean - 检测 fsType 是否允许可编辑嵌入。
### isFSTypeAbsent() {#isFSTypeAbsent--}
```
public boolean isFSTypeAbsent()
```


如果 'OS/2' 表中不存在 fsType 标志，则返回 true。

**Returns:**
boolean - 如果在 'OS/2' 表中不存在 fsType 标志，则为 True。
### isInstallableEmbedding() {#isInstallableEmbedding--}
```
public boolean isInstallableEmbedding()
```


检测 fsType 是否为可安装嵌入。

**Returns:**
boolean - 检测 fsType 是否为可安装嵌入。
### isNoSubsettingEmbedding() {#isNoSubsettingEmbedding--}
```
public boolean isNoSubsettingEmbedding()
```


检测 fsType 是否允许不子集嵌入。

**Returns:**
boolean - 检测 fsType 是否允许不子集嵌入。
### isPreviewAndPrintEmbedding() {#isPreviewAndPrintEmbedding--}
```
public boolean isPreviewAndPrintEmbedding()
```


检测 fsType 是否允许预览和打印嵌入。

**Returns:**
boolean - 检测 fsType 是否允许预览和打印嵌入。
### isReservedType() {#isReservedType--}
```
public boolean isReservedType()
```


检测 fsType 的保留位（位 0）是否被设置。

**Returns:**
boolean - 检测 fsType 的保留位（位 0）是否被设置。
### isRestrictedLicenseEmbedding() {#isRestrictedLicenseEmbedding--}
```
public boolean isRestrictedLicenseEmbedding()
```


检测 fsType 是否为受限许可证嵌入。

**Returns:**
boolean - 检测 fsType 是否为受限许可嵌入。
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

