---
title: "System::Collections::IListImplRefType class"
linktitle: "IListImplRefType"
second_title: "Aspose.Page لـ C++"
description: "System::Collections::IListImplRefType class. نموذج أولي ينفّذ واجهة System::Collections::IList على كائن System::Collections::Generic::List. تنفيذ للأنواع المرجعية في C++."
type: docs
weight: 1100
url: /ar/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


نموذج أولي ينفّذ واجهة [System::Collections::IList](../ilist/) على كائن [System::Collections::Generic::List](../../system.collections.generic/list/). تنفيذ للأنواع المرجعية.

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | يضيف عنصرًا إلى نهاية القائمة. |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | تحويل مرجع النوع إلى قيمة كائن إلى كائن. |
| [Clear](./clear/)() override | يحذف جميع العناصر. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | يتحقق مما إذا كان العنصر موجودًا في القائمة. |
| [get_Count](./get_count/)() const override | تنفيذ طرق [ICollection.get_Count()](../icollection/get_count/) يحصل على عدد العناصر في المجموعة. |
| [GetEnumerator](./getenumerator/)() override | تنفيذ [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) يُرجع مُعددًا يتنقل عبر المجموعة. |
| [idx_get](./idx_get/)(int, int) const override | يحصل على العنصر في الفهرس المحدد. |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | ينشئ نسخة جديدة من الكائن. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | يحصل على فهرس الظهور الأول للعنصر في الحاوية. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | يدخل العنصر في الموضع المحدد، مع إزاحة العناصر الأخرى. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | يزيل أول نسخة من العنصر المحدد من القائمة. |
| [RemoveAt](./removeat/)(int) override | يزيل العنصر في الموضع المحدد. |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | تحويل قيمة الكائن إلى مرجع نوع معين. |
## انظر أيضًا

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
