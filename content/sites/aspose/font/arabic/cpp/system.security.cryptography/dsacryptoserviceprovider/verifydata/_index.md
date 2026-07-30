---
title: "طريقة System::Security::Cryptography::DSACryptoServiceProvider::VerifyData"
linktitle: "VerifyData"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::DSACryptoServiceProvider::VerifyData. تتحقق من توقيع البيانات في C++."
type: docs
weight: 1700
url: /ar/cpp/system.security.cryptography/dsacryptoserviceprovider/verifydata/
---
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


يفحص توقيع البيانات.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const ByteArrayPtr &signature)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) للتحقق من التوقيع الخاص به. |
| التوقيع | const ByteArrayPtr\& | التوقيع كما تم استلامه. |

### ReturnValue

صحيح إذا كان التوقيع صالحًا، خطأ خلاف ذلك.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


يتحقق من أن توقيع البيانات المحددة صالح.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البيانات | const ByteArrayPtr\& | بيانات موقعة. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


يتحقق من أن توقيع البيانات المحددة صالح.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البيانات | const ByteArrayPtr\& | بيانات موقعة. |
| إزاحة | int32_t | الإزاحة في **data**. |
| count | int32_t | عدد البايتات لتجزئتها. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


يتحقق من أن توقيع تدفق البيانات الثنائية المحدد صالح.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const StreamPtr\& | بيانات موقعة. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
