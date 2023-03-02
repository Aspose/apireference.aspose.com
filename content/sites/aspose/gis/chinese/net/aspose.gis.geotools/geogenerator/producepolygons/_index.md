---
title: GeoGenerator.ProducePolygons
second_title: Aspose.GIS for .NET API 参考
description: GeoGenerator 方法. 使用给定数量的随机项创建一个新的 IPolygon 枚举器所有项都在给定范围内
type: docs
weight: 30
url: /zh/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

使用给定数量的随机项创建一个新的 IPolygon 枚举器，所有项都在给定范围内。

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| rect | Extent | 指定区域（见[`程度`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | 多边形创建选项（请参阅[`多边形生成器选项`](../../polygongeneratoroptions/)) |

### 返回值

多边形数组（参见枚举[`多边形`](../../../aspose.gis.geometries/ipolygon/))

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | 多边形的数量必须大于一个。 |
| NullReferenceException | 范围必须有一个值（不能为 NULL） |
| ArgumentException | 最小和最大长度必须不相等且大于 0 |
| ArgumentException | 最大长度必须大于最小长度 |

### 也可以看看

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* 命名空间 [Aspose.Gis.GeoTools](../../geogenerator/)
* 部件 [Aspose.GIS](../../../)


