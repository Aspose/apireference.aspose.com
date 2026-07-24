---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure classe"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure classe. Classe encapsulant les caractéristiques de l'élément PathFigure. Cet élément est composé d'un ensemble d'un ou plusieurs segments de ligne ou de courbe en C++."
type: docs
weight: 3100
url: /fr/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


Classe encapsulant les fonctionnalités de l'élément PathFigure. Cet élément est composé d'un ensemble d'un ou plusieurs segments de ligne ou de courbe.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Clone cette figure de chemin. |
| [get_IsClosed](./get_isclosed/)() const | Renvoie/definit la valeur indiquant si la figure de chemin est fermée. |
| [get_IsFilled](./get_isfilled/)() const | Renvoie/definit la valeur indiquant si la figure de chemin est utilisée pour calculer la surface de la géométrie de chemin contenant. |
| [get_Segments](./get_segments/)() | Renvoie la liste des segments de chemin enfants. |
| [get_StartPoint](./get_startpoint/)() const | Renvoie/definit le point de départ du premier segment de la figure de chemin. |
| [set_IsClosed](./set_isclosed/)(bool) | Renvoie/definit la valeur indiquant si la figure de chemin est fermée. |
| [set_IsFilled](./set_isfilled/)(bool) | Renvoie/definit la valeur indiquant si la figure de chemin est utilisée pour calculer la surface de la géométrie de chemin contenant. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | Renvoie/definit le point de départ du premier segment de la figure de chemin. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définit le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
## Voir aussi

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
