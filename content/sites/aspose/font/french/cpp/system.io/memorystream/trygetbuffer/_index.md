---
title: "System::IO::MemoryStream::TryGetBuffer méthode"
linktitle: "TryGetBuffer"
second_title: "Aspose.Font pour C++"
description: "System::IO::MemoryStream::TryGetBuffer méthode. Retourne le tableau d'octets non signés à partir duquel ce flux a été créé en C++."
type: docs
weight: 1800
url: /fr/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


Renvoie le tableau d'octets non signés à partir duquel ce flux a été créé.

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | ArraySegment\<uint8_t\>\& | tableau d'octets - paramètre de sortie. Lorsque cette méthode renvoie true, le segment de tableau d'octets à partir duquel ce flux a été créé ; lorsque cette méthode renvoie false, ce paramètre est réinitialisé à la valeur par défaut. |

### ReturnValue

True si la conversion a réussi.

## Voir aussi

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
