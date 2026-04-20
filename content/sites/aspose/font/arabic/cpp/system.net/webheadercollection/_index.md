---
title: "System::Net::WebHeaderCollection class"
linktitle: "WebHeaderCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Net::WebHeaderCollection class. تمثّل مجموعة رؤوس البروتوكول. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3600
url: /ar/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


يمثّل مجموعة رؤوس البروتوكول. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class WebHeaderCollection : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(String, String) | يضيف الزوج المحدد من اسم الرأس وقيمة الرأس إلى المجموعة. |
| [Add](./add/)(HttpResponseHeader, String) | يضيف الزوج المحدد من الرأس وقيمة الرأس إلى المجموعة. |
| [Add](./add/)(HttpRequestHeader, String) | يضيف الزوج المحدد من الرأس وقيمة الرأس إلى المجموعة. |
| [AllKeys](./allkeys/)() | يعيد مجموعة من أسماء الرؤوس المخزنة في المجموعة. |
| [get_Count](./get_count/)() const | يعيد عدد العناصر في المجموعة. |
| [get_Keys](./get_keys/)() | يعيد مجموعة من أسماء الرؤوس المخزنة في المجموعة. |
| [GetKey](./getkey/)(int) | يعيد المفتاح في الفهرس المحدد. |
| [GetValues](./getvalues/)(String) | يعيد مجموعة قيم الرؤوس. |
| [idx_get](./idx_get/)(HttpRequestHeader) | يحصل على قيمة الرأس باستخدام رأس الطلب المحدد. |
| [idx_get](./idx_get/)(HttpResponseHeader) | يحصل على قيمة الرأس باستخدام رأس الاستجابة المحدد. |
| [idx_get](./idx_get/)(String) | يحصل على قيمة الرأس باستخدام اسم الرأس المحدد. |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | يضبط قيمة الرأس للرأس المحدد. |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | يضبط قيمة الرأس باستخدام رأس الاستجابة المحدد. |
| [idx_set](./idx_set/)(String, String) | يضبط قيمة الرأس باستخدام اسم الرأس المحدد. |
| static [IsRestricted](./isrestricted/)(const String\&) | يفحص ما إذا كان يمكن ضبط رأس HTTP المحدد للطلب. |
| [Remove](./remove/)(String) | يزيل الرأس باستخدام اسم الرأس المحدد. |
| [Remove](./remove/)(HttpResponseHeader) | يزيل رأس الاستجابة المحدد. |
| [Remove](./remove/)(HttpRequestHeader) | يزيل رأس الطلب المحدد. |
| [Set](./set/)(String, String) | يضبط قيمة الرأس المحدد. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| [WebHeaderCollection](./webheadercollection/)() | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
