---
title: Class DatabaseDriverOptions
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.DatabaseDriverOptions クラス. のオプションDatabaseDriver .
type: docs
weight: 70
url: /ja/net/aspose.gis/databasedriveroptions/
---
## DatabaseDriverOptions class

のオプション[`DatabaseDriver`](../databasedriver/) .

```csharp
public abstract class DatabaseDriverOptions : DriverOptions
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | 閉じていないものを閉じるかどうかを決定しますLinearRing各ジオメトリで。デフォルトは`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | ジオメトリの各セグメントの中間に新しいポイントを追加するかどうかを決定します。デフォルトは`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | 各ジオメトリの近くのポイントを削除するかどうかを決定します。デフォルトは`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | の距離を決定します[`DeleteNearPoints`](../driveroptions/deletenearpoints/).デフォルトは`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | 曲線ジオメトリを線形化するために使用する許容差. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/)ジオメトリが[`VectorLayer`](../vectorlayer/)またはそれらが[`VectorLayer`](../vectorlayer/). デフォルト値は[`Exact`](../precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | 各ジオメトリの同じセグメントにあるポイントを削除するかどうかを決定します。デフォルトは`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | の距離を決定します[`SimplifySegments`](../driveroptions/simplifysegments/).デフォルトは`0` . |
| [SpatialReferenceSystemMode](../../aspose.gis/databasedriveroptions/spatialreferencesystemmode/) { get; set; } | データベースの不明なジオメトリの SRS がレイヤーに追加されたときにどのように処理するかを決定します。 デフォルト値はThrowException . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | レイヤーにジオメトリを追加するときにジオメトリを検証する必要があるかどうかを決定します. に設定されている場合`true`、[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) each ジオメトリがレイヤーに追加されたときに呼び出され、検証が失敗した場合 ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/)は`false`)、[`GisException`](../gisexception/)スローされます. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | ポリゴンまたはマルチポリゴンから折れ線への変換を許可するかどうかを決定します。デフォルトは`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/)ジオメトリが[`VectorLayer`](../vectorlayer/)またはそれらが[`VectorLayer`](../vectorlayer/). デフォルト値は[`Exact`](../precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/)ジオメトリが[`VectorLayer`](../vectorlayer/)またはそれらが[`VectorLayer`](../vectorlayer/). デフォルト値は[`Exact`](../precisionmodel/exact/) . |

### 関連項目

* class [DriverOptions](../driveroptions/)
* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


