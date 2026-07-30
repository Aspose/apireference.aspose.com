---
title: "Classe System::IDisposable"
linktitle: "IDisposable"
second_title: "Aspose.Font pour C++"
description: "Classe System::IDisposable. Définit une méthode qui libère les ressources détenues par l'objet actuel. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() fonction. Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3600
url: /fr/cpp/system/idisposable/
---
## IDisposable class


Définit une méthode qui libère les ressources détenues par l'objet actuel. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/) fonction. Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class IDisposable : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Dispose](./dispose/)() | Ne fait rien. |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
