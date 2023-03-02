---
title: Class LocalSpatialReferenceSystem
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.LocalSpatialReferenceSystem クラス. 地球ではなく何らかのオブジェクトに関連するローカル SRS 座標.
type: docs
weight: 2180
url: /ja/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

地球ではなく、何らかのオブジェクトに関連するローカル SRS 座標.

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | に変換されたこの SRS を返します[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/). 使用[`IsCompound`](../spatialreferencesystem/iscompound/)変換が可能かどうかを調べる. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | に変換されたこの SRS を返します[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | に変換されたこの SRS を返します[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal/) { get; } | これを返す. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | に変換されたこの SRS を返します[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | に変換されたこの SRS を返します[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount/) { get; } | この SRS の次元数. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | このオブジェクト識別子が EPSG 識別子の場合 - そのコードを返します。それ以外の場合 - -1. を返します |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum/) { get; } | スローInvalidOperationException、ローカル SRS には地理データがありません。 |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum/) { get; } | 戻り値`false`、ローカル SRS には地理データがありません。 |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian/) { get; } | 戻り値`false` 、ローカル SRS には本初子午線がないため. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | この識別可能なオブジェクトの識別子. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | この SRS が複合 (2 つの SRS の和集合) であるかどうかを返します。 複合 SRS の次の SRS の組み合わせが有効と見なされます:Geographic . 投影 SRS + 垂直 SRS。この場合、複合 SRS のタイプは次のようになります。Projected . SRSの組み合わせが異なる場合、複合SRSの種類はUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | この SRS が単一かどうかを返します (2 つの SRS の結合ではありません). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | と同じ[`Validate`](../spatialreferencesystem/validate/)、しかしエラーメッセージを返さない. |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum/) { get; } | データム、測定方法を記述します。 |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | このオブジェクトの名前. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian/) { get; } | スローInvalidOperationException 、ローカル SRS には本初子午線がないため. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type/) { get; } | 戻るLocal . |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit/) { get; } | この SRS の単位。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | これから変換を作成します`空間参照システム`別の人に`空間参照システム` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | この SRS の表現を WKT 文字列として返します。 |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis/)(int) | 取得[`Axis`](../axis/)ディメンションを説明する. |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit/)(int) | 取得[`Unit`](./unit/)次元の. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | この SRS が他の SRS と同等かどうかを検出します。 . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | これから変換を作成します`空間参照システム`別の人に`空間参照システム` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate/)(out string) | この SRS が有効かどうかを判断します。見る[`Validate`](../spatialreferencesystem/validate/)有効性説明用. |

### 関連項目

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


