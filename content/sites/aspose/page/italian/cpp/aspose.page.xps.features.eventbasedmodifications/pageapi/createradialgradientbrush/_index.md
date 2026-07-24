---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method. Crea un nuovo pennello a gradiente radiale in C++."
type: docs
weight: 2000
url: /it/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createradialgradientbrush/
---
## PageAPI::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Crea un nuovo pennello a gradiente radiale.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| center | System::Drawing::PointF | Il punto centrale del gradiente radiale (cioè, il centro dell'ellisse). |
| gradientOrigin | System::Drawing::PointF | Il punto di origine del gradiente radiale. |
| radiusX | float | Il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale. |
| radiusY | float | Il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale. |

### ReturnValue

Nuovo pennello a gradiente radiale.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Crea un nuovo pennello a gradiente radiale.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | L'elenco dei gradient stop. |
| center | System::Drawing::PointF | Il punto centrale del gradiente radiale (cioè, il centro dell'ellisse). |
| gradientOrigin | System::Drawing::PointF | Il punto di origine del gradiente radiale. |
| radiusX | float | Il raggio nella dimensione x dell'ellisse che definisce il gradiente radiale. |
| radiusY | float | Il raggio nella dimensione y dell'ellisse che definisce il gradiente radiale. |

### ReturnValue

Nuovo pennello a gradiente radiale.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
