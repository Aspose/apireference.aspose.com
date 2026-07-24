---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash metodu"
linktitle: "SignHash"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash metodu. C++'de belirtilen hash değeri için imzayı hesaplar."
type: docs
weight: 1700
url: /tr/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


Belirtilen hash değeri için imzayı hesaplar.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| özet | ByteArrayPtr | Hash değeri. |
| hash_algorithm | HashAlgorithmName | Hash algoritması. |
| padding | SharedPtr\<RSASignaturePadding\> | Padding mode. Belirtilen hash için [RSA](../../rsa/) imzasını döndürür. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


Belirtilen giriş değerinin imzasını hesaplar. Henüz uygulanmadı.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | İmzalanacak verinin hash değeri. |
| str | const String\& | Hash'i oluşturmak için kullanılan hash algoritması tanımlayıcısı. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
