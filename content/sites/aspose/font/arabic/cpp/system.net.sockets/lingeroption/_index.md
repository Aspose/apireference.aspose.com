---
title: "System::Net::Sockets::LingerOption فئة"
linktitle: "LingerOption"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::LingerOption فئة. يحدد ما إذا كان المقبس سيظل متصلاً بعد استدعاء دالة Close() أو طرق Close(). كما يحدد الفترة التي سيظل فيها المقبس متصلاً إذا استمر إرسال البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


يحدد ما إذا كان المقبس سيظل متصلاً بعد استدعاء دالة Close() أو طرق Close(). كما يحدد الفترة التي سيظل فيها المقبس متصلاً إذا استمر إرسال البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class LingerOption : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Enabled](./get_enabled/)() | معلومات RTTI. |
| [get_LingerTime](./get_lingertime/)() | يحصل على مهلة تأخير بالثواني. |
| [LingerOption](./lingeroption/)(bool, int32_t) | ينشئ نسخة جديدة. |
| [set_Enabled](./set_enabled/)(bool) | يضبط قيمة تشير إلى ما إذا كان المقبس سيؤخر الإغلاق في محاولة لإرسال جميع البيانات المعلقة. |
| [set_LingerTime](./set_lingertime/)(int32_t) | يضبط مهلة تأخير بالثواني. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
