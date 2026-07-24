---
title: "طريقة System::Security::Cryptography::RSA::SignData"
linktitle: "SignData"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::RSA::SignData. تحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة والحشو، وتوقع النتيجة في C++."
type: docs
weight: 1000
url: /ar/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


يحسب قيمة التجزئة لمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة والحشو، ويوقع النتيجة.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بيانات | const ByteArrayPtr\& | مصفوفة البيانات المدخلة. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | وضع الحشو. إرجاع توقيع [RSA](../) للبيانات المدخلة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


يحسب قيمة التجزئة لمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة والحشو، ويوقع النتيجة.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بيانات | const ByteArrayPtr\& | مصفوفة البيانات المدخلة. |
| الإزاحة | int32_t | الإزاحة في **data**. |
| count | int32_t | عدد البايتات لاستخدامها كبيانات مدخلة. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | وضع الحشو. إرجاع توقيع [RSA](../) للبيانات المدخلة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


يحسب قيمة التجزئة لتدفق البيانات الثنائي المحدد باستخدام خوارزمية التجزئة المحددة والحشو، ويوقع النتيجة.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دفق | const StreamPtr\& | دفق ثنائي. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | وضع الحشو. إرجاع توقيع [RSA](../) للبيانات المدخلة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
