---
title: "System::IO::FileStream::FlushAsync méthode"
linktitle: "FlushAsync"
second_title: "Aspose.Page pour C++"
description: "System::IO::FileStream::FlushAsync méthode. Vide de façon asynchrone tous les tampons de ce flux, provoque l'écriture de toutes les données tamponnées sur le dispositif sous-jacent, et surveille les demandes d'annulation en C++."
type: docs
weight: 500
url: /fr/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Efface de façon asynchrone tous les tampons de ce flux, provoque l’écriture de toutes les données tamponnées vers le dispositif sous-jacent et surveille les demandes d’annulation.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Le jeton à surveiller pour les demandes d'annulation. |

### ReturnValue

Une tâche qui représente l'opération de vidage asynchrone.

## Voir aussi

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
