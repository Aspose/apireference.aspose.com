---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt metod"
linktitle: "Decrypt"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt metod. Avkrypterar indata med den angivna utfyllnadsläget i C++."
type: docs
weight: 200
url: /sv/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Dekrypterar indata med det angivna utfyllnadsläget.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) array att dekryptera. |
| utfyllnad | SharedPtr\<RSAEncryptionPadding\> | Paddingläge. |

### ReturnValue

Dekrypterad data i byte‑array‑format.

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


Dekrypterar meddelande. Ej implementerat.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) att avkryptera. |
| use_oaep | bool | Sant för att använda OAEP-utfyllnad, falskt för att använda PKCS#1 v1.5-utfyllnad. |

### ReturnValue

Avkrypterad dataarray.

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
