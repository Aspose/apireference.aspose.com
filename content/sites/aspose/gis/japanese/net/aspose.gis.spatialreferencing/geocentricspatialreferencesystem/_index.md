---
title: Class GeocentricSpatialReferenceSystem
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystem クラス. Geocentric SRS は地球の中心を原点とする 3 次元デカルト SRS です
type: docs
weight: 2090
url: /ja/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

Geocentric SRS は、地球の中心を原点とする 3 次元デカルト SRS です。

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | に変換されたこの SRS を返します[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/). 使用[`IsCompound`](../spatialreferencesystem/iscompound/)変換が可能かどうかを調べる. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric/) { get; } | これを返す. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | に変換されたこの SRS を返します[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | に変換されたこの SRS を返します[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | に変換されたこの SRS を返します[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | に変換されたこの SRS を返します[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder/) { get; } | この SRS の軸の順序。 この SRS が無効で、軸の方向が間違っている場合、Invalid返されます. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount/) { get; } | 地球中心の SRS は常に 3 次元であるため、3 を返します。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | このオブジェクト識別子が EPSG 識別子の場合 - そのコードを返します。それ以外の場合 - -1. を返します |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum/) { get; } | この SRS の地理データを返します。 |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum/) { get; } | 戻る`true` 、ジオセントリック SRS は常に地理データムを持っているため. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian/) { get; } | 戻る`true` 、地球中心の SRS には常に本初子午線があるため. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | この識別可能なオブジェクトの識別子. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | この SRS が複合 (2 つの SRS の和集合) であるかどうかを返します。 複合 SRS の次の SRS の組み合わせが有効と見なされます:Geographic . 投影 SRS + 垂直 SRS。この場合、複合 SRS のタイプは次のようになります。Projected . SRSの組み合わせが異なる場合、複合SRSの種類はUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | この SRS が単一かどうかを返します (2 つの SRS の結合ではありません). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | と同じ[`Validate`](../spatialreferencesystem/validate/)、しかしエラーメッセージを返さない. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit/) { get; } | この SRS で使用されるユニット。 |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | このオブジェクトの名前. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian/) { get; } | この SRS の本初子午線を返します。 |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type/) { get; } | 戻るGeocentric . |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | これから変換を作成します`空間参照システム`別の人に`空間参照システム` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | この SRS の表現を WKT 文字列として返します。 |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis/)(int) | 取得[`Axis`](../axis/)ディメンションを説明する. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit/)(int) | 取得[`Unit`](../unit/)次元の. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | この SRS が他の SRS と同等かどうかを検出します。 . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | これから変換を作成します`空間参照システム`別の人に`空間参照システム` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate/)(out string) | この SRS が有効かどうかを判断します。見る[`Validate`](../spatialreferencesystem/validate/)有効性説明用. |

### 関連項目

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


