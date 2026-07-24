---
title: "System::Security::Cryptography::DSA::VerifyData طريقة"
linktitle: "VerifyData"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::DSA::VerifyData طريقة. يتحقق من أن توقيع البيانات المحددة صالح في C++."
type: docs
weight: 700
url: /ar/cpp/system.security.cryptography/dsa/verifydata/
---
## DSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


يتحقق من صحة توقيع البيانات المحددة.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بيانات | const ByteArrayPtr\& | البيانات الموقعة. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


يتحقق من صحة توقيع البيانات المحددة.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بيانات | const ByteArrayPtr\& | البيانات الموقعة. |
| الإزاحة | int32_t | الإزاحة في **data**. |
| count | int32_t | عدد البايتات لتجزئتها. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


يتحقق من صحة توقيع تدفق البيانات الثنائي المحدد.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دفق | const StreamPtr\& | البيانات الموقعة. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
