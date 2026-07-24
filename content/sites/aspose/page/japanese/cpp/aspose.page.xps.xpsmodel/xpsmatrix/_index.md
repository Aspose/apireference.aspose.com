---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix クラス"
linktitle: "XpsMatrix"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix クラス。MatrixTransform プロパティ要素の機能をカプセル化するクラスです。この要素は、C++ で要素の座標系を操作するために使用される任意のアフィン行列変換を定義します。"
type: docs
weight: 2600
url: /ja/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


MatrixTransform プロパティ要素の機能をカプセル化するクラス。この要素は要素の座標系を操作するために使用される任意のアフィン行列変換を定義します。

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | この変換行列を複製します。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 指定された [System::Object](../../system/object/) がこのインスタンスと等しいかどうかを判断します。 |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | 実際の実装です。 |
| [get_IsIdentity](./get_isidentity/)() | このインスタンスが単位行列かどうかを示す値を取得します。 |
| [get_M11](./get_m11/)() | M11 要素を取得します。 |
| [get_M12](./get_m12/)() | M12 要素を取得します。 |
| [get_M21](./get_m21/)() | M21 要素を取得します。 |
| [get_M22](./get_m22/)() | M22 要素を取得します。 |
| [get_M31](./get_m31/)() | M31 要素を取得します。 |
| [get_M32](./get_m32/)() | M32 要素を取得します。 |
| [GetHashCode](./gethashcode/)() const override | このインスタンスのハッシュコードを返します。 |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | この行列を、*matrix* で指定された行列と、*matrixOrder* で指定された順序で乗算します。 |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | この行列を、*matrix* で指定された行列とデフォルト（Prepend）順序で掛け算します。 |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | この行列を、*matrix* で指定された行列と、*matrixOrder* で指定された順序で乗算します。 |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | この行列を、*matrix* で指定された行列とデフォルト（Prepend）順序で掛け算します。 |
| [Reset](./reset/)() | この Matrix を単位行列にリセットします。 |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | *angle* で時計回りに回転させ、*matrixOrder* で指定された順序でこの Matrix に適用します。 |
| [Rotate](./rotate/)(float) | *angle* で時計回りに回転させ、デフォルト（Prepend）順序でこの Matrix に適用します。 |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | *pivot* の周りで *angle* だけ時計回りに回転させ、*matrixOrder* で指定された順序でこの Matrix に適用します。 |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | *pivot* の周りで *angle* だけ時計回りに回転させ、デフォルト（Prepend）順序でこの Matrix に適用します。 |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | 指定されたスケールベクトル（scaleX と scaleY）を、*matrixOrder* で指定された順序でこの Matrix に適用します。 |
| [Scale](./scale/)(float, float) | 指定されたスケールベクトル（scaleX と scaleY）を、デフォルト（Prepend）順序でこの Matrix に適用します。 |
| [Skew](./skew/)(double, double) | 指定されたせん断変換をこの Matrix に適用します。 |
| [ToString](./tostring/)() const override | この [XpsMatrix](./) インスタンスの文字列表現を返します。 |
| [Transform](./transform/)(System::Drawing::RectangleF) | この Matrix が表すアフィン変換を、指定された矩形に適用します。 |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | この Matrix が表すアフィン変換を、指定された点に適用します。 |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | この Matrix が表すアフィン変換を、ポイント配列の指定された部分に適用します。 |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | この Matrix が表すアフィン変換を、指定されたポイント配列に適用します。 |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | 指定された平行移動ベクトルを、*matrixOrder* で指定された順序でこの Matrix に適用します。 |
| [Translate](./translate/)(float, float) | 指定された平行移動ベクトルをこの Matrix に適用します。 |
## 参照

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
