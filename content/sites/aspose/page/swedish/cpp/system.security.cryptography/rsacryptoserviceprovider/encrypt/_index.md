---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt metod"
linktitle: "Kryptera"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt metod. Krypterar indata med det angivna utfyllnadsläget i C++."
type: docs
weight: 400
url: /sv/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Krypterar indata med det angivna utfyllnadsläget.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) array att kryptera. |
| utfyllnad | SharedPtr\<RSAEncryptionPadding\> | Paddingläge. |

### ReturnValue

Krypterad data i bytearrayformat.

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


Krypterar meddelande. Ej implementerat.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) att kryptera. |
| use_oaep | bool | Sant för att använda OAEP-utfyllnad, falskt för att använda PKCS#1 v1.5-utfyllnad. |

### ReturnValue

Krypterad dataarray.

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
