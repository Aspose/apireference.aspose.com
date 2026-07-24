---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush méthode"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush méthode. Crée un nouveau pinceau à dégradé radial en C++."
type: docs
weight: 2700
url: /fr/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Crée un nouveau pinceau de dégradé radial.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Crée un nouveau pinceau de dégradé radial.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
