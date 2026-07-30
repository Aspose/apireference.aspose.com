---
title: "System::IO::FileStream::Read Methode"
linktitle: "Read"
second_title: "Aspose.Font für C++"
description: "System::IO::FileStream::Read Methode. Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array in C++."
type: docs
weight: 1300
url: /de/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Byte-Array, in das die gelesenen Bytes geschrieben werden sollen. |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll. |
| count | int32_t | Die Anzahl der zu lesenden Bytes. |

### ReturnValue

Die Anzahl der gelesenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Die Byte-Array-Ansicht, in die die gelesenen Bytes geschrieben werden sollen. |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll. |
| count | int32_t | Die Anzahl der zu lesenden Bytes. |

### ReturnValue

Die Anzahl der gelesenen Bytes.

## Siehe auch

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
