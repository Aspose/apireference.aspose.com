---
title: "فئة System::Collections::CollectionBase"
linktitle: "CollectionBase"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::CollectionBase. توفر فئة أساسية مجردة لمجموعة ذات نوعية قوية في C++."
type: docs
weight: 300
url: /ar/cpp/system.collections/collectionbase/
---
## CollectionBase class


يوفر فئة أساسية مجردة لمجموعة ذات نوعية قوية.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع عناصر المجموعة |
## Nested classes

* Class [ListImpl](./listimpl/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clear](./clear/)() | يزيل جميع الكائنات من نسخة المجموعة. لا يمكن تجاوز هذه الطريقة. |
| [get_Capacity](./get_capacity/)() | يعيد عدد العناصر التي يمكن للمجموعة احتواؤها. |
| [get_Count](./get_count/)() | يعيد عدد العناصر الموجودة في نسخة المجموعة. لا يمكن تجاوز هذه الطريقة. |
| [GetEnumerator](./getenumerator/)() override | يعيد كائن تعداد يتنقل عبر نسخة المجموعة. |
| [RemoveAt](./removeat/)(int32_t) | يزيل العنصر عند الفهرس المحدد في نسخة المجموعة. هذه الطريقة غير قابلة للتجاوز. |
| [set_Capacity](./set_capacity/)(int32_t) | يضبط عدد العناصر التي يمكن للمجموعة احتواؤها. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن معامل القالب الـ n'th إلى مؤشر ضعيف (بدلاً من المشترك). يسمح بتبديل المؤشرات في الحاويات إلى الوضع الضعيف. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |

## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
