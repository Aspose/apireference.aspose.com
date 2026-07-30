---
title: "Classe System::Collections::Generic::Stack::Enumerator"
linktitle: "Énumérateur"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::Stack::Enumerator. Énumérateur pour parcourir la pile. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2000
url: /fr/cpp/system.collections.generic/stack/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through stack. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::ReverseEnumerator<stack_t>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | Construit un énumérateur parcourant la pile donnée. |
## Voir aussi

* Class [ReverseEnumerator](../../reverseenumerator/)
* Class [Stack](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
