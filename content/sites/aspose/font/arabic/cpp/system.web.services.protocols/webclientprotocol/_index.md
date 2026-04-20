---
title: "فئة System::Web::Services::Protocols::WebClientProtocol"
linktitle: "WebClientProtocol"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Web::Services::Protocols::WebClientProtocol. تُستخدم هذه الفئة الأساسية في جميع وكلاء خدمة الويب XML الذين تم إنشاؤهم باستخدام ASP.NET. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


تُستخدم هذه الفئة الأساسية في جميع وكلاء خدمة الويب XML [Web](../../system.web/) الذين تم إنشاؤهم باستخدام ASP.NET. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
class WebClientProtocol : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Abort](./abort/)() | يلغي الطلب. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | يحصل على اسم مجموعة الاتصال. |
| [get_Credentials](./get_credentials/)() | يحصل على معلومات المصادقة. |
| [get_PreAuthenticate](./get_preauthenticate/)() | يحصل على قيمة تشير إلى ما إذا كان التوثيق المسبق مفعلاً. |
| [get_RequestEncoding](./get_requestencoding/)() | يحصل على الترميز المستخدم لإنشاء طلبات العميل. |
| [get_Timeout](./get_timeout/)() | يحصل على الفترة الزمنية للانتظار قبل انتهاء مهلة الطلب. |
| [get_Uri](./get_uri/)() | يحصل على URI خدمة XML [Web](../../system.web/). |
| [get_Url](./get_url/)() | يحصل على URL خدمة XML [Web](../../system.web/). |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | يحصل على قيمة تشير إلى ما إذا كانت الخاصية 'Credential' مساوية للخاصية 'DefaultCredentials'. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | يضبط اسم مجموعة الاتصال. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | يضبط معلومات المصادقة. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | يضبط قيمة تشير إلى ما إذا كان التوثيق المسبق مفعلاً. |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | يضبط الترميز المستخدم لإنشاء طلبات العميل. |
| [set_Timeout](./set_timeout/)(int32_t) | يضبط الفترة الزمنية للانتظار قبل انتهاء مهلة الطلب. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | يضبط URI خدمة XML [Web](../../system.web/). |
| [set_Url](./set_url/)(String) | يضبط URL خدمة XML [Web](../../system.web/). |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | يضبط قيمة تشير إلى ما إذا كانت الخاصية 'Credential' مساوية للخاصية 'DefaultCredentials'. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
