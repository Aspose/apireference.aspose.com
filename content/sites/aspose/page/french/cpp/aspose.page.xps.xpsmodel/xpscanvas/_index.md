---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas classe"
linktitle: "XpsCanvas"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas classe. Classe encapsulant les fonctionnalités de l'élément Canvas. Cet élément regroupe les éléments ensemble. Par exemple, les éléments Glyphs et Path peuvent être regroupés dans un canvas afin d'être identifiés comme une unité (comme une destination de lien hypertexte) ou d'appliquer une valeur de propriété composée à chaque élément enfant et ancêtre en C++."
type: docs
weight: 500
url: /fr/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Classe encapsulant les fonctionnalités de l'élément Canvas. Cet élément regroupe les éléments ensemble. Par exemple, les éléments Glyphs et Path peuvent être regroupés dans un canvas afin d'être identifiés comme une unité (comme destination de lien hypertexte) ou d'appliquer une valeur de propriété composée à chaque élément enfant et ancêtre.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(T) | Ajoute un élément à la liste des enfants de ce canvas. |
| [AddCanvas](./addcanvas/)() | Ajoute un nouveau canvas à la liste des enfants de ce canvas. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Ajoute de nouveaux glyphs à la liste des enfants de ce canvas. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Ajoute un nouveau Path à la liste des enfants de ce canvas. |
| [Clone](./clone/)() | Clone ce canvas. |
| [get_EdgeMode](./get_edgemode/)() const | Renvoie/definit la valeur qui contrôle la façon dont les bords des chemins à l'intérieur du canvas sont rendus. |
| [Insert](./insert/)(int32_t, T) | Insère un élément dans la liste des enfants de ce canvas à la position *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Insère un nouveau canvas dans la liste des enfants de ce canvas à la position *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Insère de nouveaux glyphs dans la liste des enfants de ce canvas à la position *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Insère un nouveau Path dans la liste des enfants de ce canvas à la position *index*. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Renvoie/definit la valeur qui contrôle la façon dont les bords des chemins à l'intérieur du canvas sont rendus. |
## Voir aussi

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
