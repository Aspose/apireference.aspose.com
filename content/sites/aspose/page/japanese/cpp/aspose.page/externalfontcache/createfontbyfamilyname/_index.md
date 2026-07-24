---
title: "Aspose::Page::ExternalFontCache::CreateFontByFamilyName メソッド"
linktitle: "CreateFontByFamilyName"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::ExternalFontCache::CreateFontByFamilyName メソッド。C++ でフォントファミリ名、サイズ、スタイル、フォント大文字属性で DrFont を取得します。"
type: docs
weight: 100
url: /ja/cpp/aspose.page/externalfontcache/createfontbyfamilyname/
---
## ExternalFontCache::CreateFontByFamilyName method


フォント ファミリ名、サイズ、スタイル、フォント 大文字で [DrFont](../) を取得します。

```cpp
static System::SharedPtr<System::Drawing::Font> Aspose::Page::ExternalFontCache::CreateFontByFamilyName(System::String familyName, float size, System::Drawing::FontStyle style)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| familyName | System::String | [Font](../../../aspose.page.font/) ファミリ名。 |
| sizePoints | float | [Font](../../../aspose.page.font/) ポイント単位のサイズ（1 ポイントは 1/72 インチです）。 |
| style | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) スタイル。 |

### ReturnValue

DrFont を返します
## 備考



フォントファミリ名、サイズ、スタイル、代替フォントファミリ名で [DrFont](../) を取得します。


フォントファミリ名、サイズ、スタイル、フォント大文字属性、代替フォントファミリ名で [DrFont](../) を取得します。


フォントファミリ名、スタイル、サイズで [System::Drawing::Font](../../../system.drawing/font/) を取得します。


フォントファミリ名、スタイル、サイズで [System::Drawing::Font](../../../system.drawing/font/) を作成します。


///
## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [ExternalFontCache](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
