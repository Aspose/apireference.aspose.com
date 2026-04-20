---
title: "طريقة System::Security::Cryptography::ECDsa::SignData"
linktitle: "SignData"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::ECDsa::SignData. يحسب قيمة الهاش لمصفوفة البيانات المحددة باستخدام خوارزمية الهاش المحددة، ويوقع النتيجة في C++."
type: docs
weight: 700
url: /ar/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البيانات | const ByteArrayPtr\& | مصفوفة البيانات المدخلة. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع توقيع ECDSA للبيانات المدخلة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البيانات | const ByteArrayPtr\& | مصفوفة البيانات المدخلة. |
| إزاحة | int32_t | الإزاحة في **data**. |
| count | int32_t | عدد البايتات لاستخدامها كبيانات إدخال. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع توقيع ECDSA للبيانات المدخلة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


يحسب قيمة التجزئة لتدفق البيانات الثنائية المحدد باستخدام خوارزمية التجزئة المحددة، ويوقع النتيجة.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const StreamPtr\& | تيار ثنائي. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع توقيع ECDSA للبيانات المدخلة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
