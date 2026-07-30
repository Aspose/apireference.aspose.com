---
title: "فئة System::ComponentModel::IContainer"
linktitle: "IContainer"
second_title: "Aspose.Font لـ C++"
description: "فئة System::ComponentModel::IContainer. واجهة وهمية للكود الذي يستخدم IContainer لتتمكن من التجميع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاء وقت التشغيل أو أعطال التحقق. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.componentmodel/icontainer/
---
## IContainer class


واجهة وهمية للكود الذي يستخدم IContainer لتتمكن من التجميع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاء وقت التشغيل أو أعطال التحقق. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IContainer : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Add](./add/)(System::SharedPtr\<IComponent\>) | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
