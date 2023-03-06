---
title: Class VerticalSpatialReferenceSystem
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.VerticalSpatialReferenceSystem クラス. 垂直 SRS は高さ座標を記述する 1 次元 SRS です
type: docs
weight: 2310
url: /ja/net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

垂直 SRS は、高さ座標を記述する 1 次元 SRS です。

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | に変換されたこの SRS を返します[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/). 使用[`IsCompound`](../spatialreferencesystem/iscompound/)変換が可能かどうかを調べる. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | に変換されたこの SRS を返します[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | に変換されたこの SRS を返します[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | に変換されたこの SRS を返します[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | に変換されたこの SRS を返します[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical/) { get; } | この SRS を返します。 |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount/) { get; } | 垂直 SRS は常に 1 次元であるため、1 を返します。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | このオブジェクト識別子が EPSG 識別子の場合 - そのコードを返します。それ以外の場合 - -1. を返します |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum/) { get; } | スローInvalidOperationException 、垂直 SRS には地理データムがないため. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum/) { get; } | 戻り値`false` 、垂直 SRS には地理データムがないため. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian/) { get; } | 戻り値`false` 、垂直 SRS には本初子午線がないため. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | この識別可能なオブジェクトの識別子. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | この SRS が複合 (2 つの SRS の和集合) であるかどうかを返します。 複合 SRS の次の SRS の組み合わせが有効と見なされます:Geographic . 投影 SRS + 垂直 SRS。この場合、複合 SRS のタイプは次のようになります。Projected . SRSの組み合わせが異なる場合、複合SRSの種類はUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | この SRS が単一かどうかを返します (2 つの SRS の結合ではありません). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | と同じ[`Validate`](../spatialreferencesystem/validate/)、しかしエラーメッセージを返さない. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | このオブジェクトの名前. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian/) { get; } | スローInvalidOperationException 、垂直 SRS には本初子午線がないため. |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type/) { get; } | 戻るVertical . |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum/) { get; } | この SRS で使用されるデータム。 |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit/) { get; } | この SRS で使用されるユニット。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | これから変換を作成します`空間参照システム`別の人に`空間参照システム` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | この SRS の表現を WKT 文字列として返します。 |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis/)(int) | 取得[`Axis`](../axis/)ディメンションを説明する. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit/)(int) | 取得[`Unit`](../unit/)次元の. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | この SRS が他の SRS と同等かどうかを検出します。 . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | これから変換を作成します`空間参照システム`別の人に`空間参照システム` . |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate/)(out string) | この SRS が有効かどうかを判断します。見る[`Validate`](../spatialreferencesystem/validate/)有効性説明用. |

### 関連項目

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


