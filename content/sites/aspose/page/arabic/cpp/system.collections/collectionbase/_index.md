---
title: "الفئة System::Collections::CollectionBase"
linktitle: "CollectionBase"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Collections::CollectionBase. توفر فئة أساسية مجردة لمجموعة ذات نوع محدد في C++."
type: docs
weight: 300
url: /ar/cpp/system.collections/collectionbase/
---
## CollectionBase class


يوفر فئة أساسية مجردة لمجموعة ذات نوعية محددة.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| Parameter | الوصف |
| --- | --- |
| T | نوع عناصر المجموعة |
## Nested classes

* Class [ListImpl](./listimpl/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clear](./clear/)() | يزيل جميع الكائنات من نسخة المجموعة. لا يمكن تجاوز هذه الطريقة. |
| [get_Capacity](./get_capacity/)() | يرجع عدد العناصر التي يمكن للمجموعة احتواؤها. |
| [get_Count](./get_count/)() | يرجع عدد العناصر الموجودة في نسخة المجموعة. لا يمكن تجاوز هذه الطريقة. |
| [GetEnumerator](./getenumerator/)() override | يرجع مُعدِّدًا يتنقل عبر نسخة المجموعة. |
| [RemoveAt](./removeat/)(int32_t) | يزيل العنصر عند الفهرس المحدد لنسخة المجموعة. هذه الطريقة غير قابلة للتجاوز. |
| [set_Capacity](./set_capacity/)(int32_t) | يضبط عدد العناصر التي يمكن للمجموعة احتواؤها. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن الوسيط القالب رقم n كإشارة ضعيفة (بدلاً من المشتركة). يسمح بتبديل المؤشرات في الحاويات إلى وضع الضعيفة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |

## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
