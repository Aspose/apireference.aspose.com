---
title: "System::IO::Stream::WriteAsync Methode"
linktitle: "WriteAsync"
second_title: "Aspose.Font für C++"
description: "System::IO::Stream::WriteAsync Methode. Schreibt asynchron eine Sequenz von Bytes in den aktuellen Stream, verschiebt die aktuelle Position innerhalb dieses Streams um die Anzahl der geschriebenen Bytes und überwacht Abbruchanforderungen in C++."
type: docs
weight: 2700
url: /de/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Schreibt asynchron eine Sequenz von Bytes in den aktuellen Stream, verschiebt die aktuelle Position in diesem Stream um die geschriebene Anzahl von Bytes und überwacht Abbruchanforderungen.

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Array, das die zu schreibenden Bytes enthält. |
| Offset | int32_t | Ein nullbasierter Index des Elements in **buffer**, an dem der zu schreibende Teilbereich beginnt. |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich. |

### ReturnValue

Eine Aufgabe, die die asynchrone Schreiboperation darstellt.

## Siehe auch

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Schreibt asynchron eine Sequenz von Bytes in den aktuellen Stream, verschiebt die aktuelle Position in diesem Stream um die geschriebene Anzahl von Bytes und überwacht Abbruchanforderungen.

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Array, das die zu schreibenden Bytes enthält. |
| Offset | int32_t | Ein nullbasierter Index des Elements in **buffer**, an dem der zu schreibende Teilbereich beginnt. |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich. |
| cancellationToken | const Threading::CancellationToken\& | Das Token, das auf Abbruchanforderungen überwacht wird. |

### ReturnValue

Eine Aufgabe, die die asynchrone Schreiboperation darstellt.

## Siehe auch

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
