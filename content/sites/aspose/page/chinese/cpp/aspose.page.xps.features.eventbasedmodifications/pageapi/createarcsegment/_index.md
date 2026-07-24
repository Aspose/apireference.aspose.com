---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment 方法。 在 C++ 中创建一个新的椭圆弧段。"
type: docs
weight: 600
url: /zh/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createarcsegment/
---
## PageAPI::CreateArcSegment method


创建一个新的椭圆弧段。

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 点 | System::Drawing::PointF | 椭圆弧的终点。 |
| size | System::Drawing::SizeF | 椭圆弧的 x 和 y 半径，以 x,y 对的形式表示。 |
| rotationAngle | 单精度浮点数 | 指示椭圆相对于当前坐标系的旋转方式。 |
| isLargeArc | bool | 确定该弧段是否以 180 度或更大的扫掠角度绘制。 |
| sweepDirection | XpsModel::XpsSweepDirection | 绘制弧段的方向。 |
| isStroked | bool | 指定是否为路径的此段绘制描边。 |

### ReturnValue

新的椭圆弧段。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
