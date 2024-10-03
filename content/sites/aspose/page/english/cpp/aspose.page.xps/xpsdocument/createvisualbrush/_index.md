---
title: Aspose::Page::XPS::XpsDocument::CreateVisualBrush method
linktitle: CreateVisualBrush
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsDocument::CreateVisualBrush method. Creates a new visual brush in C++.'
type: docs
weight: 5400
url: /cpp/aspose.page.xps/xpsdocument/createvisualbrush/
---
## XpsDocument::CreateVisualBrush method


Creates a new visual brush.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::XpsDocument::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Description |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | The [XPS](../../) element (Canvas, Path or Glyphs) for Visual property od visual brush. |
| viewbox | System::Drawing::RectangleF | The position and dimensions of the brush's source content. |
| viewport | System::Drawing::RectangleF | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

### ReturnValue

New visual brush.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
