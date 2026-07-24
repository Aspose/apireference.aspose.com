---
title: "System::IO::FileStream::FlushAsync Methode"
linktitle: "FlushAsync"
second_title: "Aspose.Page für C++"
description: "System::IO::FileStream::FlushAsync Methode. Löscht asynchron alle Puffer für diesen Stream, veranlasst, dass gepufferte Daten in das zugrunde liegende Gerät geschrieben werden, und überwacht Abbruchanforderungen in C++."
type: docs
weight: 500
url: /de/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Leert asynchron alle Puffer dieses Streams, bewirkt, dass gepufferte Daten in das zugrunde liegende Gerät geschrieben werden, und überwacht Abbruchanforderungen.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Das Token, das auf Abbruchanforderungen überwacht wird. |

### ReturnValue

Eine Aufgabe, die die asynchrone Flush-Operation darstellt.

## Siehe auch

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
