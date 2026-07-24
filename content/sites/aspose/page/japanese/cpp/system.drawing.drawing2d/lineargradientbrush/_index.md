---
title: "System::Drawing::Drawing2D::LinearGradientBrush クラス"
linktitle: "LinearGradientBrush"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::LinearGradientBrush クラス。線形グラデーションブラシを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 900
url: /ja/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


線形グラデーションブラシを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | 現在のオブジェクトのコピーを作成します。 |
| [get_Blend](./get_blend/)() const | このブラシの基本色の係数と位置を指定するブレンドを返します。 |
| [get_GammaCorrection](./get_gammacorrection/)() const | このブラシでガンマ補正が有効になっていることを示す値を返します。 |
| [get_InterpolationColors](./get_interpolationcolors/)() const | マルチカラー線形グラデーションを定義する [ColorBlend](../colorblend/) オブジェクトを返します。 |
| [get_LinearColors](./get_linearcolors/)() const | このグラデーションの開始色と終了色を返します。 |
| [get_Rectangle](./get_rectangle/)() | 境界矩形を返します。 |
| [get_Transform](./get_transform/)() const | 現在のオブジェクトが表すブラシの幾何変換を指定する [Matrix](../matrix/) オブジェクトのコピーを返します。 |
| [get_WrapMode](./get_wrapmode/)() const | ラップモードを返します。 |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | RTTI 情報。 |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | [LinearGradientBrush](./) の新しいインスタンスを構築します。 |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | [LinearGradientBrush](./) の新しいインスタンスを構築します。 |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | [LinearGradientBrush](./) の新しいインスタンスを構築します。 |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | [LinearGradientBrush](./) の新しいインスタンスを構築します。 |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | [LinearGradientBrush](./) の新しいインスタンスを構築します。 |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | 現在のオブジェクトの変換行列を指定された行列で乗算します。 |
| [ResetTransform](./resettransform/)() | 現在のオブジェクトの変換行列をリセットします。 |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | 現在のオブジェクトの変換行列を回転させます。 |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | 現在のオブジェクトの変換行列をスケールします。 |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | このブラシの基本色の係数と位置を指定するブレンドを設定します。 |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | このブラシのガンマ補正状態を設定します。 |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | マルチカラー線形グラデーションを定義する [ColorBlend](../colorblend/) オブジェクトを設定します。 |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | このグラデーションの開始色と終了色を設定します。 |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | 現在のオブジェクトが表すブラシの幾何変換を指定する [Matrix](../matrix/) オブジェクトを設定します。 |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | ラップモードを設定します。 |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | 未実装です。 |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | 未実装です。 |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 現在のオブジェクトの変換行列を平行移動します。 |
## 参照

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
