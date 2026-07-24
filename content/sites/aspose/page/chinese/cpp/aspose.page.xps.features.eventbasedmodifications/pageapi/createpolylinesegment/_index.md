---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment method"
linktitle: "CreatePolyLineSegment"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment 方法。创建一个包含任意数量顶点的多边形绘图（C++）。"
type: docs
weight: 1800
url: /zh/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolylinesegment/
---
## PageAPI::CreatePolyLineSegment method


创建一个包含任意数量独立顶点的新的多边形绘图。

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
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
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
