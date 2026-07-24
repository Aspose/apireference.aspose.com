---
title: "System::Security::Cryptography::DSA::SignData طريقة"
linktitle: "SignData"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::DSA::SignData طريقة. يحسب قيمة التجزئة لمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة في C++."
type: docs
weight: 500
url: /ar/cpp/system.security.cryptography/dsa/signdata/
---
## DSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بيانات | const ByteArrayPtr\& | مصفوفة البيانات المدخلة. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع توقيع [DSA](../) للبيانات المدخلة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بيانات | const ByteArrayPtr\& | مصفوفة البيانات المدخلة. |
| الإزاحة | int32_t | الإزاحة في **data**. |
| count | int32_t | عدد البايتات لاستخدامها كبيانات مدخلة. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع توقيع [DSA](../) للبيانات المدخلة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


يحسب قيمة التجزئة لتدفق البيانات الثنائي المحدد باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دفق | const StreamPtr\& | دفق ثنائي. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع توقيع [DSA](../) للبيانات المدخلة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
