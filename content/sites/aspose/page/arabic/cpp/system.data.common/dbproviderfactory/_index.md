---
title: "فئة System::Data::Common::DbProviderFactory"
linktitle: "DbProviderFactory"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Data::Common::DbProviderFactory. موفر للوصول إلى قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.data.common/dbproviderfactory/
---
## DbProviderFactory class


موفر للوصول إلى قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DbProviderFactory : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CreateCommand](./createcommand/)() | معلومات RTTI. |
| virtual [CreateConnection](./createconnection/)() | ينشئ اتصال قاعدة البيانات. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
