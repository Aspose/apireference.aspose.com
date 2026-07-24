---
title: "System::Drawing::Drawing2D::PathGradientBrush クラス"
linktitle: "PathGradientBrush"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::PathGradientBrush クラス。グラデーションで GraphicsPath オブジェクトの内部を塗りつぶすブラシを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 1200
url: /ja/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


グラデーションで [GraphicsPath](../graphicspath/) オブジェクトの内部を塗りつぶすブラシを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | 現在のオブジェクトのコピーを作成します。 |
| [get_Blend](./get_blend/)() const | 未実装です。 |
| [get_CenterColor](./get_centercolor/)() const | 現在のオブジェクトが塗りつぶしたパスの中心にある色を返します。 |
| [get_CenterPoint](./get_centerpoint/)() const | グラデーションの中心点を取得します。 |
| [get_FocusScales](./get_focusscales/)() const | グラデーションの減衰の焦点位置を取得します。 |
| [get_InterpolationColors](./get_interpolationcolors/)() const | 多色線形グラデーションを定義する値を返します。 |
| [get_Rectangle](./get_rectangle/)() | 未実装です。 |
| [get_SurroundColors](./get_surroundcolors/)() const | この [PathGradientBrush](./) が塗りつぶすパスの点に対応する色を返します。 |
| [get_Transform](./get_transform/)() const | 現在のオブジェクトが表すブラシの幾何変換を指定する [Matrix](../matrix/) オブジェクトのコピーを返します。 |
| [get_WrapMode](./get_wrapmode/)() const | ラップモードを返します。 |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | 現在のオブジェクトの変換行列を指定された行列で乗算します。 |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | RTTI 情報。 |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | [PathGradientBrush](./) クラスの新しいインスタンスを構築します。 |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | [PathGradientBrush](./) クラスの新しいインスタンスを構築します。 |
| [ResetTransform](./resettransform/)() | 現在のオブジェクトの変換行列をリセットし、単位行列にします。 |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 指定された順序で、ローカルの幾何変換を指定された角度だけ回転させます。 |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 指定された順序で、ローカルの幾何変換を指定された係数で拡大縮小します。 |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | このブラシの基本色の係数と位置を指定するブレンドを設定します。 |
| [set_CenterColor](./set_centercolor/)(Color) | 現在のオブジェクトが塗りつぶしたパスの中心にある色を設定します。 |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | グラデーションの中心点を設定します。 |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | グラデーションの減衰の焦点位置を設定します。 |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | 多色線形グラデーションを定義する値を設定します。 |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | この [PathGradientBrush](./) が塗りつぶすパスの点に対応する色を設定します。 |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | 現在のオブジェクトが表すブラシの幾何変換を指定する [Matrix](../matrix/) オブジェクトを設定します。 |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | ラップモードを設定します。 |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | 未実装です。 |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | 未実装です。 |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 指定された順序で、ローカルの幾何変換を指定された寸法だけ平行移動します。 |
## 参照

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
