---
title: "Aspose::Page::ExternalFontCache::FetchDrFont 方法"
linktitle: "FetchDrFont"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::ExternalFontCache::FetchDrFont 方法。在 C++ 中通过字体族名称、大小和样式获取 DrFont。"
type: docs
weight: 200
url: /zh/cpp/aspose.page/externalfontcache/fetchdrfont/
---
## ExternalFontCache::FetchDrFont method


通过字体族名称、大小和样式获取 [DrFont](../)。

```cpp
static System::SharedPtr<Font::DrFont> Aspose::Page::ExternalFontCache::FetchDrFont(System::String familyName, float sizePoints, System::Drawing::FontStyle style)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| familyName | System::String | [Font](../../../aspose.page.font/) 族名。 |
| sizePoints | float | [Font](../../../aspose.page.font/) 点数大小（1 点等于 1/72 英寸）。 |
| style | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) 样式。 |

### ReturnValue

返回 DrFont

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [ExternalFontCache](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
