---
title: "System::Net::HttpWebResponse فئة"
linktitle: "HttpWebResponse"
second_title: "Aspose.Font لـ C++"
description: "System::Net::HttpWebResponse فئة. تمثل استجابة الويب HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2100
url: /ar/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


تمثل استجابة الويب HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق تدفق الاستجابة. |
| [get_CharacterSet](./get_characterset/)() | غير مُنفّذ. |
| [get_ContentLength](./get_contentlength/)() override | معلومات RTTI. |
| [get_ContentType](./get_contenttype/)() override | يعيد نوع MIME للمورد. |
| virtual [get_Cookies](./get_cookies/)() | يعيد ملفات تعريف الارتباط المرتبطة باستجابة الويب. |
| [get_Headers](./get_headers/)() override | يعيد مجموعة الرؤوس المرتبطة بالاستجابة الحالية. |
| virtual [get_Method](./get_method/)() | يعيد طريقة HTTP. |
| [get_ResponseUri](./get_responseuri/)() override | يعيد URI المورد. |
| virtual [get_StatusCode](./get_statuscode/)() | يعيد رمز حالة HTTP المرتبط بالاستجابة الويب. |
| virtual [get_StatusDescription](./get_statusdescription/)() | يعيد تمثيل السلسلة لرمز الحالة. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | يعيد قيمة تشير إلى ما إذا كانت الاستجابة الحالية تدعم الرؤوس. |
| [GetResponseHeader](./getresponseheader/)(String) | يعيد القيمة المقابلة لاسم الرأس المحدد. |
| [GetResponseStream](./getresponsestream/)() override | يعيد تدفق الاستجابة. |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
