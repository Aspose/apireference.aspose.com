---
title: "System::IO::FileStream::ReadAsync method"
linktitle: "ReadAsync"
second_title: "Aspose.Page pour C++"
description: "System::IO::FileStream::ReadAsync method. Lit de manière asynchrone une séquence d'octets depuis le flux actuel, avance la position dans le flux du nombre d'octets lus, et surveille les demandes d'annulation en C++."
type: docs
weight: 1400
url: /fr/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


Lit de façon asynchrone une séquence d’octets du flux actuel, avance la position dans le flux du nombre d’octets lus et surveille les demandes d’annulation.

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau d'octets où écrire les octets lus. |
| offset | int32_t | Une position indexée à partir de 0 dans **buffer** où commencer l'écriture. |
| count | int32_t | Le nombre d'octets à lire. |
| cancellationToken | const Threading::CancellationToken\& | Le jeton à surveiller pour les demandes d'annulation. |

### ReturnValue

Une tâche qui représente l'opération de lecture asynchrone. La valeur du paramètre TResult contient le nombre total d'octets lus dans le tampon. La valeur du résultat peut être inférieure au nombre d'octets demandés si le nombre d'octets actuellement disponible est inférieur au nombre demandé, ou elle peut être 0 (zéro) si la fin du flux a été atteinte.

## Voir aussi

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
