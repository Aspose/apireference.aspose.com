---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt methode"
linktitle: "Encrypt"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt methode. Versleutelt invoergegevens met behulp van de opgegeven opvulmodus in C++."
type: docs
weight: 400
url: /nl/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Versleutelt invoergegevens met de gespecificeerde opvulmodus.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) array om te versleutelen. |
| opvulling | SharedPtr\<RSAEncryptionPadding\> | Padding-modus. |

### ReturnValue

Versleutelde gegevens in byte-arrayformaat.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


Versleutelt bericht. Niet geïmplementeerd.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) om te versleutelen. |
| use_oaep | bool | True om OAEP-opvulling te gebruiken, false om PKCS#1 v1.5-opvulling te gebruiken. |

### ReturnValue

Versleutelde gegevensarray.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
