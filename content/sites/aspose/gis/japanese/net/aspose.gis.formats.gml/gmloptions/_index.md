---
title: Class GmlOptions
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Formats.Gml.GmlOptions クラス. GML 形式のドライバー固有のオプション
type: docs
weight: 350
url: /ja/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

GML 形式のドライバー固有のオプション。

```csharp
public class GmlOptions : DriverOptions
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [GmlOptions](gmloptions/)() | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | 閉じていないものを閉じるかどうかを決定しますLinearRing各ジオメトリで。デフォルトは`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | ジオメトリの各セグメントの中間に新しいポイントを追加するかどうかを決定します。デフォルトは`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | 各ジオメトリの近くのポイントを削除するかどうかを決定します。デフォルトは`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | の距離を決定します[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/).デフォルトは`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | 曲線ジオメトリを線形化するために使用する許容差. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/) { get; set; } | Aspose.GIS がインターネットから XML スキーマをロードできるかどうかを決定します。 に設定されている場合`false`、'file://' で始まらない絶対 URI を持つスキーマはロードされません。 デフォルトは`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator/) { get; set; } | ネストされた属性のコンポーネントを区切るために使用される文字列を取得または設定します. デフォルトは「_」です. |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema/) { get; set; } | Aspose.GIS が、XML スキーマが欠落している、または読み込めない Gml ファイルの属性を解析できるかどうかを決定します。 に設定されている場合`true`、Aspose.GIS リーダーは XML スキーマの存在を必要としません。 デフォルトは`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation/) { get; set; } | URI ペアのスペース区切りリスト。すべてのペアの最初の URI は名前空間の URI で、2 番目の URI は名前空間の XML スキーマへのパスです。 に設定されている場合`null`、[`GmlDriver`](../gmldriver/)ドキュメントのルート要素から schemaLocation の読み取りを試みます。 デフォルトは`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | 各ジオメトリの同じセグメントにあるポイントを削除するかどうかを決定します。デフォルトは`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | の距離を決定します[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/).デフォルトは`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | レイヤーにジオメトリを追加するときにジオメトリを検証する必要があるかどうかを決定します. に設定されている場合`true`、[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) each ジオメトリがレイヤーに追加されたときに呼び出され、検証が失敗した場合 ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/)は`false`)、[`GisException`](../../aspose.gis/gisexception/)スローされます. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | ポリゴンまたはマルチポリゴンから折れ線への変換を許可するかどうかを決定します。デフォルトは`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver/) { get; set; } | A[`XmlResolver`](./xmlresolver/)外部リソースを解決するために使用されます。デフォルトはXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### 関連項目

* class [DriverOptions](../../aspose.gis/driveroptions/)
* 名前空間 [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml/)
* 組み立て [Aspose.GIS](../../)


