---
title: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush طريقة"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush طريقة. ينشئ فرشاة بصرية جديدة في C++."
type: docs
weight: 2900
url: /ar/cpp/aspose.page.xps/xpsdocument/createvisualbrush/
---
## XpsDocument::CreateVisualBrush method


ينشئ فرشاة بصرية جديدة.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::XpsDocument::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | العنصر [XPS](../../) (Canvas, Path أو Glyphs) لخاصية Visual للفرشاة البصرية. |
| viewbox | System::Drawing::RectangleF | الموضع والأبعاد لمحتوى المصدر للفرشاة. |
| منطقة العرض | System::Drawing::RectangleF | المنطقة في مساحة الإحداثيات المحتوية لبلاطة الفرشاة الأساسية التي تُطبق (ربما بشكل متكرر) لملء المنطقة التي تُطبق عليها الفرشاة |

### ReturnValue

فرشاة بصرية جديدة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
