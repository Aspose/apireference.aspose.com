---
title: "classe System::IComparable"
linktitle: "IComparable"
second_title: "Aspose.Font pour C++"
description: "classe System::IComparable. Définit une méthode qui compare deux objets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 3300
url: /fr/cpp/system/icomparable/
---
## IComparable class


Définit une méthode qui compare deux objets. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| Paramètre | Description |
| --- | --- |
| T | Le type des objets avec lesquels l'objet actuel est comparé |
## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | Compare l'objet actuel avec l'objet spécifié. |

## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
