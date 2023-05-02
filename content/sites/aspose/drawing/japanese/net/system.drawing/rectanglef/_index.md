---
title: Struct RectangleF
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.RectangleF 構造体. 四角形の位置とサイズを表す 4 つの浮動小数点数のセットを格納します より高度な領域関数についてはRegion オブジェクトを使用します
type: docs
weight: 1050
url: /ja/net/system.drawing/rectanglef/
---
## RectangleF structure

四角形の位置とサイズを表す 4 つの浮動小数点数のセットを格納します。 より高度な領域関数については、Region オブジェクトを使用します。

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [RectangleF](rectanglef/#constructor_1)(PointF, SizeF) | 指定された位置とサイズで RectangleF 構造体の新しいインスタンスを初期化します。 |
| [RectangleF](rectanglef/#constructor)(float, float, float, float) | 指定された位置とサイズで RectangleF 構造体の新しいインスタンスを初期化します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom/) { get; } | この RectangleF 構造体の Y と高さの合計である y 座標を取得します。 |
| [Height](../../system.drawing/rectanglef/height/) { get; set; } | この RectangleF 構造体の高さを取得または設定します。 |
| [IsEmpty](../../system.drawing/rectanglef/isempty/) { get; } | かどうかを示す値を取得します。WidthまたHeightこれの property RectangleFゼロの値を持っています. |
| [Left](../../system.drawing/rectanglef/left/) { get; } | この RectangleF 構造体の左端の x 座標を取得します。 |
| [Location](../../system.drawing/rectanglef/location/) { get; set; } | この左上隅の座標を取得または設定しますRectangleF構造体. |
| [Right](../../system.drawing/rectanglef/right/) { get; } | この RectangleF 構造体の X と幅の合計である x 座標を取得します。 |
| [Size](../../system.drawing/rectanglef/size/) { get; set; } | このサイズを取得または設定しますRectangleF. |
| [Top](../../system.drawing/rectanglef/top/) { get; } | この RectangleF 構造体の上端の y 座標を取得します。 |
| [Width](../../system.drawing/rectanglef/width/) { get; set; } | この RectangleF 構造体の幅を取得または設定します。 |
| [X](../../system.drawing/rectanglef/x/) { get; set; } | この RectangleF 構造体の左上隅の x 座標を取得または設定します。 |
| [Y](../../system.drawing/rectanglef/y/) { get; set; } | この RectangleF 構造体の左上隅の x 座標を取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb/)(float, float, float, float) | 指定された位置に左上隅と右下隅を持つ RectangleF 構造体を作成します。 |
| static [Inflate](../../system.drawing/rectanglef/inflate/)(RectangleF, float, float) | 指定されたRectangleFstructure. コピーは指定された量だけ膨張します。元の長方形は変更されません. |
| static [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF, RectangleF) | を返しますRectangleF 2 つの長方形の交点を表す構造体. 交点がなく、空の場合RectangleF返されます. |
| static [Union](../../system.drawing/rectanglef/union/)(RectangleF, RectangleF) | 結合を形成する 2 つの四角形の両方を含むことができる最小の 3 番目の四角形を作成します. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_1)(PointF) | 指定したポイントがこの範囲内に含まれているかどうかを判断しますRectangleF構造体. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_2)(RectangleF) | で表される長方形の領域が*rect*この中に完全に含まれていますRectangleF構造体. |
| [Contains](../../system.drawing/rectanglef/contains/#contains)(float, float) | 指定したポイントがこの範囲内に含まれているかどうかを判断しますRectangleF構造体. |
| override [Equals](../../system.drawing/rectanglef/equals/#equals_1)(object) | 指定されたObject、このインスタンスと等しい. |
| [Equals](../../system.drawing/rectanglef/equals/#equals)(RectangleF) | 他の`RectangleF`構造体はこれと同じ位置とサイズを持っています`RectangleF`構造体. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode/)() | このインスタンスのハッシュ コードを返します。 |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate_1)(SizeF) | これを膨らませますRectangleF指定された量によって. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate)(float, float) | これを膨らませますRectangleF指定された量で構造化. |
| [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF) | これを置き換えますRectangleFそれ自体と指定された の交点を持つ構造RectangleF構造体. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith/)(RectangleF) | この長方形が交差するかどうかを決定します*rect*. |
| [Offset](../../system.drawing/rectanglef/offset/#offset_1)(PointF) | 指定した量だけこの長方形の位置を調整します。 |
| [Offset](../../system.drawing/rectanglef/offset/#offset)(float, float) | 指定した量だけこの長方形の位置を調整します。 |
| override [ToString](../../system.drawing/rectanglef/tostring/)() | この属性を変換します[`Rectangle`](../rectangle/)人間が読める文字列. |
| [operator ==](../../system.drawing/rectanglef/op_equality/) | 2 つのRectangleF構造体の位置とサイズは同じです. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit/) | 指定された Rectangle 構造体を RectangleF 構造体に変換します。 |
| [operator !=](../../system.drawing/rectanglef/op_inequality/) | 2 つのRectangleF構造は場所またはサイズが異なります. |

## 田畑

| 名前 | 説明 |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty/) | のインスタンスを表しますRectangleFメンバーが初期化されていないクラス. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


