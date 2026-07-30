---
title: "classe System::Char"
linktitle: "Char"
second_title: "Aspose.Font pour C++"
description: "classe System::Char. Fournit des méthodes pour la manipulation de caractères représentés sous forme d'unités de code UTF-16. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci par quelque moyen que ce soit en C++."
type: docs
weight: 1200
url: /fr/cpp/system/char/
---
## Char class


Fournit des méthodes pour la manipulation de caractères représentés comme des unités de code UTF-16. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci par quelque moyen que ce soit.

```cpp
class Char
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | Convertit une unité de code UTF-32 en une instance de la classe [System::String](../string/). |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | Convertit la paire de substituts UTF-16 spécifiée en unité de code UTF-32. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | Convertit la valeur d'un caractère encodé en UTF-16 ou d'une paire de substituts à une position spécifiée dans une chaîne en unité de code UTF-32. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | Convertit le caractère UTF-16 spécifié en valeur numérique à virgule flottante double précision. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | Renvoie une valeur qui représente une catégorie Unicode du caractère spécifié. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | Détermine si le caractère spécifié est classé comme un caractère d'espace blanc ASCII. |
| static [IsControl](./iscontrol/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme un caractère de contrôle Unicode. |
| static [IsControl](./iscontrol/)(char_t) | Détermine si le caractère spécifié est classé comme un caractère de contrôle Unicode. |
| static [IsDigit](./isdigit/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme un chiffre décimal. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | Détermine si le caractère à l'index spécifié dans la chaîne spécifiée est classé comme un chiffre décimal. |
| static [IsDigit](./isdigit/)(char_t) | Détermine si le caractère spécifié est classé comme un chiffre décimal. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | Détermine si le caractère à l'index spécifié dans la chaîne spécifiée est une unité de code substitut haut UTF-16. |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est un substitut haut. |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | Détermine si le caractère spécifié est un substitut haut. |
| static [IsLetter](./isletter/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme une lettre Unicode. |
| static [IsLetter](./isletter/)(char_t) | Détermine si le caractère spécifié est classé comme une lettre Unicode. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme une lettre Unicode ou un chiffre décimal. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | Détermine si le caractère spécifié est classé comme une lettre Unicode ou un chiffre décimal. |
| static [IsLower](./islower/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme une lettre minuscule. |
| static [IsLower](./islower/)(char_t) | Détermine si le caractère spécifié est classé comme une lettre minuscule. |
| static [IsLower](./islower/)(const String\&, int) | Détermine si le caractère à l'index spécifié dans la chaîne spécifiée est classé comme une lettre minuscule. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est un surrogat bas. |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | Détermine si le caractère spécifié est un surrogat bas. |
| static [IsNumber](./isnumber/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme un chiffre. |
| static [IsNumber](./isnumber/)(char_t) | Détermine si le caractère spécifié est classé comme un chiffre. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme un caractère de ponctuation. |
| static [IsPunctuation](./ispunctuation/)(char_t) | Détermine si le caractère spécifié est classé comme un caractère de ponctuation. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme un caractère séparateur. |
| static [IsSeparator](./isseparator/)(char_t) | Détermine si le caractère spécifié est classé comme un caractère séparateur. |
| static [IsSurrogate](./issurrogate/)(char_t) | Détermine si le caractère spécifié est une unité de code surrogat UTF-16. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | Détermine si le caractère à l'index spécifié dans la chaîne spécifiée est une unité de code surrogat UTF-16. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | Détermine si les deux caractères spécifiés forment une paire de surrogats UTF-16. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | Détermine si deux caractères consécutifs dans le tampon de caractères spécifié forment une paire de surrogats. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme un caractère symbole. |
| static [IsSymbol](./issymbol/)(char_t) | Détermine si le caractère spécifié est classé comme un caractère symbole. |
| static [IsUpper](./isupper/)(const String\&, int) | Détermine si le caractère à l'index spécifié dans la chaîne spécifiée est classé comme une lettre majuscule. |
| static [IsUpper](./isupper/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme une lettre majuscule. |
| static [IsUpper](./isupper/)(char_t) | Détermine si le caractère spécifié est classé comme une lettre majuscule. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | Détermine si le caractère à l'index spécifié dans le tampon de caractères spécifié est classé comme un caractère d'espace blanc. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | Détermine si le caractère spécifié est classé comme un caractère d'espace blanc. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | Détermine si le caractère à l'index spécifié dans la chaîne spécifiée est classé comme un caractère d'espace blanc. |
| static [Parse](./parse/)(const String\&) | Convertit le premier et unique caractère de la chaîne spécifiée en une valeur char_t. |
| static [ToLower](./tolower/)(char_t) | Convertit le caractère spécifié en minuscule. |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Convertit le caractère spécifié en minuscule. |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | Convertit le caractère spécifié en minuscule. |
| static [ToUpper](./toupper/)(char_t) | Convertit le caractère spécifié en majuscule. |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Convertit le caractère spécifié en majuscule. |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | Convertit le caractère spécifié en majuscule. |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | Essaie de convertir une chaîne composée d'un seul caractère en caractère UTF-16. La fonction réussit uniquement lorsque la chaîne d'entrée n'est pas nulle et a une longueur d'exactement un caractère. |
## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
