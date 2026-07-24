---
title: "System::ComponentModel::Component فئة"
linktitle: "Component"
second_title: "Aspose.Page لـ C++"
description: "System::ComponentModel::Component فئة. فئة وهمية لجعل الكود المترجم باستخدام فئة Component قابلًا للتجميع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.componentmodel/component/
---
## Component class


فئة وهمية لجعل الكود المترجم باستخدام الفئة [Component](./) قابلًا للتجميع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل المؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Component](./component/)() | معلومات RTTI. |
| [Dispose](./dispose/)(bool) | دعم نمط القابل للتصرف؛ لا يقوم بأي شيء. |
| [get_DesignMode](./get_designmode/)() | يتحقق مما إذا كان المكوّن في وضع التصميم. |
## انظر أيضًا

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
