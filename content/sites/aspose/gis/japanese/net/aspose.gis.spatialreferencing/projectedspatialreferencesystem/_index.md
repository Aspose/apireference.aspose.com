---
title: Class ProjectedSpatialReferenceSystem
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystem クラス. 射影 SRS は地理 SRS への射影を適用した結果です 射影 SRS は2 次元または 3 次元にすることができます 射影 SRS が 3 次元の場合実際には2 次元の射影 SRS と 1 次元垂直の合成 SRS です SRS.
type: docs
weight: 2220
url: /ja/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

射影 SRS は、地理 SRS への射影を適用した結果です。 射影 SRS は、2 次元または 3 次元にすることができます。 射影 SRS が 3 次元の場合、実際には、2 次元の射影 SRS と 1 次元垂直の合成 SRS です。 SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit/) { get; } | この SRS の角度値と角度パラメータに使用される単位[`Projection`](./projection/). の角度単位に一致[`Base`](./base/) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | に変換されたこの SRS を返します[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/). 使用[`IsCompound`](../spatialreferencesystem/iscompound/)変換が可能かどうかを調べる. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | に変換されたこの SRS を返します[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | に変換されたこの SRS を返します[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | に変換されたこの SRS を返します[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected/) { get; } | これを返す. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | に変換されたこの SRS を返します[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)変換が可能かどうかを調べる. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder/) { get; } | この SRS の軸の順序。 この SRS が無効で、軸の方向が間違っている場合、Invalid返されます. |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base/) { get; } | 地理的 SRS[`Projection`](./projection/)この SRS. を取得するために適用されました |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount/) { get; } | この SRS の次元数を返します。射影 SRS の場合、これは次のようになります: 2 - これが単一の射影 SRS の場合。 3 - これが複合 SRS の場合。これは、単一の 2 次元の射影 SRS と垂直 SRS で構成され、3 番目の次元が追加されます。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | このオブジェクト識別子が EPSG 識別子の場合 - そのコードを返します。それ以外の場合 - -1. を返します |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | この SRS の地理データを返します。 |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum/) { get; } | 投影された SRS には常に本初子午線があるため、true を返します。 |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian/) { get; } | 投影された SRS には常に本初子午線があるため、true を返します。 |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | この識別可能なオブジェクトの識別子. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | この SRS が複合 (2 つの SRS の和集合) であるかどうかを返します。 複合 SRS の次の SRS の組み合わせが有効と見なされます:Geographic . 投影 SRS + 垂直 SRS。この場合、複合 SRS のタイプは次のようになります。Projected . SRSの組み合わせが異なる場合、複合SRSの種類はUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | この SRS が単一かどうかを返します (2 つの SRS の結合ではありません). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | と同じ[`Validate`](../spatialreferencesystem/validate/)、しかしエラーメッセージを返さない. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit/) { get; } | 単位。この SRS の直線寸法と直線パラメータに使用されます。[`Projection`](./projection/) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | このオブジェクトの名前. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | この SRS の本初子午線を返します。 |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection/) { get; } | に適用された射影[`Base`](./base/)この SRS. を取得するには |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type/) { get; } | 戻り値Projected . |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | これから変換を作成します`空間参照システム`別の人に`空間参照システム` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | この SRS の表現を WKT 文字列として返します。 |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | 取得[`Axis`](../axis/)ディメンションを説明する. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | 取得[`Unit`](../unit/)次元の. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | この SRS が他の SRS と同等かどうかを検出します。 . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | これから変換を作成します`空間参照システム`別の人に`空間参照システム` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | この SRS が有効かどうかを判断します。 |

### 関連項目

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


