---
title: "System::IO::BasicSTDIOStreamWrapper::Read method"
linktitle: "Read"
second_title: "Aspose.Font für C++"
description: "System::IO::BasicSTDIOStreamWrapper::Read method. Wenn der Wrapper-Modus binär ist, liest er die angegebene Anzahl von Bytes aus dem Stream, andernfalls liest er die angegebene Anzahl von Zeichen und konvertiert sie in den Typ uint8_t. Schreibt das Ergebnis der Leseoperation in das angegebene Byte-Array in C++."
type: docs
weight: 400
url: /de/cpp/system.io/basicstdiostreamwrapper/read/
---
## BasicSTDIOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Wenn der Wrap‑Modus binär ist, liest er die angegebene Anzahl von Bytes aus dem Stream, andernfalls liest er die angegebene Anzahl von Zeichen und konvertiert sie in den Typ uint8_t. Schreibt das Ergebnis des Lesens in das angegebene Byte‑Array.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Byte-Array, in das die gelesenen Bytes geschrieben werden sollen |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll |
| count | int32_t | Die Anzahl der zu lesenden Bytes |

### ReturnValue

Anzahl der gelesenen Bytes oder Zeichen

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Die Byte-Array-Ansicht, in die die gelesenen Bytes geschrieben werden sollen |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll |
| count | int32_t | Die Anzahl der zu lesenden Bytes |

### ReturnValue

Die Anzahl der gelesenen Bytes

## Siehe auch

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
