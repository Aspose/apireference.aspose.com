---
title: "System::Drawing::SizeF クラス"
linktitle: "SizeF"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::SizeF クラス。画像の幅と高さを表す単精度浮動小数点値のペアを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 2300
url: /ja/cpp/system.drawing/sizef/
---
## SizeF class


画像の幅と高さを表す単精度浮動小数点値のペアを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。決して [System::SmartPtr](../../system/smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class SizeF
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Add](./add/)(const SizeF\&, const SizeF\&) | 指定された [SizeF](./) オブジェクトの合計となる新しい [SizeF](./) オブジェクトを返します。つまり、幅の値は指定されたオブジェクトの幅の合計に等しく、高さの値は指定されたオブジェクトの高さの合計に等しくなります。 |
| [Equals](./equals/)(const SizeF\&) const | 現在のオブジェクトと指定されたオブジェクトが等しいかどうかを判定します。すなわち、同じ幅と高さのペアを表すかどうかです。 |
| [get_Height](./get_height/)() const | 現在のオブジェクトが表す高さの値を返します。 |
| [get_IsEmpty](./get_isempty/)() const | 幅と高さの両方の値が 0 であるかどうかを判定します。 |
| [get_Width](./get_width/)() const | 現在のオブジェクトが表す幅の値を返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [operator PointF](./operatorpointf/)() const | 現在のオブジェクトの幅と高さの値をそれぞれ X と Y 座標に設定して、[Point](../point/) オブジェクトのインスタンスに変換します。 |
| [operator+=](./operator+=/)(const SizeF\&) | 指定された [SizeF](./) オブジェクトの幅と高さの値を、現在の [SizeF](./) オブジェクトの幅と高さの値にそれぞれ加算します。 |
| [set_Height](./set_height/)(float) | 現在のオブジェクトが表す高さの値を設定します。 |
| [set_Width](./set_width/)(float) | 現在のオブジェクトが表す幅の値を設定します。 |
| [SizeF](./sizef/)() | 新しい [SizeF](./) オブジェクトを作成し、その幅と高さの値を 0 で初期化します。 |
| [SizeF](./sizef/)(const PointF\&) | 新しい [SizeF](./) オブジェクトを作成し、指定された点の X と Y 座標の値で幅と高さの値をそれぞれ初期化します。 |
| [SizeF](./sizef/)(float, float) | 新しい [SizeF](./) オブジェクトを作成し、指定された値で初期化します。 |
| static [Subtract](./subtract/)(const SizeF\&, const SizeF\&) | **size1** から **size2** を減算した結果となる新しい [SizeF](./) オブジェクトを返します。つまり、幅の値は **size1** の幅から **size2** の幅を減算した結果となり、高さの値は **size1** の高さから **size2** の高さを減算した結果となります。 |
| [ToPointF](./topointf/)() const | 現在のオブジェクトの幅と高さの値をそれぞれ X と Y 座標に設定して、[Point](../point/) オブジェクトのインスタンスに変換します。 |
| [ToSize](./tosize/)() const | 現在の [SizeF](./) オブジェクトの幅と高さの値を切り捨てて、次に低い整数値に変換し、[Size](../size/) オブジェクトを作成します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表す幅と高さのペアの文字列表現を返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | 幅と高さの値が 0 の空の [SizeF](./) クラスのインスタンスです。 |
## 参照

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
