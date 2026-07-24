---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush 方法。创建一个新的图像画刷（C++）。"
type: docs
weight: 1100
url: /zh/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


创建一个新的图像画刷。

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| image | System::SharedPtr\<XpsModel::XpsImage\> | 图像资源。 |
| viewbox | System::Drawing::RectangleF | 刷子源内容的位置和尺寸。 |
| 视口 | System::Drawing::RectangleF | 在包含坐标空间中，主刷子瓦片的区域（可能会重复）用于填充刷子应用的区域。 |

### ReturnValue

新的图像画刷。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


创建一个新的图像画刷。

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| imagePath | System::String | 用于作为画刷平铺的图像的路径。 |
| viewbox | System::Drawing::RectangleF | 刷子源内容的位置和尺寸。 |
| 视口 | System::Drawing::RectangleF | 在包含坐标空间中，主刷子瓦片的区域（可能会重复）用于填充刷子应用的区域。 |

### ReturnValue

新的图像画刷。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
