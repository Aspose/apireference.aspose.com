---
title: "طريقة System::Security::Cryptography::ECDsaBotan::VerifyData"
linktitle: "VerifyData"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::ECDsaBotan::VerifyData. تتحقق من أن توقيع البيانات المحددة صالح في C++."
type: docs
weight: 1400
url: /ar/cpp/system.security.cryptography/ecdsabotan/verifydata/
---
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


يتحقق من صحة توقيع البيانات المحددة.

```cpp
bool System::Security::Cryptography::ECDsaBotan::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بيانات | const ByteArrayPtr\& | البيانات الموقعة. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


يتحقق من صحة توقيع البيانات المحددة.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بيانات | const ByteArrayPtr\& | البيانات الموقعة. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) method


يتحقق من صحة توقيع البيانات المحددة.

```cpp
bool System::Security::Cryptography::ECDsaBotan::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بيانات | const ByteArrayPtr\& | البيانات الموقعة. |
| الإزاحة | int32_t | الإزاحة في **data**. |
| count | int32_t | عدد البايتات لتجزئتها. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


يتحقق من صحة توقيع البيانات المحددة.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
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
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::VerifyData(const StreamPtr\&, const ByteArrayPtr\&) method


يتحقق من صحة توقيع تدفق البيانات الثنائي المحدد.

```cpp
bool System::Security::Cryptography::ECDsaBotan::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دفق | const StreamPtr\& | البيانات الموقعة. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


يتحقق من صحة توقيع تدفق البيانات الثنائي المحدد.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دفق | const StreamPtr\& | البيانات الموقعة. |
| التوقيع | const ByteArrayPtr\& | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
