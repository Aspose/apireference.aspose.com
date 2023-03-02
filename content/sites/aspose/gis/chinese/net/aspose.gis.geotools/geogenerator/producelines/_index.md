---
title: GeoGenerator.ProduceLines
second_title: Aspose.GIS for .NET API 参考
description: GeoGenerator 方法. 创建一个新的 ILineString 枚举器其中包含给定数量的随机项所有项都在给定范围内
type: docs
weight: 10
url: /zh/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

创建一个新的 ILineString 枚举器，其中包含给定数量的随机项，所有项都在给定范围内。

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| rect | Extent | 指定区域（见[`程度`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | 线创建选项（见[`线生成器选项`](../../linegeneratoroptions/)) |

### 返回值

行数组（见枚举[`线串`](../../../aspose.gis.geometries/ilinestring/))

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | 行数必须大于一。 |
| NullReferenceException | 范围必须有一个值（不能为 NULL） |

### 也可以看看

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* 命名空间 [Aspose.Gis.GeoTools](../../geogenerator/)
* 部件 [Aspose.GIS](../../../)


