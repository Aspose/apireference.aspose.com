---
title: "Classe System::Threading::Semaphore"
linktitle: "Sémaphore"
second_title: "Aspose.Font pour C++"
description: "Classe System::Threading::Semaphore. Implémentation du sémaphore. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Release](./release/)() | Libère le verrou du sémaphore. |
| [Release](./release/)(int) | Libère plusieurs verrous du sémaphore. |
| virtual [Reset](./reset/)() | Met le sémaphore à l’état non signalé. Non pris en charge. |
| [Semaphore](./semaphore/)(int, int) | Informations RTTI. |
| [Semaphore](./semaphore/)(int, int, const String\&) | Crée un sémaphore nommé. |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | Crée un sémaphore nommé. |
| virtual [Set](./set/)() | Met le sémaphore à l’état signalé. Non pris en charge. |
| [WaitOne](./waitone/)() override | Verrouille le sémaphore. Effectue une attente illimitée si nécessaire. |
| [WaitOne](./waitone/)(int) override | Verrouille le sémaphore. Effectue une attente si nécessaire. |
## Champs

| Champ | Description |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Valeur spéciale à renvoyer par la fonction, sinon renvoie l’indice de l’objet signalé dans le tableau, si le délai d’attente dépasse et qu’aucun signal n’est reçu. |
## Voir aussi

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
