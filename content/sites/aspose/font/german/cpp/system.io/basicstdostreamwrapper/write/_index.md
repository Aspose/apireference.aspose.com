---
title: "System::IO::BasicSTDOStreamWrapper::Write-Methode"
linktitle: "Write"
second_title: "Aspose.Font für C++"
description: "System::IO::BasicSTDOStreamWrapper::Write-Methode. Wenn der Wrapper-Modus binär ist, schreibt sie den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream, andernfalls wird der angegebene Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Typ char_type konvertiert und das Ergebnis in den Stream geschrieben in C++."
type: docs
weight: 700
url: /de/cpp/system.io/basicstdostreamwrapper/write/
---
## BasicSTDOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Wenn der Wrapper-Modus binär ist, schreibt sie den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream, andernfalls wird der angegebene Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Typ [char_type](../char_type/) konvertiert und das Ergebnis in den Stream geschrieben.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Array, das die zu schreibenden Bytes enthält |
| Offset | int32_t | Ein 0-basierter Index des Elements im **buffer**, an dem der zu schreibende Teilbereich beginnt |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Die Array-Ansicht, die die zu schreibenden Bytes enthält |
| Offset | int32_t | Ein 0-basierter Index des Elements in **buffer**, an dem der zu schreibende Teilbereich beginnt |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich |

## Siehe auch

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
