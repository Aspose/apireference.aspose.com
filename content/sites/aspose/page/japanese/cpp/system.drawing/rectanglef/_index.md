---
title: "System::Drawing::RectangleF class"
linktitle: "RectangleF"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::RectangleF クラス。画像の矩形領域を表し、左上隅の X および Y 座標と幅・高さを単精度浮動小数点数で定義します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 2000
url: /ja/cpp/system.drawing/rectanglef/
---
## RectangleF class


画像の矩形領域を表し、左上隅の X および Y 座標と幅・高さを単精度浮動小数点数で定義します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。 この型のオブジェクトを管理するために [System::SmartPtr](../../system/smartptr/) クラスを使用しないでください。

```cpp
class RectangleF
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Contains](./contains/)(float, float) | 指定された点が現在のオブジェクトで表される矩形内にあるかどうかを判断します。 |
| [Contains](./contains/)(const PointF\&) | 指定された点が現在のオブジェクトで表される矩形内にあるかどうかを判断します。 |
| [Contains](./contains/)(const RectangleF\&) | 指定された矩形が現在のオブジェクトで表される矩形内にあるかどうかを判断します。 |
| [Equals](./equals/)(const RectangleF\&) const | 現在のオブジェクトと指定されたオブジェクトで表される矩形が同一かどうかを判断します。 |
| static [FromLTRB](./fromltrb/)(float, float, float, float) | 指定されたエッジ位置で矩形を表す新しい [RectangleF](./) オブジェクトを作成します。 |
| [get_Bottom](./get_bottom/)() const | 現在のオブジェクトで表される矩形の下端の y 座標を返します。 |
| [get_Height](./get_height/)() const | 現在のオブジェクトで表される矩形の高さを返します。 |
| [get_IsEmpty](./get_isempty/)() const | 現在のオブジェクトで表される矩形の左上隅の X および Y 座標と、幅と高さが 0 の値かどうかを判断します。 |
| [get_Left](./get_left/)() const | 現在のオブジェクトで表される矩形の左端の X 座標を返します。 |
| [get_Location](./get_location/)() const | 現在のオブジェクトで表される矩形の左上隅の位置を指定する [PointF](../pointf/) クラスのインスタンスを返します。 |
| [get_Right](./get_right/)() const | 現在のオブジェクトで表される矩形の右端の X 座標を返します。 |
| [get_Size](./get_size/)() const | 現在のオブジェクトで表される矩形の幅と高さを指定する [SizeF](../sizef/) クラスのインスタンスを返します。 |
| [get_Top](./get_top/)() const | 現在のオブジェクトで表される矩形の上端の Y 座標を返します。 |
| [get_Width](./get_width/)() const | 現在のオブジェクトで表される矩形の幅を返します。 |
| [get_X](./get_x/)() const | 現在のオブジェクトで表される矩形の左上隅の X 座標を返します。 |
| [get_Y](./get_y/)() const | 現在のオブジェクトで表される矩形の左上隅の Y 座標を返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [Inflate](./inflate/)(float, float) | 現在のオブジェクトで表される矩形の幅と高さを、矩形の幾何中心の位置を維持しながら増加させます。幅と高さは指定された量だけ両方向に増加します。 |
| [Inflate](./inflate/)(const SizeF\&) | 現在のオブジェクトで表される矩形の幅と高さを、矩形の幾何中心の位置を維持しながら増加させます。幅と高さは、指定されたサイズオブジェクトの幅と高さの値でそれぞれ指定された量だけ両方向に増加します。 |
| static [Inflate](./inflate/)(const RectangleF\&, float, float) | 指定されたオブジェクトで表される矩形の幅と高さを、矩形の幾何中心の位置を維持しながら増加させます。幅と高さは指定された量だけ両方向に増加します。 |
| [Intersect](./intersect/)(const RectangleF\&) | 現在のオブジェクトで表される矩形を、指定されたオブジェクトで表される矩形との交差結果となる矩形に置き換えます。 |
| static [Intersect](./intersect/)(const RectangleF\&, const RectangleF\&) | 指定された矩形の交差結果となる矩形を返します。 |
| [IntersectsWith](./intersectswith/)(const RectangleF\&) | 現在のオブジェクトと指定されたオブジェクトで表される矩形が交差するかどうかを判断します。 |
| [Offset](./offset/)(const PointF\&) | 現在のオブジェクトで表される矩形の位置を、指定された量だけオフセットします。 |
| [Offset](./offset/)(float, float) | 現在のオブジェクトで表される矩形の位置を、指定された量だけオフセットします。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 常に true を返します。 |
| [operator==](./operator==/)(std::nullptr_t) const | 常に false を返します。 |
| [RectangleF](./rectanglef/)() | X および Y 座標と幅と高さの値が 0 に設定された矩形を表す新しい [RectangleF](./) オブジェクトのインスタンスを作成します。 |
| [RectangleF](./rectanglef/)(float, float, float, float) | 左上隅の指定された座標と幅と高さで矩形を表す新しい [RectangleF](./) オブジェクトのインスタンスを作成します。 |
| [RectangleF](./rectanglef/)(const PointF\&, const SizeF\&) | 新しい [RectangleF](./) オブジェクトのインスタンスを作成します。このオブジェクトは、左上隅の座標が [PointF](../pointf/) クラスのインスタンスとして指定され、幅と高さが [SizeF](../sizef/) クラスのインスタンスとして指定された矩形を表します。 |
| explicit [RectangleF](./rectanglef/)(const Rectangle\&) | 指定された矩形と等価な矩形を表す新しい [RectangleF](./) オブジェクトのインスタンスを作成します。 |
| [set_Height](./set_height/)(float) | 現在のオブジェクトが表す矩形の高さを設定します。 |
| [set_Location](./set_location/)(PointF) | 現在のオブジェクトが表す矩形の左上隅の位置を設定します。 |
| [set_Size](./set_size/)(SizeF) | 現在のオブジェクトが表す矩形の幅と高さを設定します。 |
| [set_Width](./set_width/)(float) | 現在のオブジェクトが表す矩形の幅を設定します。 |
| [set_X](./set_x/)(float) | 現在のオブジェクトが表す矩形の左上隅の X 座標を設定します。 |
| [set_Y](./set_y/)(float) | 現在のオブジェクトが表す矩形の左上隅の Y 座標を設定します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトの文字列表現を返します。 |
| static [Union](./union/)(const RectangleF\&, const RectangleF\&) | 指定された矩形の合成結果となる矩形を返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | 空の矩形、つまり位置とサイズの値がすべて 0 の矩形です。 |
## 参照

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
