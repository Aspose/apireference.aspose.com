---
title: "classe System::Threading::CancellationToken"
linktitle: "CancellationToken"
second_title: "Aspose.Page pour C++"
description: "classe System::Threading::CancellationToken. Propage la notification que les opérations doivent être annulées. Cette classe fournit un mécanisme d'annulation coopérative entre les threads, permettant à un thread d'avertir les autres qu'une opération doit être annulée en C++."
type: docs
weight: 200
url: /fr/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


Diffuse une notification indiquant que les opérations doivent être annulées. Cette classe fournit un mécanisme d'annulation coopérative entre les threads, permettant à un thread de notifier les autres qu'une opération doit être annulée.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | Constructeur par défaut. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | Obtient si ce token peut être dans l'état annulé. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Obtient si l'annulation a été demandée pour ce token. |
| static [get_None](./get_none/)() | Renvoie une valeur vide de [System::Threading::CancellationToken](./). |
| [Register](./register/)(const Action<>\&) const | Enregistre un rappel qui sera invoqué lorsque l'annulation est demandée. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | Lance une OperationCanceledException si l'annulation a été demandée. |
## Remarques



Un [CancellationToken](./) ne peut être annulé que via son [CancellationTokenSource](../cancellationtokensource/) associé.

## Voir aussi

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
