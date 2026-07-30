---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData yöntemi"
linktitle: "VerifyData"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData yöntemi. C++'ta veri imzasını kontrol eder."
type: docs
weight: 1700
url: /tr/cpp/system.security.cryptography/dsacryptoserviceprovider/verifydata/
---
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


Veri imzasını kontrol eder.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const ByteArrayPtr &signature)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) imzasını kontrol etmek için. |
| imza | const ByteArrayPtr\& | Alındığı gibi imza. |

### ReturnValue

İmza geçerliyse Doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Belirtilen verinin imzasının geçerli olduğunu doğrular.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| veri | const ByteArrayPtr\& | İmzalı veri. |
| imza | const ByteArrayPtr\& | İmza verisi. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. İmza geçerli ise true, aksi takdirde false döndürür. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Belirtilen verinin imzasının geçerli olduğunu doğrular.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| veri | const ByteArrayPtr\& | İmzalı veri. |
| offset | int32_t | Offset **data** içinde. |
| count | int32_t | Hashlenecek bayt sayısı. |
| imza | const ByteArrayPtr\& | İmza verisi. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. İmza geçerli ise true, aksi takdirde false döndürür. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Belirtilen ikili akışın imzasının geçerli olduğunu doğrular.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const StreamPtr\& | İmzalı veri. |
| imza | const ByteArrayPtr\& | İmza verisi. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. İmza geçerli ise true, aksi takdirde false döndürür. |

## Ayrıca Bakınız

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
