---
title: "System::ComponentModel::IContainer class"
linktitle: "IContainer"
second_title: "Aspose.Font pour C++"
description: "System::ComponentModel::IContainer class. Interface factice pour le code utilisant IContainer afin de compiler. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.componentmodel/icontainer/
---
## IContainer class


Interface factice pour le code utilisant IContainer afin de compiler. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class IContainer : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Add](./add/)(System::SharedPtr\<IComponent\>) | Informations RTTI. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
