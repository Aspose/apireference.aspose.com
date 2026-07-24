---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry classe"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry classe. Classe encapsulant les fonctionnalités de l'élément de propriété PathGeometry. Cet élément contient un ensemble de figures de chemin spécifiées soit avec l'attribut Figures, soit avec un élément enfant PathFigure en C++."
type: docs
weight: 3200
url: /fr/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


Classe encapsulant les fonctionnalités de l'élément de propriété PathGeometry. Cet élément contient un ensemble de figures de chemin spécifiées soit avec l'attribut Figures, soit avec un élément enfant PathFigure.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Ajoute un segment de chemin à la liste des segments enfants de la dernière figure de chemin. |
| [Clone](./clone/)() | Clone cette géométrie de chemin. |
| [get_FillRule](./get_fillrule/)() const | Renvoie/definit la valeur spécifiant comment les zones d'intersection des formes géométriques sont combinées pour former une région. |
| [get_PathFigures](./get_pathfigures/)() | Renvoie la liste des figures de chemin enfants. |
| [get_Transform](./get_transform/)() override | Renvoie/definit la matrice de transformation affine établissant la transformation matricielle locale appliquée à tous les éléments enfants et descendants de la géométrie de chemin avant son utilisation pour le remplissage, le découpage ou le tracé. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | Insère un segment de chemin dans la liste des segments enfants de la dernière figure de chemin à la position *index*. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Supprime un segment de chemin de la liste des segments enfants de la dernière figure de chemin. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | Supprime un segment de chemin de la liste des segments enfants de la dernière figure de chemin à la position *index*. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Renvoie/definit la valeur spécifiant comment les zones d'intersection des formes géométriques sont combinées pour former une région. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Renvoie/definit la matrice de transformation affine établissant la transformation matricielle locale appliquée à tous les éléments enfants et descendants de la géométrie de chemin avant son utilisation pour le remplissage, le découpage ou le tracé. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définit le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
## Voir aussi

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
