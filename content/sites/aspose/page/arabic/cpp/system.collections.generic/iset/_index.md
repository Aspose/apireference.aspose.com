---
title: "الفئة System::Collections::Generic::ISet"
linktitle: "ISet"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Collections::Generic::ISet. واجهة مجموعة تحتوي على مجموعة من العناصر الفريدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. يجب دائماً تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2700
url: /ar/cpp/system.collections.generic/iset/
---
## ISet class


واجهة مجموعة تحتوي على مجموعة من العناصر الفريدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. يجب دائماً تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| Parameter | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | يزيل مجموعة من العناصر. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | يزيل العناصر غير الموجودة في حاوية مختلفة. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة الحالية مجموعة فرعية صريحة للحاوية الأخرى. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة الحالية مجموعة عليا صريحة للحاوية الأخرى. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة الحالية مجموعة فرعية للحاوية الأخرى. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة الحالية مجموعة عليا للحاوية الأخرى. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة تتقاطع مع الحاوية الأخرى. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | يتحقق مما إذا كانت المجموعة والحاوية تحتويان على نفس العناصر. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | يحسب الاستثناء المتماثل بين حاويتين. يزيل جميع العناصر الموجودة في كلتا الحاويتين، وفي الوقت نفسه يضيف جميع العناصر الموجودة في **other** ولكن غير الموجودة في المجموعة الحالية. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | يضيف عناصر من المجموعة المحددة غير موجودة بعد في المجموعة الحالية. |
| virtual [~ISet](./~iset/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | معلومات RTTI. |

## انظر أيضًا

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
