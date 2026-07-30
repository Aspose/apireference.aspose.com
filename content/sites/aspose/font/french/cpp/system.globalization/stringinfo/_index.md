---
title: "classe System::Globalization::StringInfo"
linktitle: "StringInfo"
second_title: "Aspose.Font pour C++"
description: "classe System::Globalization::StringInfo. Diviseur pour parcourir les parties d'une chaîne. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2400
url: /fr/cpp/system.globalization/stringinfo/
---
## StringInfo class


Diviseur pour parcourir les parties d'une chaîne. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class StringInfo : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | Obtient le nombre d'éléments texte dans l'objet [StringInfo](./). |
| [get_String](./get_string/)() const | Obtient la valeur de l'objet [StringInfo](./). |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | Obtient le premier élément dans la chaîne spécifiée. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | Obtient l'élément à l'index spécifié de la chaîne spécifiée. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | Crée un énumérateur pour parcourir les caractères de la chaîne. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | Crée un énumérateur pour parcourir les caractères de la chaîne à partir de l'index spécifié. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | Obtient les index des caractères de base, des substituts élevés et des caractères de contrôle. |
| [set_String](./set_string/)(const String\&) | Définit la valeur de l'objet [StringInfo](./). |
| [StringInfo](./stringinfo/)() | Informations RTTI. |
| [StringInfo](./stringinfo/)(const String\&) | Constructeur. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | Obtient la sous-chaîne d'éléments de texte à partir de l'élément de texte spécifié jusqu'au dernier élément de texte. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | Obtient la sous-chaîne d'éléments de texte à partir de l'élément de texte spécifié jusqu'au nombre spécifié d'éléments de texte. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
