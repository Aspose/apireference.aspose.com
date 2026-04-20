---
title: "System::Net::IWebProxy فئة"
linktitle: "IWebProxy"
second_title: "Aspose.Font لـ C++"
description: "System::Net::IWebProxy فئة. تُستخدم هذه الواجهة لتنفيذ وصول الوكيل إلى فئة WebRequest. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2700
url: /ar/cpp/system.net/iwebproxy/
---
## IWebProxy class


تُستخدم هذه الواجهة لتنفيذ وصول الوكيل إلى فئة [WebRequest](../webrequest/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IWebProxy : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | معلومات RTTI. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | يرجع URI الوكيل. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | يرجع قيمة تشير إلى ما إذا كان لا يجب استخدام الوكيل للمضيف المحدد. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | يضبط بيانات الاعتماد للمصادقة على خادم الوكيل. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
