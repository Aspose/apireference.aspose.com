---
title: "System::Security::Cryptography::DSA::SignData yöntemi"
linktitle: "SignData"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::DSA::SignData yöntemi. Belirtilen veri dizisinin hash değerini belirtilen hash algoritmasıyla hesaplar ve sonucu C++'ta imzalar."
type: docs
weight: 500
url: /tr/cpp/system.security.cryptography/dsa/signdata/
---
## DSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Belirtilen hash algoritması kullanılarak belirtilen veri dizisinin hash değerini hesaplar ve sonucu imzalar.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| veri | const ByteArrayPtr\& | Girdi veri dizisi. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. Girdi verisi için [DSA](../) imzasını döndür. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Belirtilen hash algoritması kullanılarak belirtilen veri dizisinin hash değerini hesaplar ve sonucu imzalar.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| veri | const ByteArrayPtr\& | Girdi veri dizisi. |
| offset | int32_t | Offset **data** içinde. |
| count | int32_t | Girdi verisi olarak kullanılacak bayt sayısı. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. Girdi verisi için [DSA](../) imzasını döndür. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSA::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Belirtilen hash algoritması kullanılarak belirtilen ikili akışın hash değerini hesaplar ve sonucu imzalar.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const StreamPtr\& | İkili akış. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. Girdi verisi için [DSA](../) imzasını döndür. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
