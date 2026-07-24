---
title: "System::Drawing::Drawing2D::Matrix クラス"
linktitle: "Matrix"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::Matrix クラス。変換操作を定義する 3x3 行列を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1000
url: /ja/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


変換操作を定義する 3x3 行列を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class Matrix : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() const | 現在のオブジェクトのコピーを作成します。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したすべてのオペレーティングシステムリソースを解放します。 |
| [Equals](./equals/)(ptr) override | 指定されたオブジェクトが [Matrix](./) であり、このオブジェクトと同一かどうかをテストします。 |
| [get_Elements](./get_elements/)() const | 行列の要素を次の順序で含む配列を返します: m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | 現在のオブジェクトが表す行列が単位行列かどうかを判定します。 |
| [get_IsInvertible](./get_isinvertible/)() const | 現在のオブジェクトが表す行列が逆行列可能かどうかを判定します。 |
| [get_OffsetX](./get_offsetx/)() const | 現在のオブジェクトが表す行列の X 平行移動値を返します。 |
| [get_OffsetY](./get_offsety/)() const | 現在のオブジェクトが表す行列の Y 平行移動値を返します。 |
| [Invert](./invert/)() | 現在のオブジェクトが表す行列を逆行列にします。 |
| [Matrix](./matrix/)() | [Matrix](./) クラスの新しいインスタンスを作成し、単位行列を表します。 |
| [Matrix](./matrix/)(float, float, float, float, float, float) | [Matrix](./) クラスの新しいインスタンスを作成し、指定された値で初期化します。 |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | 指定された矩形と点の配列で定義された幾何変換を表すように、[Matrix](./) クラスの新しいインスタンスを作成します。 |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | 指定された矩形と点の配列で定義された幾何変換を表すように、[Matrix](./) クラスの新しいインスタンスを作成します。 |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | 現在のオブジェクトが表す行列に指定された行列を掛けます。 |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | 現在のオブジェクトが表す行列に指定された行列を掛けます。 |
| [Reset](./reset/)() | 現在のオブジェクトが表す行列をリセットし、単位行列にします。 |
| [Rotate](./rotate/)(float) | 現在のオブジェクトが表す行列を指定された角度だけ時計回りに回転させます。 |
| [Rotate](./rotate/)(float, MatrixOrder) | 現在のオブジェクトが表す行列を原点を中心に指定された角度だけ時計回りに回転させます。 |
| [RotateAt](./rotateat/)(float, const PointF\&) | 現在のオブジェクトが表す行列を指定された点を中心に指定された角度だけ時計回りに回転させます。 |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | 現在のオブジェクトが表す行列を指定された点を中心に指定された角度だけ時計回りに回転させます。 |
| [Scale](./scale/)(float, float) | 指定されたスケールベクトルを現在のオブジェクトが表す行列に適用します。 |
| [Scale](./scale/)(float, float, MatrixOrder) | 指定されたスケールベクトルを現在のオブジェクトが表す行列に適用します。 |
| [Shear](./shear/)(float, float) | 指定されたせん断ベクトルを現在のオブジェクトが表す行列に適用します。 |
| [Shear](./shear/)(float, float, MatrixOrder) | 指定されたせん断ベクトルを現在のオブジェクトが表す行列に適用します。 |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | 現在のオブジェクトが表す行列で定義された幾何変換を指定された点に適用します。 |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | 現在のオブジェクトが表す行列で定義された幾何変換を指定された点に適用します。 |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | 現在のオブジェクトが表す行列で定義された幾何変換を指定された点に適用します。 |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | 現在のオブジェクトが表す行列で定義された幾何変換を指定された点に適用します。 |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | 現在のオブジェクトが表す行列のスケールと回転成分のみを指定された点に適用します。 |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | 現在のオブジェクトが表す行列のスケールと回転成分のみを指定された点に適用します。 |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | 現在のオブジェクトが表す行列のスケールと回転成分のみを指定された点に適用します。 |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | 現在のオブジェクトが表す行列のスケールと回転成分のみを指定された点に適用します。 |
| [Translate](./translate/)(float, float) | 指定された平行移動ベクトルを現在のオブジェクトが表す行列に適用します。 |
| [Translate](./translate/)(float, float, MatrixOrder) | 指定された平行移動ベクトルを現在のオブジェクトが表す行列に適用します。 |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | 配列内の各ベクトルに現在のオブジェクトが表す行列を掛けます。 |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | 配列内の各ベクトルに現在のオブジェクトが表す行列を掛けます。 |
| virtual [~Matrix](./~matrix/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
