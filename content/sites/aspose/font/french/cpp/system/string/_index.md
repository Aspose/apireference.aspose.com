---
title: "System::String class"
linktitle: "String"
second_title: "Aspose.Font pour C++"
description: "System::String class. Classe de chaîne utilisée dans toute la bibliothèque. C’est un substitut à C# System.String lors de la traduction du code. Pour des raisons d’optimisation, elle n’est pas considérée comme une sous‑classe d’Object. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N’utilisez jamais la classe System::SmartPtr pour gérer des objets de ce type en C++."
type: docs
weight: 5800
url: /fr/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) est un type valeur côté C++ qui implémente implicitement (sans héritage) certaines interfaces. |
| [begin](./begin/)() const | Renvoie un pointeur vers le début du tampon de chaîne réel. Ne réalloue jamais rien. Ne garantit pas que le tampon soit terminé par un caractère nul. |
| [Clone](./clone/)() const | Crée une copie de la chaîne actuelle. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greater compare deux sous‑chaînes. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater compare deux sous‑chaînes. |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greater compare deux chaînes. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greater compare deux chaînes. |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greater compare deux chaînes. |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater compare deux chaînes. |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greater compare deux chaînes en mode ordinal. |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greater compare deux chaînes en mode ordinal. |
| [CompareTo](./compareto/)(const String\&) const | Compare deux chaînes dans le style 'less-equals-more'. Utilise la culture actuelle. |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | Concatène des chaînes. |
| static [Concat](./concat/)(const String\&, const String\&) | Concatène des chaînes. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | Concatène des chaînes. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | Concatène des chaînes. |
| [Contains](./contains/)(const String\&) const | Vérifie si str est une sous‑chaîne de la chaîne actuelle. |
| [Contains](./contains/)(char16_t) const | Vérifie si la chaîne contient le caractère donné. |
| static [Copy](./copy/)(const String\&) | Crée une copie de chaîne. |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | Copie les caractères de la chaîne dans les éléments existants du tableau. Aucun redimensionnement n’est effectué. |
| [end](./end/)() const | Renvoie un pointeur vers la fin du tampon de chaîne réel. Ne réalloue jamais rien. Ne garantit pas que le tampon soit terminé par un caractère nul. |
| [EndsWith](./endswith/)(const String\&) const | Vérifie si la chaîne se termine par la sous‑chaîne spécifiée. |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | Vérifie si la chaîne se termine par la sous‑chaîne spécifiée. |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Vérifie si la chaîne se termine par la sous‑chaîne spécifiée. |
| [Equals](./equals/)(const String\&, System::StringComparison) const | Comparaison d’égalité de [String](./). Plusieurs modes fournis par l’énumération [StringComparison](../stringcomparison/) sont pris en charge. |
| [Equals](./equals/)(const String\&) const | Comparaison d'égalité de [String](./). Utilise le mode de comparaison [System::StringComparison::Ordinal](../stringcomparison/). |
| static [Equals](./equals/)(const String\&, const String\&) | Compare deux chaînes en utilisant le mode de comparaison Ordinal. |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Compare deux chaînes. |
| [FastToAscii](./fasttoascii/)(char, int) const | Essaie de convertir un [String](./) en chaîne ASCII. |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | Formate la chaîne au style C#. |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | Formate la chaîne au style C#. |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | Formate la chaîne au style C#. |
| static [Format](./format/)(const String\&, const Args\&...) | Formate la chaîne au style C#. |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | Formate la chaîne au style C#. |
| static [FromAscii](./fromascii/)(const char *) | Crée un [String](./) à partir d'une chaîne ASCII. |
| static [FromAscii](./fromascii/)(const char *, int) | Crée un [String](./) à partir d'une chaîne ASCII. |
| static [FromAscii](./fromascii/)(const std::string\&) | Crée un [String](./) à partir d'une chaîne ASCII. |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | Crée un [String](./) à partir d'une chaîne utf16. |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | Crée un [String](./) à partir d'une chaîne utf32. |
| static [FromUtf8](./fromutf8/)(const char *) | Crée un [String](./) à partir d'une chaîne utf8. |
| static [FromUtf8](./fromutf8/)(const char *, int) | Crée un [String](./) à partir d'une chaîne utf8. |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | Crée un [String](./) à partir d'une chaîne utf8. |
| static [FromUtf8](./fromutf8/)(const std::string\&) | Crée un [String](./) à partir d'une chaîne utf8. |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | Crée un [String](./) à partir d'une chaîne large. |
| [get_Length](./get_length/)() const | Obtient la longueur de la chaîne. |
| [GetHashCode](./gethashcode/)() const | Hache la chaîne contenue. Implémenté dans ICU, ne correspond pas aux hachages en C#. |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | Recherche avant dans la sous-chaîne. |
| [IndexOf](./indexof/)(char_t, int) const | Recherche avant de caractère. |
| [IndexOf](./indexof/)(char_t, int, int) const | Recherche avant de caractère dans la sous-chaîne. |
| [IndexOf](./indexof/)(const String\&, int) const | Recherche avant dans la sous-chaîne. |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | Recherche avant dans la sous-chaîne. |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | Recherche avant dans la sous-chaîne. |
| [IndexOf](./indexof/)(const String\&, int, int) const | Recherche avant dans la sous-chaîne. |
| [IndexOfAny](./indexofany/)(char_t, int) const | Recherche avant de caractère. |
| [IndexOfAny](./indexofany/)(const String\&, int) const | Recherche donc tous les caractères de str dans ceci. Si le premier caractère est trouvé, sa position est renvoyée, sinon il recherche le deuxième et ainsi de suite. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | Recherche n'importe lequel des caractères fournis dans toute la chaîne. Compare le premier caractère de la chaîne à tous les caractères de anyOf, puis compare le deuxième et ainsi de suite. Retourne l'index du premier correspondant à l'un des caractères cibles. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Recherche n'importe lequel des caractères fournis dans la sous-chaîne. Compare le premier caractère de la chaîne à tous les caractères de anyOf, puis compare le deuxième et ainsi de suite. Retourne l'index du premier correspondant à l'un des caractères cibles. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Recherche n'importe lequel des caractères fournis dans la sous-chaîne. Compare le premier caractère de la chaîne à tous les caractères de anyOf, puis compare le deuxième et ainsi de suite. Retourne l'index du premier correspondant à l'un des caractères cibles. |
| [Insert](./insert/)(int, const String\&) const | Insère la sous-chaîne à la position spécifiée. |
| [Is](./is/)(const System::TypeInfo\&) const | Vérifie si l'objet chaîne est du type spécifié par le [TypeInfo](../typeinfo/) passé. |
| [IsAsciiString](./isasciistring/)() const | Indique si un [String](./) ne contient que des symboles ASCII. |
| [IsEmpty](./isempty/)() const | Vérifie si la chaîne est à la fois non nulle et vide. |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | Vérifie si la chaîne Unicode est normalisée en utilisant la forme de normalisation spécifiée. |
| [IsNull](./isnull/)() const | Vérifie si la chaîne est considérée comme nulle. Un [String](./) est nul uniquement s'il est construit via le constructeur [String()](./string/), déplacé, copié ou assigné à partir d'une chaîne nulle ou si la méthode [reset()](./reset/) a été appelée. |
| [IsNullOrEmpty](./isnullorempty/)() const | Vérifie si la chaîne est vide ou considérée comme nulle. |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | Vérifie si la chaîne passée est nulle ou vide. |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | Indique si une chaîne spécifiée est nulle, vide ou ne contient que des caractères d'espace. |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | Joint le tableau en utilisant la chaîne comme séparateur. |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | Joint le tableau en utilisant la chaîne comme séparateur. |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | Joint le tableau en utilisant la chaîne comme séparateur. |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | Joint le tableau en utilisant la chaîne comme séparateur. |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | Recherche arrière de sous-chaîne. |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | Recherche arrière de sous-chaîne. |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | Recherche arrière de sous-chaîne. |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | Recherche arrière de sous-chaîne. |
| [LastIndexOf](./lastindexof/)(char_t) const | Recherche arrière de caractère. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | Recherche arrière de caractère. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | Recherche arrière de caractère. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | Recherche l'un des caractères passés dans toute la chaîne en sens inverse. Compare le dernier caractère de la chaîne à tous les caractères de anyOf, puis compare le précédent et ainsi de suite. Retourne l'index de la première correspondance trouvée. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Recherche l'un des caractères passés dans la sous-chaîne en sens inverse. Compare le dernier caractère de la chaîne à tous les caractères de anyOf, puis compare le précédent et ainsi de suite. Retourne l'index de la première correspondance trouvée. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Recherche l'un des caractères passés dans la sous-chaîne en sens inverse. Compare le dernier caractère de la chaîne à tous les caractères de anyOf, puis compare le précédent et ainsi de suite. Retourne l'index de la première correspondance trouvée. |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | Normalise la chaîne Unicode en utilisant la forme de normalisation spécifiée. |
| [operator!=](./operator!=/)(const String\&) const | Opérateur de comparaison d'inégalité. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Vérifie si la chaîne n'est pas nulle. Applique la même logique que l'appel [IsNull()](./isnull/). |
| [operator+](./operator+/)(const String\&) const | [String](./) opérateur de concaténation. |
| [operator+](./operator+/)(const T\&) const | [String](./) concaténation avec un littéral de chaîne ou un pointeur de chaîne de caractères. |
| [operator+](./operator+/)(char_t) const | Ajoute un caractère à la fin de la chaîne. |
| [operator+](./operator+/)(int) const | Ajoute la représentation sous forme de chaîne d'une valeur entière à la fin de la chaîne. |
| [operator+](./operator+/)(uint32_t) const | Ajoute la représentation sous forme de chaîne d'une valeur entière non signée à la fin de la chaîne. |
| [operator+](./operator+/)(double) const | Ajoute la représentation sous forme de chaîne d'une valeur à virgule flottante à la fin de la chaîne. |
| [operator+](./operator+/)(int64_t) const | Ajoute la représentation sous forme de chaîne d'une valeur entière à la fin de la chaîne. |
| [operator+](./operator+/)(const T\&) const | Ajoute la représentation sous forme de chaîne d'un objet de type référence à la fin de la chaîne. |
| [operator+](./operator+/)(const T\&) const | Ajoute la représentation sous forme de chaîne d'un objet de type référence à la fin de la chaîne. |
| [operator+](./operator+/)(T) const | Ajoute la représentation sous forme de chaîne d'une valeur booléenne à la fin de la chaîne. |
| [operator+=](./operator+=/)(char_t) | Opérateur d'affectation de concaténation. |
| [operator+=](./operator+=/)(const String\&) | Opérateur d'affectation de concaténation. |
| [operator+=](./operator+=/)(double) | Opérateur d'affectation de concaténation. |
| [operator+=](./operator+=/)(uint8_t) | Opérateur d'affectation de concaténation. |
| [operator+=](./operator+=/)(int16_t) | Opérateur d'affectation de concaténation. |
| [operator+=](./operator+=/)(uint16_t) | Opérateur d'affectation de concaténation. |
| [operator+=](./operator+=/)(int32_t) | Opérateur d'affectation de concaténation. |
| [operator+=](./operator+=/)(uint32_t) | Opérateur d'affectation de concaténation. |
| [operator+=](./operator+=/)(int64_t) | Opérateur d'affectation de concaténation. |
| [operator+=](./operator+=/)(uint64_t) | Opérateur d'affectation de concaténation. |
| [operator+=](./operator+=/)(T) | Opérateur d'affectation de concaténation. |
| [operator<](./operator_/)(const String\&) const | Compare les chaînes par ordre. |
| [operator=](./operator=/)(const String\&) | Opérateur d'affectation. |
| [operator=](./operator=/)(String\&&) | Opérateur d'affectation par déplacement. |
| [operator==](./operator==/)(const String\&) const | Opérateur de comparaison d'égalité. |
| [operator==](./operator==/)(std::nullptr_t) const | Vérifie si la chaîne est nulle. Applique la même logique que l'appel [IsNull()](./isnull/). |
| [operator>](./operator_/)(const String\&) const | Compare les chaînes par ordre. |
| [operator[]](./operator[]/)(int) const | Obtient le caractère à la position spécifiée. |
| [PadLeft](./padleft/)(int, char_t) const | Ajoute un remplissage à gauche de la chaîne originale. |
| [PadRight](./padright/)(int, char_t) const | Ajoute un remplissage à droite de la chaîne originale. |
| [rbegin](./rbegin/)() const | Renvoie un itérateur inverse vers le dernier caractère (le cas échéant) du tampon de chaîne réel. |
| [Remove](./remove/)(int32_t, int32_t) const | Extrait tout sauf la sous-chaîne de la chaîne actuelle. |
| [rend](./rend/)() const | Renvoie un itérateur inverse vers le caractère précédant le premier (le cas échéant) du tampon de chaîne réel. |
| [Replace](./replace/)(char_t, char_t) const | Remplace toutes les occurrences du caractère dans la chaîne. |
| [Replace](./replace/)(const String\&, const String\&) const | Remplace toutes les occurrences de la recherche dans cette chaîne. |
| [reset](./reset/)() | Définit la chaîne à null. Est analogue à 'string_variable_name = null' en C#. |
| [SetCharAt](./setcharat/)(int, char_t) | Définit le caractère à la position spécifiée. |
| [Split](./split/)(char_t, StringSplitOptions) const | Divise la chaîne par caractère. |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | Divise la chaîne par caractère. |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | Divise la chaîne par l'un des deux caractères. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | Divise la chaîne par l'un des caractères spécifiés. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | Divise la chaîne par l'un des caractères spécifiés. |
| [Split](./split/)(const String\&, StringSplitOptions) const | Divise la chaîne par sous-chaîne. |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | Divise la chaîne par sous-chaîne. |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | Divise la chaîne par sous-chaîne. |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | Divise la chaîne par sous-chaîne. Actuellement, ne prend en charge qu'un tableau de séparateurs contenant zéro ou un élément. |
| [StartsWith](./startswith/)(const String\&) const | Vérifie si la chaîne commence par la sous-chaîne spécifiée. |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | Vérifie si la chaîne commence par la sous-chaîne spécifiée. |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Vérifie si la chaîne commence par la sous-chaîne spécifiée. |
| [String](./string/)() | Constructeur par défaut. Crée un objet chaîne considéré comme null. |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | Construit une chaîne à partir d'un littéral de chaîne. Considère le littéral comme une chaîne terminée par null, calcule la longueur de la chaîne cible en fonction de la taille du littéral. |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | Construit une chaîne à partir d'un pointeur de chaîne de caractères. Traite la chaîne pointée comme terminée par null, calcule la longueur de la chaîne cible en fonction du caractère null. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | Construit une chaîne à partir d'un littéral de chaîne. Considère le littéral comme une chaîne terminée par null en UTF8, calcule la longueur de la chaîne cible en fonction de la taille du littéral. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | Construit une chaîne à partir d'un pointeur de chaîne de caractères. Traite la chaîne pointée comme terminée par null en UTF8, calcule la longueur de la chaîne cible en fonction du caractère null. |
| [String](./string/)(const char16_t *, int) | Construit une chaîne à partir d'un pointeur de chaîne de caractères et d'une longueur explicite. |
| [String](./string/)(const char *, int) | Construit une chaîne à partir d'un pointeur de chaîne de caractères et d'une longueur explicite. |
| [String](./string/)(const char16_t *, int, int) | Construit une chaîne à partir d'un pointeur de chaîne de caractères à partir de la position de départ en utilisant la longueur. |
| explicit [String](./string/)(const char16_t, int) | Constructeur de remplissage. |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | Constructeur nullptr. Déclaré comme modèle pour résoudre les priorités avec d'autres constructeurs modèles. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | Construit une chaîne à partir d'un littéral widestring. Considère le littéral comme une chaîne terminée par null, calcule la longueur de la chaîne cible en fonction de la taille du littéral. La conversion depuis wchar_t est chronophage sur certaines plates‑formes, donc aucune conversion implicite n'est autorisée. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | Construit une chaîne à partir d'un pointeur de chaîne de caractères larges. Traite la chaîne pointée comme terminée par un caractère nul, calcule la longueur de la chaîne cible en fonction du caractère nul. La conversion depuis wchar_t est chronophage sur certaines plateformes, aucune conversion implicite n'est autorisée. |
| explicit [String](./string/)(const wchar_t *, int) | Construit une chaîne à partir d'un pointeur de chaîne de caractères larges et d'une longueur explicite. La conversion depuis wchar_t est chronophage sur certaines plateformes, aucune conversion implicite n'est autorisée. |
| explicit [String](./string/)(const wchar_t, int) | Constructeur de remplissage. La conversion depuis wchar_t est chronophage sur certaines plateformes, aucune conversion implicite n'est autorisée. |
| [String](./string/)(const String\&) | Constructeur de copie. |
| [String](./string/)(String\&&) | Constructeur de déplacement. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | Convertit tout le tableau de caractères en chaîne. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | Convertit une sous-plage d'un tableau de caractères en chaîne. Si les paramètres sont hors des limites du tableau, une chaîne vide est construite. |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | Enveloppe UnicodeString dans [String](./). |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | Constructeur de déplacement. |
| explicit [String](./string/)(const std::wstring\&) | Crée un [String](./) à partir d'une chaîne large. |
| explicit [String](./string/)(const std::u16string\&) | Crée un [String](./) à partir d'une chaîne utf16. |
| explicit [String](./string/)(const std::string\&) | Crée [String](./) à partir d'une chaîne std::string présentée au format UTF-8. |
| explicit [String](./string/)(const std::u32string\&) | Crée [String](./) à partir d'une chaîne std::u32string. |
| [Substring](./substring/)(int32_t) const | Extrait une sous-chaîne. |
| [Substring](./substring/)(int32_t, int32_t) const | Extrait une sous-chaîne. |
| [ToAsciiString](./toasciistring/)() const | Convertit la chaîne en std::string. Utilise l'encodage ASCII. |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | Convertit la chaîne ou la sous-chaîne en tableau d'octets. |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | Convertit la chaîne ou la sous-chaîne en tableau de caractères. |
| [ToLower](./tolower/)() const | Convertit tous les caractères de la chaîne en minuscules. |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Convertit tous les caractères de la chaîne en minuscules en utilisant une culture spécifique. |
| [ToLowerInvariant](./tolowerinvariant/)() const | Convertit tous les caractères de la chaîne en minuscules en utilisant la culture invariante. |
| [ToString](./tostring/)() const | Enveloppe pour gérer la classe [String](./) dans les contextes où [ToString()](./tostring/) est appelée sur des objets de type valeur. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Enveloppe pour gérer la classe [String](./) dans les contextes où [ToString()](./tostring/) est appelée sur des objets de type valeur. |
| [ToU16Str](./tou16str/)() const | Convertit la chaîne en std::u16string. |
| [ToU32Str](./tou32str/)() const | Convertit la chaîne en std::u32string. |
| [ToUpper](./toupper/)() const | Convertit tous les caractères de la chaîne en majuscules. |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Convertit tous les caractères de la chaîne en majuscules en utilisant une culture spécifique. |
| [ToUpperInvariant](./toupperinvariant/)() const | Convertit tous les caractères de la chaîne en majuscules en utilisant la culture invariante. |
| [ToUtf8String](./toutf8string/)() const | Convertit la chaîne en std::string. Utilise l'encodage UTF-8. |
| [ToWCS](./towcs/)() const | Convertit la chaîne en std::wstring. |
| [Trim](./trim/)() const | Supprime tous les caractères d'espacement du début et de la fin de la chaîne. |
| [Trim](./trim/)(char_t) const | Supprime toutes les occurrences du caractère passé du début et de la fin de la chaîne. |
| [Trim](./trim/)(const String\&) const | Supprime toutes les occurrences des caractères passés du début et de la fin de la chaîne. |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | Supprime toutes les occurrences des caractères passés du début et de la fin de la chaîne. |
| [TrimEnd](./trimend/)() const | Supprime tous les caractères d'espace blanc de la fin de la chaîne. |
| [TrimEnd](./trimend/)(char_t) const | Supprime toutes les occurrences du caractère passé de la fin de la chaîne. |
| [TrimEnd](./trimend/)(const String\&) const | Supprime toutes les occurrences des caractères passés de la fin de la chaîne. |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | Supprime toutes les occurrences des caractères passés de la fin de la chaîne. |
| [TrimStart](./trimstart/)() const | Supprime tous les caractères d'espace blanc du début de la chaîne. |
| [TrimStart](./trimstart/)(char_t) const | Supprime toutes les occurrences du caractère passé du début de la chaîne. |
| [TrimStart](./trimstart/)(const String\&) const | Supprime toutes les occurrences des caractères passés du début de la chaîne. |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | Supprime toutes les occurrences des caractères passés du début de la chaîne. |
| [u_str](./u_str/)() const | Renvoie un tampon nul-terminé de style ICU. Peut réallouer la chaîne. |
| [~String](./~string/)() | Destructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](./empty/) | Chaîne vide. |
| static [Null](./null/) | Chaîne nulle. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | Type d'itérateur inverse. |
## Remarques



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // Construit une chaîne à partir du tableau de caractères et l'imprime.
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // Construit une chaîne à partir du tableau d'octets et l'imprime.
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // Coupez la chaîne ci‑dessous et imprimez‑la.
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // Imprime le nombre de mots dans le .
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
