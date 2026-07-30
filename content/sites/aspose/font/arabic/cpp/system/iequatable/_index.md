---
title: "الفئة System::IEquatable"
linktitle: "IEquatable"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::IEquatable. تُعرّف طريقة تحدد مساواة كائنين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3700
url: /ar/cpp/system/iequatable/
---
## IEquatable class


تُعرّف طريقة تحدد مساواة كائنين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائنات المقارنة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Equals](./equals/)(T) | يحدد ما إذا كانت الكائنات الحالية والمحددة متساوية. |

## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
