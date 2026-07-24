---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt methode"
linktitle: "Decrypt"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt methode. Ontsleutelt invoergegevens met behulp van de opgegeven opvulmodus in C++."
type: docs
weight: 200
url: /nl/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Ontsleutelt invoergegevens met de gespecificeerde opvulmodus.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) array om te ontsleutelen. |
| opvulling | SharedPtr\<RSAEncryptionPadding\> | Padding-modus. |

### ReturnValue

Ontsleutelde gegevens in byte-arrayformaat.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


Ontsleutelt bericht. Niet geïmplementeerd.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) om te ontsleutelen. |
| use_oaep | bool | True om OAEP-opvulling te gebruiken, false om PKCS#1 v1.5-opvulling te gebruiken. |

### ReturnValue

Ontsleutelde gegevensarray.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
