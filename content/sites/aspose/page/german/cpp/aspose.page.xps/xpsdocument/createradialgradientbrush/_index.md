---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush Methode"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush Methode. Erstellt einen neuen radialen Farbverlauf-Pinsel in C++."
type: docs
weight: 2700
url: /de/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Erstellt einen neuen radialen Farbverlaufs-Pinsel.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Erstellt einen neuen radialen Farbverlaufs-Pinsel.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
