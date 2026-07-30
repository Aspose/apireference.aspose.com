---
title: "System::Net::WebResponse فئة"
linktitle: "WebResponse"
second_title: "Aspose.Font لـ C++"
description: "System::Net::WebResponse فئة. تمثل استجابة ويب. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 4000
url: /ar/cpp/system.net/webresponse/
---
## WebResponse class


تمثل استجابة ويب. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class WebResponse : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | يغلق تدفق الاستجابة. |
| [Dispose](./dispose/)() override | لا يفعل شيئًا. |
| virtual [get_ContentLength](./get_contentlength/)() | معلومات RTTI. |
| virtual [get_ContentType](./get_contenttype/)() | يعيد نوع MIME للمورد. |
| virtual [get_Headers](./get_headers/)() | يعيد مجموعة الرؤوس المرتبطة بالاستجابة الحالية. |
| virtual [get_ResponseUri](./get_responseuri/)() | يعيد URI المورد. |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | يعيد قيمة تشير إلى ما إذا كانت الاستجابة الحالية تدعم الرؤوس. |
| virtual [GetResponseStream](./getresponsestream/)() | يعيد تدفق الاستجابة. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
