---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash methode"
linktitle: "SignHash"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash methode. Berekent de handtekening voor de opgegeven hashwaarde in C++."
type: docs
weight: 1700
url: /nl/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


Berekent de handtekening voor de gespecificeerde hashwaarde.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| hash | ByteArrayPtr | Hashwaarde. |
| hash_algorithm | HashAlgorithmName | Hash-algoritme. |
| padding | SharedPtr\<RSASignaturePadding\> | Padding-modus. retourneert [RSA](../../rsa/) handtekening voor de opgegeven hash. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


Berekent de handtekening van de opgegeven invoerwaarde. Niet geïmplementeerd.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hashwaarde van de te ondertekenen gegevens. |
| str | const String\& | Hash-algoritme‑identificatie gebruikt om de hash te maken. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
