---
title: "الفئة System::Collections::Generic::ICollection"
linktitle: "ICollection"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Collections::Generic::ICollection. واجهة مجموعة العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1900
url: /ar/cpp/system.collections.generic/icollection/
---
## ICollection class


واجهة مجموعة العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Add](./add/)(const T\&) | يضيف عنصرًا إلى المجموعة. |
| virtual [Clear](./clear/)() | يحذف جميع العناصر من المجموعة. |
| virtual [Contains](./contains/)(const T\&) const | يتحقق مما إذا كان العنصر موجودًا في المجموعة. |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | ينسخ جميع عناصر المجموعة إلى عناصر المصفوفة الموجودة. |
| virtual [get_Count](./get_count/)() const | يحصل على عدد العناصر في المجموعة. |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | يتحقق مما إذا كانت المجموعة للقراءة فقط. |
| [get_SyncRoot](./get_syncroot/)() const | يحصل على الكائن الذي يتم مزامنة المجموعة من خلاله. |
| [ICollection](./icollection/)() | منشئ افتراضي. |
| [ICollection](./icollection/)(const ICollection\&) | منشئ النسخ. |
| [ICollection](./icollection/)(ICollection\&&) | منشئ نقل. |
| [operator=](./operator=/)(ICollection\&&) | عامل إسناد النقل. |
| [operator=](./operator=/)(const ICollection\&) | عامل إسناد النقل. |
| virtual [Remove](./remove/)(const T\&) | يحذف العنصر من المجموعة. |
| virtual [~ICollection](./~icollection/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ThisType](./thistype/) | اسم نوع المجموعة. |
| [ValueType](./valuetype/) | معلومات RTTI. |

## انظر أيضًا

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
