---
title: "System::Globalization::TextInfo classe"
linktitle: "TextInfo"
second_title: "Aspose.Font pour C++"
description: "System::Globalization::TextInfo class. Définit les propriétés de texte spécifiques à la locale. Les opérations de définition ne sont activées que sur les objets non en lecture seule. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2800
url: /fr/cpp/system.globalization/textinfo/
---
## TextInfo class


Définit les propriétés de texte spécifiques à la locale. Les opérations de définition ne sont activées que sur les objets non en lecture seule. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class TextInfo : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Informations RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | Obtient la page de code ANSI. |
| [get_CultureName](./get_culturename/)() const | Obtient le nom de la culture. |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | Obtient la page de code EBCDIC. |
| [get_IsReadOnly](./get_isreadonly/)() const | Vérifie si le format est en lecture seule. |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | Vérifie si le texte est écrit de gauche à droite. |
| [get_LCID](./get_lcid/)() const | Obtient l'ID de la locale. |
| virtual [get_ListSeparator](./get_listseparator/)() const | Obtient le séparateur de liste. |
| virtual [get_MacCodePage](./get_maccodepage/)() const | Obtient la page de code Macintosh. |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | Obtient la page de code OEM. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | Obtient une version en lecture seule de la culture. |
| virtual [set_ListSeparator](./set_listseparator/)(String) | Définit le séparateur de liste. |
| [TextInfo](./textinfo/)(const TextInfo\&) | Informations RTTI. |
| virtual [ToLower](./tolower/)(char_t) const | Convertit le caractère en minuscule. |
| virtual [ToLower](./tolower/)(String) const | Convertit la chaîne en minuscule. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| [ToTitleCase](./totitlecase/)(String) const | Convertit la chaîne en casse de titre (sauf pour les acronymes déjà en majuscules). |
| virtual [ToUpper](./toupper/)(char_t) const | Convertit le caractère en majuscule. |
| virtual [ToUpper](./toupper/)(String) const | Convertit la chaîne en majuscule. |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
