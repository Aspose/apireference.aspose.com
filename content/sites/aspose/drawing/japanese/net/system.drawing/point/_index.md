---
title: Struct Point
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Point 構造体. 2 次元平面内の点を定義する整数 x 座標と y 座標の順序付けられたペアを表します
type: docs
weight: 930
url: /ja/net/system.drawing/point/
---
## Point structure

2 次元平面内の点を定義する整数 x 座標と y 座標の順序付けられたペアを表します。

```csharp
public struct Point : IEquatable<Point>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Point](point/#constructor)(int) | の新しいインスタンスを初期化します`Point`整数値で指定された座標を使用する構造体. |
| [Point](point/#constructor_2)(Size) | の新しいインスタンスを初期化します`Point`構造体[`Size`](../size/). |
| [Point](point/#constructor_1)(int, int) | の新しいインスタンスを初期化します`Point`指定された座標を持つ構造体. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [IsEmpty](../../system.drawing/point/isempty/) { get; } | これがこれかどうかを示す値を取得しますPoint空です. |
| [X](../../system.drawing/point/x/) { get; set; } | この Point の x 座標を取得または設定します。 |
| [Y](../../system.drawing/point/y/) { get; set; } | この Point の y 座標を取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [Add](../../system.drawing/point/add/)(Point, Size) | 指定されたSize指定されたPoint. |
| static [Ceiling](../../system.drawing/point/ceiling/)(PointF) | を変換します[`PointF`](../pointf/)に`Point`すべての座標でシーリング操作を実行することによって. |
| static [Round](../../system.drawing/point/round/)(PointF) | 指定されたPointFを丸めることによって Point オブジェクトにPoint最も近い整数への値. |
| static [Subtract](../../system.drawing/point/subtract/)(Point, Size) | を変換します`Point`与えられたの負によって[`Size`](../size/). |
| static [Truncate](../../system.drawing/point/truncate/)(PointF) | すべての座標で切り捨て操作を実行して、PointF を Point に変換します。 |
| override [Equals](../../system.drawing/point/equals/#equals_1)(object) | これがPoint指定されたものと同じ座標を含むObject. |
| [Equals](../../system.drawing/point/equals/#equals)(Point) | 他の`Point`構造はこれと同じ場所にあります`Point`構造体. |
| override [GetHashCode](../../system.drawing/point/gethashcode/)() | このハッシュコードを返しますPoint. |
| [Offset](../../system.drawing/point/offset/#offset_1)(Point) | これを翻訳しますPoint指定されたPoint. |
| [Offset](../../system.drawing/point/offset/#offset)(int, int) | これを翻訳しますPoint指定された量によって. |
| override [ToString](../../system.drawing/point/tostring/)() | この属性を変換します`Point`人間が読める文字列. |
| [operator +](../../system.drawing/point/op_addition/) | を変換します`Point`与えられた[`Size`](../size/). |
| [operator ==](../../system.drawing/point/op_equality/) | 2 つの比較Point objects. 結果は、オブジェクトの値がXとY つの properties Pointオブジェクトは等しい. |
| [explicit operator](../../system.drawing/point/op_explicit/) | を作成します[`Size`](../size/)指定された座標で`Point`. |
| [implicit operator](../../system.drawing/point/op_implicit/) | 指定されたPointへの構造PointF構造体. |
| [operator !=](../../system.drawing/point/op_inequality/) | 2 つの比較Point objects. 結果は、オブジェクトの値がXまたY つの properties Pointオブジェクトが等しくありません. |
| [operator -](../../system.drawing/point/op_subtraction/) | を変換します`Point`与えられたの負によって[`Size`](../size/). |

## 田畑

| 名前 | 説明 |
| --- | --- |
| static readonly [Empty](../../system.drawing/point/empty/) | を表しますPoint持っているXとYゼロに設定された値. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


