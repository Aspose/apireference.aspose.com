---
title: "System::IComparable class"
linktitle: "IComparable"
second_title: "Aspose.Font لـ C++"
description: "System::IComparable class. يعرّف طريقة تقارن كائنين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أخطاءً في التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 3300
url: /ar/cpp/system/icomparable/
---
## IComparable class


يعرّف طريقة تقارن كائنين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أخطاءً في التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../smartptr/) واستخدم هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائنات التي يُقارن معها الكائن الحالي |
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | يقارن الكائن الحالي مع الكائن المحدد. |

## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
