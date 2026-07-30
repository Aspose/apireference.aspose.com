---
title: "System::IO::BasicSTDIStreamWrapper::Write Methode"
linktitle: "Write"
second_title: "Aspose.Font für C++"
description: "System::IO::BasicSTDIStreamWrapper::Write Methode. Wenn der Wrapper-Modus binär ist, schreibt er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream, andernfalls konvertiert er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Typ char_type und schreibt das Ergebnis in den Stream. Nicht unterstützt! in C++."
type: docs
weight: 700
url: /de/cpp/system.io/basicstdistreamwrapper/write/
---
## BasicSTDIStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Wenn der Wrapper-Modus binär ist, schreibt er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream, andernfalls konvertiert er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Typ [char_type](../char_type/) und schreibt das Ergebnis in den Stream. Nicht unterstützt!

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Array, das die zu schreibenden Bytes enthält. |
| Offset | int32_t | Ein nullbasierter Index des Elements in **buffer**, an dem der zu schreibende Teilbereich beginnt. |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich. |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream.

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Die Array-Ansicht, die die zu schreibenden Bytes enthält |
| Offset | int32_t | Ein 0-basierter Index des Elements in **buffer**, an dem der zu schreibende Teilbereich beginnt |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich |

## Siehe auch

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
