---
title: Class GpxOptions
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Formats.Gpx.GpxOptions クラス. GPX 形式のドライバー固有のオプション
type: docs
weight: 370
url: /ja/net/aspose.gis.formats.gpx/gpxoptions/
---
## GpxOptions class

GPX 形式のドライバー固有のオプション。

```csharp
public class GpxOptions : DriverOptions
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [GpxOptions](gpxoptions/)() | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | 閉じていないものを閉じるかどうかを決定しますLinearRing各ジオメトリで。デフォルトは`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | ジオメトリの各セグメントの中間に新しいポイントを追加するかどうかを決定します。デフォルトは`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | 各ジオメトリの近くのポイントを削除するかどうかを決定します。デフォルトは`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | の距離を決定します[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/).デフォルトは`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | 曲線ジオメトリを線形化するために使用する許容差. |
| [MAttribute](../../aspose.gis.formats.gpx/gpxoptions/mattribute/) { get; set; } | ウェイポイント、ルート ポイント、およびトラック ポイントの「M」座標としてエクスポートされる GPX 属性を決定します。 動作は[`ZAttribute`](./zattribute/)、デフォルト`null` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedAttributeSeparator](../../aspose.gis.formats.gpx/gpxoptions/nestedattributeseparator/) { get; } | ネストされた属性名とそのインデックスを区切る文字列。デフォルトは二重下線 "__". |
| [ReadNestedAttributes](../../aspose.gis.formats.gpx/gpxoptions/readnestedattributes/) { get; set; } | 「trkpt」や「rtept」などの GPX ポイントに内部属性が含まれているかどうか、およびそれを読み取る必要があるかどうかを決定します。デフォルトは`false` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | 各ジオメトリの同じセグメントにあるポイントを削除するかどうかを決定します。デフォルトは`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | の距離を決定します[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/).デフォルトは`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | レイヤーにジオメトリを追加するときにジオメトリを検証する必要があるかどうかを決定します. に設定されている場合`true`、[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) each ジオメトリがレイヤーに追加されたときに呼び出され、検証が失敗した場合 ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/)は`false`)、[`GisException`](../../aspose.gis/gisexception/)スローされます. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | ポリゴンまたはマルチポリゴンから折れ線への変換を許可するかどうかを決定します。デフォルトは`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZAttribute](../../aspose.gis.formats.gpx/gpxoptions/zattribute/) { get; set; } | ウェイポイント、ルート ポイント、およびトラック ポイントの「Z」座標としてエクスポートされる GPX 属性を決定します。`null` 'Z' 座標としてエクスポートされる属性はありません。 デフォルトは「ele」です。 可能な値は、double として表すことができるすべての GPX XML 属性の名前です (たとえば、「speed」、「magvar」、「geoidheight」など)。 ) |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### 関連項目

* class [DriverOptions](../../aspose.gis/driveroptions/)
* 名前空間 [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx/)
* 組み立て [Aspose.GIS](../../)


