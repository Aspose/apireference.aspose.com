---
title: "classe System::IEquatable"
linktitle: "IEquatable"
second_title: "Aspose.Font pour C++"
description: "classe System::IEquatable. Définit une méthode qui détermine l'égalité de deux objets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3700
url: /fr/cpp/system/iequatable/
---
## IEquatable class


Définit une méthode qui détermine l'égalité de deux objets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| Paramètre | Description |
| --- | --- |
| T | Le type des objets comparés |
## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Equals](./equals/)(T) | Détermine si l'objet actuel et l'objet spécifié sont égaux. |

## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
