---
title: "System::Drawing::Point クラス"
linktitle: "Point"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Point クラス。2 次元平面上の点の整数 X および Y 座標のペアを表します。この型はスタック上に割り当て、値または参照で関数に渡すべきです。C++ ではこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 1700
url: /ja/cpp/system.drawing/point/
---
## Point class


2 次元平面上の点の整数 X および Y 座標のペアを表します。この型はスタック上に割り当て、値または参照で関数に渡すべきです。[System::SmartPtr](../../system/smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class Point
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Add](./add/)(const Point\&, const Size\&) | 指定された [Size](../size/) オブジェクトの幅と高さの値を、指定された [Point](./) オブジェクトの X および Y 座標値にそれぞれ加算します。 |
| static [Ceiling](./ceiling/)(const PointF\&) | 指定された [PointF](../pointf/) オブジェクトの X と Y 座標値を次の整数に切り上げて、[Point](./) オブジェクトを構築します。 |
| [Equals](./equals/)(const Point\&) const | 現在のオブジェクトと指定されたオブジェクトが等しいかどうか、すなわち同じ X および Y 座標のペアを表すかを判定します。 |
| [get_IsEmpty](./get_isempty/)() const | X と Y の座標値が両方とも 0 に等しいかどうかを判定します。 |
| [get_X](./get_x/)() const | 現在のオブジェクトが表す X 座標の値を返します。 |
| [get_Y](./get_y/)() const | 現在のオブジェクトが表す Y 座標の値を返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [getStdHash](./getstdhash/)() const | 現在のオブジェクトのハッシュ値を返します。 |
| [IsNull](./isnull/)() const | 常に false を返します。 |
| [Offset](./offset/)(int, int) | 現在のオブジェクトが表す X と Y 座標値を、指定された値だけオフセットします。 |
| [Offset](./offset/)(Point) | 現在のオブジェクトが表す X と Y 座標を、指定された [Point](./) オブジェクトが表す X と Y 座標の値でそれぞれオフセットします。 |
| [operator PointF](./operatorpointf/)() const | [PointF](../pointf/) オブジェクトのインスタンスを構築し、現在の [Point](./) オブジェクトの X と Y 座標値で初期化します。 |
| [operator Size](./operatorsize/)() const | [Size](../size/) オブジェクトのインスタンスを構築し、その幅と高さの値を現在のオブジェクトが表す X と Y 座標値でそれぞれ初期化します。 |
| [Point](./point/)() | 新しい [Point](./) オブジェクトを構築し、X と Y 座標値を 0 で初期化します。 |
| [Point](./point/)(int, int) | 新しい [Point](./) オブジェクトを構築し、指定された値で初期化します。 |
| [Point](./point/)(const Size\&) | 新しい [Point](./) オブジェクトを構築し、指定された [SizeF](../sizef/) オブジェクトの幅と高さの値で X と Y 座標値をそれぞれ初期化します。 |
| [Point](./point/)(int) | 新しい [Point](./) オブジェクトを構築し、X 座標値を指定された 32 ビット整数の上位 16 ビットで構成された値で、Y 座標値を指定された 32 ビット整数の下位 16 ビットで構成された値で初期化します。 |
| static [Round](./round/)(const PointF\&) | 指定された [PointF](../pointf/) オブジェクトから [Point](./) オブジェクトを作成し、[PointF](../pointf/) オブジェクトの X と Y 座標値を最も近い整数に丸めます。 |
| [set_X](./set_x/)(int) | 現在のオブジェクトが表す X 座標の値を設定します。 |
| [set_Y](./set_y/)(int) | 現在のオブジェクトが表す Y 座標の値を設定します。 |
| static [Subtract](./subtract/)(const Point\&, const Size\&) | 指定された [Size](../size/) オブジェクトの幅と高さの値を、指定された [Point](./) オブジェクトの X と Y 座標値からそれぞれ減算します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表す X と Y 座標のペアの文字列表現を返します。 |
| static [Truncate](./truncate/)(const PointF\&) | 指定された [PointF](../pointf/) オブジェクトから [Point](./) オブジェクトを作成し、[PointF](../pointf/) オブジェクトの X と Y 座標値を次の低い整数に切り捨てます。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | [Point](./) クラスの空のインスタンスで、X と Y の座標値は 0 です。 |
## 参照

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
