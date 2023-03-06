---
title: RasterLayer.GetSpatialPoint
second_title: Aspose.GIS for .NET API リファレンス
description: RasterLayer 方法. 指定された列と行を空間座標に変換します
type: docs
weight: 150
url: /ja/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

指定された列と行を空間座標に変換します。

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| cellX | Int32 | 列の値 (x 座標)。番号付けは 0 から始まります。 |
| cellY | Int32 | 行の値 (y 座標)。番号付けは 0 から始まります。 |

### 戻り値

指定された列と行の左上隅の x 座標を返します。

### 備考

いずれかのパラメーターがラスターのそれぞれの次元の範囲外に渡された場合、 ラスターのグリッドがラスターの境界外に適用可能であると仮定して、ラスターの外部の座標を返します.

### 関連項目

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* 名前空間 [Aspose.Gis.Raster](../../rasterlayer/)
* 組み立て [Aspose.GIS](../../../)


