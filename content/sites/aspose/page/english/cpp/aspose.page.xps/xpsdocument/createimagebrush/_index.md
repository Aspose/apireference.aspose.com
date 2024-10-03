---
title: Aspose::Page::XPS::XpsDocument::CreateImageBrush method
linktitle: CreateImageBrush
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsDocument::CreateImageBrush method. Creates a new image brush in C++.'
type: docs
weight: 5500
url: /cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Creates a new image brush.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Description |
| --- | --- | --- |
| image | System::SharedPtr\<XpsModel::XpsImage\> | An image resource. |
| viewbox | System::Drawing::RectangleF | The position and dimensions of the brush's source content. |
| viewport | System::Drawing::RectangleF | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

### ReturnValue

New image brush.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Creates a new image brush.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
