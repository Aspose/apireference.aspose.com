---
title: "System::Drawing::Rectangle クラス"
linktitle: "Rectangle"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Rectangle クラス。画像の矩形領域を表し、左上隅の整数 X および Y 座標と幅と高さで定義されます。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ ではこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 1900
url: /ja/cpp/system.drawing/rectangle/
---
## Rectangle class


画像の矩形領域を表し、左上隅の整数 X および Y 座標と幅と高さで定義されます。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。[System::SmartPtr](../../system/smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class Rectangle
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Ceiling](./ceiling/)(const RectangleF\&) | 指定された [RectangleF](../rectanglef/) オブジェクトの位置とサイズの値を次の整数に切り上げて、[Rectangle](./) オブジェクトを作成します。 |
| [Contains](./contains/)(int, int) const | 指定された点が現在のオブジェクトで表される矩形内にあるかどうかを判断します。 |
| [Contains](./contains/)(const Point\&) const | 指定された点が現在のオブジェクトで表される矩形内にあるかどうかを判断します。 |
| [Contains](./contains/)(const Rectangle\&) const | 指定された矩形が現在のオブジェクトで表される矩形内にあるかどうかを判断します。 |
| [Equals](./equals/)(const Rectangle\&) const | 現在のオブジェクトと指定されたオブジェクトで表される矩形が同一かどうかを判断します。 |
| static [FromLTRB](./fromltrb/)(int, int, int, int) | 指定されたエッジ位置を持つ矩形を表す新しい [Rectangle](./) オブジェクトを作成します。 |
| [get_Bottom](./get_bottom/)() const | 現在のオブジェクトで表される矩形の下端の y 座標を返します。 |
| [get_Height](./get_height/)() const | 現在のオブジェクトで表される矩形の高さを返します。 |
| [get_IsEmpty](./get_isempty/)() const | 現在のオブジェクトで表される矩形の左上隅の X および Y 座標と、幅と高さが 0 の値かどうかを判断します。 |
| [get_Left](./get_left/)() const | 現在のオブジェクトで表される矩形の左端の X 座標を返します。 |
| [get_Location](./get_location/)() const | 現在のオブジェクトが表す矩形の左上隅の位置を指定する [Point](../point/) クラスのインスタンスを返します。 |
| [get_Right](./get_right/)() const | 現在のオブジェクトで表される矩形の右端の X 座標を返します。 |
| [get_Size](./get_size/)() const | 現在のオブジェクトが表す矩形の幅と高さを指定する [Size](../size/) クラスのインスタンスを返します。 |
| [get_Top](./get_top/)() const | 現在のオブジェクトで表される矩形の上端の Y 座標を返します。 |
| [get_Width](./get_width/)() const | 現在のオブジェクトで表される矩形の幅を返します。 |
| [get_X](./get_x/)() const | 現在のオブジェクトで表される矩形の左上隅の X 座標を返します。 |
| [get_Y](./get_y/)() const | 現在のオブジェクトで表される矩形の左上隅の Y 座標を返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [Inflate](./inflate/)(int, int) | 現在のオブジェクトで表される矩形の幅と高さを、矩形の幾何中心の位置を維持しながら増加させます。幅と高さは指定された量だけ両方向に増加します。 |
| [Inflate](./inflate/)(const Size\&) | 現在のオブジェクトで表される矩形の幅と高さを、矩形の幾何中心の位置を維持しながら増加させます。幅と高さは、指定されたサイズオブジェクトの幅と高さの値でそれぞれ指定された量だけ両方向に増加します。 |
| static [Inflate](./inflate/)(const Rectangle\&, int, int) | 指定されたオブジェクトで表される矩形の幅と高さを、矩形の幾何中心の位置を維持しながら増加させます。幅と高さは指定された量だけ両方向に増加します。 |
| [Intersect](./intersect/)(const Rectangle\&) | 現在のオブジェクトで表される矩形を、指定されたオブジェクトで表される矩形との交差結果となる矩形に置き換えます。 |
| static [Intersect](./intersect/)(const Rectangle\&, const Rectangle\&) | 指定された矩形の交差結果となる矩形を返します。 |
| [IntersectsWith](./intersectswith/)(const Rectangle\&) | 現在のオブジェクトと指定されたオブジェクトで表される矩形が交差するかどうかを判断します。 |
| [Offset](./offset/)(const Point\&) | 現在のオブジェクトで表される矩形の位置を、指定された量だけオフセットします。 |
| [Offset](./offset/)(int, int) | 現在のオブジェクトで表される矩形の位置を、指定された量だけオフセットします。 |
| [operator RectangleF](./operatorrectanglef/)() const | 現在のオブジェクトが表す矩形と等価な矩形を表す [RectangleF](../rectanglef/) オブジェクトを返します。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 常に true を返します。 |
| [operator==](./operator==/)(std::nullptr_t) const | 常に false を返します。 |
| [Rectangle](./rectangle/)() | X と Y 座標および幅と高さの値が 0 に設定された矩形を表す新しい [Rectangle](./) オブジェクトのインスタンスを作成します。 |
| [Rectangle](./rectangle/)(int, int, int, int) | 左上隅の指定された座標と幅と高さを持つ矩形を表す新しい [Rectangle](./) オブジェクトのインスタンスを作成します。 |
| [Rectangle](./rectangle/)(const Point\&, const Size\&) | 左上隅の座標を [Point](../point/) クラスのインスタンスで、幅と高さを [Size](../size/) クラスのインスタンスで指定した矩形を表す新しい [Rectangle](./) オブジェクトのインスタンスを作成します。 |
| [Rectangle](./rectangle/)(const System::Windows::Forms::Screen::Rectangle_\&) | 指定された矩形と等価な矩形を表す新しい [Rectangle](./) オブジェクトのインスタンスを作成します。 |
| static [Round](./round/)(const RectangleF\&) | 指定された [RectangleF](../rectanglef/) オブジェクトの位置とサイズの値を最も近い整数に丸めて、[Rectangle](./) オブジェクトを作成します。 |
| [set_Height](./set_height/)(int) | 現在のオブジェクトが表す矩形の高さを設定します。 |
| [set_Location](./set_location/)(Point) | 現在のオブジェクトが表す矩形の左上隅の位置を設定します。 |
| [set_Size](./set_size/)(Size) | 現在のオブジェクトが表す矩形の幅と高さを設定します。 |
| [set_Width](./set_width/)(int) | 現在のオブジェクトが表す矩形の幅を設定します。 |
| [set_X](./set_x/)(int) | 現在のオブジェクトが表す矩形の左上隅の X 座標を設定します。 |
| [set_Y](./set_y/)(int) | 現在のオブジェクトが表す矩形の左上隅の Y 座標を設定します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトの文字列表現を返します。 |
| static [Truncate](./truncate/)(const RectangleF\&) | 指定された [RectangleF](../rectanglef/) オブジェクトの位置とサイズの値を次の整数に切り捨てて、[Rectangle](./) オブジェクトを作成します。 |
| static [Union](./union/)(const Rectangle\&, const Rectangle\&) | 指定された矩形の合成結果となる矩形を返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | 空の矩形、つまり位置とサイズの値がすべて 0 の矩形です。 |
## 参照

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
