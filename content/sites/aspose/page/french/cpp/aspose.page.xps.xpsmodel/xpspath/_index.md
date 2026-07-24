---
title: "Aspose::Page::XPS::XpsModel::XpsPath classe"
linktitle: "XpsPath"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsModel::XpsPath classe. Classe encapsulant les fonctionnalités de l’élément Path. Cet élément est le seul moyen d’ajouter des graphiques vectoriels et des images à une page fixe. Il définit un seul graphique vectoriel à rendre sur une page en C++."
type: docs
weight: 3000
url: /fr/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Classe encapsulant les fonctionnalités de l'élément Path. Cet élément est le seul moyen d'ajouter des graphiques vectoriels et des images à une page fixe. Il définit un graphique vectoriel unique à rendre sur une page.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Clone ce chemin. |
| [get_Data](./get_data/)() | Obtient/définit la géométrie du chemin. |
| [get_Fill](./get_fill/)() | Obtient/définit le pinceau utilisé pour peindre la géométrie spécifiée par la propriété Data du chemin. |
| [get_Stroke](./get_stroke/)() | Obtient/définit le pinceau utilisé pour tracer le trait. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | Obtient/définit le tableau spécifiant la longueur des tirets et des espaces du trait de contour. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | Obtient/définit la valeur indiquant comment les extrémités de chaque tiret sont dessinées. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | Obtient/définit le point de départ pour répéter le motif du tableau de tirets. Si cette valeur est omise, le tableau de tirets s’aligne avec l’origine du trait. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | Obtient/définit la valeur définissant la forme de l’extrémité du dernier tiret d’un trait. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | Obtient/définit la valeur définissant la forme du début du premier tiret d’un trait. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | Obtient/définit le rapport entre la longueur maximale du joint en biseau et la moitié de l’épaisseur du trait. Cette valeur n’est significative que si l’attribut **StrokeLineJoin** spécifie **Miter**. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | Obtient/définit la valeur définissant la forme du début du premier tiret d’un trait. |
| [get_StrokeThickness](./get_strokethickness/)() const | Obtient/définit l’épaisseur d’un trait, en unités de l’espace de coordonnées effectif (inclut la transformation de rendu du chemin). Le trait est dessiné au-dessus de la frontière de la géométrie spécifiée par la propriété Data de l’élément Path. La moitié du StrokeThickness s’étend à l’extérieur de la géométrie spécifiée par la propriété Data et l’autre moitié s’étend à l’intérieur de la géométrie. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | Obtient/définit la géométrie du chemin. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Obtient/définit le pinceau utilisé pour peindre la géométrie spécifiée par la propriété Data du chemin. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | Obtient/définit le pinceau utilisé pour tracer le trait. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | Obtient/définit le tableau spécifiant la longueur des tirets et des espaces du trait de contour. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | Obtient/définit la valeur indiquant comment les extrémités de chaque tiret sont dessinées. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | Obtient/définit le point de départ pour répéter le motif du tableau de tirets. Si cette valeur est omise, le tableau de tirets s’aligne avec l’origine du trait. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | Obtient/définit la valeur définissant la forme de l’extrémité du dernier tiret d’un trait. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | Obtient/définit la valeur définissant la forme du début du premier tiret d’un trait. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | Obtient/définit le rapport entre la longueur maximale du joint en biseau et la moitié de l’épaisseur du trait. Cette valeur n’est significative que si l’attribut **StrokeLineJoin** spécifie **Miter**. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | Obtient/définit la valeur définissant la forme du début du premier tiret d’un trait. |
| [set_StrokeThickness](./set_strokethickness/)(float) | Obtient/définit l’épaisseur d’un trait, en unités de l’espace de coordonnées effectif (inclut la transformation de rendu du chemin). Le trait est dessiné au-dessus de la frontière de la géométrie spécifiée par la propriété Data de l’élément Path. La moitié du StrokeThickness s’étend à l’extérieur de la géométrie spécifiée par la propriété Data et l’autre moitié s’étend à l’intérieur de la géométrie. |
## Voir aussi

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
