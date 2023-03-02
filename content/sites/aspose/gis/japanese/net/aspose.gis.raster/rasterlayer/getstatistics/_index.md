---
title: RasterLayer.GetStatistics
second_title: Aspose.GIS for .NET API リファレンス
description: RasterLayer 方法. カウント合計平均最小最大で構成される要約統計量を計算します
type: docs
weight: 160
url: /ja/net/aspose.gis.raster/rasterlayer/getstatistics/
---
## RasterLayer.GetStatistics method

カウント、合計、平均、最小、最大で構成される要約統計量を計算します。

```csharp
public RasterStatistics GetStatistics(int bandIndex = 0, bool excludeNodataValue = true)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| bandIndex | Int32 | バンドのインデックス。番号付けは 0 から始まります。 |
| excludeNodataValue | Boolean | 「nodata」値を除外できます。 「excludeNodataValue」が false に設定されている場合、すべてのピクセルが考慮されます。 |

### 戻り値

要約統計。

### 関連項目

* class [RasterStatistics](../../rasterstatistics/)
* class [RasterLayer](../)
* 名前空間 [Aspose.Gis.Raster](../../rasterlayer/)
* 組み立て [Aspose.GIS](../../../)


