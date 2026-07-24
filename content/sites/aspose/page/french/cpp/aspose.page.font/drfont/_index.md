---
title: "Aspose::Page::Font::DrFont classe"
linktitle: "DrFont"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::Font::DrFont classe. Utilisez cette classe à la place de GDI+ Font en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.page.font/drfont/
---
## DrFont class


Utilisez cette classe à la place de GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Détermine si le [System::Object](../../system/object/) spécifié est égal à cette instance. |
| [get_AscentLis](./get_ascentlis/)() | Ascension de cellule de cette police (lis). Il s'agit d'une distance verticale du haut de la cellule à la ligne de base de la cellule. |
| [get_AscentPoints](./get_ascentpoints/)() | Renvoie l'ascension de la cellule en points. |
| [get_CellHeightLis](./get_cellheightlis/)() | Renvoie la hauteur de cellule de cette police (lis). Il s'agit d'un raccourci pour [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | Raccourci pour [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | Descente de cellule de cette police (lis). Il s'agit d'une distance verticale du bas de la cellule à la ligne de base de la cellule. |
| [get_DescentPoints](./get_descentpoints/)() | Renvoie la descente de cellule en points. |
| [get_FamilyName](./get_familyname/)() | Obtient le nom de cette police. |
| [get_IsBold](./get_isbold/)() | Obtient une valeur indiquant si cette instance est en gras. |
| [get_IsItalic](./get_isitalic/)() | Obtient une valeur indiquant si cette instance est en italique. |
| [get_LeadingLis](./get_leadinglis/)() | Renvoie l'interligne de cette police (lis). Il s'agit d'un raccourci pour [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | Renvoie l'interligne de cette police (lis). Il s'agit d'un raccourci pour [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | Renvoie l'espacement de cellule de cette police (lis). Il s'agit d'une distance verticale entre les lignes de base des deux glyphes. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Renvoie l'espacement de cellule de cette police (points). Il s'agit d'une distance verticale entre les lignes de base des deux glyphes. |
| [get_SizePoints](./get_sizepoints/)() | Obtient la taille de cette police (points). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Obtient les majuscules de la police. |
| [get_Style](./get_style/)() | Obtient la police TrueType. |
| [get_StyleEx](./get_styleex/)() | Cette propriété contient des informations supplémentaires sur le style de la police. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Obtient la largeur du caractère lis. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Renvoie la largeur du caractère (points). |
| [GetHashCode](./gethashcode/)() const override | Renvoie un code de hachage pour cette instance. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Renvoie la boîte de texte de mesure du texte en points. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Obtient la largeur du texte lis. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Obtient la largeur du texte en points. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Obtient la largeur du texte en points. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | Renvoie True pour la police "Microsoft Sans Serif". Celle-ci est mal rendue par GDI+. Voir Test286 et Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Remplace le contenu de la police. |
| [set_SizePoints](./set_sizepoints/)(float) | Obtient la taille de cette police (points). |
| [set_StyleEx](./set_styleex/)(int16_t) | Cette propriété contient des informations supplémentaires sur le style de la police. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
