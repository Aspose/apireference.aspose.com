---
title: Interface ICircularString
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Geometries.ICircularString 界面. 点之间圆弧插值的多顶点曲线.
type: docs
weight: 960
url: /zh/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

点之间圆弧插值的多顶点曲线.

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## 方法

| 姓名 | 描述 |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | 获取此几何体的可编辑副本。 |

### 评论

的`循环字符串`由首尾相连的一个或多个圆弧段组成。 前三个点定义第一段。第一点是弧的起点。 第二点是弧上除起点或终点以外的任何中间点。 第三点是弧的终点。后续弧仅由它们的中间点和终点定义， 作为起点隐式定义为前一段的终点。

### 也可以看看

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* 命名空间 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 部件 [Aspose.GIS](../../)


