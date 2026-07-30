---
title: "Classe System::Drawing::FontFamily"
linktitle: "FontFamily"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::FontFamily. Représente un groupe de polices qui partagent une conception de base similaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.drawing/fontfamily/
---
## FontFamily class


Représente un groupe de polices qui partagent une conception de base similaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class FontFamily : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Renvoie une copie de l'objet [FontFamily](./) actuel. |
| [Dispose](./dispose/)() | Libère toutes les ressources du système d'exploitation acquises par l'objet actuel. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Détermine si l'objet actuel et l'objet spécifié sont identiques. |
| [FontFamily](./fontfamily/)(const String\&) | Construit une nouvelle instance de la classe [FontFamily](./) qui représente une famille de polices avec le nom spécifié. |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | Construit une nouvelle instance de [FontFamily](./) dans la FontCollection spécifiée avec le nom indiqué. |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | Construit une nouvelle instance de [FontFamily](./) à partir de la famille de polices générique spécifiée. |
| static [get_Families](./get_families/)() | Renvoie un tableau contenant tous les objets [FontFamily](./) associés au contexte graphique actuel. |
| static [get_GenericMonospace](./get_genericmonospace/)() | Renvoie un objet [FontFamily](./) qui représente une famille de polices Monospace générique. |
| static [get_GenericSansSerif](./get_genericsansserif/)() | Renvoie un objet [FontFamily](./) qui représente une famille de polices Sans Serif générique. |
| static [get_GenericSerif](./get_genericserif/)() | Renvoie un objet [FontFamily](./) qui représente une famille de polices Serif générique. |
| [get_Name](./get_name/)() const | Renvoie le nom de la famille de polices représentée par l'objet actuel. |
| [GetCellAscent](./getcellascent/)(FontStyle) | Renvoie la montée de cellule de la famille de polices représentée par l'objet actuel pour le style de police spécifié. |
| [GetCellDescent](./getcelldescent/)(FontStyle) | Renvoie la descente de cellule de la famille de polices représentée par l'objet actuel pour le style de police spécifié. |
| [GetEmHeight](./getemheight/)(FontStyle) | Renvoie la hauteur du carré em en unités de conception de police pour le style spécifié. |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | Renvoie l'espacement des lignes de la famille de polices représentée par l'objet actuel pour le style de police spécifié. |
| [GetName](./getname/)(int) const | Renvoie le nom de la famille de polices représentée par l'objet actuel. |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | Détermine si le style de police spécifié est disponible. |
| virtual [~FontFamily](./~fontfamily/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
