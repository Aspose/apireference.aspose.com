---
title: "System::IO::Stream::ReadAsync Methode"
linktitle: "ReadAsync"
second_title: "Aspose.Font für C++"
description: "System::IO::Stream::ReadAsync Methode. Liest asynchron eine Sequenz von Bytes aus dem aktuellen Stream, verschiebt die Position im Stream um die gelesene Anzahl von Bytes und überwacht Abbruchanforderungen in C++."
type: docs
weight: 1900
url: /de/cpp/system.io/stream/readasync/
---
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Liest asynchron eine Sequenz von Bytes aus dem aktuellen Stream, verschiebt die Position im Stream um die gelesene Anzahl von Bytes und überwacht Abbruchanforderungen.

```cpp
RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Byte-Array, in das die gelesenen Bytes geschrieben werden sollen. |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll. |
| count | int32_t | Die Anzahl der zu lesenden Bytes. |

### ReturnValue

Ein Task, der den asynchronen Lesevorgang repräsentiert. Der Wert des TResult-Parameters enthält die Gesamtzahl der in den Puffer gelesenen Bytes. Der Ergebniswert kann kleiner sein als die angeforderte Byte-Anzahl, wenn die derzeit verfügbare Byte-Anzahl kleiner ist als die angeforderte, oder er kann 0 (null) sein, wenn das Ende des Streams erreicht wurde.

## Siehe auch

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Liest asynchron eine Sequenz von Bytes aus dem aktuellen Stream, verschiebt die Position im Stream um die gelesene Anzahl von Bytes und überwacht Abbruchanforderungen.

```cpp
virtual RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
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
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
