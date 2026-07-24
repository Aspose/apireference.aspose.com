---
title: "System::IO::MemoryStream::TryGetBuffer-Methode"
linktitle: "TryGetBuffer"
second_title: "Aspose.Page für C++"
description: "System::IO::MemoryStream::TryGetBuffer-Methode. Gibt das Array von unsigned Bytes zurück, aus dem dieser Stream in C++ erstellt wurde."
type: docs
weight: 1800
url: /de/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


Gibt das Array aus vorzeichenlosen Bytes zurück, aus dem dieser Stream erstellt wurde.

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | ArraySegment\<uint8_t\>\& | Byte-Array – Out-Parameter. Wenn diese Methode true zurückgibt, das Byte-Array‑Segment, aus dem dieser Stream erstellt wurde; wenn die Methode false zurückgibt, wird dieser Parameter auf den Standardwert gesetzt. |

### ReturnValue

True, wenn die Konvertierung erfolgreich war.

## Siehe auch

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
