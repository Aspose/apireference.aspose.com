---
title: Interface ICompoundCurve
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Geometries.ICompoundCurve 界面. 表示一系列连续曲线的曲线相邻曲线在其端点连接
type: docs
weight: 970
url: /zh/net/aspose.gis.geometries/icompoundcurve/
---
## ICompoundCurve interface

表示一系列连续曲线的曲线，相邻曲线在其端点连接。

```csharp
public interface ICompoundCurve : ICurve, IEnumerable<ICurve>, IEquatable<ICompoundCurve>
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Count](../../aspose.gis.geometries/icompoundcurve/count/) { get; } | 获取曲线中的曲线数`ICompoundCurve`. |
| [Item](../../aspose.gis.geometries/icompoundcurve/item/) { get; } | 获取[`ICurve`](../icurve/)在指定的索引处. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icompoundcurve/toeditable/)() | 获取此几何体的可编辑副本。 |

### 也可以看看

* interface [ICurve](../icurve/)
* 命名空间 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 部件 [Aspose.GIS](../../)


