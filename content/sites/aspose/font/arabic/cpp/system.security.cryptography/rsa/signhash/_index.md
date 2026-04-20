---
title: "طريقة System::Security::Cryptography::RSA::SignHash"
linktitle: "SignHash"
second_title: "Aspose.Font لـ C++"
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


| معامل | نوع | الوصف |
| --- | --- | --- |
| الهاش | ByteArrayPtr | قيمة التجزئة. |
| hash_algorithm | HashAlgorithmName | خوارزمية التجزئة. |
| padding | SharedPtr\<RSASignaturePadding\> | وضع الحشو. إرجاع توقيع [RSA](../) للتجزئة المحددة. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
