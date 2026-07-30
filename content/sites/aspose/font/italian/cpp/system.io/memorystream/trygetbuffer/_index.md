---
title: "System::IO::MemoryStream::TryGetBuffer metodo"
linktitle: "TryGetBuffer"
second_title: "Aspose.Font per C++"
description: "System::IO::MemoryStream::TryGetBuffer metodo. Restituisce l'array di byte senza segno da cui è stato creato questo stream in C++."
type: docs
weight: 1800
url: /it/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


Restituisce l'array di byte senza segno da cui è stato creato questo flusso.

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | ArraySegment\<uint8_t\>\& | byte array - out paramter. Quando questo metodo restituisce true, il segmento di array di byte da cui è stato creato questo stream; quando restituisce false, questo parametro è impostato al valore predefinito. |

### ReturnValue

True se la conversione è riuscita.

## Vedi anche

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
