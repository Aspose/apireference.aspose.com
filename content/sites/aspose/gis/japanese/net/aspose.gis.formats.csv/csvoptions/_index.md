---
title: Class CsvOptions
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Formats.Csv.CsvOptions クラス. CSV 形式のドライバー固有のオプション
type: docs
weight: 200
url: /ja/net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

CSV 形式のドライバー固有のオプション。

```csharp
public class CsvOptions : DriverOptions
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [CsvOptions](csvoptions/)() | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | 閉じていないものを閉じるかどうかを決定しますLinearRing各ジオメトリで。デフォルトは`false` . |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm/) { get; set; } | M 座標値を含む列の名前を取得または設定します。 デフォルトは`null` . |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt/) { get; set; } | ジオメトリを表す Well-Known Text を含む列の名前を取得または設定します。 デフォルトは`null` . |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx/) { get; set; } | X 座標値を含む列の名前を取得または設定します。 デフォルトは`null` . |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny/) { get; set; } | Y 座標値を含む列の名前を取得または設定します。 デフォルトは`null` . |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz/) { get; set; } | Z 座標値を含む列の名前を取得または設定します。 デフォルトは`null` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | ジオメトリの各セグメントの中間に新しいポイントを追加するかどうかを決定します。デフォルトは`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | 各ジオメトリの近くのポイントを削除するかどうかを決定します。デフォルトは`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | の距離を決定します[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/).デフォルトは`0` . |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter/) { get; set; } | 値を区切る区切り文字として使用される文字を取得または設定します。 デフォルトは「,」です。 |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape/) { get; set; } | 二重引用符のエスケープ文字として使用される文字を取得または設定します。 デフォルトは '"' です。 |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames/) { get; set; } | 属性名を持つヘッダー行が存在するかどうかを決定します。 デフォルトは`true` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | 曲線ジオメトリを線形化するために使用する許容差. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | 各ジオメトリの同じセグメントにあるポイントを削除するかどうかを決定します。デフォルトは`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | の距離を決定します[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/).デフォルトは`0` . |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber/) { get; set; } | データを読み取るときに最初になるゼロベースの行数を取得または設定します。 デフォルトは 0 です。 |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | レイヤーにジオメトリを追加するときにジオメトリを検証する必要があるかどうかを決定します. に設定されている場合`true`、[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) each ジオメトリがレイヤーに追加されたときに呼び出され、検証が失敗した場合 ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/)は`false`)、[`GisException`](../../aspose.gis/gisexception/)スローされます. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | ポリゴンまたはマルチポリゴンから折れ線への変換を許可するかどうかを決定します。デフォルトは`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/)ジオメトリが[`VectorLayer`](../../aspose.gis/vectorlayer/)またはそれらが[`VectorLayer`](../../aspose.gis/vectorlayer/). デフォルト値は[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### 関連項目

* class [DriverOptions](../../aspose.gis/driveroptions/)
* 名前空間 [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv/)
* 組み立て [Aspose.GIS](../../)


