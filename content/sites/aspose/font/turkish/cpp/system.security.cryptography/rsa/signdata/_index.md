---
title: "System::Security::Cryptography::RSA::SignData metodu"
linktitle: "SignData"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSA::SignData yöntemi. Belirtilen veri dizisinin hash değerini belirtilen hash algoritması ve doldurma (padding) kullanarak hesaplar ve sonucu C++'ta imzalar."
type: docs
weight: 1000
url: /tr/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Belirtilen veri dizisinin hash değerini belirtilen hash algoritması ve dolgu (padding) kullanarak hesaplar ve sonucu imzalar.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| veri | const ByteArrayPtr\& | Girdi veri dizisi. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Dolgu modu. Girdi verisi için [RSA](../) imzasını döndürür. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Belirtilen veri dizisinin hash değerini belirtilen hash algoritması ve dolgu (padding) kullanarak hesaplar ve sonucu imzalar.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| veri | const ByteArrayPtr\& | Girdi veri dizisi. |
| offset | int32_t | Offset **data** içinde. |
| count | int32_t | Girdi verisi olarak kullanılacak bayt sayısı. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Dolgu modu. Girdi verisi için [RSA](../) imzasını döndürür. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Belirtilen ikili akışın hash değerini belirtilen hash algoritması ve doldurma (padding) kullanarak hesaplar ve sonucu imzalar.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const StreamPtr\& | İkili akış. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Dolgu modu. Girdi verisi için [RSA](../) imzasını döndürür. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
