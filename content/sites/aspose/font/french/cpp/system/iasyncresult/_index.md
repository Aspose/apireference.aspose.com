---
title: "System::IAsyncResult classe"
linktitle: "IAsyncResult"
second_title: "Aspose.Font pour C++"
description: "System::IAsyncResult classe. Représente l'état d'une opération asynchrone. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3100
url: /fr/cpp/system/iasyncresult/
---
## IAsyncResult class


Représente l'état d'une opération asynchrone. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class IAsyncResult : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | Renvoie un objet contenant les informations sur l'opération asynchrone. |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | Renvoie une instance de WaitHandle qui peut être utilisée pour attendre la fin de l'opération asynchrone. |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | Renvoie une valeur indiquant si l'opération asynchrone s'est terminée de manière synchrone. |
| virtual [get_IsCompleted](./get_iscompleted/)() | Renvoie une valeur indiquant si l'opération asynchrone est terminée. |
| virtual [~IAsyncResult](./~iasyncresult/)() | Destructeur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [smart_ptr](./smart_ptr/) | Pointeur partagé vers [IAsyncResult](./). |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
