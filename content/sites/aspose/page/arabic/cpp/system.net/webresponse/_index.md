---
title: "فئة System::Net::WebResponse"
linktitle: "WebResponse"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Net::WebResponse. تمثل استجابة ويب. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 4000
url: /ar/cpp/system.net/webresponse/
---
## WebResponse class


تمثل استجابة ويب. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class WebResponse : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | يغلق تدفق الاستجابة. |
| [Dispose](./dispose/)() override | لا يفعل شيئًا. |
| virtual [get_ContentLength](./get_contentlength/)() | معلومات RTTI. |
| virtual [get_ContentType](./get_contenttype/)() | يعيد نوع MIME للموارد. |
| virtual [get_Headers](./get_headers/)() | يعيد مجموعة الرؤوس المرتبطة بالاستجابة الحالية. |
| virtual [get_ResponseUri](./get_responseuri/)() | يعيد عنوان URI للموارد. |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | يعيد قيمة تشير إلى ما إذا كانت الاستجابة الحالية تدعم الرؤوس. |
| virtual [GetResponseStream](./getresponsestream/)() | يعيد تدفق الاستجابة. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
