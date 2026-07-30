---
title: "类 FontDefinition"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Sources.FontDefinition 类。表示字体文件集定义。此类包含与字体内部数据无关的字段。这些字段描述字体位置以及加载字体所需的其他数据，如某些字体源文件内存等。"
type: docs
weight: 730
url: /zh/net/aspose.font.sources/fontdefinition/
---
## FontDefinition class

表示字体文件集定义。此类包含与字体内部数据无关的字段。这些字段描述字体的放置以及从某些字体来源（文件、内存等）加载字体所需的其他数据。

```csharp
public class FontDefinition
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [FontDefinition](fontdefinition/#constructor)(FontType, FontFileDefinition) | 创建单文件字体定义。 |
| [FontDefinition](fontdefinition/#constructor_1)(FontType, FontFileDefinition[]) | 创建多文件字体定义。 |
| [FontDefinition](fontdefinition/#constructor_2)(FontType, StreamSource) | 创建单文件字体定义。 |
| [FontDefinition](fontdefinition/#constructor_3)(FontType, string, StreamSource) | 创建单文件字体定义。 |
| [FontDefinition](fontdefinition/#constructor_6)(string, FontType, FontFileDefinition) | 创建单文件字体定义。 |
| [FontDefinition](fontdefinition/#constructor_4)(MultiLanguageString, MultiLanguageString, FontType, FontFileDefinition) | 创建多文件字体定义。 |
| [FontDefinition](fontdefinition/#constructor_5)(MultiLanguageString, MultiLanguageString, FontType, FontFileDefinition[]) | 创建多文件字体定义。 |
| [FontDefinition](fontdefinition/#constructor_7)(string, FontType, string, StreamSource) | 创建单文件字体定义。 |
| [FontDefinition](fontdefinition/#constructor_8)(string, string, FontType, FontFileDefinition) | 创建单文件字体定义。 |
| [FontDefinition](fontdefinition/#constructor_9)(string, string, FontType, FontFileDefinition[]) | 创建多文件字体定义。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [FileDefinitions](../../aspose.font.sources/fontdefinition/filedefinitions/) { get; } | 获取文件定义集合。 |
| virtual [FontName](../../aspose.font.sources/fontdefinition/fontname/) { get; } | 返回字体名称。 |
| virtual [FontNames](../../aspose.font.sources/fontdefinition/fontnames/) { get; } | 获取字体名称，作为 [`MultiLanguageString`](../../aspose.font/multilanguagestring/)。 |
| [FontType](../../aspose.font.sources/fontdefinition/fonttype/) { get; } | 获取字体类型。 |
| virtual [PostscriptName](../../aspose.font.sources/fontdefinition/postscriptname/) { get; } | 获取 PostScript 字体名称。 |
| [PostscriptNames](../../aspose.font.sources/fontdefinition/postscriptnames/) { get; } | 获取 PostScript 字体名称，作为 [`MultiLanguageString`](../../aspose.font/multilanguagestring/)。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| static [Open](../../aspose.font.sources/fontdefinition/open/#open)(StreamSource, FontType) | 返回针对字体流源和字体类型的 FontDefinition。 |
| static [Open](../../aspose.font.sources/fontdefinition/open/#open_1)(string, FontType) | 返回针对字体文件和字体类型的 FontDefinition。 |

### 另见

* namespace [Aspose.Font.Sources](../../aspose.font.sources/)
* assembly [Aspose.Font](../../)


