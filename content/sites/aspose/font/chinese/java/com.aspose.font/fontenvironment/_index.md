---
title: "FontEnvironment"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "提供有关当前环境和平台的信息。"
type: docs
weight: 39
url: /zh/java/com.aspose.font/fontenvironment/
---
**Inheritance:**
java.lang.Object
```
public class FontEnvironment
```

提供有关当前环境和平台的信息。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCffCommonFontsSettings()](#getCffCommonFontsSettings--) | 适用于 CFF 字体的通用设置。 |
| [getClass()](#getClass--) |  |
| [getCurrent()](#getCurrent--) | 获取当前环境。 |
| [getCurrentPlatformId()](#getCurrentPlatformId--) | 获取当前平台标识。 |
| [getFontSpecificEncodings()](#getFontSpecificEncodings--) | 存储面向消费者的字体的特定编码。 |
| [getStrictness()](#getStrictness--) | 某些字体可能包含意外数据、未指定的特性，或可能被粗略裁剪。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setStrictness(FontEnvironment.ParsingStrictness value)](#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-) | 某些字体可能包含意外数据、未指定的特性，或可能被粗略裁剪。 |
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
### getCffCommonFontsSettings() {#getCffCommonFontsSettings--}
```
public static CffFontsSettings getCffCommonFontsSettings()
```


适用于 CFF 字体的通用设置。

**Returns:**
[CffFontsSettings](../../com.aspose.font/cfffontssettings)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCurrent() {#getCurrent--}
```
public static FontEnvironment getCurrent()
```


获取当前环境。

**Returns:**
[FontEnvironment](../../com.aspose.font/fontenvironment) - Current environment.
### getCurrentPlatformId() {#getCurrentPlatformId--}
```
public int getCurrentPlatformId()
```


获取当前平台标识。

**Returns:**
int - 当前平台标识。
### getFontSpecificEncodings() {#getFontSpecificEncodings--}
```
public FontSpecificEncodings getFontSpecificEncodings()
```


存储面向消费者的字体的特定编码。例如，PDF 使用 Adobe Symbol 和 ZapfDingbats 的特定编码。

**Returns:**
[FontSpecificEncodings](../../com.aspose.font/fontspecificencodings) - Specific encodings for consumer-aware Fonts.
### getStrictness() {#getStrictness--}
```
public FontEnvironment.ParsingStrictness getStrictness()
```


某些字体可能包含意外数据、未指定的特性，或可能被粗略裁剪。对于希望在不考虑字体可能不足的情况下打开任何字体的用户，建议使用宽容设置。字体内部结构不保证一致。对于希望打开大多数有效且稳固字体的用户，建议使用严格设置。

**Returns:**
[ParsingStrictness](../../com.aspose.font/parsingstrictness) - Strictness.
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




### setStrictness(FontEnvironment.ParsingStrictness value) {#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-}
```
public void setStrictness(FontEnvironment.ParsingStrictness value)
```


某些字体可能包含意外数据、未指定的特性，或可能被粗略裁剪。对于希望在不考虑字体可能不足的情况下打开任何字体的用户，建议使用宽容设置。字体内部结构不保证一致。对于希望打开大多数有效且稳固字体的用户，建议使用严格设置。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [ParsingStrictness](../../com.aspose.font/parsingstrictness) | 严格程度。 |

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

