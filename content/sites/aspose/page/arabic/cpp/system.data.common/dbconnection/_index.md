---
title: "فئة System::Data::Common::DbConnection"
linktitle: "DbConnection"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Data::Common::DbConnection. اتصال قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.data.common/dbconnection/
---
## DbConnection class


اتصال قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DbConnection : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | معلومات RTTI. |
| virtual [Open](./open/)() | يفتح اتصالاً بقاعدة البيانات. |
| virtual [set_ConnectionString](./set_connectionstring/)(String) const | يضبط معلومات الاتصال (مثال: الخادم والمنفذ). |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
