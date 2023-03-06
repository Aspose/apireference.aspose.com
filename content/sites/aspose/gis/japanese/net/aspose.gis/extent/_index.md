---
title: Class Extent
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Extent クラス. 2 次元の空間バウンディング ボックス
type: docs
weight: 120
url: /ja/net/aspose.gis/extent/
---
## Extent class

2 次元の空間バウンディング ボックス。

```csharp
public class Extent : IEquatable<Extent>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Extent](extent/#constructor)() | 新しいインスタンスを作成します。 |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | 新しいインスタンスを作成します。 |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | 範囲の中心。 |
| [Height](../../aspose.gis/extent/height/) { get; } | エクステントの高さ。 |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | これが`Extent`有効です. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/)このエクステントに関連付けられています。 `null`もしも[`SpatialReferenceSystem`](./spatialreferencesystem/)不明です. 使用[`GetTransformed`](./gettransformed/) 異なる空間参照系の間で範囲を変換するため. |
| [Width](../../aspose.gis/extent/width/) { get; } | エクステントの幅。 |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | X 座標の最大値。 |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | X 座標の最小値。 |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | Y 座標の最大値。 |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Y 座標の最小値。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | このインスタンスを複製します。 |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | このエクステントに引数が含まれているかどうかを判断します。 |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | このエクステントに引数が含まれているかどうかを判断します。 |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | この範囲に、引数で定義された座標が含まれているかどうかを判断します。 |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | 現在のオブジェクトが同じ型の別のオブジェクトと等しいかどうかを示します。 |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | 指定されたオブジェクトが現在のオブジェクトと等しいかどうかを判断します。 |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | デフォルトのハッシュ関数として機能します。 |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | 指定された新しいエクステントを返します[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/)このエクステントを含む. |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | このエクステントを拡張して、引数を含めます。 |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | 指定したポイントが含まれるように、この範囲を拡張します。 |
| [GrowX](../../aspose.gis/extent/growx/)(double) | 指定された値が含まれるように、この範囲を X 軸に沿って拡大します。 |
| [GrowY](../../aspose.gis/extent/growy/)(double) | 指定された値が含まれるように、Y 軸に沿ってこの範囲を拡張します。 |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | このエクステントが引数と交差するかどうかを決定します。 |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | このエクステントが引数と交差するかどうかを決定します。 |
| [Normalize](../../aspose.gis/extent/normalize/)() | スワップ[`XMin`](./xmin/)と[`XMax`](./xmax/)もしも[`Width`](./width/)負の and [`YMin`](./ymin/)と[`YMax`](./ymax/)もしも[`Height`](./height/)負です. |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | この範囲を、それを表す長方形のポリゴンに変換します。 |
| override [ToString](../../aspose.gis/extent/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| [operator ==](../../aspose.gis/extent/op_equality/) | 「==」演算子を実装します。 |
| [operator !=](../../aspose.gis/extent/op_inequality/) | '!=' 演算子を実装します。 |

### 関連項目

* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


