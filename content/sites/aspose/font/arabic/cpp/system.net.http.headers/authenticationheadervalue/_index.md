---
title: "System::Net::Http::Headers::AuthenticationHeaderValue فئة"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue فئة. تمثل قيم رؤوس ''Authorization''، ''ProxyAuthorization''، ''WWW-Authenticate''، و''Proxy-Authenticate''. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


يمثل قيم رؤوس 'Authorization'، 'ProxyAuthorization'، 'WWW-Authenticate'، و'Proxy-Authenticate'. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | المُنشئ. |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | المُنشئ. |
| [Clone](./clone/)() override | معلومات RTTI. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_Parameter](./get_parameter/)() | يسترجع بيانات الاعتماد التي تحتوي على معلومات المصادقة. |
| [get_Scheme](./get_scheme/)() | معلومات RTTI. |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يقوم بتحليل السلسلة المحددة ويعيد الفهرس الأخير لتمثيل السلسلة. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [Parse](./parse/)(String) | يحوّل السلسلة الممرّرة إلى نسخة من فئة [AuthenticationHeaderValue](./). |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | محاولة تحويل السلسلة الممرّرة إلى نسخة من فئة [AuthenticationHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
