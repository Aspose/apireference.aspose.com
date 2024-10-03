---
title: Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method
linktitle: CreateVisualBrush
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method. Creates a new visual brush in C++.'
type: docs
weight: 3200
url: /cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/
---
## PageAPI::CreateVisualBrush method


Creates a new visual brush.

```cpp
System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsVisualBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush(System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Description |
| --- | --- | --- |
| element | System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsContentElement\> | The [XPS](../../../aspose.page.xps/) element (Canvas, Path or Glyphs) for Visual property od visual brush. |
| viewbox | System::Drawing::RectangleF | The position and dimensions of the brush's source content. |
| viewport | System::Drawing::RectangleF | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

### ReturnValue

New visual brush.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
