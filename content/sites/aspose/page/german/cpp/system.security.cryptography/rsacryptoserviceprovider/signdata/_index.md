---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData Methode"
linktitle: "SignData"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData Methode. Berechnet die Signatur des angegebenen Eingabewerts in C++."
type: docs
weight: 1600
url: /de/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


Berechnet die Signatur des angegebenen Eingabewerts.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) zum Lesen von Eingabedaten. |
| halg | const SharedPtr\<Object\>\& | Hash-Algorithmus, der verwendet werden soll. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


Berechnet die Signatur des angegebenen Eingabewerts.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) zum Lesen von Eingabedaten. |
| offset | int32_t | Startindex des Eingabepufferabschnitts. |
| count | int32_t | Größe des Eingabepufferabschnitts. |
| halg | const SharedPtr\<Object\>\& | Hash-Algorithmus, der verwendet werden soll. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


Berechnet die Signatur des angegebenen Eingabewerts.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | Stream zum Lesen der zu signierenden Daten. |
| halg | const SharedPtr\<Object\>\& | Hash-Algorithmus, der verwendet werden soll. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
