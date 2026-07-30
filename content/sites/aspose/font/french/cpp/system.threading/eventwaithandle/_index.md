---
title: "Classe System::Threading::EventWaitHandle"
linktitle: "EventWaitHandle"
second_title: "Aspose.Font pour C++"
description: "Classe System::Threading::EventWaitHandle. Événement qui peut être envoyé à un thread en attente. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | Informations RTTI. |
| virtual [Reset](./reset/)() | Met l'événement à l'état non signalé. |
| virtual [Set](./set/)() | Met l'événement à l'état signalé. |
| [~EventWaitHandle](./~eventwaithandle/)() | Destructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Valeur spéciale à renvoyer par la fonction, sinon renvoie l’indice de l’objet signalé dans le tableau, si le délai d’attente dépasse et qu’aucun signal n’est reçu. |
## Voir aussi

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
