---
title: "Aspose::Page::ExternalFontCache::CreateFontByFamilyName 方法"
linktitle: "CreateFontByFamilyName"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::ExternalFontCache::CreateFontByFamilyName 方法。在 C++ 中通过字体族名称、大小、样式和字体大写形式获取 DrFont。"
type: docs
weight: 100
url: /zh/cpp/aspose.page/externalfontcache/createfontbyfamilyname/
---
## ExternalFontCache::CreateFontByFamilyName method


通过字体族名称、大小、样式和大写字母获取 [DrFont](../)。

```cpp
static System::SharedPtr<System::Drawing::Font> Aspose::Page::ExternalFontCache::CreateFontByFamilyName(System::String familyName, float size, System::Drawing::FontStyle style)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| familyName | System::String | [Font](../../../aspose.page.font/) 族名。 |
| sizePoints | float | [Font](../../../aspose.page.font/) 点数大小（1 点等于 1/72 英寸）。 |
| style | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) 样式。 |

### ReturnValue

返回 DrFont
## 备注



通过字体族名称、大小、样式和备用字体族名称获取 [DrFont](../)。


通过字体族名称、大小、样式、字体大写形式和备用字体族名称获取 [DrFont](../)。


通过字体族名称、样式和大小获取 [System::Drawing::Font](../../../system.drawing/font/)。


通过字体族名称、样式和大小创建 [System::Drawing::Font](../../../system.drawing/font/)。


///
## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [ExternalFontCache](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
