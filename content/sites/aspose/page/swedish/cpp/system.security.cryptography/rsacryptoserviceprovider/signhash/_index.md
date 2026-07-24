---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash metod"
linktitle: "SignHash"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash metod. Beräknar signaturen för det angivna hashvärdet i C++."
type: docs
weight: 1700
url: /sv/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


Beräknar signaturen för det angivna hashvärdet.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| hash | ByteArrayPtr | Hash-värde. |
| hash_algorithm | HashAlgorithmName | Hash-algoritm. |
| padding | SharedPtr\<RSASignaturePadding\> | Padding-läge. returnerar [RSA](../../rsa/) signatur för den angivna hashen. |

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


Beräknar signaturen för angivet indata­värde. Ej implementerat.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hashvärde för data som ska signeras. |
| str | const String\& | Identifierare för hash-algoritm som används för att skapa hashen. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
