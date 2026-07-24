---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash methode"
linktitle: "VerifyHash"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash methode. Verifieert dat de handtekening van de opgegeven hash geldig is in C++."
type: docs
weight: 1900
url: /nl/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


Verifieert dat de handtekening van de gespecificeerde hash geldig is.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| hash | ByteArrayPtr | Hashwaarde van de ondertekende gegevens. |
| handtekening | ByteArrayPtr | Handtekeninggegevens. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. |
| opvulling | SharedPtr\\<RSASignaturePadding\\> | Opvulmodus. return true als de handtekening geldig is, anders - false. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


Controleert de gegevenshandtekening.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hash berekend voor ontvangen gegevens. |
| str | const String\& | Naam van de gebruikte hash-algoritme. |
| rgb_signature | const ByteArrayPtr\& | Handtekening zoals ontvangen. |

### ReturnValue

True als de handtekening geldig is, false anders.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
