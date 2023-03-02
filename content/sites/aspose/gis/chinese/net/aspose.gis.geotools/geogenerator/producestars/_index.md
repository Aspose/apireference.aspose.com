---
title: GeoGenerator.ProduceStars
second_title: Aspose.GIS for .NET API 参考
description: GeoGenerator 方法. 创建一个星星数组所有星星都在给定范围内
type: docs
weight: 40
url: /zh/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

创建一个星星数组，所有星星都在给定范围内。

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| rect | Extent | 指定区域（见[`程度`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | 多边形创建选项（请参阅[`StarGenerator选项`](../../stargeneratoroptions/)) |

### 返回值

恒星阵列（见枚举[`多边形`](../../../aspose.gis.geometries/ipolygon/))

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | 星星的数量必须大于一颗。 |
| NullReferenceException | 范围必须有一个值（不能为 NULL） |
| ArgumentException | 最小和最大长度必须不相等且大于 3 |
| ArgumentException | 最大长度必须大于最小长度 |

### 也可以看看

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* 命名空间 [Aspose.Gis.GeoTools](../../geogenerator/)
* 部件 [Aspose.GIS](../../../)


