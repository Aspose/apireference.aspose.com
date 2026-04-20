---
title: "System::Security::Cryptography::ECDsaBotan::HashData طريقة"
linktitle: "HashData"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::ECDsaBotan::HashData طريقة. يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة في C++."
type: docs
weight: 700
url: /ar/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


يحسب قيمة التجزئة للمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| data | ByteArrayPtr | [Data](../../../system.data/) للتجزئة. |
| إزاحة | int32_t | الإزاحة في **data**. |
| count | int32_t | عدد البايتات لتجزئتها. |
| hash_algorithm | HashAlgorithmName | خوارزمية التجزئة. |

### ReturnValue

بيانات مجزأة.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


يحسب قيمة التجزئة لتدفق البيانات الثنائي المحدد باستخدام خوارزمية التجزئة المحددة.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | StreamPtr | تيار ثنائي للهاش. |
| hash_algorithm | HashAlgorithmName | خوارزمية التجزئة. |

### ReturnValue

بيانات مجزأة.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
