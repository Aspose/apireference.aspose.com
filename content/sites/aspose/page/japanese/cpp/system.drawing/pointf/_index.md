---
title: "System::Drawing::PointF クラス"
linktitle: "PointF"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::PointF クラス。2 次元平面上の点の X および Y 座標（単精度浮動小数点）のペアを表します。この型はスタック上に割り当て、値または参照で関数に渡すべきです。C++ ではこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 1800
url: /ja/cpp/system.drawing/pointf/
---
## PointF class


2 次元平面上の点の X および Y 座標（単精度浮動小数点）のペアを表します。この型はスタック上に割り当て、値または参照で関数に渡すべきです。決して [System::SmartPtr](../../system/smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class PointF
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Add](./add/)(const PointF\&, const SizeF\&) | 指定された [SizeF](../sizef/) オブジェクトの幅と高さの値を、指定された [PointF](./) オブジェクトの X および Y 座標値にそれぞれ加算します。 |
| static [Add](./add/)(const PointF\&, const Size\&) | 指定された [Size](../size/) オブジェクトの幅と高さの値を、指定された [PointF](./) オブジェクトの X および Y 座標値にそれぞれ加算します。 |
| [Equals](./equals/)(const PointF\&) const | 現在のオブジェクトと指定されたオブジェクトが等しいかどうか、すなわち同じ X および Y 座標のペアを表すかを判定します。 |
| [get_IsEmpty](./get_isempty/)() const | X と Y の座標値が両方とも 0 に等しいかどうかを判定します。 |
| [get_X](./get_x/)() const | 現在のオブジェクトが表す X 座標の値を返します。 |
| [get_Y](./get_y/)() const | 現在のオブジェクトが表す Y 座標の値を返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [IsNull](./isnull/)() const | 常に false を返します。 |
| explicit [operator bool](./operatorbool/)() | 常に true を返します。 |
| [PointF](./pointf/)() | 新しい [PointF](./) オブジェクトを作成し、その X および Y 座標の値を 0 に初期化します。 |
| [PointF](./pointf/)(float, float) | 新しい [PointF](./) オブジェクトを作成し、指定された値で初期化します。 |
| [PointF](./pointf/)(const SizeF\&) | 新しい [PointF](./) オブジェクトを作成し、その X および Y 座標の値を、指定された [SizeF](../sizef/) オブジェクトの幅と高さの値でそれぞれ初期化します。 |
| [set_X](./set_x/)(float) | 現在のオブジェクトが表す X 座標の値を設定します。 |
| [set_Y](./set_y/)(float) | 現在のオブジェクトが表す Y 座標の値を設定します。 |
| static [Subtract](./subtract/)(const PointF\&, const SizeF\&) | 指定された [SizeF](../sizef/) オブジェクトの幅と高さの値を、指定された [PointF](./) オブジェクトの X および Y 座標の値からそれぞれ減算します。 |
| static [Subtract](./subtract/)(const PointF\&, const Size\&) | 指定された [Size](../size/) オブジェクトの幅と高さの値を、指定された [PointF](./) オブジェクトの X および Y 座標の値からそれぞれ減算します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表す X と Y 座標のペアの文字列表現を返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | X と Y 座標の値が 0 の空の [PointF](./) クラスのインスタンスです。 |
## 参照

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
