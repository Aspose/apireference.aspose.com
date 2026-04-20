---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Font لـ C++"
description: "System::Net::FileWebResponse class. يوفر تنفيذًا لفئة WebResponse المجردة للعمل مع نظام الملفات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.net/filewebresponse/
---
## FileWebResponse class


يوفر تنفيذًا لفئة [WebResponse](../webresponse/) المجردة للعمل مع نظام الملفات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق تدفق الاستجابة. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | ينشئ نسخة جديدة. |
| [get_ContentLength](./get_contentlength/)() override | معلومات RTTI. |
| [get_ContentType](./get_contenttype/)() override | يعيد نوع MIME للمورد. |
| [get_Headers](./get_headers/)() override | يعيد مجموعة الرؤوس المرتبطة بالاستجابة الحالية. |
| [get_ResponseUri](./get_responseuri/)() override | يعيد URI المورد. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | يعيد قيمة تشير إلى ما إذا كانت الاستجابة الحالية تدعم الرؤوس. |
| [GetResponseStream](./getresponsestream/)() override | يعيد تدفق الاستجابة. |
## انظر أيضًا

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
