---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush μέθοδος"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush μέθοδος. Δημιουργεί ένα νέο radial gradient brush σε C++."
type: docs
weight: 2700
url: /el/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Δημιουργεί ένα νέο πινέλο ακτινικής διαβάθμισης.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| κέντρο | System::Drawing::PointF | Το κεντρικό σημείο της ακτινικής διαβάθμισης (δηλαδή, το κέντρο της έλλειψης). |
| gradientOrigin | System::Drawing::PointF | Το σημείο προέλευσης της ακτινικής διαβάθμισης. |
| radiusX | float | Η ακτίνα στη διάσταση x της έλλειψης που ορίζει την ακτινική διαβάθμιση. |
| radiusY | float | Η ακτίνα στη διάσταση y του έλλειψης που ορίζει την ακτινική διαβάθμιση. |

### ReturnValue

Νέο πινέλο ακτινικής διαβάθμισης.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Δημιουργεί ένα νέο πινέλο ακτινικής διαβάθμισης.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | Η λίστα των σημείων διακοπής διαβάθμισης. |
| κέντρο | System::Drawing::PointF | Το κεντρικό σημείο της ακτινικής διαβάθμισης (δηλαδή, το κέντρο της έλλειψης). |
| gradientOrigin | System::Drawing::PointF | Το σημείο προέλευσης της ακτινικής διαβάθμισης. |
| radiusX | float | Η ακτίνα στη διάσταση x της έλλειψης που ορίζει την ακτινική διαβάθμιση. |
| radiusY | float | Η ακτίνα στη διάσταση y του έλλειψης που ορίζει την ακτινική διαβάθμιση. |

### ReturnValue

Νέο πινέλο ακτινικής διαβάθμισης.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
