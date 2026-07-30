---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum"
linktitle: "X509KeyUsageFlags"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum. يحدد كيف يمكن استخدام مفتاح الشهادة في C++."
type: docs
weight: 2200
url: /ar/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


يحدد كيفية استخدام مفتاح الشهادة.

```cpp
enum class X509KeyUsageFlags : int32_t
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| None | 0 | لا توجد معلمات لاستخدام المفتاح. |
| EncipherOnly | 1 | يمكن استخدام المفتاح فقط للتشفير. |
| CrlSign | 2 | يمكن استخدام المفتاح لتوقيع قائمة إلغاء الشهادات. |
| KeyCertSign | 4 | يمكن استخدام المفتاح لتوقيع الشهادات. |
| KeyAgreement | 8 | يمكن استخدام المفتاح لتحديد اتفاقية المفتاح. |
| DataEncipherment | 16 | يمكن استخدام المفتاح لتشفير البيانات. |
| KeyEncipherment | 32 | يمكن استخدام المفتاح لتشفير المفتاح. |
| NonRepudiation | 64 | يمكن استخدام المفتاح للمصادقة. |
| DigitalSignature | 128 | يمكن استخدام المفتاح كتوقيع رقمي. |
| DecipherOnly | 32768 | يمكن استخدام المفتاح فقط لفك التشفير. |

## انظر أيضًا

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
