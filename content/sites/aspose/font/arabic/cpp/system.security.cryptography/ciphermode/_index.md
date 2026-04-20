---
title: "System::Security::Cryptography::CipherMode enum"
linktitle: "CipherMode"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::CipherMode enum. وضع تشفير الكتلة في C++."
type: docs
weight: 5300
url: /ar/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


وضع تشفير كتلي.

```cpp
enum class CipherMode
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| CBC | 1 | سلسلة كتل التشفير (Cipher block chaining) التي تجمع الكتلة الحالية مع الكتلة السابقة لتحسين التشفير. |
| ECB | 2 | وضع دفتر الشيفرات الإلكتروني بدون تأثيرات بين الكتل؛ يؤدي إلى تشفير أضعف. |
| OFB | 3 | وضع التغذية الراجعة للإخراج الذي يتعامل مع كتل إدخال كبيرة على أجزاء صغيرة. |
| CFB | 4 | وضع تغذية التشفير الذي يتعامل مع كتل الإدخال الكبيرة على أجزاء صغيرة. قواعد التشويه تختلف عن تلك الخاصة بـ OFB. |
| CTS | 5 | وضع سرقة نص التشفير، يتصرف مثل CBC لجميع الكتل ما عدا آخر كتلتين من النص. |

## انظر أيضًا

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
