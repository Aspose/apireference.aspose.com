---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method. Erstellt einen neuen radialen Farbverlaufspinsel in C++."
type: docs
weight: 2000
url: /de/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createradialgradientbrush/
---
## PageAPI::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Erstellt einen neuen radialen Farbverlaufs-Pinsel.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Mitte | System::Drawing::PointF | Der Mittelpunkt des radialen Farbverlaufs (das heißt, die Mitte der Ellipse). |
| gradientOrigin | System::Drawing::PointF | Der Ursprungspunkt des radialen Farbverlaufs. |
| radiusX | float | Der Radius in der x-Dimension der Ellipse, die den radialen Farbverlauf definiert. |
| radiusY | float | Der Radius in der y‑Dimension der Ellipse, die den radialen Farbverlauf definiert. |

### ReturnValue

Neuer radialer Farbverlauf‑Pinsel.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Erstellt einen neuen radialen Farbverlaufs-Pinsel.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | Die Liste der Farbverlaufsstopps. |
| Mitte | System::Drawing::PointF | Der Mittelpunkt des radialen Farbverlaufs (das heißt, die Mitte der Ellipse). |
| gradientOrigin | System::Drawing::PointF | Der Ursprungspunkt des radialen Farbverlaufs. |
| radiusX | float | Der Radius in der x-Dimension der Ellipse, die den radialen Farbverlauf definiert. |
| radiusY | float | Der Radius in der y‑Dimension der Ellipse, die den radialen Farbverlauf definiert. |

### ReturnValue

Neuer radialer Farbverlauf‑Pinsel.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
