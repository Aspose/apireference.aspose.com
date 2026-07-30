---
title: "System::IO::FileStream::ReadAsync Methode"
linktitle: "ReadAsync"
second_title: "Aspose.Font für C++"
description: "System::IO::FileStream::ReadAsync Methode. Liest asynchron eine Sequenz von Bytes aus dem aktuellen Stream, verschiebt die Position im Stream um die gelesene Anzahl von Bytes und überwacht Abbruchanforderungen in C++."
type: docs
weight: 1400
url: /de/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


Liest asynchron eine Sequenz von Bytes aus dem aktuellen Stream, verschiebt die Position im Stream um die gelesene Anzahl von Bytes und überwacht Abbruchanforderungen.

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Byte-Array, in das die gelesenen Bytes geschrieben werden sollen. |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll. |
| count | int32_t | Die Anzahl der zu lesenden Bytes. |
| cancellationToken | const Threading::CancellationToken\& | Das Token, das auf Abbruchanforderungen überwacht wird. |

### ReturnValue

Ein Task, der den asynchronen Lesevorgang repräsentiert. Der Wert des TResult-Parameters enthält die Gesamtzahl der in den Puffer gelesenen Bytes. Der Ergebniswert kann kleiner sein als die angeforderte Byte-Anzahl, wenn die derzeit verfügbare Byte-Anzahl kleiner ist als die angeforderte, oder er kann 0 (null) sein, wenn das Ende des Streams erreicht wurde.

## Siehe auch

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
