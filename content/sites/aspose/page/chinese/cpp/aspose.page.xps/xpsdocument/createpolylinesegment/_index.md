---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment method"
linktitle: "CreatePolyLineSegment"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment 方法。以 C++ 创建包含任意数量顶点的多边形绘图。"
type: docs
weight: 2500
url: /zh/cpp/aspose.page.xps/xpsdocument/createpolylinesegment/
---
## XpsDocument::CreatePolyLineSegment method


创建一个包含任意数量独立顶点的新的多边形绘图。

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | 一组用于定义折线段的多个段的坐标。 |
| isStroked | bool | 指定是否为路径的此段绘制描边。 |

### ReturnValue

新的多边形绘图段。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyLineSegment](../../../aspose.page.xps.xpsmodel/xpspolylinesegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
