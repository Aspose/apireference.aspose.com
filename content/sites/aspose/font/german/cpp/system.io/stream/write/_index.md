---
title: "System::IO::Stream::Write Methode"
linktitle: "Write"
second_title: "Aspose.Font für C++"
description: "System::IO::Stream::Write Methode. Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream in C++."
type: docs
weight: 2600
url: /de/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream.

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Array, das die zu schreibenden Bytes enthält |
| Offset | int32_t | Ein 0-basierter Index des Elements in **buffer**, an dem der zu schreibende Teilbereich beginnt |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream.

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Die Array-Ansicht, die die zu schreibenden Bytes enthält |
| Offset | int32_t | Ein 0-basierter Index des Elements in **buffer**, an dem der zu schreibende Teilbereich beginnt |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich |

## Siehe auch

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream.

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | Beschreibung |
| --- | --- |
| N | Die Größe des Stack-Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const System::Details::StackArray\<uint8_t, N\>\& | Das Stack-Array, das die zu schreibenden Bytes enthält |
| Offset | int32_t | Ein 0-basierter Index des Elements in **buffer**, an dem der zu schreibende Teilbereich beginnt |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich |

## Siehe auch

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
