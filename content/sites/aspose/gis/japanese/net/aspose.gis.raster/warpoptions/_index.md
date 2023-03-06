---
title: Class WarpOptions
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Raster.WarpOptions クラス. ラスター ワーピングのオプション
type: docs
weight: 1430
url: /ja/net/aspose.gis.raster/warpoptions/
---
## WarpOptions class

ラスター ワーピングのオプション。

```csharp
public class WarpOptions
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [WarpOptions](warpoptions/)() | デフォルトのコンストラクター。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CellHeight](../../aspose.gis.raster/warpoptions/cellheight/) { get; set; } | ラスター セルの新しい高さを (ターゲットの地理参照単位で) 指定します。 値が 0 に設定されている場合、[`CellHeight`](./cellheight/)自動的に計算されます。デフォルト値は「0」です。 |
| [CellWidth](../../aspose.gis.raster/warpoptions/cellwidth/) { get; set; } | ラスター セルの新しい幅を (ターゲットの地理参照単位で) 指定します。 値が 0 に設定されている場合、[`CellWidth`](./cellwidth/)自動的に計算されます。デフォルト値は「0」です。 |
| [DefaultSpatialReferenceSystem](../../aspose.gis.raster/warpoptions/defaultspatialreferencesystem/) { get; set; } | 欠落している場合、ソース空間参照の値を指定します。 |
| [Height](../../aspose.gis.raster/warpoptions/height/) { get; set; } | 出力ラスターの高さをピクセルと列で指定します。 値が 0 に設定されている場合、高さは自動的に計算されます。デフォルト値は「0」です。 |
| [TargetExtent](../../aspose.gis.raster/warpoptions/targetextent/) { get; set; } | ワープするラスター レイヤーの境界を指定します。 に設定した場合`null`、範囲はラスターからのすべてのセルを含むようにワーピング中に計算されます. |
| [TargetSpatialReferenceSystem](../../aspose.gis.raster/warpoptions/targetspatialreferencesystem/) { get; set; } | ターゲットの空間参照を指定します。 に設定されている場合`null`、デフォルトまたはソースの空間参照が使用されます。 |
| [Width](../../aspose.gis.raster/warpoptions/width/) { get; set; } | 出力ラスターの幅をピクセルと列で指定します。 値が 0 に設定されている場合、幅は自動的に計算されます。デフォルト値は「0」です。 |

### 関連項目

* 名前空間 [Aspose.Gis.Raster](../../aspose.gis.raster/)
* 組み立て [Aspose.GIS](../../)


