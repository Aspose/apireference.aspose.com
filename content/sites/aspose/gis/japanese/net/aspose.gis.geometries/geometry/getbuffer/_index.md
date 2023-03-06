---
title: Geometry.GetBuffer
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリの周囲のバッファ領域を計算します.
type: docs
weight: 210
url: /ja/net/aspose.gis.geometries/geometry/getbuffer/
---
## Geometry.GetBuffer method

このジオメトリの周囲のバッファ領域を計算します.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| distance | Double | バッファ領域の幅。 |
| quadrantSegments | Int32 | 90 度の曲率を近似するために使用されるセグメントの数。 この数値が大きいほど、曲線のより良い近似が生成されます。 デフォルトは 30 です。 |

### 戻り値

このジオメトリから 指定された距離内にあるすべてのポイントを表すジオメトリ. 結果のタイプは次のいずれかです[`Null`](../null/)、[`IPolygon`](../../ipolygon/)また[`IMultiPolygon`](../../imultipolygon/) .

### 例外

| 例外 | 調子 |
| --- | --- |
| InvalidOperationException | このジオメトリは、操作を完了できないような方法で無効です. |
| ArgumentOutOfRangeException | 象限セグメントは 0 以下です。 |

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


