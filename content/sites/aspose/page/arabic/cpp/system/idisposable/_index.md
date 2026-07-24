---
title: "فئة System::IDisposable"
linktitle: "IDisposable"
second_title: "Aspose.Page لـ C++"
description: "فئة System::IDisposable. تُعرّف طريقة تُطلق الموارد المملوكة للكائن الحالي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3600
url: /ar/cpp/system/idisposable/
---
## IDisposable class


يُعرّف طريقة تُطلق الموارد المملوكة للكائن الحالي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IDisposable : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Dispose](./dispose/)() | لا يفعل شيئًا. |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
