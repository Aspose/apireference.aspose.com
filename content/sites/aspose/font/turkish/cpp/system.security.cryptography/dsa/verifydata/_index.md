---
title: "System::Security::Cryptography::DSA::VerifyData yöntemi"
linktitle: "VerifyData"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::DSA::VerifyData yöntemi. Belirtilen verinin imzasının C++'ta geçerli olduğunu doğrular."
type: docs
weight: 700
url: /tr/cpp/system.security.cryptography/dsa/verifydata/
---
## DSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


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
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


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
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


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
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
