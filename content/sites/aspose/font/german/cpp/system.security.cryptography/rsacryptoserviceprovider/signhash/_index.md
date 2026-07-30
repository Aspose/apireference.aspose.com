---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash Methode"
linktitle: "SignHash"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash Methode. Berechnet die Signatur für den angegebenen Hashwert in C++."
type: docs
weight: 1700
url: /de/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


Berechnet die Signatur für den angegebenen Hashwert.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| hash | ByteArrayPtr | Hashwert. |
| hash_algorithm | HashAlgorithmName | Hash-Algorithmus. |
| padding | SharedPtr\<RSASignaturePadding\> | Auffüllmodus. Gibt die [RSA](../../rsa/) Signatur für den angegebenen Hash zurück. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


Berechnet die Signatur des angegebenen Eingabewerts. Nicht implementiert.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hashwert der zu signierenden Daten. |
| str | const String\& | Hash-Algorithmus-Identifikator, der zum Erstellen des Hashs verwendet wird. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
