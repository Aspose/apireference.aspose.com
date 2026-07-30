---
title: "classe System::Reflection::Assembly"
linktitle: "Assembly"
second_title: "Aspose.Font pour C++"
description: "classe System::Reflection::Assembly. Classe de réflexion décrivant l'assembly. Le support est limité car les règles sont assez différentes entre C# et C++. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Assembly](./assembly/)() | Constructeur. |
| virtual [get_CodeBase](./get_codebase/)() const | Obtient le répertoire de l'assembly actuel. Le support est limité. |
| virtual [get_FullName](./get_fullname/)() const | Obtient le nom complet de l'assembly. |
| virtual [get_Location](./get_location/)() const | Obtient l'emplacement de l'assembly. Non implémenté. |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | Obtient l'assembly définissant le type spécifique. |
| static [GetCallingAssembly](./getcallingassembly/)() | Obtient l'assembly appelant. |
| static [GetEntryAssembly](./getentryassembly/)() | Obtient l'assembly d'entrée. |
| static [GetExecutingAssembly](./getexecutingassembly/)() | Obtient l'assembly en cours d'exécution. |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | Obtient les noms des ressources du manifeste. |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | Obtient le flux connecté à la ressource du manifeste. |
| virtual [GetName](./getname/)() const | Obtient le nom de l'assembly. |
| virtual [GetTypes](./gettypes/)() const | Obtient les types déclarés par l'assembly. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
