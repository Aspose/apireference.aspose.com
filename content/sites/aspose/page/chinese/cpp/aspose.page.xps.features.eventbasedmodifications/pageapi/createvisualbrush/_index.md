---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush 方法"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush 方法。在 C++ 中创建新的视觉画刷。"
type: docs
weight: 2200
url: /zh/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/
---
## PageAPI::CreateVisualBrush method


创建一个新的视觉画刷。

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | 用于 Visual 属性的 [XPS](../../../aspose.page.xps/) 元素（Canvas、Path 或 Glyphs），用于视觉画刷。 |
| viewbox | System::Drawing::RectangleF | 刷子源内容的位置和尺寸。 |
| 视口 | System::Drawing::RectangleF | 在包含坐标空间中，主刷子瓦片的区域（可能会重复）用于填充刷子应用的区域。 |

### ReturnValue

新视觉画刷。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
