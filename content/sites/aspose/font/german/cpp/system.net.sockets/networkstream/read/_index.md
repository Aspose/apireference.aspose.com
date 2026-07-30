---
title: "System::Net::Sockets::NetworkStream::Read Methode"
linktitle: "Read"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::NetworkStream::Read Methode. Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array in C++."
type: docs
weight: 1900
url: /de/cpp/system.net.sockets/networkstream/read/
---
## NetworkStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Das Byte-Array, in das die gelesenen Bytes geschrieben werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu lesenden Bytes. |

### ReturnValue

Die Anzahl der gelesenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## NetworkStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Die Byte-Array-Ansicht, in die die gelesenen Bytes geschrieben werden sollen |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll |
| size | int32_t | Die Anzahl der zu lesenden Bytes |

### ReturnValue

Die Anzahl der gelesenen Bytes

## Siehe auch

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
