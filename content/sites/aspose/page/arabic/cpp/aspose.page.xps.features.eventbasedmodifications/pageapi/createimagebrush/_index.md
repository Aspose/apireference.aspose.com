---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method. ينشئ فرشاة صورة جديدة في C++."
type: docs
weight: 1100
url: /ar/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


ينشئ فرشاة صورة جديدة.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| صورة | System::SharedPtr\<XpsModel::XpsImage\> | مورد صورة. |
| viewbox | System::Drawing::RectangleF | الموضع والأبعاد لمحتوى المصدر للفرشاة. |
| منطقة العرض | System::Drawing::RectangleF | المنطقة في مساحة الإحداثيات المحتوية لبلاطة الفرشاة الأساسية التي تُطبق (ربما بشكل متكرر) لملء المنطقة التي تُطبق عليها الفرشاة |

### ReturnValue

فرشاة صورة جديدة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


ينشئ فرشاة صورة جديدة.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| imagePath | System::String | المسار إلى الصورة لاستخدامها كبلاطة للفرشاة. |
| viewbox | System::Drawing::RectangleF | الموضع والأبعاد لمحتوى المصدر للفرشاة. |
| منطقة العرض | System::Drawing::RectangleF | المنطقة في مساحة الإحداثيات المحتوية لبلاطة الفرشاة الأساسية التي تُطبق (ربما بشكل متكرر) لملء المنطقة التي تُطبق عليها الفرشاة |

### ReturnValue

فرشاة صورة جديدة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
