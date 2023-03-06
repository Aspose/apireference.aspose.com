---
title: GeoGenerator.ProducePoints
second_title: Aspose.GIS for .NET API リファレンス
description: GeoGenerator 方法. 指定された領域に属する点の配列を作成します
type: docs
weight: 20
url: /ja/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

指定された領域に属する点の配列を作成します。

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | Extent | 指定された領域 (参照[`範囲`](../../../aspose.gis/extent/)）。 |
| options | PointGeneratorOptions | ポイント作成オプション (「[`PointGeneratorOptions`](../../pointgeneratoroptions/)）。 |

### 戻り値

ポイントの配列 (の列挙を参照)[`IGeometry`](../../../aspose.gis.geometries/igeometry/)）。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | ポイントの数は 1 より大きい必要があります。 |
| NullReferenceException | エクステントには値が必要です (NULL は不可)。 |

### 関連項目

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* 名前空間 [Aspose.Gis.GeoTools](../../geogenerator/)
* 組み立て [Aspose.GIS](../../../)


