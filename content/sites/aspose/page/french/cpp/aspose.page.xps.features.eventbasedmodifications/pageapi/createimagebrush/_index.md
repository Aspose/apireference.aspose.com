---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method. Crée un nouveau pinceau d'image en C++."
type: docs
weight: 1100
url: /fr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Crée un nouveau pinceau d'image.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| image | System::SharedPtr\<XpsModel::XpsImage\> | Une ressource d'image. |
| viewbox | System::Drawing::RectangleF | La position et les dimensions du contenu source du pinceau. |
| fenêtre d'affichage | System::Drawing::RectangleF | La région dans l'espace de coordonnées contenant la tuile principale du pinceau qui est (éventuellement appliquée de façon répétée) utilisée pour remplir la région à laquelle le pinceau est appliqué |

### ReturnValue

Nouveau pinceau d'image.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Crée un nouveau pinceau d'image.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| imagePath | System::String | Le chemin vers l'image à utiliser comme tuile de pinceau. |
| viewbox | System::Drawing::RectangleF | La position et les dimensions du contenu source du pinceau. |
| fenêtre d'affichage | System::Drawing::RectangleF | La région dans l'espace de coordonnées contenant la tuile principale du pinceau qui est (éventuellement appliquée de façon répétée) utilisée pour remplir la région à laquelle le pinceau est appliqué |

### ReturnValue

Nouveau pinceau d'image.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
