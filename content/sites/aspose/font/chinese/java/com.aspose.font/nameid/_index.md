---
title: "NameId"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 NameId 枚举。"
type: docs
weight: 67
url: /zh/java/com.aspose.font/nameid/
---
**Inheritance:**
java.lang.Object
```
public final class NameId
```

表示 NameId 枚举。
## 字段

| 字段 | 描述 |
| --- | --- |
| [CompatibleFull](#CompatibleFull) | 18 兼容完整（仅限 Macintosh）；在 Macintosh 上，菜单名称是使用字体资源构建的。 |
| [CopyrightNotice](#CopyrightNotice) | 0 版权声明。 |
| [DarkBackground](#DarkBackground) | 如果此 ID 用于 CPAL table\\u2019s 调色板标签数组，则表示 CPAL 表中相应的颜色调色板适用于在黑色等深色背景上显示字体时使用。 |
| [Description](#Description) | 10 描述；字形的描述。 |
| [DesignerName](#DesignerName) | 9 设计师；字体设计者的名称。 |
| [FontFamily](#FontFamily) | 1 字体族。 |
| [FontSubfamily](#FontSubfamily) | 2 字体子族。 |
| [FullName](#FullName) | 4 字体的完整名称。 |
| [LicenseDescription](#LicenseDescription) | 13 许可证描述；描述字体的合法使用方式，或不同的授权使用示例场景。 |
| [LicenseInfoUrl](#LicenseInfoUrl) | 14 许可证信息 URL，可在此获取更多授权信息。 |
| [LightBackground](#LightBackground) | 此 ID 如果在 CPAL 表\\u2019s 调色板标签数组中使用，则指定 CPAL 表中相应的颜色调色板在将字体显示在如白色的浅色背景上时适用。 |
| [ManufacturerName](#ManufacturerName) | 8 制造商名称。 |
| [PostScriptCID](#PostScriptCID) | 它在字体中的存在意味着 nameID 6 包含一个 PostScript 字体名称，该名称旨在与 \\u201ccomposefont\\u201d 调用一起使用，以在 PostScript 解释器中调用该字体。 |
| [PostScriptName](#PostScriptName) | 6 字体的 PostScript 名称。 |
| [PreferredFamily](#PreferredFamily) | 15 保留 16 首选族（仅限 Windows）；在 Windows 中，族名称显示在字体菜单中；子族名称显示为样式名称。 |
| [PreferredSubfamily](#PreferredSubfamily) | 17 首选子族（仅限 Windows）；在 Windows 中，族名称显示在字体菜单中；子族名称显示为样式名称。 |
| [SampleText](#SampleText) | 19 示例文本。 |
| [TrademarkNotice](#TrademarkNotice) | 7 商标声明。 |
| [UniqueFontId](#UniqueFontId) | 3 Apple 规范：唯一子族标识。3 MS 规范：唯一字体标识符。 |
| [UrlDesigner](#UrlDesigner) | 12 字体设计者的 URL（包含协议，例如 http://、ftp://） |
| [UrlVendor](#UrlVendor) | 11 字体供应商的 URL（包含协议，例如 http://、ftp://）。 |
| [VariationsPostScriptNamePrefix](#VariationsPostScriptNamePrefix) | 如果在可变字体中出现，它可以在变体字体的 PostScript 名称生成算法中用作族前缀。 |
| [Version](#Version) | 5 名称表的版本。 |
| [WwsFamilyName](#WwsFamilyName) | 用于在 ID 16 和 17 的条目不符合 WWS 模型时提供符合 WWS 标准的族名称。 |
| [WwsSubfamilyName](#WwsSubfamilyName) | 与 ID 21 结合使用时，此 ID 在 ID 16 和 17 的条目不符合 WWS 模型的情况下提供符合 WWS 标准的子族名称（仅反映粗细、宽度和倾斜属性）。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromId(int id)](#fromId-int-) | 根据整数值创建名称 ID。 |
| [getClass()](#getClass--) |  |
| [getId()](#getId--) | 获取整数值。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompatibleFull {#CompatibleFull}
```
public static final NameId CompatibleFull
```


18 兼容完整名称（仅限 Macintosh）；在 Macintosh 上，菜单名称使用字体资源构建。通常与完整名称相匹配。如果希望字体名称与完整名称不同，可以在 ID 18 中插入兼容完整名称。此名称并未被 Mac OS 本身使用，但可能被应用程序开发者使用（例如 Adobe）。

### CopyrightNotice {#CopyrightNotice}
```
public static final NameId CopyrightNotice
```


0 版权声明。

### DarkBackground {#DarkBackground}
```
public static final NameId DarkBackground
```


如果此 ID 用于 CPAL table\\u2019s 调色板标签数组，则表示 CPAL 表中相应的颜色调色板适用于在黑色等深色背景上显示字体时使用。

### Description {#Description}
```
public static final NameId Description
```


10 描述；字体的描述。可以包含修订信息、使用建议、历史、特性等。

### DesignerName {#DesignerName}
```
public static final NameId DesignerName
```


9 设计师；字体设计者的名称。

### FontFamily {#FontFamily}
```
public static final NameId FontFamily
```


1 字体族。此字符串是用户在 Macintosh 平台上看到的字体族名称。

### FontSubfamily {#FontSubfamily}
```
public static final NameId FontSubfamily
```


2 字体子族。此字符串是用户在 Macintosh 平台上看到的字体系列。

### FullName {#FullName}
```
public static final NameId FullName
```


4 字体的完整名称。

### LicenseDescription {#LicenseDescription}
```
public static final NameId LicenseDescription
```


13 许可证描述；描述字体可以合法使用的方式，或许可使用的不同示例场景。此字段应使用通俗语言编写，而非法律术语。

### LicenseInfoUrl {#LicenseInfoUrl}
```
public static final NameId LicenseInfoUrl
```


14 许可证信息 URL，可在此获取更多授权信息。

### LightBackground {#LightBackground}
```
public static final NameId LightBackground
```


此 ID 如果在 CPAL 表\\u2019s 调色板标签数组中使用，则指定 CPAL 表中相应的颜色调色板在将字体显示在如白色的浅色背景上时适用。

### ManufacturerName {#ManufacturerName}
```
public static final NameId ManufacturerName
```


8 制造商名称。

### PostScriptCID {#PostScriptCID}
```
public static final NameId PostScriptCID
```


它在字体中的存在意味着 nameID 6 包含一个 PostScript 字体名称，该名称旨在与 \\u201ccomposefont\\u201d 调用一起使用，以在 PostScript 解释器中调用该字体。

### PostScriptName {#PostScriptName}
```
public static final NameId PostScriptName
```


6 字体的 PostScript 名称。注意：一个字体只能有一个 PostScript 名称，且该名称必须为 ASCII。

### PreferredFamily {#PreferredFamily}
```
public static final NameId PreferredFamily
```


15 保留 16 首选系列（仅限 Windows）；在 Windows 中，系列名称显示在字体菜单中；子族名称显示为样式名称。出于历史原因，字体系列最多包含四种样式，但字体设计师可以将超过四种字体归为同一系列。首选系列和首选子族 ID 允许设计师包含首选的系列/子族分组。仅当这些 ID 与 ID 1 和 2 不同时才会出现。

### PreferredSubfamily {#PreferredSubfamily}
```
public static final NameId PreferredSubfamily
```


17 首选子族（仅限 Windows）；在 Windows 中，系列名称显示在字体菜单中；子族名称显示为样式名称。出于历史原因，字体系列最多包含四种样式，但字体设计师可以将超过四种字体归为同一系列。首选系列和首选子族 ID 允许设计师包含首选的系列/子族分组。仅当这些 ID 与 ID 1 和 2 不同时才会出现。

### SampleText {#SampleText}
```
public static final NameId SampleText
```


19 示例文本。可以是字体名称，或设计师认为最能展示字体外观的任何其他文本。

### TrademarkNotice {#TrademarkNotice}
```
public static final NameId TrademarkNotice
```


7 商标声明。

### UniqueFontId {#UniqueFontId}
```
public static final NameId UniqueFontId
```


3 Apple 规范：唯一子族标识。3 MS 规范：唯一字体标识符。

### UrlDesigner {#UrlDesigner}
```
public static final NameId UrlDesigner
```


12 字体设计者的 URL（包含协议，例如 http://、ftp://）

### UrlVendor {#UrlVendor}
```
public static final NameId UrlVendor
```


11 字体供应商的 URL（包含协议，例如 http://、ftp://）。如果 URL 中嵌入唯一的序列号，可用于注册该字体。

### VariationsPostScriptNamePrefix {#VariationsPostScriptNamePrefix}
```
public static final NameId VariationsPostScriptNamePrefix
```


如果在可变字体中出现，它可以在变体字体的 PostScript 名称生成算法中用作族前缀。

### Version {#Version}
```
public static final NameId Version
```


5 名称表的版本。

### WwsFamilyName {#WwsFamilyName}
```
public static final NameId WwsFamilyName
```


用于在 ID 16 和 17 的条目不符合 WWS 模型时提供符合 WWS 标准的族名称。

### WwsSubfamilyName {#WwsSubfamilyName}
```
public static final NameId WwsSubfamilyName
```


与 ID 21 结合使用时，此 ID 在 ID 16 和 17 的条目不符合 WWS 模型的情况下提供符合 WWS 标准的子族名称（仅反映粗细、宽度和倾斜属性）。

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
### fromId(int id) {#fromId-int-}
```
public static NameId fromId(int id)
```


根据整数值创建名称 ID。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | int | 整数值。 |

**Returns:**
[NameId](../../com.aspose.font/nameid) - The name id.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getId() {#getId--}
```
public int getId()
```


获取整数值。

**Returns:**
int - 整数值。
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

