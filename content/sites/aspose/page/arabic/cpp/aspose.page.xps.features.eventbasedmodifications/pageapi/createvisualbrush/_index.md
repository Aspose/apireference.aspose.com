---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush طريقة"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush طريقة. ينشئ فرشاة بصرية جديدة في C++."
type: docs
weight: 2200
url: /ar/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/
---
## PageAPI::CreateVisualBrush method


ينشئ فرشاة بصرية جديدة.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | العنصر [XPS](../../../aspose.page.xps/) (Canvas, Path أو Glyphs) لخاصية Visual للفرشاة البصرية. |
| viewbox | System::Drawing::RectangleF | الموضع والأبعاد لمحتوى المصدر للفرشاة. |
| منطقة العرض | System::Drawing::RectangleF | المنطقة في مساحة الإحداثيات المحتوية لبلاطة الفرشاة الأساسية التي تُطبق (ربما بشكل متكرر) لملء المنطقة التي تُطبق عليها الفرشاة |

### ReturnValue

فرشاة بصرية جديدة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
