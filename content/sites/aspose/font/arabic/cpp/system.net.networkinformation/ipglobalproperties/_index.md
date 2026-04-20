---
title: "فئة System::Net::NetworkInformation::IPGlobalProperties"
linktitle: "IPGlobalProperties"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::NetworkInformation::IPGlobalProperties. تمثل معلومات حول اتصال الشبكة للكمبيوتر المحلي. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


تمثل معلومات حول اتصال الشبكة للكمبيوتر المحلي. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IPGlobalProperties : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | يرجع النطاق الذي تم تسجيل الكمبيوتر المحلي فيه. |
| virtual [get_HostName](./get_hostname/)() | يرجع اسم المضيف للكمبيوتر المحلي. |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Font for C++](../../)
