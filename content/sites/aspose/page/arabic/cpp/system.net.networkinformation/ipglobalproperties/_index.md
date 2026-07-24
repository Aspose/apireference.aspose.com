---
title: "System::Net::NetworkInformation::IPGlobalProperties فئة"
linktitle: "IPGlobalProperties"
second_title: "Aspose.Page لـ C++"
description: "System::Net::NetworkInformation::IPGlobalProperties فئة. تمثّل معلومات حول اتصال الشبكة للكمبيوتر المحلي. يجب إنشاء كائنات من هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال تأكيدية. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


يمثل معلومات حول اتصال الشبكة للكمبيوتر المحلي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IPGlobalProperties : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | يعيد النطاق الذي تم تسجيل الكمبيوتر المحلي فيه. |
| virtual [get_HostName](./get_hostname/)() | يعيد اسم المضيف للكمبيوتر المحلي. |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Page for C++](../../)
