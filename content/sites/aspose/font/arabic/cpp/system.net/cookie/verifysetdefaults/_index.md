---
title: "System::Net::Cookie::VerifySetDefaults طريقة"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Cookie::VerifySetDefaults طريقة. يتحقق ويضبط قيم السمة الافتراضية attribute''s في C++."
type: docs
weight: 4200
url: /ar/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


يتحقق ويضبط قيم السمات الافتراضية.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| variant | CookieVariant | مواصفات ملف تعريف الارتباط. |
| uri | System::SharedPtr\<Uri\> | مثال فئة Uri-class الذي يُستخدم لتهيئة الحقول الداخلية. |
| isLocalDomain | bool | قيمة تشير إلى ما إذا كان ملف تعريف الارتباط يُدفع إلى النطاق المحلي. |
| localDomain | String | اسم نطاق محلي. |
| setDefault | bool | قيمة تشير إلى ما إذا كان يجب تهيئة سمات ملف تعريف الارتباط باستخدام القيم الافتراضية الخاصة بها. |
| shouldThrow | bool | قيمة تشير إلى ما إذا كان يجب رمي استثناء عندما تكون القيم المحددة غير صالحة. |

### ReturnValue

صحيح عندما تكون جميع القيم صالحة، وإلا خطأ.

## انظر أيضًا

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
