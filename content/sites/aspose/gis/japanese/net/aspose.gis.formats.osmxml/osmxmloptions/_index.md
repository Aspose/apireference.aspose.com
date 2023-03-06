---
title: Class OsmXmlOptions
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Formats.OsmXml.OsmXmlOptions クラス. OSM XML 形式のドライバー固有のオプション
type: docs
weight: 630
url: /ja/net/aspose.gis.formats.osmxml/osmxmloptions/
---
## OsmXmlOptions class

OSM XML 形式のドライバー固有のオプション。

```csharp
public class OsmXmlOptions : DriverOptions
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [OsmXmlOptions](osmxmloptions/)() | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | 閉じていないものを閉じるかどうかを決定しますLinearRing各ジオメトリで。デフォルトは`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | ジオメトリの各セグメントの中間に新しいポイントを追加するかどうかを決定します。デフォルトは`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | 各ジオメトリの近くのポイントを削除するかどうかを決定します。デフォルトは`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | の距離を決定します[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/).デフォルトは`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | 曲線ジオメトリを線形化するために使用する許容差. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ReportAllNodes](../../aspose.gis.formats.osmxml/osmxmloptions/reportallnodes/) { get; set; } | 重要なタグがない場合でも、すべてのノードを機能としてレポートします。 |
| [ReportAllWays](../../aspose.gis.formats.osmxml/osmxmloptions/reportallways/) { get; set; } | 重要なタグやノードがない場合でも、すべてのウェイをフィーチャーとしてレポートします。 |
| [ReportCommonAttributes](../../aspose.gis.formats.osmxml/osmxmloptions/reportcommonattributes/) { get; set; } | 共通の OSM 属性を報告します: visible、version、changeset、timestamp、user、および uid. 共通の属性は、osm_user、osm_timestamp などのように、"osm_" プレフィックスが付いた機能属性として報告されます。 |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | 各ジオメトリの同じセグメントにあるポイントを削除するかどうかを決定します。デフォルトは`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | の距離を決定します[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/).デフォルトは`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | レイヤーにジオメトリを追加するときにジオメトリを検証する必要があるかどうかを決定します. に設定されている場合`true`、[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) each ジオメトリがレイヤーに追加されたときに呼び出され、検証が失敗した場合 ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/)は`false`)、[`GisException`](../../aspose.gis/gisexception/)スローされます. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | ポリゴンまたはマルチポリゴンから折れ線への変換を許可するかどうかを決定します。デフォルトは`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### 関連項目

* class [DriverOptions](../../aspose.gis/driveroptions/)
* 名前空間 [Aspose.Gis.Formats.OsmXml](../../aspose.gis.formats.osmxml/)
* 組み立て [Aspose.GIS](../../)


