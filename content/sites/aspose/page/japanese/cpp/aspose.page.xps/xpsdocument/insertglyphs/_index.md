---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs メソッド"
linktitle: "InsertGlyphs"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs メソッド。C++ でインデックス位置に新しいグリフをアクティブページに挿入します。"
type: docs
weight: 4400
url: /ja/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


*index* 番目の位置に、アクティブページへ新しいグリフを挿入します。

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| インデックス | int32_t | 新しいグリフを挿入すべき位置です。 |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) リソース。 |
| fontSize | float | [Font](../../../aspose.page.font/) サイズ。 |
| originX | 単精度浮動小数点数 | グリフの原点 X 座標。 |
| originY | 単精度浮動小数点数 | グリフの原点 Y 座標。 |
| unicodeString | System::String | 印刷する文字列。 |

### ReturnValue

挿入されたグリフです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


*index* 番目の位置に、アクティブページへ新しいグリフを挿入します。

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| インデックス | int32_t | 新しいグリフを挿入すべき位置です。 |
| fontFamily | System::String | [Font](../../../aspose.page.font/) ファミリ。 |
| fontSize | float | [Font](../../../aspose.page.font/) サイズ。 |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) スタイル。 |
| originX | 単精度浮動小数点数 | グリフの原点 X 座標。 |
| originY | 単精度浮動小数点数 | グリフの原点 Y 座標。 |
| unicodeString | System::String | 印刷する文字列。 |

### ReturnValue

挿入されたグリフです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
