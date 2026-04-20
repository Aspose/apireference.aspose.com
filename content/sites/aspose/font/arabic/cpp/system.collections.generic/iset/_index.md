---
title: "فئة System::Collections::Generic::ISet"
linktitle: "ISet"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::ISet. واجهة مجموعة تحتوي على مجموعة من العناصر الفريدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2700
url: /ar/cpp/system.collections.generic/iset/
---
## ISet class


واجهة مجموعة تحتوي على مجموعة من العناصر الفريدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أعطال التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | يزيل مجموعة من العناصر. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | يزيل العناصر غير الموجودة في حاوية مختلفة. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة الحالية مجموعة جزئية صريحة للحاوية الأخرى. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة الحالية مجموعة شاملة صريحة للحاوية الأخرى. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة الحالية مجموعة جزئية للحاوية الأخرى. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة الحالية مجموعة شاملة للحاوية الأخرى. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة تتقاطع مع الحاوية الأخرى. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة والحاوية تحتويان على نفس العناصر. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | يحسب الاستثناء المتناظر بين حاويتين. يزيل جميع العناصر الموجودة في كلتا الحاويتين، وفي الوقت نفسه يضيف جميع العناصر الموجودة في **other** ولكن ليست في المجموعة الحالية. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | يضيف العناصر من المجموعة المحددة التي لم تُوجد بعد في المجموعة الحالية. |
| virtual [~ISet](./~iset/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | معلومات RTTI. |

## انظر أيضًا

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
