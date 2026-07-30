---
title: "Méthode System::IO::FileStream::FlushAsync"
linktitle: "FlushAsync"
second_title: "Aspose.Font pour C++"
description: "Méthode System::IO::FileStream::FlushAsync. Vide de façon asynchrone tous les tampons de ce flux, entraîne l'écriture de toute donnée tamponnée sur le dispositif sous-jacent et surveille les demandes d'annulation en C++."
type: docs
weight: 500
url: /fr/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Efface de manière asynchrone tous les tampons de ce flux, force l'écriture de toutes les données tamponnées vers le dispositif sous-jacent et surveille les demandes d'annulation.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\\& | Le jeton à surveiller pour les demandes d'annulation. |

### ReturnValue

Une tâche qui représente l'opération de vidage asynchrone.

## Voir aussi

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
