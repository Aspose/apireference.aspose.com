---
title: Class GeographicDatum
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing.GeographicDatum クラス. 地理データムは経度と緯度を地球上の特定の場所に関連付けます
type: docs
weight: 2120
url: /ja/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

地理データムは、経度と緯度を地球上の特定の場所に関連付けます。

```csharp
public class GeographicDatum : IdentifiableObject
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 データム. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 データム. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB 1936 データム. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 データム. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 データム. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | 地球を近似するためにこの測地系で使用される楕円体. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | このオブジェクト識別子が EPSG 識別子の場合 - そのコードを返します。それ以外の場合 - -1. を返します |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | この識別可能なオブジェクトの識別子. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | このオブジェクトの名前. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | このデータムの座標を WGS84 データムの座標に変換するために使用できる BursaWolfParamters. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | 2 つの測地系が等しいかどうかを判断します。 対応する測地系の同じ座標は、地球上の同じ場所と一致します。 対応する測地系の一部のパラメーターは異なる場合があります。たとえば、[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 現在のオブジェクトを表す文字列を返します。 |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | 2 つの測地系が等しいかどうかを判断します。 対応する測地系の同じ座標は、地球上の同じ場所と一致します。 対応する測地系の一部のパラメーターは異なる場合があります。たとえば、[`Name`](../identifiableobject/name/) . |

### 関連項目

* class [IdentifiableObject](../identifiableobject/)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 組み立て [Aspose.GIS](../../)


