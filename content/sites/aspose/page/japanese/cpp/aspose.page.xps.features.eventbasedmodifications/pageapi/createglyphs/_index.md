---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs メソッド"
linktitle: "CreateGlyphs"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs メソッド。C++ で新しいグリフを作成します。"
type: docs
weight: 900
url: /ja/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createglyphs/
---
## PageAPI::CreateGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


新しいグリフを作成します。

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) リソース。 |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) サイズ。 |
| originX | 単精度浮動小数点数 | グリフの原点 X 座標。 |
| originY | 単精度浮動小数点数 | グリフの原点 Y 座標。 |
| unicodeString | System::String | 印刷する文字列。 |

### ReturnValue

新しいグリフ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


新しいグリフを作成します。

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
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

新しいグリフ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
