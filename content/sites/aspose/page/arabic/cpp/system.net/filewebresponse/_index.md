---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Page لـ C++"
description: "System::Net::FileWebResponse class. يوفر تنفيذًا لفئة WebResponse المجردة للعمل مع نظام الملفات. يجب إنشاء كائنات هذه الفئة باستخدام دالة System::MakeObject() فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.net/filewebresponse/
---
## FileWebResponse class


يوفر تنفيذًا لفئة [WebResponse](../webresponse/) المجردة للعمل مع نظام الملفات. يجب إنشاء كائنات هذه الفئة باستخدام دالة [System::MakeObject()](../../system/makeobject/) فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق تدفق الاستجابة. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | ينشئ نسخة جديدة. |
| [get_ContentLength](./get_contentlength/)() override | معلومات RTTI. |
| [get_ContentType](./get_contenttype/)() override | يعيد نوع MIME للموارد. |
| [get_Headers](./get_headers/)() override | يعيد مجموعة الرؤوس المرتبطة بالاستجابة الحالية. |
| [get_ResponseUri](./get_responseuri/)() override | يعيد عنوان URI للموارد. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | يعيد قيمة تشير إلى ما إذا كانت الاستجابة الحالية تدعم الرؤوس. |
| [GetResponseStream](./getresponsestream/)() override | يعيد تدفق الاستجابة. |
## انظر أيضًا

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
