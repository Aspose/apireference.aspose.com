---
title: "System::Drawing::Size クラス"
linktitle: "サイズ"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Size クラス。画像の幅と高さを表す整数のペアを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ ではこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 2200
url: /ja/cpp/system.drawing/size/
---
## Size class


画像の幅と高さを表す整数のペアを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。[System::SmartPtr](../../system/smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class Size
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Add](./add/)(const Size\&, const Size\&) | 指定された [Size](./) オブジェクトの合計となる新しい [Size](./) オブジェクトを返します。つまり、幅の値は指定されたオブジェクトの幅の合計に等しく、高さの値は指定されたオブジェクトの高さの合計に等しくなります。 |
| static [Ceiling](./ceiling/)(const SizeF\&) | 指定された [SizeF](../sizef/) オブジェクトの幅と高さの値を次の整数に切り上げて、[Size](./) オブジェクトを構築します。 |
| [Equals](./equals/)(const Size\&) const | 現在のオブジェクトと指定されたオブジェクトが等しいかどうかを判定します。すなわち、同じ幅と高さのペアを表すかどうかです。 |
| [get_Height](./get_height/)() const | 現在のオブジェクトが表す高さの値を返します。 |
| [get_IsEmpty](./get_isempty/)() const | 幅と高さの両方の値が 0 であるかどうかを判定します。 |
| [get_Width](./get_width/)() const | 現在のオブジェクトが表す幅の値を返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [operator Point](./operatorpoint/)() const | [Point](../point/) オブジェクトのインスタンスを作成し、その X と Y 座標を現在のオブジェクトの幅と高さの値でそれぞれ初期化します。 |
| [operator SizeF](./operatorsizef/)() const | [SizeF](../sizef/) オブジェクトのインスタンスを作成し、現在の [Size](./) オブジェクトの幅と高さの値で初期化します。 |
| static [Round](./round/)(const SizeF\&) | 指定された [SizeF](../sizef/) オブジェクトの幅と高さの値を最も近い整数に丸めて、[Size](./) オブジェクトを構築します。 |
| [set_Height](./set_height/)(int) | 現在のオブジェクトが表す高さの値を設定します。 |
| [set_Width](./set_width/)(int) | 現在のオブジェクトが表す幅の値を設定します。 |
| [Size](./size/)() | 新しい [Size](./) オブジェクトを作成し、その幅と高さの値を 0 に初期化します。 |
| [Size](./size/)(const Point\&) | 新しい [Size](./) オブジェクトを作成し、その幅と高さの値を、指定された点の X と Y 座標の値でそれぞれ初期化します。 |
| [Size](./size/)(int, int) | 指定された値で初期化された新しい [Size](./) オブジェクトを構築します。 |
| static [Subtract](./subtract/)(const Size\&, const Size\&) | **size1** から **size2** を減算した結果となる新しい [Size](./) オブジェクトを返します。すなわち、幅の値は **size2's** 幅の値を **size1's** 幅の値から減算した結果であり、高さの値は **size2's** 高さの値を **size1's** 高さの値から減算した結果です。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表す幅と高さのペアの文字列表現を返します。 |
| static [Truncate](./truncate/)(const SizeF\&) | 指定された [SizeF](../sizef/) オブジェクトの幅と高さの値を次の低い整数に切り捨てて、[Size](./) オブジェクトを構築します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | 幅と高さの値が 0 の空の [Size](./) クラスのインスタンスです。 |
## 参照

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
