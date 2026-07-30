---
title: "System::Globalization::IdnMapping class"
linktitle: "IdnMapping"
second_title: "Aspose.Font pour C++"
description: "System::Globalization::IdnMapping class. IdnMapping utilisé pour mapper les noms en Punycode. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1300
url: /fr/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Compare deux objets [IdnMapping](./). |
| [get_AllowUnassigned](./get_allowunassigned/)() const | Obtient le drapeau indiquant si des points de code non assignés sont utilisés dans les opérations. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | Obtient le drapeau indiquant si les conventions de nommage standard sont utilisées dans les opérations. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) nom de domaine unicode en équivalent ASCII. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) nom de domaine unicode en équivalent ASCII. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) nom de domaine unicode en équivalent ASCII. |
| [GetHashCode](./gethashcode/)() const override | Obtient le code de hachage de l'objet [IdnMapping](./) actuel. |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) nom de domaine ASCII en équivalent Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) nom de domaine ASCII en équivalent Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) nom de domaine ASCII en équivalent Unicode. |
| [IdnMapping](./idnmapping/)() | Informations RTTI. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | Définit le drapeau indiquant si des points de code non assignés sont utilisés dans les opérations. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | Définit le drapeau indiquant si les conventions de nommage standard sont utilisées dans les opérations. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
