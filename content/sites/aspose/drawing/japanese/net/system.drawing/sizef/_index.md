---
title: Struct SizeF
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.SizeF 構造体. 浮動小数点数の順序付けられたペア 通常は四角形の幅と高さ を格納します
type: docs
weight: 1090
url: /ja/net/system.drawing/sizef/
---
## SizeF structure

浮動小数点数の順序付けられたペア (通常は四角形の幅と高さ) を格納します。

```csharp
public struct SizeF : IEquatable<SizeF>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [SizeF](sizef/#constructor_1)(PointF) | の新しいインスタンスを初期化します`SizeF`構造体. |
| [SizeF](sizef/#constructor_2)(SizeF) | の新しいインスタンスを初期化します`SizeF`構造体. |
| [SizeF](sizef/#constructor)(float, float) | 指定された次元から SizeF 構造体の新しいインスタンスを初期化します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Height](../../system.drawing/sizef/height/) { get; set; } | この SizeF 構造体の垂直コンポーネントを取得または設定します。 |
| [IsEmpty](../../system.drawing/sizef/isempty/) { get; } | かどうかを示す値を取得します。SizeF構造体の幅と高さはゼロです. |
| [Width](../../system.drawing/sizef/width/) { get; set; } | この SizeF 構造体の水平コンポーネントを取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [Add](../../system.drawing/sizef/add/)(SizeF, SizeF) | 1 の幅と高さを加算しますSizeF別の幅と高さの構造SizeF構造体. |
| static [Subtract](../../system.drawing/sizef/subtract/)(SizeF, SizeF) | 幅と高さを 1 減算しますSizeF別の幅と高さからの構造SizeF構造体. |
| override [Equals](../../system.drawing/sizef/equals/#equals_1)(object) | 指定されたオブジェクトがSizeFこれと同じ寸法の構造SizeF構造体. |
| [Equals](../../system.drawing/sizef/equals/#equals)(SizeF) | 他の`SizeF`構造体はこれと同じサイズです`SizeF`構造体. |
| override [GetHashCode](../../system.drawing/sizef/gethashcode/)() | このハッシュコードを返しますSizeF構造体. |
| [ToPointF](../../system.drawing/sizef/topointf/)() | を変換しますSizeFへの構造PointF構造体. |
| [ToSize](../../system.drawing/sizef/tosize/)() | を変換しますSizeFへの構造Size構造体. |
| override [ToString](../../system.drawing/sizef/tostring/)() | この属性を変換します`SizeF`人間が読める文字列. |
| [operator +](../../system.drawing/sizef/op_addition/) | 1 の幅と高さを加算しますSizeF別の幅と高さの構造SizeF構造体. |
| [operator /](../../system.drawing/sizef/op_division/) | 割り算`SizeF`によってSingle生産`SizeF`. |
| [operator ==](../../system.drawing/sizef/op_equality/) | 2 つのSizeF構造は等しい. |
| [explicit operator](../../system.drawing/sizef/op_explicit/) | 指定された`SizeF`に[`PointF`](../pointf/). |
| [operator !=](../../system.drawing/sizef/op_inequality/) | 2 つのSizeF構造が異なります. |
| [operator *](../../system.drawing/sizef/op_multiply/#op_multiply) | 乗算`SizeF`によってSingle生産`SizeF`. (2 operators) |
| [operator -](../../system.drawing/sizef/op_subtraction/) | 幅と高さを 1 減算しますSizeF別の幅と高さからの構造SizeF構造体. |

## 田畑

| 名前 | 説明 |
| --- | --- |
| static readonly [Empty](../../system.drawing/sizef/empty/) | を取得しますSizeFを持つ構造Height とWidth0. の値 |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


