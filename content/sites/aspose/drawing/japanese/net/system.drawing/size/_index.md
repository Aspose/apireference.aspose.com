---
title: Struct Size
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Size 構造体. 通常は四角形の幅と高さである整数の順序付きペアを格納します
type: docs
weight: 1080
url: /ja/net/system.drawing/size/
---
## Size structure

通常は四角形の幅と高さである整数の順序付きペアを格納します。

```csharp
public struct Size : IEquatable<Size>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Size](size/#constructor_1)(Point) | の新しいインスタンスを初期化します`Size`指定された構造体Point. |
| [Size](size/#constructor)(int, int) | の新しいインスタンスを初期化します`Size`指定された次元からの構造体. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Height](../../system.drawing/size/height/) { get; set; } | この垂直コンポーネントを取得または設定しますSize. |
| [IsEmpty](../../system.drawing/size/isempty/) { get; } | かどうかを示す値を取得します。Size幅と高さは 0. です |
| [Width](../../system.drawing/size/width/) { get; set; } | この水平成分を取得または設定しますSize. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [Add](../../system.drawing/size/add/)(Size, Size) | 1 の幅と高さを加算しますSize幅と高さの 別の構造Size構造体. |
| static [Ceiling](../../system.drawing/size/ceiling/)(SizeF) | 指定されたSizeFへの構造Sizeの値 を丸めることによる構造Size次に高い整数値への構造。 |
| static [Round](../../system.drawing/size/round/)(SizeF) | 指定されたSizeFへの構造Sizestructure の値を丸めることによってSizeF最も近い整数値への構造. |
| static [Subtract](../../system.drawing/size/subtract/)(Size, Size) | 幅と高さを 1 減算しますSize幅と高さの 別の構造Size構造体. |
| static [Truncate](../../system.drawing/size/truncate/)(SizeF) | 指定されたSizeFへの構造Size structure の値を切り捨ててSizeF構造体を次に低い整数値に変換します. |
| override [Equals](../../system.drawing/size/equals/#equals_1)(object) | 指定されたオブジェクトがSizeこれと同じ dimension でSize. |
| [Equals](../../system.drawing/size/equals/#equals)(Size) | 他の`Size`構造体はこれと同じサイズです`Size`構造体. |
| override [GetHashCode](../../system.drawing/size/gethashcode/)() | このハッシュコードを返しますSize構造体. |
| override [ToString](../../system.drawing/size/tostring/)() | この属性を変換します`Size`人間が読める文字列. |
| [operator +](../../system.drawing/size/op_addition/) | 1 の幅と高さを加算しますSize幅と高さの 別の構造Size構造体. |
| [operator /](../../system.drawing/size/op_division/#op_division) | 割り算`Size`によってInt32生産`Size`. (2 operators) |
| [operator ==](../../system.drawing/size/op_equality/) | 2 つのSize構造は等しい. |
| [explicit operator](../../system.drawing/size/op_explicit/) | 指定されたSizeにPoint. |
| [implicit operator](../../system.drawing/size/op_implicit/) | 指定されたSizeにSizeF. |
| [operator !=](../../system.drawing/size/op_inequality/) | 2 つのSize構造が異なります. |
| [operator *](../../system.drawing/size/op_multiply/#op_multiply) | を乗算します`Size`によってInt32生産`Size`. (4 operators) |
| [operator -](../../system.drawing/size/op_subtraction/) | 幅と高さを 1 減算しますSize幅と高さの 別の構造Size構造体. |

## 田畑

| 名前 | 説明 |
| --- | --- |
| static readonly [Empty](../../system.drawing/size/empty/) | を取得しますSizeを持つ構造HeightとWidth0. の値 |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


