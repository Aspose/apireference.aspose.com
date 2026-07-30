---
title: "فئة System::Data::Common::DbCommand"
linktitle: "DbCommand"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Data::Common::DbCommand. أمر قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.data.common/dbcommand/
---
## DbCommand class


أمر قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DbCommand : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | ينفّذ أمر غير استعلام. |
| virtual [ExecuteReader](./executereader/)() | ينفّذ أمر استعلام. |
| virtual [get_CommandText](./get_commandtext/)() const | معلومات RTTI. |
| virtual [get_Connection](./get_connection/)() const | يحصل على اتصال قاعدة البيانات المرتبط بالأمر. |
| virtual [set_CommandText](./set_commandtext/)(String) const | يضبط نص أمر قاعدة البيانات. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | يحصل على اتصال قاعدة البيانات المرتبط بالأمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
