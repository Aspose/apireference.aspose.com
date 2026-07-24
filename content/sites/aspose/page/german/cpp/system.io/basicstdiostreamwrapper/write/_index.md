---
title: "System::IO::BasicSTDIOStreamWrapper::Write Methode"
linktitle: "Write"
second_title: "Aspose.Page für C++"
description: "System::IO::BasicSTDIOStreamWrapper::Write Methode. Wenn der Wrapper-Modus binär ist, schreibt er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream, andernfalls konvertiert er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Typ char_type und schreibt dann das Ergebnis in den Stream in C++."
type: docs
weight: 700
url: /de/cpp/system.io/basicstdiostreamwrapper/write/
---
## BasicSTDIOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Wenn der Wrapper-Modus binär ist, schreibt es den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream, andernfalls wird der angegebene Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Typ [char_type](../char_type/) konvertiert und das Ergebnis in den Stream geschrieben.

```cpp
virtual void System::IO::BasicSTDIOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | const ArrayPtr\<uint8_t\>\& | Das Array, das die zu schreibenden Bytes enthält |
| offset | int32_t | Ein nullbasierter Index des Elements im **buffer**, an dem der zu schreibende Teilbereich beginnt |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream.

```cpp
virtual void System::IO::BasicSTDIOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | const System::Details::ArrayView\<uint8_t\>\& | Die Array-Ansicht, die die zu schreibenden Bytes enthält |
| offset | int32_t | Ein nullbasierter Index des Elements in **buffer**, an dem der zu schreibende Teilbereich beginnt |
| count | int32_t | Die Anzahl der Elemente im zu schreibenden Teilbereich |

## Siehe auch

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
