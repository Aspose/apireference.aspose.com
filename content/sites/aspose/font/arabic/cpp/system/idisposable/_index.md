---
title: "فئة System::IDisposable"
linktitle: "IDisposable"
second_title: "Aspose.Font لـ C++"
description: "فئة System::IDisposable. تُعرّف طريقة تُطلق الموارد المملوكة للكائن الحالي. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو فشل في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3600
url: /ar/cpp/system/idisposable/
---
## IDisposable class


تُعرّف طريقة تُطلق الموارد المملوكة للكائن الحالي. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو فشل في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

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
* Library [Aspose.Font for C++](../../)
