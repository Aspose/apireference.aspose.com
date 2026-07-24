---
title: "Aspose::Page::XPS::XpsModel::XpsContentElement class"
linktitle: "XpsContentElement"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsModel::XpsContentElement classe. Encapsule les fonctionnalités des éléments de contenu XPS : Canvas, Path et Glyphs en C++."
type: docs
weight: 700
url: /fr/cpp/aspose.page.xps.xpsmodel/xpscontentelement/
---
## XpsContentElement class


Encapsule les fonctionnalités des éléments de contenu [XPS](../../aspose.page.xps/) : Canvas, Path et Glyphs.

```cpp
class XpsContentElement : public Aspose::Page::XPS::XpsModel::XpsHyperlinkElement
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Clip](./get_clip/)() | Renvoie/définit l'instance de géométrie de chemin limitant la région rendue de l'élément. |
| [get_Opacity](./get_opacity/)() const | Renvoie/définit la valeur définissant la transparence uniforme de l'élément. |
| [get_OpacityMask](./get_opacitymask/)() | Renvoie/définit le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément. |
| [get_RenderTransform](./get_rendertransform/)() | Renvoie/définit la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |
| [set_Clip](./set_clip/)(System::SharedPtr\<XpsPathGeometry\>) | Renvoie/définit l'instance de géométrie de chemin limitant la région rendue de l'élément. |
| [set_Opacity](./set_opacity/)(float) | Renvoie/définit la valeur définissant la transparence uniforme de l'élément. |
| [set_OpacityMask](./set_opacitymask/)(System::SharedPtr\<XpsBrush\>) | Renvoie/définit le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément. |
| [set_RenderTransform](./set_rendertransform/)(System::SharedPtr\<XpsMatrix\>) | Renvoie/définit la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |
## Voir aussi

* Class [XpsHyperlinkElement](../xpshyperlinkelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
