---
title: XpsDocument.CreatePathFigure
second_title: Aspose.Page for .NET API 参考
description: XpsDocument 方法. 创建一个新路径图
type: docs
weight: 280
url: /zh/net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

创建一个新路径图。

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| startPoint | PointF | 路径图形第一段的起点。 |
| isClosed | Boolean | 指定路径是否闭合。如果设置为 true，则描边绘制 “闭合”，即路径图形最后一段中的最后一个点与 StartPoint 属性中指定的点连接，否则描边绘制为“打开”，并且 最后点未连接到起点。仅当路径图 is 用于指定笔划的 {Path} 元素时才适用。 |

### 返回值

新路径图。

### 也可以看看

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* 命名空间 [Aspose.Page.XPS](../../xpsdocument/)
* 部件 [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

创建一个新路径图。

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| startPoint | PointF | 路径图形第一段的起点。 |
| segments | List`1 | 路径段列表。 |
| isClosed | Boolean | 指定路径是否闭合。如果设置为 true，则描边绘制 “闭合”，即路径图形最后一段中的最后一个点与 StartPoint 属性中指定的点连接，否则描边绘制为“打开”，并且 最后点未连接到起点。仅当路径图 is 用于指定笔划的 {Path} 元素时才适用。 |

### 返回值

新路径图。

### 也可以看看

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* 命名空间 [Aspose.Page.XPS](../../xpsdocument/)
* 部件 [Aspose.Page](../../../)


