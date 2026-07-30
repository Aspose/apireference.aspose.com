---
title: "طريقة System::Security::Cryptography::RSA::VerifyData"
linktitle: "VerifyData"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::RSA::VerifyData. تتحقق من صحة توقيع البيانات المحددة في C++."
type: docs
weight: 1300
url: /ar/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


يتحقق من أن توقيع البيانات المحددة صالح.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البيانات | const ByteArrayPtr\& | بيانات موقعة. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. |
| حشو | const SharedPtr\<RSASignaturePadding\>\& | وضع الحشو. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


يتحقق من أن توقيع البيانات المحددة صالح.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البيانات | const ByteArrayPtr\& | بيانات موقعة. |
| إزاحة | int32_t | الإزاحة في **data**. |
| count | int32_t | عدد البايتات لتجزئتها. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. |
| حشو | const SharedPtr\<RSASignaturePadding\>\& | وضع الحشو. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


يتحقق من أن توقيع تدفق البيانات الثنائية المحدد صالح.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const StreamPtr\& | بيانات موقعة. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. |
| حشو | const SharedPtr\<RSASignaturePadding\>\& | وضع الحشو. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
