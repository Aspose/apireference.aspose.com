---
title: "System::Reflection::MethodBase class"
linktitle: "MethodBase"
second_title: "Aspose.Font pour C++"
description: "System::Reflection::MethodBase classe. Informations de base sur la méthode. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 800
url: /fr/cpp/system.reflection/methodbase/
---
## MethodBase class


Informations de base sur la méthode. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Indique le type du membre - méthode, constructeur, événement, etc. |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | Cette méthode permet d'obtenir le nom de la méthode actuelle. Le traducteur remplace automatiquement ASPOSE_CURRENT_FUNCTION comme paramètre. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | Initialise une nouvelle instance de la classe [MethodBase](./). |
## Voir aussi

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
