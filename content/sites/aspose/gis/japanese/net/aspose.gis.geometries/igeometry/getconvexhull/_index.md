---
title: IGeometry.GetConvexHull
second_title: Aspose.GIS for .NET API リファレンス
description: IGeometry 方法. このジオメトリの凸包を計算します.
type: docs
weight: 220
url: /ja/net/aspose.gis.geometries/igeometry/getconvexhull/
---
## IGeometry.GetConvexHull method

このジオメトリの凸包を計算します.

```csharp
public IGeometry GetConvexHull()
```

### 戻り値

このジオメトリの凸包を表すジオメトリ. このジオメトリにポイントがない場合、結果は次のようになります。[`Null`](../../geometry/null/) . このジオメトリにポイントが 1 つしかない場合、結果はこのポイントになります。 このジオメトリにポイントが 2 つしかない場合、結果は次のようになります。[`ILineString`](../../ilinestring/) このジオメトリに 3 つ以上のポイントがある場合、結果は次のようになります。[`ILinearRing`](../../ilinearring/)すべてのジオメトリ ポイントの周りの凸状の ハルを表します.

### 関連項目

* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)


