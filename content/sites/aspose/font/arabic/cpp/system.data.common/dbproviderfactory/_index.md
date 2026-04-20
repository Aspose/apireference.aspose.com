---
title: "System::Data::Common::DbProviderFactory class"
linktitle: "DbProviderFactory"
second_title: "Aspose.Font لـ C++"
description: "System::Data::Common::DbProviderFactory class. موفر للوصول إلى قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام operator new، لأن ذلك سيسبّب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.data.common/dbproviderfactory/
---
## DbProviderFactory class


موفر للوصول إلى قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام operator new، لأن ذلك سيسبّب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

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
* Library [Aspose.Font for C++](../../)
