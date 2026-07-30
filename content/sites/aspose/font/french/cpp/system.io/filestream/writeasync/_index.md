---
title: "System::IO::FileStream::WriteAsync méthode"
linktitle: "WriteAsync"
second_title: "Aspose.Font pour C++"
description: "System::IO::FileStream::WriteAsync méthode. Écrit de façon asynchrone une séquence d'octets dans le flux actuel, avance la position actuelle dans ce flux du nombre d'octets écrits, et surveille les demandes d'annulation en C++."
type: docs
weight: 2000
url: /fr/cpp/system.io/filestream/writeasync/
---
## FileStream::WriteAsync method


Écrit de manière asynchrone une séquence d'octets dans le flux actuel, avance la position actuelle dans ce flux du nombre d'octets écrits et surveille les demandes d'annulation.

```cpp
TaskPtr System::IO::FileStream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau contenant les octets à écrire. |
| décalage | int32_t | Un indice basé sur 0 de l'élément dans **buffer** où commence la sous-plage à écrire. |
| count | int32_t | Le nombre d'éléments dans la sous-plage à écrire. |
| cancellationToken | const Threading::CancellationToken\\& | Le jeton à surveiller pour les demandes d'annulation. |

### ReturnValue

Une tâche qui représente l'opération d'écriture asynchrone.

## Voir aussi

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
