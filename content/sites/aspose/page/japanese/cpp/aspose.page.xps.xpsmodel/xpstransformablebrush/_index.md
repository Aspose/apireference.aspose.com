---
title: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush クラス"
linktitle: "XpsTransformableBrush"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush クラス。C++ における変形可能なブラシ要素（SolidColorBrush を除く）の共通機能をカプセル化するクラスです。"
type: docs
weight: 4300
url: /ja/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


変形可能なブラシ要素（SolidColorBrush を除くすべて）の共通機能をカプセル化するクラス。

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Transform](./get_transform/)() override | ブラシの座標空間に適用される行列変換を取得/設定します。Transform プロパティは現在の有効なレンダー変換と連結され、ブラシローカルの有効なレンダー変換を生成します。ブラシのビューポートはローカルの有効なレンダー変換を使用して変換されます。 |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | ブラシの座標空間に適用される行列変換を取得/設定します。Transform プロパティは現在の有効なレンダー変換と連結され、ブラシローカルの有効なレンダー変換を生成します。ブラシのビューポートはローカルの有効なレンダー変換を使用して変換されます。 |
## 参照

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
