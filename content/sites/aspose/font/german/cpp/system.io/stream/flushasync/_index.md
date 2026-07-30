---
title: "System::IO::Stream::FlushAsync Methode"
linktitle: "FlushAsync"
second_title: "Aspose.Font für C++"
description: "System::IO::Stream::FlushAsync Methode. Löscht asynchron alle Puffer dieses Streams, veranlasst, dass gepufferte Daten in das zugrunde liegende Gerät geschrieben werden, und überwacht Abbruchanforderungen in C++."
type: docs
weight: 900
url: /de/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Löscht asynchron alle Puffer für diesen Stream, sorgt dafür, dass gepufferte Daten in das zugrunde liegende Gerät geschrieben werden, und überwacht Abbruchanforderungen.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Eine Aufgabe, die den asynchronen Flush-Vorgang darstellt.

## Siehe auch

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Löscht asynchron alle Puffer für diesen Stream, sorgt dafür, dass gepufferte Daten in das zugrunde liegende Gerät geschrieben werden, und überwacht Abbruchanforderungen.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Das Token, das auf Abbruchanforderungen überwacht wird. |

### ReturnValue

Eine Aufgabe, die den asynchronen Flush-Vorgang darstellt.

## Siehe auch

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
