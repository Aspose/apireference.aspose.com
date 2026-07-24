---
title: "System::Net::Http::Headers::AuthenticationHeaderValue فئة"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue فئة. تمثل قيم رؤوس ''Authorization''، ''ProxyAuthorization''، ''WWW-Authenticate''، و''Proxy-Authenticate''. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


يمثل قيم رؤوس 'Authorization'، 'ProxyAuthorization'، 'WWW-Authenticate'، و'Proxy-Authenticate'. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | منشئ. |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | منشئ. |
| [Clone](./clone/)() override | معلومات RTTI. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| [get_Parameter](./get_parameter/)() | يحصل على بيانات الاعتماد التي تحتوي على معلومات المصادقة. |
| [get_Scheme](./get_scheme/)() | معلومات RTTI. |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يقوم بتحليل السلسلة المحددة ويعيد الفهرس الأخير للتمثيل النصي. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [Parse](./parse/)(String) | يحوّل سلسلة مُمرَّرة إلى نسخة من الفئة [AuthenticationHeaderValue](./). |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | محاولة تحويل سلسلة مُمرَّرة إلى نسخة من الفئة [AuthenticationHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
