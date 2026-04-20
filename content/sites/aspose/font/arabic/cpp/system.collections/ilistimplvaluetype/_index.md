---
title: "فئة System::Collections::IListImplValueType"
linktitle: "IListImplValueType"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::IListImplValueType. نموذج أولي يُنفّذ واجهة System::Collections::IList على كائن System::Collections::Generic::List. تنفيذ لأنواع القيم في C++."
type: docs
weight: 1200
url: /ar/cpp/system.collections/ilistimplvaluetype/
---
## IListImplValueType class


نموذج أولي يُنفّذ واجهة [System::Collections::IList](../ilist/) على كائن [System::Collections::Generic::List](../../system.collections.generic/list/). تنفيذ لأنواع القيم.

```cpp
template<typename T>class IListImplValueType : public virtual System::Collections::IList
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | يضيف العنصر إلى نهاية القائمة. |
| [Clear](./clear/)() override | يحذف جميع العناصر. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | يتحقق مما إذا كان العنصر موجودًا في القائمة. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) تنفيذ الطريقة يحصل على عدد العناصر في المجموعة. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) تنفيذ يُعيد مُعدِّدًا يتنقل عبر مجموعة. |
| [idx_get](./idx_get/)(int, int) const override | يحصل على العنصر في الفهرس المحدد. |
| [IListImplValueType](./ilistimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IList\<T\>\>) | ينشئ نسخة جديدة من الكائن. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | يحصل على فهرس الظهور الأول للعنصر في الحاوية. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | يدرج العنصر في الموضع المحدد، مع إزاحة العناصر الأخرى. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | يزيل النسخة الأولى من العنصر المحدد من القائمة. |
| [RemoveAt](./removeat/)(int) override | يزيل العنصر في الموضع المحدد. |
## انظر أيضًا

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
