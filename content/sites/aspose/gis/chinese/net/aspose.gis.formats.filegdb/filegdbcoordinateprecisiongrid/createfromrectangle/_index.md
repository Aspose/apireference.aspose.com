---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: Aspose.GIS for .NET API 参考
description: FileGdbCoordinatePrecisionGrid 方法. 创建新的FileGdb坐标精度网格这样矩形内的所有值都是可表示的
type: docs
weight: 20
url: /zh/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

创建新的`FileGdb坐标精度网格`这样矩形内的所有值都是可表示的。

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| p1 | IPoint | 矩形的一个角。 |
| p2 | IPoint | 矩形的对角。必须具有相同的尺寸*p1*. |

### 返回值

的`FileGdb坐标精度网格`这样矩形内的所有值都是可表示的。 矩形外的值不可表示，因此将写入 FileGDB layer 的所有坐标都必须在矩形内。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | *p1*和*p2*不要形成有效的非空矩形： *p1*或者*p2*是空的。 HasZ的旗帜*p1*不等于'HasZ'标志*p2*HasM'标志*p1*不等于'HasM'标志*p2*X'坐标*p1*等于'X'坐标*p2*Y'坐标*p1*等于'Y'坐标*p2*Z'坐标*p1*等于'Z'坐标*p2*M'坐标*p1*等于'M'坐标*p2*任何坐标是NaN或无穷大。 |

### 也可以看看

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* 部件 [Aspose.GIS](../../../)


