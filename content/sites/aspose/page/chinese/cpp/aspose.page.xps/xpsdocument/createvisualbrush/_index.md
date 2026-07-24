---
title: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush 方法"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush 方法。创建一个新的 visual brush 在 C++ 中。"
type: docs
weight: 2900
url: /zh/cpp/aspose.page.xps/xpsdocument/createvisualbrush/
---
## XpsDocument::CreateVisualBrush method


创建一个新的视觉画刷。

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::XpsDocument::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | 用于 visual brush 的 Visual 属性的 [XPS](../../) 元素（Canvas、Path 或 Glyphs）。 |
| viewbox | System::Drawing::RectangleF | 刷子源内容的位置和尺寸。 |
| 视口 | System::Drawing::RectangleF | 在包含坐标空间中，主刷子瓦片的区域（可能会重复）用于填充刷子应用的区域。 |

### ReturnValue

新视觉画刷。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
