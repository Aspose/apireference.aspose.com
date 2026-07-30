---
title: "System::Security::Cryptography::RSA::VerifyData yöntemi"
linktitle: "VerifyData"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSA::VerifyData yöntemi. Belirtilen verinin imzasının C++'ta geçerli olduğunu doğrular."
type: docs
weight: 1300
url: /tr/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Belirtilen verinin imzasının geçerli olduğunu doğrular.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| veri | const ByteArrayPtr\& | İmzalı veri. |
| imza | const ByteArrayPtr\& | İmza verisi. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. |
| dolgu | const SharedPtr\<RSASignaturePadding\>\& | Dolgu modu. İmza geçerli ise true döndür, aksi takdirde - false. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Belirtilen verinin imzasının geçerli olduğunu doğrular.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| veri | const ByteArrayPtr\& | İmzalı veri. |
| offset | int32_t | Offset **data** içinde. |
| count | int32_t | Hashlenecek bayt sayısı. |
| imza | const ByteArrayPtr\& | İmza verisi. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. |
| dolgu | const SharedPtr\<RSASignaturePadding\>\& | Dolgu modu. İmza geçerli ise true döndür, aksi takdirde - false. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Belirtilen ikili akışın imzasının geçerli olduğunu doğrular.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const StreamPtr\& | İmzalı veri. |
| imza | const ByteArrayPtr\& | İmza verisi. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. |
| dolgu | const SharedPtr\<RSASignaturePadding\>\& | Dolgu modu. İmza geçerli ise true döndür, aksi takdirde - false. |

## Ayrıca Bakınız

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
