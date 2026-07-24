---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData methode"
linktitle: "SignData"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData methode. Berekent de handtekening van de opgegeven invoerwaarde in C++."
type: docs
weight: 1600
url: /nl/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


Berekent de handtekening van de opgegeven invoerwaarde.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) om invoergegevens van te lezen. |
| halg | const SharedPtr\<Object\>\& | Hash-algoritme om te gebruiken. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


Berekent de handtekening van de opgegeven invoerwaarde.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) om invoergegevens van te lezen. |
| offset | int32_t | Beginindex van het invoerbuffersegment. |
| count | int32_t | Grootte van het invoerbuffersegment. |
| halg | const SharedPtr\<Object\>\& | Hash-algoritme om te gebruiken. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


Berekent de handtekening van de opgegeven invoerwaarde.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | Stream om de te ondertekenen gegevens van te lezen. |
| halg | const SharedPtr\<Object\>\& | Hash-algoritme om te gebruiken. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
