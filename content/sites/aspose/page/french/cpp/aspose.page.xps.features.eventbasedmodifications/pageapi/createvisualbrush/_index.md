---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush méthode"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush méthode. Crée un nouveau pinceau visuel en C++."
type: docs
weight: 2200
url: /fr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/
---
## PageAPI::CreateVisualBrush method


Crée un nouveau pinceau visuel.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | L'élément [XPS](../../../aspose.page.xps/) (Canvas, Path ou Glyphs) pour la propriété Visual du pinceau visuel. |
| viewbox | System::Drawing::RectangleF | La position et les dimensions du contenu source du pinceau. |
| fenêtre d'affichage | System::Drawing::RectangleF | La région dans l'espace de coordonnées contenant la tuile principale du pinceau qui est (éventuellement appliquée de façon répétée) utilisée pour remplir la région à laquelle le pinceau est appliqué |

### ReturnValue

Nouveau pinceau visuel.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
