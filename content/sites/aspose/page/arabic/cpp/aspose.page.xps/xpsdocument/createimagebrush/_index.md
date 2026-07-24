---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method. ينشئ فرشاة صورة جديدة في C++."
type: docs
weight: 1800
url: /ar/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


ينشئ فرشاة صورة جديدة.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


ينشئ فرشاة صورة جديدة.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
