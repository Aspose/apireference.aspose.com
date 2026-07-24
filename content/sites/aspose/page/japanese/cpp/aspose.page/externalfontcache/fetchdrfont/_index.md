---
title: "Aspose::Page::ExternalFontCache::FetchDrFont メソッド"
linktitle: "FetchDrFont"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::ExternalFontCache::FetchDrFont メソッド。C++ でフォントファミリ名、サイズ、スタイルで DrFont を取得します。"
type: docs
weight: 200
url: /ja/cpp/aspose.page/externalfontcache/fetchdrfont/
---
## ExternalFontCache::FetchDrFont method


フォント ファミリ名、サイズ、スタイルで [DrFont](../) を取得します。

```cpp
static System::SharedPtr<Font::DrFont> Aspose::Page::ExternalFontCache::FetchDrFont(System::String familyName, float sizePoints, System::Drawing::FontStyle style)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| familyName | System::String | [Font](../../../aspose.page.font/) ファミリ名。 |
| sizePoints | float | [Font](../../../aspose.page.font/) ポイント単位のサイズ（1 ポイントは 1/72 インチです）。 |
| style | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) スタイル。 |

### ReturnValue

DrFont を返します

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [ExternalFontCache](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
