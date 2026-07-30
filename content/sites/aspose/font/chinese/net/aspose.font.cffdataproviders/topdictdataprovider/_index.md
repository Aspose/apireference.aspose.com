---
title: "类 TopDictDataProvider"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.CffDataProviders.TopDictDataProvider 类。声明用于读取/更新 CFF Top DICT 结构的功能"
type: docs
weight: 120
url: /zh/net/aspose.font.cffdataproviders/topdictdataprovider/
---
## TopDictDataProvider class

声明用于读取/更新 CFF Top DICT 结构的功能。

```csharp
public abstract class TopDictDataProvider
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [BaseFontName](../../aspose.font.cffdataproviders/topdictdataprovider/basefontname/) { get; set; } | 获取/设置 BaseFontName。 |
| [CidCount](../../aspose.font.cffdataproviders/topdictdataprovider/cidcount/) { get; set; } | 获取/设置 CIDCount。 |
| [CidFontRevision](../../aspose.font.cffdataproviders/topdictdataprovider/cidfontrevision/) { get; set; } | 获取/设置 CIDFontRevision。 |
| [CidFontType](../../aspose.font.cffdataproviders/topdictdataprovider/cidfonttype/) { get; set; } | 获取/设置 CIDFontType。 |
| [CidFontVersion](../../aspose.font.cffdataproviders/topdictdataprovider/cidfontversion/) { get; set; } | 获取/设置 CIDFontVersion。 |
| [Copyright](../../aspose.font.cffdataproviders/topdictdataprovider/copyright/) { get; set; } | 获取/设置 Copyright。 |
| [FamilyName](../../aspose.font.cffdataproviders/topdictdataprovider/familyname/) { get; set; } | 获取/设置 FamilyName。 |
| [FontBBox](../../aspose.font.cffdataproviders/topdictdataprovider/fontbbox/) { get; set; } | 获取/设置 FontBBox。 |
| [FontMatrix](../../aspose.font.cffdataproviders/topdictdataprovider/fontmatrix/) { get; set; } | 获取/设置 FontMatrix。 |
| [FontName](../../aspose.font.cffdataproviders/topdictdataprovider/fontname/) { get; set; } | 获取/设置 FontName。 |
| [FullName](../../aspose.font.cffdataproviders/topdictdataprovider/fullname/) { get; set; } | 获取/设置 FullName。 |
| [IsFixedPitch](../../aspose.font.cffdataproviders/topdictdataprovider/isfixedpitch/) { get; set; } | 获取/设置 isFixedPitch 字段的值。 |
| [ItalicAngle](../../aspose.font.cffdataproviders/topdictdataprovider/italicangle/) { get; set; } | 获取/设置 ItalicAngle。 |
| [Notice](../../aspose.font.cffdataproviders/topdictdataprovider/notice/) { get; set; } | 获取/设置 Notice。 |
| [PaintType](../../aspose.font.cffdataproviders/topdictdataprovider/painttype/) { get; set; } | 获取/设置 PaintType。 |
| [PostScript](../../aspose.font.cffdataproviders/topdictdataprovider/postscript/) { get; set; } | 获取/设置 PostScript。 |
| [PrivateDictProvider](../../aspose.font.cffdataproviders/topdictdataprovider/privatedictprovider/) { get; } | 获取 Private DICT 的提供程序，如果当前顶层字典不存在 Private 字典，则返回 NULL。 |
| [StrokeWidth](../../aspose.font.cffdataproviders/topdictdataprovider/strokewidth/) { get; set; } | 获取/设置 StrokeWidth。 |
| [SyntheticBase](../../aspose.font.cffdataproviders/topdictdataprovider/syntheticbase/) { get; set; } | 获取/设置 SyntheticBase。 |
| [UidBase](../../aspose.font.cffdataproviders/topdictdataprovider/uidbase/) { get; set; } | 获取/设置 UIDBase。 |
| [UnderlinePosition](../../aspose.font.cffdataproviders/topdictdataprovider/underlineposition/) { get; set; } | 获取/设置 UnderlinePosition。 |
| [UnderlineThickness](../../aspose.font.cffdataproviders/topdictdataprovider/underlinethickness/) { get; set; } | 获取/设置 UnderlineThickness。 |
| [UniqueId](../../aspose.font.cffdataproviders/topdictdataprovider/uniqueid/) { get; set; } | 获取/设置 UniqueID。 |
| [Version](../../aspose.font.cffdataproviders/topdictdataprovider/version/) { get; set; } | 获取/设置 version。 |
| [Weight](../../aspose.font.cffdataproviders/topdictdataprovider/weight/) { get; set; } | 获取/设置 Weight。 |
| [Xuid](../../aspose.font.cffdataproviders/topdictdataprovider/xuid/) { get; set; } | 获取/设置 XUID。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [GetRos](../../aspose.font.cffdataproviders/topdictdataprovider/getros/#getros)(out int, out int, out int) | 获取 ROS(Registry Ordering Supplement) 字段（operator）的值。字符串标识符（SID）用于输出字符串类型。 |
| [GetRos](../../aspose.font.cffdataproviders/topdictdataprovider/getros/#getros_1)(out string, out string, out int) | 获取 ROS(Registry Ordering Supplement) 字段（operator）的值。 |
| [SetBaseFontName](../../aspose.font.cffdataproviders/topdictdataprovider/setbasefontname/)(string) | 设置 BaseFontName 字段的字符串值，并返回与新设置的字符串值关联的 SID。 |
| [SetBaseFontNameSid](../../aspose.font.cffdataproviders/topdictdataprovider/setbasefontnamesid/)(int) | 更新 CFF Top DICT 数据中 BaseFontName 字段的 SID（string identifier）值。 |
| [SetCopyright](../../aspose.font.cffdataproviders/topdictdataprovider/setcopyright/)(string) | 设置 Copyright 字段的字符串值，并返回与新设置的字符串值关联的 SID。 |
| [SetCopyrightSid](../../aspose.font.cffdataproviders/topdictdataprovider/setcopyrightsid/)(int) | 更新 CFF Top DICT 数据中 Copyright 字段的 SID（string identifier）值。 |
| [SetFamilyName](../../aspose.font.cffdataproviders/topdictdataprovider/setfamilyname/)(string) | 设置 FamilyName 字段的字符串值，并返回与新设置的字符串值关联的 SID。 |
| [SetFamilyNameSid](../../aspose.font.cffdataproviders/topdictdataprovider/setfamilynamesid/)(int) | 更新 CFF Top DICT 数据中 FamilyName 字段的 SID（string identifier）值。 |
| [SetFontName](../../aspose.font.cffdataproviders/topdictdataprovider/setfontname/)(string) | 设置 FontName 字段的字符串值，并返回与新设置的字符串值关联的 SID。 |
| [SetFontNameSid](../../aspose.font.cffdataproviders/topdictdataprovider/setfontnamesid/)(int) | 更新 CFF Top DICT 数据中 FontName 字段的 SID（string identifier）值。 |
| [SetFullName](../../aspose.font.cffdataproviders/topdictdataprovider/setfullname/)(string) | 设置 FullName 字段的字符串值，并返回与新设置的字符串值关联的 SID。 |
| [SetFullNameSid](../../aspose.font.cffdataproviders/topdictdataprovider/setfullnamesid/)(int) | 更新 CFF Top DICT 数据中 FullName 字段的 SID（string identifier）值。 |
| [SetNotice](../../aspose.font.cffdataproviders/topdictdataprovider/setnotice/)(string) | 设置 Notice 字段（operator）的字符串值，并返回与新设置的字符串值关联的 SID。 |
| [SetNoticeSid](../../aspose.font.cffdataproviders/topdictdataprovider/setnoticesid/)(int) | 更新 CFF Top DICT 数据中 Notice 字段（operator）的 SID（string identifier）值。 |
| [SetPostScript](../../aspose.font.cffdataproviders/topdictdataprovider/setpostscript/)(string) | 设置 PostScript 字段的字符串值，并返回与新设置的字符串值关联的 SID。 |
| [SetPostScriptSid](../../aspose.font.cffdataproviders/topdictdataprovider/setpostscriptsid/)(int) | 更新 CFF Top DICT 数据中 PostScript 字段的 SID（string identifier）值。 |
| [SetRos](../../aspose.font.cffdataproviders/topdictdataprovider/setros/#setros)(int, int, int) | 设置 ROS(Registry Ordering Supplement) 字段（operator）的值。字符串标识符（SID）应用于注册表和排序参数。 |
| [SetRos](../../aspose.font.cffdataproviders/topdictdataprovider/setros/#setros_1)(string, string, int) | 设置 ROS(Registry Ordering Supplement) 字段（operator）的值。 |
| [SetVersion](../../aspose.font.cffdataproviders/topdictdataprovider/setversion/)(string) | 设置 version 字段（operator）的字符串值，并返回与新设置的字符串值关联的 SID。 |
| [SetVersionSid](../../aspose.font.cffdataproviders/topdictdataprovider/setversionsid/)(int) | 更新 CFF Top DICT 数据中 version 字段（operator）的 SID（string identifier）值。 |
| [SetWeight](../../aspose.font.cffdataproviders/topdictdataprovider/setweight/)(string) | 设置 Weight 字段的字符串值，并返回与新设置的字符串值关联的 SID。 |
| [SetWeightSid](../../aspose.font.cffdataproviders/topdictdataprovider/setweightsid/)(int) | 更新 CFF Top DICT 数据中 Weight 字段的 SID（string identifier）值。 |

### 另见

* namespace [Aspose.Font.CffDataProviders](../../aspose.font.cffdataproviders/)
* assembly [Aspose.Font](../../)


