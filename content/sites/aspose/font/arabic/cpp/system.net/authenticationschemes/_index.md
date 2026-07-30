---
title: "System::Net::AuthenticationSchemes تعداد"
linktitle: "AuthenticationSchemes"
second_title: "Aspose.Font لـ C++"
description: "System::Net::AuthenticationSchemes enum. يعدد أنماط المصادقة في C++."
type: docs
weight: 4100
url: /ar/cpp/system.net/authenticationschemes/
---
## AuthenticationSchemes enum


يسرد آليات المصادقة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
enum class AuthenticationSchemes
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| None | 0 | لا يلزم أي مصادقة. |
| Digest | 1 | مصادقة وصول Digest. |
| Negotiate | 2 | يتفاوض مع العميل لتحديد نمط المصادقة الذي سيُستخدم (NTML أو Kerberos). |
| Ntlm | 4 | مصادقة NTLM. |
| Basic | 8 | مصادقة Basic. |
| Anonymous | 32768 | مصادقة Anonymous. |
| IntegratedWindowsAuthentication | n/a | [Windows](../../system.windows/) المصادقة. |

## انظر أيضًا

* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
