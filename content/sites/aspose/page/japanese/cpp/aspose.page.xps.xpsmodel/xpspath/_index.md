---
title: "Aspose::Page::XPS::XpsModel::XpsPath クラス"
linktitle: "XpsPath"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsPath クラス。Path 要素の機能をカプセル化するクラスです。この要素は、固定ページにベクターグラフィックと画像を追加する唯一の手段です。C++ でページ上に描画される単一のベクターグラフィックを定義します。"
type: docs
weight: 3000
url: /ja/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Path 要素の機能をカプセル化するクラス。この要素は固定ページにベクターグラフィックや画像を追加する唯一の手段で、ページ上にレンダリングされる単一のベクターグラフィックを定義します。

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | このパスを複製します。 |
| [get_Data](./get_data/)() | パスのジオメトリを取得/設定します。 |
| [get_Fill](./get_fill/)() | パスの Data プロパティで指定されたジオメトリを塗るために使用されるブラシを取得/設定します。 |
| [get_Stroke](./get_stroke/)() | ストロークを描画するために使用されるブラシを取得/設定します。 |
| [get_StrokeDashArray](./get_strokedasharray/)() const | アウトラインストロークのダッシュとギャップの長さを指定する配列を取得/設定します。 |
| [get_StrokeDashCap](./get_strokedashcap/)() const | 各ダッシュの端点がどのように描画されるかを指定する値を取得/設定します。 |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | ダッシュ配列パターンを繰り返す開始点を取得/設定します。この値が省略された場合、ダッシュ配列はストロークの原点に合わせられます。 |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | ストローク内の最後のダッシュの終端形状を定義する値を取得/設定します。 |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | ストローク内の最初のダッシュの開始形状を定義する値を取得/設定します。 |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | 最大ミータ長とストローク太さの半分との比率を取得/設定します。この値は、**StrokeLineJoin** 属性が **Miter** を指定している場合にのみ有効です。 |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | ストローク内の最初のダッシュの開始形状を定義する値を取得/設定します。 |
| [get_StrokeThickness](./get_strokethickness/)() const | 有効座標空間の単位（パスのレンダートランスフォームを含む）でストロークの太さを取得/設定します。ストロークは Path 要素の Data プロパティで指定されたジオメトリの境界の上に描画されます。StrokeThickness の半分は Data プロパティで指定されたジオメトリの外側に伸び、残りの半分はジオメトリの内部に伸びます。 |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | パスのジオメトリを取得/設定します。 |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | パスの Data プロパティで指定されたジオメトリを塗るために使用されるブラシを取得/設定します。 |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | ストロークを描画するために使用されるブラシを取得/設定します。 |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | アウトラインストロークのダッシュとギャップの長さを指定する配列を取得/設定します。 |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | 各ダッシュの端点がどのように描画されるかを指定する値を取得/設定します。 |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | ダッシュ配列パターンを繰り返す開始点を取得/設定します。この値が省略された場合、ダッシュ配列はストロークの原点に合わせられます。 |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | ストローク内の最後のダッシュの終端形状を定義する値を取得/設定します。 |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | ストローク内の最初のダッシュの開始形状を定義する値を取得/設定します。 |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | 最大ミータ長とストローク太さの半分との比率を取得/設定します。この値は、**StrokeLineJoin** 属性が **Miter** を指定している場合にのみ有効です。 |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | ストローク内の最初のダッシュの開始形状を定義する値を取得/設定します。 |
| [set_StrokeThickness](./set_strokethickness/)(float) | 有効座標空間の単位（パスのレンダートランスフォームを含む）でストロークの太さを取得/設定します。ストロークは Path 要素の Data プロパティで指定されたジオメトリの境界の上に描画されます。StrokeThickness の半分は Data プロパティで指定されたジオメトリの外側に伸び、残りの半分はジオメトリの内部に伸びます。 |
## 参照

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
