---
title: "فئة System::Net::WebProxy"
linktitle: "WebProxy"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::WebProxy. تمثل خادم بروكسي ويب http. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3700
url: /ar/cpp/system.net/webproxy/
---
## WebProxy class


تمثل خادم بروكسي ويب http. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class WebProxy : public System::Net::IWebProxy
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Address](./get_address/)() | يحصل على عنوان خادم البروكسي الحالي. |
| [get_BypassList](./get_bypasslist/)() | يحصل على قائمة العناوين التي لا تستخدم خادم البروكسي. |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | يحصل على قيمة تشير إلى ما إذا كان يجب استخدام خادم البروكسي للعناوين المحلية. |
| virtual [get_Credentials](./get_credentials/)() | يحصل على بيانات الاعتماد التي تُرسل إلى خادم البروكسي للمصادقة. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | يحصل على قيمة تشير إلى ما إذا كان يجب إرسال بيانات الاعتماد الافتراضية مع الطلبات. |
| static [GetDefaultProxy](./getdefaultproxy/)() | يعيد البروكسي الذي يستخدم إعدادات Internet Explorer غير الديناميكية. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | يعيد عنوان URI الموكَّل لطلب ويب. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | يتحقق مما إذا كان خادم الوكيل غير مستخدم للعنوان URI المحدد. |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | يضبط عنوان خادم الوكيل الحالي. |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | يضبط قائمة العناوين التي لا تستخدم خادم الوكيل. |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب استخدام خادم الوكيل للعناوين المحلية. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | يضبط بيانات الاعتماد التي تُرسل إلى خادم الوكيل للمصادقة. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب إرسال بيانات الاعتماد الافتراضية مع الطلبات. |
| [WebProxy](./webproxy/)() | ينشئ نسخة جديدة. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | ينشئ نسخة جديدة. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | ينشئ نسخة جديدة. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | ينشئ نسخة جديدة. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | ينشئ نسخة جديدة. |
| [WebProxy](./webproxy/)(String, int32_t) | ينشئ نسخة جديدة. |
| [WebProxy](./webproxy/)(String) | ينشئ نسخة جديدة. |
| [WebProxy](./webproxy/)(String, bool) | ينشئ نسخة جديدة. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | ينشئ نسخة جديدة. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
