---
title: GeoGenerator.ProducePoints
second_title: Aspose.GIS for .NET API 参考
description: GeoGenerator 方法. 创建属于指定区域的点数组
type: docs
weight: 20
url: /zh/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

创建属于指定区域的点数组。

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| rect | Extent | 指定区域（见[`程度`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | 点创建选项（参见[`点生成器选项`](../../pointgeneratoroptions/)). |

### 返回值

点数组（见枚举[`几何图形`](../../../aspose.gis.geometries/igeometry/)).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | 点数必须大于一。 |
| NullReferenceException | Extent 必须有一个值（不能为 NULL）。 |

### 也可以看看

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* 命名空间 [Aspose.Gis.GeoTools](../../geogenerator/)
* 部件 [Aspose.GIS](../../../)


