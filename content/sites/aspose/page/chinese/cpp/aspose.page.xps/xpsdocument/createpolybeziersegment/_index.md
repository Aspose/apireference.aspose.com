---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment 方法"
linktitle: "CreatePolyBezierSegment"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment 方法。在 C++ 中创建一组新的三次贝塞尔曲线。"
type: docs
weight: 2400
url: /zh/cpp/aspose.page.xps/xpsdocument/createpolybeziersegment/
---
## XpsDocument::CreatePolyBezierSegment method


创建一组新的三次贝塞尔曲线。

```cpp
System::SharedPtr<XpsModel::XpsPolyBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | 多个贝塞尔段的控制点。 |
| isStroked | bool | 指定是否为路径的此段绘制描边。 |

### ReturnValue

新的三次贝塞尔曲线段。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolybeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
