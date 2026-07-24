---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method. Crée un nouveau pinceau de dégradé radial en C++."
type: docs
weight: 2000
url: /fr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createradialgradientbrush/
---
## PageAPI::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Crée un nouveau pinceau de dégradé radial.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| centre | System::Drawing::PointF | Le point central du dégradé radial (c'est-à-dire le centre de l'ellipse). |
| gradientOrigin | System::Drawing::PointF | Le point d'origine du dégradé radial. |
| radiusX | float | Le rayon dans la dimension x de l'ellipse qui définit le dégradé radial. |
| radiusY | float | Le rayon dans la dimension y de l'ellipse qui définit le dégradé radial. |

### ReturnValue

Nouvelle brosse de dégradé radial.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Crée un nouveau pinceau de dégradé radial.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | La liste des arrêts de dégradé. |
| centre | System::Drawing::PointF | Le point central du dégradé radial (c'est-à-dire le centre de l'ellipse). |
| gradientOrigin | System::Drawing::PointF | Le point d'origine du dégradé radial. |
| radiusX | float | Le rayon dans la dimension x de l'ellipse qui définit le dégradé radial. |
| radiusY | float | Le rayon dans la dimension y de l'ellipse qui définit le dégradé radial. |

### ReturnValue

Nouvelle brosse de dégradé radial.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
