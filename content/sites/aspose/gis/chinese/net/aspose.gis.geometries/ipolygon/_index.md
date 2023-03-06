---
title: Interface IPolygon
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Geometries.IPolygon 界面. 一个ICurvePolygon其边界由线性环定义
type: docs
weight: 1100
url: /zh/net/aspose.gis.geometries/ipolygon/
---
## IPolygon interface

一个[`ICurvePolygon`](../icurvepolygon/)其边界由线性环定义。

```csharp
public interface IPolygon : ICurvePolygon, IEquatable<IPolygon>
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [ExteriorRing](../../aspose.gis.geometries/ipolygon/exteriorring/) { get; } | 获取外环。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [GetInteriorRing](../../aspose.gis.geometries/ipolygon/getinteriorring/)(int) | 通过其索引获取内部环。 |
| [ToEditable](../../aspose.gis.geometries/ipolygon/toeditable/)() | 获取此几何体的可编辑副本。 |

### 也可以看看

* interface [ICurvePolygon](../icurvepolygon/)
* 命名空间 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 部件 [Aspose.GIS](../../)


