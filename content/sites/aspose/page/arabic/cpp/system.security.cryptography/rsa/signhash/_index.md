---
title: "طريقة System::Security::Cryptography::RSA::SignHash"
linktitle: "SignHash"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::RSA::SignHash. تحسب التوقيع للقيمة التجزئة المحددة في C++."
type: docs
weight: 1100
url: /ar/cpp/system.security.cryptography/rsa/signhash/
---
## RSA::SignHash method


يحسب التوقيع لقيمة التجزئة المحددة.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الملخص | ByteArrayPtr | قيمة التجزئة. |
| hash_algorithm | HashAlgorithmName | خوارزمية التجزئة. |
| padding | SharedPtr\<RSASignaturePadding\> | وضع الحشو. إرجاع توقيع [RSA](../) للقيمة التجزئة المحددة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
