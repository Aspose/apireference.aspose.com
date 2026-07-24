---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs classe"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs classe. Classe encapsulant les fonctionnalités de l'élément Glyphs. Cet élément représente une séquence de texte uniformément formaté provenant d'une seule police. Il fournit les informations nécessaires à un rendu précis et prend en charge les fonctions de recherche et de sélection dans les visionneuses en C++."
type: docs
weight: 1500
url: /fr/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Classe encapsulant les fonctionnalités de l'élément Glyphs. Cet élément représente une séquence de texte uniformément formaté provenant d'une seule police. Il fournit les informations nécessaires à un rendu précis et prend en charge les fonctionnalités de recherche et de sélection dans les visualiseurs.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Clonez ces glyphes. |
| [get_BidiLevel](./get_bidilevel/)() const | Renvoie/definit la valeur spécifiant le niveau d'imbrication bidirectionnel de l'algorithme Unicode. Les valeurs paires impliquent une disposition de gauche à droite, les valeurs impaires impliquent une disposition de droite à gauche. La disposition de droite à gauche place l'origine de la séquence du côté droit du premier glyphe, les largeurs d'avance positives (représentant des avances vers la gauche) plaçant les glyphes suivants à gauche du glyphe précédent. |
| [get_Fill](./get_fill/)() | Renvoie/definit la brosse utilisée pour remplir la forme des glyphes rendus. |
| [get_Font](./get_font/)() | Renvoie la ressource de police pour la police **TrueType** utilisée pour composer le texte des éléments. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | Renvoie/definit la taille de police en unités de surface de dessin, exprimée comme un flottant dans les unités de l'espace de coordonnées effectif. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | Renvoie/définit la valeur indiquant qu'un glyphe est tourné sur le côté, l'origine étant définie comme le centre supérieur du glyphe non tourné. |
| [get_OriginX](./get_originx/)() const | Renvoie/définit la coordonnée x du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif. |
| [get_OriginY](./get_originy/)() const | Renvoie/définit la coordonnée y du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif. |
| [get_StyleSimulations](./get_stylesimulations/)() const | Renvoie/définit la valeur spécifiant une simulation de style. |
| [get_UnicodeString](./get_unicodestring/)() const | Renvoie/définit la chaîne de texte rendue par l'élément Glyphs. Le texte est spécifié sous forme de points de code Unicode. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Renvoie/definit la valeur spécifiant le niveau d'imbrication bidirectionnel de l'algorithme Unicode. Les valeurs paires impliquent une disposition de gauche à droite, les valeurs impaires impliquent une disposition de droite à gauche. La disposition de droite à gauche place l'origine de la séquence du côté droit du premier glyphe, les largeurs d'avance positives (représentant des avances vers la gauche) plaçant les glyphes suivants à gauche du glyphe précédent. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Renvoie/definit la brosse utilisée pour remplir la forme des glyphes rendus. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | Renvoie/definit la taille de police en unités de surface de dessin, exprimée comme un flottant dans les unités de l'espace de coordonnées effectif. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | Renvoie/définit la valeur indiquant qu'un glyphe est tourné sur le côté, l'origine étant définie comme le centre supérieur du glyphe non tourné. |
| [set_OriginX](./set_originx/)(float) | Renvoie/définit la coordonnée x du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif. |
| [set_OriginY](./set_originy/)(float) | Renvoie/définit la coordonnée y du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | Renvoie/définit la valeur spécifiant une simulation de style. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | Renvoie/définit la chaîne de texte rendue par l'élément Glyphs. Le texte est spécifié sous forme de points de code Unicode. |
## Voir aussi

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
