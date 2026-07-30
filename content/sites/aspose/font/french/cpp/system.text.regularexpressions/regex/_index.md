---
title: "Classe System::Text::RegularExpressions::Regex"
linktitle: "Expression régulière"
second_title: "Aspose.Font pour C++"
description: "Classe System::Text::RegularExpressions::Regex. Expression régulière qui suit une syntaxe similaire à C#. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 800
url: /fr/cpp/system.text.regularexpressions/regex/
---
## Regex class


Expression régulière qui suit une syntaxe similaire à C#. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Regex : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Escape](./escape/)(const String\&) | Échappe les caractères spéciaux pour utiliser la chaîne comme partie du modèle. |
| [get_MatchTimeout](./get_matchtimeout/)() | Obtient le délai d'attente du matching. |
| [get_Options](./get_options/)() | Obtient les options de l'expression régulière. |
| [get_RightToLeft](./get_righttoleft/)() | Vérifie si le rapprochement est effectué en mode de droite à gauche. |
| [IsMatch](./ismatch/)(const String\&, int) | Correspond l'expression régulière à la chaîne. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | Vérifie si la chaîne correspond au modèle. |
| [Match](./match/)(const String\&) | Correspond l'expression régulière à la chaîne. |
| [Match](./match/)(const String\&, int, int) | Correspond l'expression régulière à la chaîne. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Correspond la chaîne et le modèle. |
| [Matches](./matches/)(const String\&, int) | Obtient toutes les correspondances de l'expression régulière dans la chaîne donnée en effectuant des correspondances répétées. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Obtient toutes les correspondances entre la chaîne et le modèle. |
| [Regex](./regex/)() | Construit une expression régulière vide. |
| [Regex](./regex/)(const String\&) | Constructeur. |
| [Regex](./regex/)(const String\&, RegexOptions) | Constructeur. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | Constructeur. |
| [Replace](./replace/)(const String\&, const String\&) | Remplace toutes les correspondances de l'expression régulière dans la chaîne par la chaîne de remplacement. |
| [Replace](./replace/)(const String\&, const char_t *) | Remplace toutes les correspondances de l'expression régulière dans la chaîne par la chaîne de remplacement. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | Remplace toutes les correspondances de l'expression régulière dans la chaîne par la chaîne de remplacement. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | Remplace toutes les correspondances de l'expression régulière dans la chaîne par la chaîne de remplacement. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | Remplace toutes les correspondances dans la chaîne par des chaînes de remplacement générées par un délégué. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | Remplace toutes les correspondances dans la chaîne par des chaînes de remplacement générées par un délégué. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | Remplace toutes les correspondances dans la chaîne par des chaînes de remplacement générées par un délégué. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | Remplace toutes les correspondances dans la chaîne par des chaînes de remplacement générées par un délégué (fonction statique). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | Remplace toutes les correspondances de l'expression régulière dans la chaîne par la chaîne de remplacement. |
| [Replace](./replace/)(const String\&, const String\&, int) | Remplace les sous‑chaînes dans la chaîne. Non implémenté. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Remplace les sous‑chaînes dans la chaîne. Non implémenté. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | Remplace les correspondances d'expressions régulières. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | Remplace les correspondances d'expressions régulières. |
| [Split](./split/)(const String\&) | Divise la chaîne selon les correspondances d'expressions régulières. |
| [Split](./split/)(const String\&, int) | Divise la chaîne selon les correspondances d'expressions régulières. |
| [Split](./split/)(const String\&, int, int) | Divise une chaîne d'entrée un nombre maximal spécifié de fois en un tableau de sous‑chaînes, aux positions définies par une expression régulière spécifiée dans le constructeur [Regex](./). La recherche du motif d'expression régulière commence à une position de caractère spécifiée dans la chaîne d'entrée. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | Divise la chaîne selon l'expression régulière. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | Divise la chaîne selon l'expression régulière. |
| [ToString](./tostring/)() const override | Convertit une expression régulière en chaîne. |
| static [Unescape](./unescape/)(const String\&) | Décode les caractères spéciaux dans la chaîne utilisés comme partie du motif. |
## Champs

| Champ | Description |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | Valeur de délai d'attente spéciale pour désactiver l'interruption de correspondance par le délai. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
