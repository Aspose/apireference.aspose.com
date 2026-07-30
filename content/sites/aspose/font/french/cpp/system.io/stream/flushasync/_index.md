---
title: "System::IO::Stream::FlushAsync méthode"
linktitle: "FlushAsync"
second_title: "Aspose.Font pour C++"
description: "System::IO::Stream::FlushAsync méthode. Vide de manière asynchrone tous les tampons de ce flux, provoque l'écriture de toutes les données tamponnées sur le dispositif sous-jacent et surveille les demandes d'annulation en C++."
type: docs
weight: 900
url: /fr/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Efface de manière asynchrone tous les tampons de ce flux, force l'écriture de toutes les données tamponnées vers le dispositif sous-jacent et surveille les demandes d'annulation.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Une tâche qui représente l'opération de vidage asynchrone.

## Voir aussi

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Efface de manière asynchrone tous les tampons de ce flux, force l'écriture de toutes les données tamponnées vers le dispositif sous-jacent et surveille les demandes d'annulation.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\\& | Le jeton à surveiller pour les demandes d'annulation. |

### ReturnValue

Une tâche qui représente l'opération de vidage asynchrone.

## Voir aussi

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
