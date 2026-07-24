---
title: "System::IEquatable فئة"
linktitle: "IEquatable"
second_title: "Aspose.Page لـ C++"
description: "System::IEquatable فئة. تُعرّف طريقة تحدد مساواة كائنين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3700
url: /ar/cpp/system/iequatable/
---
## IEquatable class


تُعرّف طريقة تحدد مساواة كائنين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائنات المقارنة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Equals](./equals/)(T) | يحدد ما إذا كان الكائن الحالي والكائن المحدد متساويين. |

## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
