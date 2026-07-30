---
title: "System::IO::Stream::Read Methode"
linktitle: "Read"
second_title: "Aspose.Font für C++"
description: "System::IO::Stream::Read Methode. Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array in C++."
type: docs
weight: 1800
url: /de/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array.

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Byte-Array, in das die gelesenen Bytes geschrieben werden sollen |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll |
| count | int32_t | Die Anzahl der zu lesenden Bytes |

### ReturnValue

Die Anzahl der gelesenen Bytes

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array.

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Die Byte-Array-Ansicht, in die die gelesenen Bytes geschrieben werden sollen |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll |
| count | int32_t | Die Anzahl der zu lesenden Bytes |

### ReturnValue

Die Anzahl der gelesenen Bytes

## Siehe auch

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array.

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | Beschreibung |
| --- | --- |
| N | Die Größe des Stack-Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const System::Details::StackArray\<uint8_t, N\>\& | Das Byte-Stack-Array, in das die gelesenen Bytes geschrieben werden sollen |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll |
| count | int32_t | Die Anzahl der zu lesenden Bytes |

### ReturnValue

Die Anzahl der gelesenen Bytes

## Siehe auch

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
