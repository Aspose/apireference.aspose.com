---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash yöntemi"
linktitle: "VerifyHash"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash yöntemi. Belirtilen özetin imzasının C++'de geçerli olduğunu doğrular."
type: docs
weight: 1900
url: /tr/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


Belirtilen hash'in imzasının geçerli olduğunu doğrular.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| hash | ByteArrayPtr | İmzalı verinin hash değeri. |
| imza | ByteArrayPtr | İmza verisi. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. |
| dolgu | SharedPtr\<RSASignaturePadding\> | Dolgu modu. İmza geçerli ise true döndür, aksi takdirde - false. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


Veri imzasını kontrol eder.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Alınan veri için hesaplanan karma. |
| str | const String\& | Kullanılan hash algoritmasının adı. |
| rgb_signature | const ByteArrayPtr\& | Alındığı gibi imza. |

### ReturnValue

İmza geçerliyse Doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
