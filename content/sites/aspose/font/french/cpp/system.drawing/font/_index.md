---
title: "Classe System::Drawing::Font"
linktitle: "Police"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::Font. Représente un format particulier pour le texte, incluant la police, la taille et le style. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.drawing/font/
---
## Font class


Représente un format particulier pour le texte, incluant la police, la taille et le style. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class Font : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Renvoie une copie de la police actuelle. |
| [Dispose](./dispose/)() | Libère toutes les ressources du système d'exploitation acquises par l'objet actuel. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Détermine si l'objet actuel et l'objet spécifié sont identiques. |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | Construit une nouvelle instance de la classe [Font](./) qui représente la police existante spécifiée avec le style de police indiqué. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Construit une nouvelle instance de la classe [Font](./). |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | Construit une nouvelle instance de la classe [Font](./). |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Construit une nouvelle instance de la classe [Font](./). |
| [Font](./font/)(const String\&, float, GraphicsUnit) | Construit une nouvelle instance de la classe [Font](./). |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | NON IMPLEMENTÉ. |
| [get_Bold](./get_bold/)() | Détermine si la police représentée par l'objet actuel possède le style gras appliqué. |
| [get_FontFamily](./get_fontfamily/)() | Renvoie la famille de polices de la police représentée par l'objet actuel. |
| [get_FontStyle](./get_fontstyle/)() | Renvoie le style de police de la police représentée par l'objet actuel. |
| [get_GdiCharSet](./get_gdicharset/)() | Renvoie une valeur indiquant le jeu de caractères GDI utilisé par la police représentée par l'objet actuel. |
| [get_Height](./get_height/)() | Renvoie l'interligne de la police représentée par l'objet actuel en pixels. |
| [get_Italic](./get_italic/)() | Détermine si la police représentée par l'objet actuel possède le style italique appliqué. |
| [get_Name](./get_name/)() | Renvoie le nom de la police (face) de la police représentée par l'objet actuel. |
| [get_OriginalFontName](./get_originalfontname/)() | Renvoie le nom initialement spécifié de la police. |
| [get_Size](./get_size/)() | Renvoie la taille en em de la police représentée par l'objet actuel, mesurée dans les unités spécifiées par la propriété Unit. |
| [get_SizeInPoints](./get_sizeinpoints/)() | Renvoie la taille en em de la police représentée par l'objet actuel en points. |
| [get_Strikeout](./get_strikeout/)() | Détermine si la police représentée par l'objet actuel a le style barré appliqué. |
| [get_Style](./get_style/)() | Renvoie le style de police de la police représentée par l'objet actuel. |
| [get_Underline](./get_underline/)() | Détermine si la police représentée par l'objet actuel a le style souligné appliqué. |
| [get_Unit](./get_unit/)() | Renvoie l'unité de mesure de la police représentée par l'objet actuel. |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | Renvoie l'interligne de la police représentée par l'objet actuel, dans l'unité actuelle d'un objet [Graphics](../graphics/) spécifié. |
| [GetHeight](./getheight/)(float) | Renvoie la hauteur de la police représentée par l'objet actuel lorsqu'elle est dessinée sur un dispositif d'affichage avec la résolution verticale spécifiée. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
