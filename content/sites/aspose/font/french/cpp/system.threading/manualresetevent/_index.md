---
title: "classe System::Threading::ManualResetEvent"
linktitle: "ManualResetEvent"
second_title: "Aspose.Font pour C++"
description: "classe System::Threading::ManualResetEvent. Événement qui notifie le thread en attente et qui ne se réinitialise pas automatiquement. Les objets de cette classe ne doivent être alloués qu'à l'aide de la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | Informations RTTI. |
## Champs

| Champ | Description |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Valeur spéciale à renvoyer par la fonction, sinon renvoie l’indice de l’objet signalé dans le tableau, si le délai d’attente dépasse et qu’aucun signal n’est reçu. |
## Voir aussi

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
