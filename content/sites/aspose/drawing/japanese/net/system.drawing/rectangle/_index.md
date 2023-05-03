---
title: Struct Rectangle
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Rectangle 構造体. 四角形の位置とサイズを表す 4 つの整数のセットを格納します
type: docs
weight: 1040
url: /ja/net/system.drawing/rectangle/
---
## Rectangle structure

四角形の位置とサイズを表す 4 つの整数のセットを格納します。

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Rectangle](rectangle/#constructor_1)(Point, Size) | の新しいインスタンスを初期化します`Rectangle`指定された場所とサイズの構造体. |
| [Rectangle](rectangle/#constructor)(int, int, int, int) | 指定された位置とサイズで Rectangle 構造体の新しいインスタンスを初期化します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom/) { get; } | この Rectangle 構造体の Y プロパティ値と Height プロパティ値の合計である y 座標を取得します。 |
| [Height](../../system.drawing/rectangle/height/) { get; set; } | この Rectangle 構造体の高さを取得または設定します。 |
| [IsEmpty](../../system.drawing/rectangle/isempty/) { get; } | このすべての数値プロパティが`Rectangle`ゼロの値を持つ. |
| [Left](../../system.drawing/rectangle/left/) { get; } | この Rectangle 構造体の左端の x 座標を取得します。 |
| [Location](../../system.drawing/rectangle/location/) { get; set; } | この左上隅の座標を取得または設定しますRectangle構造体. |
| [Right](../../system.drawing/rectangle/right/) { get; } | この Rectangle 構造体の X プロパティ値と Width プロパティ値の合計である x 座標を取得します。 |
| [Size](../../system.drawing/rectangle/size/) { get; set; } | このサイズを取得または設定しますRectangle. |
| [Top](../../system.drawing/rectangle/top/) { get; } | この Rectangle 構造体の上端の y 座標を取得します。 |
| [Width](../../system.drawing/rectangle/width/) { get; set; } | この Rectangle 構造体の幅を取得または設定します。 |
| [X](../../system.drawing/rectangle/x/) { get; set; } | この Rectangle 構造体の左上隅の x 座標を取得または設定します。 |
| [Y](../../system.drawing/rectangle/y/) { get; set; } | この Rectangle 構造体の左上隅の y 座標を取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling/)(RectangleF) | 指定されたRectangleFへの構造Rectangleを丸めた構造RectangleF値から次に高い整数値へ. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb/)(int, int, int, int) | を作成しますRectangle指定されたエッジ位置を持つ構造. |
| static [Inflate](../../system.drawing/rectangle/inflate/)(Rectangle, int, int) | を作成します`Rectangle`指定された量だけ膨張します. |
| static [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle, Rectangle) | 3 番目を返しますRectangle他の 2 つの Intersection を表す構造体Rectangle構造。交点がない場合は空Rectangle返されます. |
| static [Round](../../system.drawing/rectangle/round/)(RectangleF) | 指定されたRectangleFにRectanglerounding によってRectangleF最も近い整数値への値. |
| static [Truncate](../../system.drawing/rectangle/truncate/)(RectangleF) | 指定されたRectangleFにRectangleを切り捨てることによってRectangleF値. |
| static [Union](../../system.drawing/rectangle/union/)(Rectangle, Rectangle) | を取得しますRectangle 2 つの結合を含む構造Rectangle構造物. |
| [Contains](../../system.drawing/rectangle/contains/#contains_1)(Point) | 指定したポイントがこの範囲内に含まれているかどうかを判断しますRectangle構造体. |
| [Contains](../../system.drawing/rectangle/contains/#contains_2)(Rectangle) | で表される長方形の領域が*rect*これで表される長方形の領域内に完全に含まれています`Rectangle`. |
| [Contains](../../system.drawing/rectangle/contains/#contains)(int, int) | 指定したポイントがこの範囲内に含まれているかどうかを判断しますRectangle構造体. |
| override [Equals](../../system.drawing/rectangle/equals/#equals_1)(object) | obj がRectangleこれと同じ位置とサイズの構造Rectangle構造体. |
| [Equals](../../system.drawing/rectangle/equals/#equals)(Rectangle) | 他の`Rectangle`構造体はこれと同じ位置とサイズを持っています`Rectangle`構造体. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode/)() | このハッシュコードを返しますRectangle構造。ハッシュ コードの使用については、GetHashCode . を参照してください。 |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate_1)(Size) | これを拡大しますRectangle指定された量によって. |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate)(int, int) | これを拡大しますRectangle指定された量によって. |
| [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle) | これを置き換えますRectangleそれ自体と指定されたRectangle. |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith/)(Rectangle) | この長方形が交差するかどうかを決定します*rect*. |
| [Offset](../../system.drawing/rectangle/offset/#offset_1)(Point) | 指定した量だけこの長方形の位置を調整します。 |
| [Offset](../../system.drawing/rectangle/offset/#offset)(int, int) | 指定した量だけこの長方形の位置を調整します。 |
| override [ToString](../../system.drawing/rectangle/tostring/)() | この属性を変換します`Rectangle`人間が読める文字列. |
| [operator ==](../../system.drawing/rectangle/op_equality/) | 2 つのRectangle構造体の位置とサイズは同じです. |
| [operator !=](../../system.drawing/rectangle/op_inequality/) | 2 つのRectangle構造は場所またはサイズが異なります. |

## 田畑

| 名前 | 説明 |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty/) | を表しますRectangleプロパティが初期化されていない構造体. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


