---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method. Δημιουργεί ένα νέο πινέλο εικόνας σε C++."
type: docs
weight: 1100
url: /el/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Δημιουργεί ένα νέο πινέλο εικόνας.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| image | System::SharedPtr\<XpsModel::XpsImage\> | Ένας πόρος εικόνας. |
| viewbox | System::Drawing::RectangleF | Η θέση και οι διαστάσεις του περιεχομένου πηγής του πινέλου. |
| προβολή | System::Drawing::RectangleF | Η περιοχή στο περιβάλλον χώρο συντεταγμένων του κύριου πλακιδίου πινέλου που εφαρμόζεται (ενδεχομένως επανειλημμένα) για να γεμίσει την περιοχή στην οποία εφαρμόζεται το πινέλο |

### ReturnValue

Νέο πινέλο εικόνας.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Δημιουργεί ένα νέο πινέλο εικόνας.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| imagePath | System::String | Η διαδρομή προς την εικόνα που θα ληφθεί ως πλακίδιο πινέλου. |
| viewbox | System::Drawing::RectangleF | Η θέση και οι διαστάσεις του περιεχομένου πηγής του πινέλου. |
| προβολή | System::Drawing::RectangleF | Η περιοχή στο περιβάλλον χώρο συντεταγμένων του κύριου πλακιδίου πινέλου που εφαρμόζεται (ενδεχομένως επανειλημμένα) για να γεμίσει την περιοχή στην οποία εφαρμόζεται το πινέλο |

### ReturnValue

Νέο πινέλο εικόνας.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
