---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush 方法。以 C++ 创建新的图像画刷。"
type: docs
weight: 1800
url: /zh/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


创建一个新的图像画刷。

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


创建一个新的图像画刷。

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
