---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs method"
linktitle: "AddGlyphs"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs メソッド。C++ でページに新しいグリフを追加します。"
type: docs
weight: 300
url: /ja/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/addglyphs/
---
## PageAPI::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


ページに新しいグリフを追加します。

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) リソース。 |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) サイズ。 |
| originX | 単精度浮動小数点数 | グリフの原点 X 座標。 |
| originY | 単精度浮動小数点数 | グリフの原点 Y 座標。 |
| unicodeString | System::String | 印刷する文字列。 |

### ReturnValue

追加されたグリフ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


ページに新しいグリフを追加します。

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) ファミリ。 |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) サイズ。 |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) スタイル。 |
| originX | 単精度浮動小数点数 | グリフの原点 X 座標。 |
| originY | 単精度浮動小数点数 | グリフの原点 Y 座標。 |
| unicodeString | System::String | 印刷する文字列。 |

### ReturnValue

追加されたグリフ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
