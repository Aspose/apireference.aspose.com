---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush methode"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush methode. Maakt een nieuwe radiale gradiëntkwast in C++."
type: docs
weight: 2700
url: /nl/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Maakt een nieuwe radiale gradientpenseel.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| center | System::Drawing::PointF | Het middelpunt van de radiale gradient (dat wil zeggen, het midden van de ellips). |
| gradientOrigin | System::Drawing::PointF | Het oorsprongspunt van de radiale gradient. |
| radiusX | float | De straal in de x-dimensie van de ellips die de radiale gradient definieert. |
| radiusY | float | De straal in de y-dimensie van de ellips die de radiale gradiënt definieert. |

### ReturnValue

Nieuwe radiale gradiëntkwast.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Maakt een nieuwe radiale gradientpenseel.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | De lijst met gradientstops. |
| center | System::Drawing::PointF | Het middelpunt van de radiale gradient (dat wil zeggen, het midden van de ellips). |
| gradientOrigin | System::Drawing::PointF | Het oorsprongspunt van de radiale gradient. |
| radiusX | float | De straal in de x-dimensie van de ellips die de radiale gradient definieert. |
| radiusY | float | De straal in de y-dimensie van de ellips die de radiale gradiënt definieert. |

### ReturnValue

Nieuwe radiale gradiëntkwast.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
