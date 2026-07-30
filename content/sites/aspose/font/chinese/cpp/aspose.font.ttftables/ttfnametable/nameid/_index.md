---
title: "Aspose::Font::TtfTables::TtfNameTable::NameId 枚举"
linktitle: "NameId"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfNameTable::NameId 枚举。表示 C++ 中的 NameId。"
type: docs
weight: 1600
url: /zh/cpp/aspose.font.ttftables/ttfnametable/nameid/
---
## NameId enum


表示 [NameId](./)。

```cpp
enum class NameId : uint16_t
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| CopyrightNotice | 0 | 0 版权声明。 |
| FontFamily | 1 | 1 [Font](../../../aspose.font/font/) 家族。此字符串是用户在 Macintosh 平台上看到的 [Font](../../../aspose.font/font/) 家族名称。 |
| FontSubfamily | 2 | 2 [Font](../../../aspose.font/font/) 子族。此字符串是用户在 Macintosh 平台上看到的 [Font](../../../aspose.font/font/) 家族。 |
| UniqueFontId | 3 | 3 唯一子族标识（Apple 规范）。3 唯一 [Font](../../../aspose.font/font/) 标识符（MS 规范）。 |
| FullName | 4 | 4 [Font](../../../aspose.font/font/) 的完整名称。 |
| 版本 | 5 | 5 名称表的版本。 |
| PostScriptName | 6 | 6 [Font](../../../aspose.font/font/) 的 PostScript 名称。注意：一个 [Font](../../../aspose.font/font/) 只能有一个 PostScript 名称，且该名称必须为 ASCII。 |
| TrademarkNotice | 7 | 7 商标声明。 |
| ManufacturerName | 8 | 8 制造商名称。 |
| 设计师名称 | 9 | 9 设计师；字体设计者的名称。 |
| 描述 | 10 | 10 描述；字体的描述。可以包含修订信息、使用建议、历史、特性等。 |
| UrlVendor | 11 | 11 [Font](../../../aspose.font/font/) 供应商的 URL（带协议，例如 [http://](http://)、[ftp://](ftp://)）。如果 URL 中嵌入唯一序列号，可用于注册该 [Font](../../../aspose.font/font/)。 |
| UrlDesigner | 12 | 12 [Font](../../../aspose.font/font/) 设计师的 URL（带协议，例如 [http://](http://)、[ftp://](ftp://)） |
| LicenseDescription | 13 | 13 [License](../../../aspose.font/license/) 描述；说明如何合法使用该 [Font](../../../aspose.font/font/)，或列出许可使用的不同示例场景。此字段应使用通俗语言编写，而非法律术语。 |
| LicenseInfoUrl | 14 | 14 可获取更多许可信息的 [License](../../../aspose.font/license/) 信息 URL。 |
| PreferredFamily | 16 | 15 保留 16 首选族（仅限 Windows）；在 Windows 中，族名称显示在 [Font](../../../aspose.font/font/) 菜单中；子族名称显示为样式名称。出于历史原因，[Font](../../../aspose.font/font/) 族最多包含四种样式，但 [Font](../../../aspose.font/font/) 设计师可以将超过四种字体分组到同一族中。首选族和首选子族 ID 允许 [Font](../../../aspose.font/font/) 设计师包含首选的族/子族分组。仅当这些 ID 与 ID 1 和 2 不同时时才出现。 |
| PreferredSubfamily | 17 | 17 首选子族（仅限 Windows）；在 Windows 中，族名称显示在 [Font](../../../aspose.font/font/) 菜单中；子族名称显示为样式名称。出于历史原因，[Font](../../../aspose.font/font/) 族最多包含四种样式，但 [Font](../../../aspose.font/font/) 设计师可以将超过四种字体分组到同一族中。首选族和首选子族 ID 允许 [Font](../../../aspose.font/font/) 设计师包含首选的族/子族分组。仅当这些 ID 与 ID 1 和 2 不同时时才出现。 |
| CompatibleFull | 18 | 18 兼容全名（仅限 Macintosh）；在 Macintosh 上，菜单名称使用 [Font](../../../aspose.font/font/) 资源构建。通常与完整名称相匹配。如果希望 [Font](../../../aspose.font/font/) 的名称与完整名称不同，可在 ID 18 中插入兼容全名。此名称并未被 Mac OS 本身使用，但可能被应用程序开发者（例如 Adobe）使用。 |
| SampleText | 19 | 19 示例文本。可以是 [Font](../../../aspose.font/font/) 的名称，或任何设计师认为最能展示该 [Font](../../../aspose.font/font/) 外观的文本。 |
| PostScriptCID | 20 | 它在字体中的存在表示 nameID 6 包含一个 PostScript 字体名称，旨在与 “composefont” 调用一起使用，以在 PostScript 解释器中调用该字体。 |
| WwsFamilyName | 21 | 用于在 ID 16 和 17 的条目不符合 WWS 模型时提供符合 WWS 标准的族名称。 |
| WwsSubfamilyName | 22 | 与 ID 21 结合使用时，如果 ID 16 和 17 的条目不符合 WWS 模型，此 ID 提供符合 WWS 标准的子族名称（仅反映粗细、宽度和倾斜属性）。 |
| LightBackground | 23 | 如果在 CPAL 表的调色板标签数组中使用此 ID，则表示 CPAL 表中对应的颜色调色板适用于在浅色背景（如白色）下显示该字体。 |
| DarkBackground | 24 | 如果在 CPAL 表的调色板标签数组中使用此 ID，则表示 CPAL 表中对应的颜色调色板适用于在深色背景（如黑色）下显示该字体。 |
| VariationsPostScriptNamePrefix | 25 | 如果出现在可变字体中，它可用作变体字体的 PostScript 名称生成算法中的族前缀。 |

## 另见

* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
