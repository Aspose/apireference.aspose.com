---
title: "System::Drawing::Region クラス"
linktitle: "Region"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Region クラス。グラフィック形状の内部を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数の引数として渡すようにしてください。"
type: docs
weight: 2100
url: /ja/cpp/system.drawing/region/
---
## Region class


グラフィック形状の内部を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class Region : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() const | 現在のオブジェクトのコピーを返します。 |
| [Complement](./complement/)(const RectangleF\&) | 現在のオブジェクトが表す領域を、指定された矩形で定義された領域のうち、この領域と交差しない部分に置き換えます。 |
| [Complement](./complement/)(const Rectangle\&) | 現在のオブジェクトが表す領域を、指定された矩形で定義された領域のうち、この領域と交差しない部分に置き換えます。 |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 現在のオブジェクトが表す領域を、指定されたパスで定義された領域のうち、この領域と交差しない部分に置き換えます。 |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | 現在のオブジェクトが表す領域を、指定された領域のうち、この領域と交差しない部分に置き換えます。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したすべてのオペレーティングシステムリソースを解放します。 |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | 指定された描画サーフェス上で、指定された領域が現在のオブジェクトが表す領域と同一かどうかを判定します。 |
| [Exclude](./exclude/)(const RectangleF\&) | 現在のオブジェクトが表す領域を、指定された矩形で定義された領域を除外した結果に置き換えます。 |
| [Exclude](./exclude/)(const Rectangle\&) | 現在のオブジェクトが表す領域を、指定された矩形で定義された領域を除外した結果に置き換えます。 |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 現在のオブジェクトが表す領域を、指定されたパスで定義された領域を除外した結果に置き換えます。 |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | 現在のオブジェクトが表す領域を、指定された領域を除外した結果に置き換えます。 |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | [Graphics](../graphics/) オブジェクトの描画サーフェス上で、この [Region](./) を囲む矩形を表す [RectangleF](../rectanglef/) 構造体を取得します。 |
| [GetRegionData](./getregiondata/)() const | 現在のオブジェクトが表す領域を定義するデータを含む RegionData オブジェクトを返します。 |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | 指定された行列変換が適用された後、この [Region](./) を近似する [RectangleF](../rectanglef/) 構造体の配列を返します。 |
| [Intersect](./intersect/)(const RectangleF\&) | 現在のオブジェクトが表す領域を、この領域と指定された矩形で定義された領域との交差結果に置き換えます。 |
| [Intersect](./intersect/)(const Rectangle\&) | 現在のオブジェクトが表す領域を、この領域と指定された矩形で定義された領域との交差結果に置き換えます。 |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 現在のオブジェクトが表す領域を、この領域と指定されたパスで定義された領域との交差結果に置き換えます。 |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | 現在のオブジェクトが表す領域を、この領域と指定された領域との交差結果に置き換えます。 |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | 現在のオブジェクトが表す領域が、指定された描画サーフェス上で内部が空であるかどうかを判定します。 |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | 現在のオブジェクトが表す領域が、指定された描画サーフェス上で内部が無限であるかどうかを判定します。 |
| [IsVisible](./isvisible/)(const Point\&) const | 指定された点が、現在のオブジェクトが表す領域に含まれているかどうかを判定します。 |
| [IsVisible](./isvisible/)(const PointF\&) const | 指定された点が、現在のオブジェクトが表す領域に含まれているかどうかを判定します。 |
| [IsVisible](./isvisible/)(const Rectangle\&) | 指定された矩形の一部が、現在のオブジェクトが表す領域に含まれているかどうかを判定します。 |
| [IsVisible](./isvisible/)(const RectangleF\&) | 指定された矩形の一部が、現在のオブジェクトが表す領域に含まれているかどうかを判定します。 |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | 指定されたグラフィックスを使用して、指定された点が現在のオブジェクトが表す領域に含まれているかどうかを判定します。 |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | 指定されたグラフィックスを使用して、指定された点が現在のオブジェクトが表す領域に含まれているかどうかを判定します。 |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | 指定されたグラフィックスを使用して、指定された矩形の一部が現在のオブジェクトが表す領域に含まれているかどうかを判定します。 |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | 指定されたグラフィックスを使用して、指定された矩形の一部が現在のオブジェクトが表す領域に含まれているかどうかを判定します。 |
| [IsVisible](./isvisible/)(float, float) const | 指定された点が、現在のオブジェクトが表す領域に含まれているかどうかを判定します。 |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | 指定されたグラフィックスを使用して、指定された点が現在のオブジェクトが表す領域に含まれているかどうかを判定します。 |
| [MakeEmpty](./makeempty/)() | 現在のオブジェクトを内部が空の状態に初期化します。 |
| [MakeInfinite](./makeinfinite/)() | この領域オブジェクトを内部が無限の状態に初期化します。 |
| [Region](./region/)() | [Region](./) クラスの新しいインスタンスを構築します。 |
| [Region](./region/)(const RectangleF\&) | 指定された矩形で定義された領域を表す [Region](./) クラスの新しいインスタンスを構築します。 |
| [Region](./region/)(const Rectangle\&) | 指定された矩形で定義された領域を表す [Region](./) クラスの新しいインスタンスを構築します。 |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 指定されたパスで定義された領域を表す [Region](./) クラスの新しいインスタンスを構築します。 |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | 指定された RegionData オブジェクトで定義された領域を表す [Region](./) クラスの新しいインスタンスを構築します。 |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | この領域を指定された行列で変換します。 |
| [Transform](./transform/)(const SkMatrix\&) | この領域を指定された行列で変換します。 |
| [Translate](./translate/)(int, int) | 領域の座標を指定された量だけ移動します。 |
| [Translate](./translate/)(float, float) | 領域の座標を指定された量だけ移動します。 |
| [Union](./union/)(const RectangleF\&) | 現在のオブジェクトが表す領域を、この領域と指定された矩形で定義された領域との合成結果に置き換えます。 |
| [Union](./union/)(const Rectangle\&) | 現在のオブジェクトが表す領域を、この領域と指定された矩形で定義された領域の合成結果に置き換えます。 |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 現在のオブジェクトが表す領域を、この領域と指定されたパスで定義された領域の合成結果に置き換えます。 |
| [Union](./union/)(const SharedPtr\<Region\>\&) | 現在のオブジェクトが表す領域を、この領域と指定された領域との合成結果に置き換えます。 |
| [Xor](./xor/)(const RectangleF\&) | 現在のオブジェクトが表す領域を、この領域と指定された矩形で定義された領域のうち、交差しない部分に置き換えます。 |
| [Xor](./xor/)(const Rectangle\&) | 現在のオブジェクトが表す領域を、この領域と指定された矩形で定義された領域のうち、交差しない部分に置き換えます。 |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 現在のオブジェクトが表す領域を、この領域と指定されたパスで定義された領域のうち、交差しない部分に置き換えます。 |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | 現在のオブジェクトが表す領域を、この領域と指定された領域のうち、交差しない部分に置き換えます。 |
| virtual [~Region](./~region/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
