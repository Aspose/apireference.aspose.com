---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment 方法"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment 方法。 在 C++ 中使用指定的控制点，从路径图形的前一点通过一组顶点创建一组二次贝塞尔曲线。"
type: docs
weight: 2600
url: /zh/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


创建一组新的二次贝塞尔曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | 多个二次贝塞尔段的控制点。 |
| isStroked | bool | 指定是否为路径的此段绘制描边。 |

### ReturnValue

新的二次贝塞尔曲线段。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
