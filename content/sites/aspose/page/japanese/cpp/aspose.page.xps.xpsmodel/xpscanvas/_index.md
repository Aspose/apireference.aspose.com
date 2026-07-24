---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas クラス"
linktitle: "XpsCanvas"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas クラス。Canvas要素の機能をカプセル化するクラスです。この要素は要素をまとめてグループ化します。たとえば、Glyphs と Path の要素を Canvas 内でグループ化して、単位として識別できるように（ハイパーリンク先として）したり、各子要素や先祖要素に対して合成されたプロパティ値を適用したりできます（C++）。"
type: docs
weight: 500
url: /ja/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Canvas 要素の機能をカプセル化するクラス。この要素は要素をまとめます。例えば、Glyphs と Path の要素を Canvas にグループ化して、単位として識別（ハイパーリンク先として）したり、各子要素および祖先要素に合成されたプロパティ値を適用したりできます。

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(T) | この Canvas の子リストに要素を追加します。 |
| [AddCanvas](./addcanvas/)() | この Canvas の子リストに新しい Canvas を追加します。 |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | この Canvas の子リストに新しい Glyphs を追加します。 |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | この Canvas の子リストに新しい Path を追加します。 |
| [Clone](./clone/)() | この Canvas をクローンします。 |
| [get_EdgeMode](./get_edgemode/)() const | Canvas 内のパスのエッジがどのように描画されるかを制御する値を取得/設定します。 |
| [Insert](./insert/)(int32_t, T) | この Canvas の子リストの *index* 番目の位置に要素を挿入します。 |
| [InsertCanvas](./insertcanvas/)(int32_t) | この Canvas の子リストの *index* 番目の位置に新しい Canvas を挿入します。 |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | この Canvas の子リストの *index* 番目の位置に新しい Glyphs を挿入します。 |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | この Canvas の子リストの *index* 番目の位置に新しい Path を挿入します。 |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Canvas 内のパスのエッジがどのように描画されるかを制御する値を取得/設定します。 |
## 参照

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
