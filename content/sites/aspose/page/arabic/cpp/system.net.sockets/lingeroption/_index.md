---
title: "System::Net::Sockets::LingerOption class"
linktitle: "LingerOption"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Sockets::LingerOption class. يحدد ما إذا كان المقبس سيظل متصلاً بعد استدعاء دالتي Close() أو Close(). كما يحدد الفترة التي سيظل فيها المقبس متصلاً إذا استمر إرسال البيانات. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


يحدد ما إذا كان المقبس سيظل متصلاً بعد استدعاء دالتي Close() أو Close(). كما يحدد الفترة التي سيظل فيها المقبس متصلاً إذا استمر إرسال البيانات. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class LingerOption : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Enabled](./get_enabled/)() | معلومات RTTI. |
| [get_LingerTime](./get_lingertime/)() | يحصل على مهلة التأخير بالثواني. |
| [LingerOption](./lingeroption/)(bool, int32_t) | ينشئ نسخة جديدة. |
| [set_Enabled](./set_enabled/)(bool) | يضبط قيمة تشير إلى ما إذا كان المقبس سيؤخر الإغلاق في محاولة لإرسال جميع البيانات المعلقة. |
| [set_LingerTime](./set_lingertime/)(int32_t) | يضبط مهلة التأخير بالثواني. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
