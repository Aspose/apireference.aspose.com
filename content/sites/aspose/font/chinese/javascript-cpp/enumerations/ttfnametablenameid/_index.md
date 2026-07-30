---
title: "枚举 TtfNameTableNameId"
second_title: "Aspose.Font 用于 JavaScript，通过 C++"
description: "Aspose.Font.TtfNameTableNameId 枚举。指定 NameId"
type: docs
weight: 120
url: /zh/javascript-cpp/enumerations/ttfnametablenameid/
---
## TtfNameTableNameId enumeration

指定 NameId。

```csharp
 enum TtfNameTableNameId
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
|  | CopyrightNotice | `0` | 版权声明。 |
|  | FontFamily | `1` | 字体族。此字符串是用户在 Macintosh 平台上看到的字体族名称。 |
|  | FontSubfamily | `2` | 字体子族。此字符串是用户在 Macintosh 平台上看到的字体族。 |
|  | UniqueFontId | `3` | 唯一子族标识（Apple 规范）。3 唯一字体标识符（MS 规范）。 |
|  | FullName | `4` | 字体的完整名称。 |
|  | Version | `5` | 名称表的版本。 |
|  | PostScriptName | `6` | 字体的 PostScript 名称。注意：一个字体只能有一个 PostScript 名称，且该名称必须是 ASCII。 |
|  | TrademarkNotice | `7` | 商标声明。 |
|  | ManufacturerName | `8` | 制造商名称。 |
|  | DesignerName | `9` | 设计师；字体设计者的姓名。 |
|  | Description | `10` | 描述；字体的描述。可以包含修订信息、使用建议、历史、特性等。 |
|  | UrlVendor | `11` | 字体供应商的 URL（带协议，例如 http://、ftp://）。如果在 URL 中嵌入唯一序列号，可用于注册该字体。 |
|  | UrlDesigner | `12` | 字体设计者的 URL（带协议，例如 http://、ftp://） |
|  | LicenseDescription | `13` | 许可证描述；说明字体的合法使用方式或不同的授权使用示例场景。此字段应使用通俗语言撰写，而非法律术语。 |
|  | LicenseInfoUrl | `14` | 许可证信息 URL，可在此获取更多许可证信息。 |
|  | PreferredFamily | `16` | `15` 保留 `16` 首选族（仅限 Windows）；在 Windows 中，族名称显示在字体菜单中；子族名称显示为样式名称。出于历史原因，字体族最多包含四种样式，但字体设计师可以将超过四个字体分组到同一族。首选族和首选子族 ID 允许字体设计师包含首选的族/子族分组。仅当这些 ID 与 ID 1 和 2 不同时时才会出现这些 ID。 |
|  | PreferredSubfamily | `17` | 首选子族（仅限 Windows）；在 Windows 中，族名称显示在字体菜单中；子族名称显示为样式名称。出于历史原因，字体族最多包含四种样式，但字体设计师可以将超过四个字体分组到同一族。首选族和首选子族 ID 允许字体设计师包含首选的族/子族分组。仅当这些 ID 与 ID 1 和 2 不同时时才会出现这些 ID。 |
|  | CompatibleFull | `18` | 兼容完整名称（仅限 Macintosh）；在 Macintosh 上，菜单名称使用字体资源构建。通常与完整名称匹配。如果希望字体名称与完整名称不同，可以在 ID 18 中插入兼容完整名称。此名称并未被 Mac OS 本身使用，但可能被应用程序开发者使用（例如 Adobe）。 |
|  | SampleText | `19` | 示例文本。可以是字体名称，也可以是设计师认为最能展示字体外观的任何其他文本。 |
|  | PostScriptCID | `20` | 它在字体中的存在意味着 nameID 6 包含一个 PostScript 字体名称，该名称旨在与 "composefont" 调用一起使用，以在 PostScript 解释器中调用该字体。 |
|  | WwsFamilyName | `21` | 用于在 ID 16 和 17 的条目不符合 WWS 模型时提供符合 WWS 标准的族名。 |
|  | WwsSubfamilyName | `22` | 与 ID 21 结合使用时，此 ID 在 ID 16 和 17 的条目不符合 WWS 模型时提供符合 WWS 标准的子族名（仅反映粗细、宽度和倾斜属性）。 |
|  | LightBackground | `23` | 如果此 ID 用于 CPAL 表的 Palette Labels Array，则指定 CPAL 表中相应的颜色调色板在将字体显示在如白色的浅色背景上时适合使用。 |
|  | DarkBackground | `24` | 如果此 ID 用于 CPAL 表的 Palette Labels Array，则指定 CPAL 表中相应的颜色调色板在将字体显示在如黑色的深色背景上时适合使用。 |
|  | VariationsPostScriptNamePrefix | `25` | 如果在可变字体中出现，它可以用作变体字体的 PostScript 名称生成算法中的族前缀。 |

