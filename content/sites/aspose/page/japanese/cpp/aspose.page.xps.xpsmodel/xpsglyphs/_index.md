---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs クラス"
linktitle: "XpsGlyphs"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs クラス。Glyphs 要素の機能をカプセル化するクラス。この要素は単一フォントからの均一にフォーマットされたテキストのランを表します。正確なレンダリングに必要な情報を提供し、C++ のビューアで検索および選択機能をサポートします。"
type: docs
weight: 1500
url: /ja/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Glyphs 要素の機能をカプセル化するクラス。この要素は単一フォントからの均一にフォーマットされたテキストのランを表します。正確なレンダリングに必要な情報を提供し、ビューアでの検索および選択機能をサポートします。

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | このグリフをクローンします。 |
| [get_BidiLevel](./get_bidilevel/)() const | Unicode アルゴリズムの双方向入れ子レベルを指定する値を取得/設定します。偶数値は左から右へのレイアウトを意味し、奇数値は右から左へのレイアウトを意味します。右から左へのレイアウトでは、最初のグリフの右側にランの起点が置かれ、正の前進幅（左方向への進みを表す）により、後続のグリフが前のグリフの左側に配置されます。 |
| [get_Fill](./get_fill/)() | レンダリングされたグリフの形状を塗りつぶすために使用されるブラシを取得/設定します。 |
| [get_Font](./get_font/)() | **TrueType** フォントを使用して要素のテキストを組版するためのフォントリソースを取得します。 |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | 描画サーフェス単位でのフォントサイズを取得/設定します。サイズは有効座標空間の単位で表された浮動小数点数です。 |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | 取得/設定する値は、グリフが横向きに回転していることを示し、原点は回転していないグリフの上部中央として定義されます。 |
| [get_OriginX](./get_originx/)() const | 取得/設定するのは、ラン内の最初のグリフの X 座標で、実効座標空間の単位で表されます。 |
| [get_OriginY](./get_originy/)() const | 取得/設定するのは、ラン内の最初のグリフの Y 座標で、実効座標空間の単位で表されます。 |
| [get_StyleSimulations](./get_stylesimulations/)() const | 取得/設定する値は、スタイル シミュレーションを指定します。 |
| [get_UnicodeString](./get_unicodestring/)() const | 取得/設定する文字列は、Glyphs 要素によって描画されるテキストです。テキストは Unicode コードポイントとして指定されます。 |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Unicode アルゴリズムの双方向入れ子レベルを指定する値を取得/設定します。偶数値は左から右へのレイアウトを意味し、奇数値は右から左へのレイアウトを意味します。右から左へのレイアウトでは、最初のグリフの右側にランの起点が置かれ、正の前進幅（左方向への進みを表す）により、後続のグリフが前のグリフの左側に配置されます。 |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | レンダリングされたグリフの形状を塗りつぶすために使用されるブラシを取得/設定します。 |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | 描画サーフェス単位でのフォントサイズを取得/設定します。サイズは有効座標空間の単位で表された浮動小数点数です。 |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | 取得/設定する値は、グリフが横向きに回転していることを示し、原点は回転していないグリフの上部中央として定義されます。 |
| [set_OriginX](./set_originx/)(float) | 取得/設定するのは、ラン内の最初のグリフの X 座標で、実効座標空間の単位で表されます。 |
| [set_OriginY](./set_originy/)(float) | 取得/設定するのは、ラン内の最初のグリフの Y 座標で、実効座標空間の単位で表されます。 |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | 取得/設定する値は、スタイル シミュレーションを指定します。 |
| [set_UnicodeString](./set_unicodestring/)(System::String) | 取得/設定する文字列は、Glyphs 要素によって描画されるテキストです。テキストは Unicode コードポイントとして指定されます。 |
## 参照

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
