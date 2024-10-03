---
title: Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method
linktitle: CreateImageBrush
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method. Creates a new image brush in C++.'
type: docs
weight: 3300
url: /cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Creates a new image brush.

```cpp
System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Description |
| --- | --- | --- |
| image | System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsImage\> | An image resource. |
| viewbox | System::Drawing::RectangleF | The position and dimensions of the brush's source content. |
| viewport | System::Drawing::RectangleF | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

### ReturnValue

New image brush.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Creates a new image brush.

```cpp
System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Description |
| --- | --- | --- |
| imagePath | System::String | The path to the image to take as a brush tile. |
| viewbox | System::Drawing::RectangleF | The position and dimensions of the brush's source content. |
| viewport | System::Drawing::RectangleF | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

### ReturnValue

New image brush.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
