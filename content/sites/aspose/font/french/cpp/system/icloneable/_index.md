---
title: "System::ICloneable classe"
linktitle: "ICloneable"
second_title: "Aspose.Font pour C++"
description: "System::ICloneable classe. Définit une méthode qui permet le clonage d'objets - créer une copie d'un objet. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3200
url: /fr/cpp/system/icloneable/
---
## ICloneable class


Définit une méthode qui permet le clonage d'objets - créer une copie d'un objet. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class ICloneable : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Clone](./clone/)() | Informations RTTI. |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
