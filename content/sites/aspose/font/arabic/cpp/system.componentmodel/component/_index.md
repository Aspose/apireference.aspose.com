---
title: "System::ComponentModel::Component class"
linktitle: "Component"
second_title: "Aspose.Font لـ C++"
description: "System::ComponentModel::Component class. فئة تجريبية لجعل الكود المترجم الذي يستخدم فئة Component قابلاً للتجميع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.componentmodel/component/
---
## Component class


فئة تجريبية لجعل الكود المترجم الذي يستخدم فئة [Component](./) قابلاً للتجميع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Component](./component/)() | معلومات RTTI. |
| [Dispose](./dispose/)(bool) | دعم نمط القابل للتصرف؛ لا يفعل شيئًا. |
| [get_DesignMode](./get_designmode/)() | يتحقق مما إذا كان المكوّن في وضع التصميم. |
## انظر أيضًا

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
