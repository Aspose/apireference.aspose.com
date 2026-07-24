---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry クラス"
linktitle: "XpsPathGeometry"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry クラス。PathGeometry プロパティ要素の機能をカプセル化するクラスです。この要素は C++ で Figures 属性または子 PathFigure 要素で指定されたパス図形のセットを含みます。"
type: docs
weight: 3200
url: /ja/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


PathGeometry プロパティ要素の機能をカプセル化するクラス。この要素は Figures 属性または子要素の PathFigure 要素で指定されたパスフィギュアの集合を含みます。

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | 最後のパス図形の子セグメントリストにパスセグメントを追加します。 |
| [Clone](./clone/)() | このパスジオメトリをクローンします。 |
| [get_FillRule](./get_fillrule/)() const | 幾何形状の交差領域がどのように結合されて領域を形成するかを指定する値を取得/設定します。 |
| [get_PathFigures](./get_pathfigures/)() | 子パス図形のリストを取得します。 |
| [get_Transform](./get_transform/)() override | パスジオメトリのすべての子および子孫要素に対して、塗りつぶし、クリッピング、またはストロークに使用される前に適用されるローカル行列変換を確立するアフィン変換行列を取得/設定します。 |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | 最後のパス図形の子セグメントリストの *index* 位置にパスセグメントを挿入します。 |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | 最後のパス図形の子セグメントリストからパスセグメントを削除します。 |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | 最後のパス図形の子セグメントリストの *index* 位置からパスセグメントを削除します。 |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | 幾何形状の交差領域がどのように結合されて領域を形成するかを指定する値を取得/設定します。 |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | パスジオメトリのすべての子および子孫要素に対して、塗りつぶし、クリッピング、またはストロークに使用される前に適用されるローカル行列変換を確立するアフィン変換行列を取得/設定します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n 番目のテンプレート引数を弱参照ポインタに設定します（共有ではなく）。コンテナ内のポインタを弱モードに切り替えることができます。 |
## 参照

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
