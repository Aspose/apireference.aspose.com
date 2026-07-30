---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash Methode"
linktitle: "VerifyHash"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash Methode. Überprüft, ob die Signatur des angegebenen Hashs in C++ gültig ist."
type: docs
weight: 1900
url: /de/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


Überprüft, ob die Signatur des angegebenen Hashwerts gültig ist.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| hash | ByteArrayPtr | Hashwert der signierten Daten. |
| Signatur | ByteArrayPtr | Signaturdaten. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. |
| Padding | SharedPtr\<RSASignaturePadding\> | Padding-Modus. Gibt true zurück, wenn die Signatur gültig ist, andernfalls false. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


Prüft die Datensignatur.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hash, der für empfangene Daten berechnet wurde. |
| str | const String\& | Name des verwendeten Hash-Algorithmus. |
| rgb_signature | const ByteArrayPtr\& | Signatur wie empfangen. |

### ReturnValue

True, wenn die Signatur gültig ist, false sonst.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
