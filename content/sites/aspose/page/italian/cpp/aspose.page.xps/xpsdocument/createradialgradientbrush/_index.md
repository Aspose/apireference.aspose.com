---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush metodo"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush metodo. Crea un nuovo pennello a gradiente radiale in C++."
type: docs
weight: 2700
url: /it/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Crea un nuovo pennello a gradiente radiale.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Crea un nuovo pennello a gradiente radiale.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
