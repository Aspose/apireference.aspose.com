---
title: "System::Net::Security::SslStream::Read Methode"
linktitle: "Read"
second_title: "Aspose.Font für C++"
description: "System::Net::Security::SslStream::Read Methode. Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array in C++."
type: docs
weight: 3200
url: /de/cpp/system.net.security/sslstream/read/
---
## SslStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Security::SslStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
## SslStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Security::SslStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Das Byte-Array, in das die gelesenen Bytes geschrieben werden sollen |
| Offset | int32_t | Eine 0-basierte Position in **buffer**, an der das Schreiben beginnen soll |
| count | int32_t | Die Anzahl der zu lesenden Bytes |

### ReturnValue

Die Anzahl der gelesenen Bytes

## Siehe auch

* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
