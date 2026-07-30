---
title: "System::Collections::IList class"
linktitle: "IList"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::IList class. IList تمثل مجموعة غير عامة من الكائنات يمكن الوصول إليها فرديًا عبر الفهرس في C++."
type: docs
weight: 1000
url: /ar/cpp/system.collections/ilist/
---
## IList class


[IList](./) Represents a non-generic collection of objects that can be individually accessed by index.

```cpp
class IList : public virtual System::Collections::ICollection
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Add](./add/)(SharedPtr\<System::Object\>) | يضيف عنصرًا إلى نهاية القائمة. |
| virtual [Clear](./clear/)() | يزيل جميع العناصر من القائمة. |
| virtual [Contains](./contains/)(SharedPtr\<System::Object\>) const | يتحقق مما إذا كان العنصر موجودًا في القائمة. |
| virtual [get_IsFixedSize](./get_isfixedsize/)() const | يحصل على قيمة تشير إلى ما إذا كانت القائمة ذات حجم ثابت. |
| virtual [idx_get](./idx_get/)(int, int) const | معلومات RTTI. |
| virtual [IndexOf](./indexof/)(SharedPtr\<System::Object\>) const | يحصل على الفهرس الأول للعنصر المحدد. |
| virtual [Insert](./insert/)(int, SharedPtr\<System::Object\>) | يدرج العنصر في القائمة عند الفهرس المحدد. |
| virtual [Remove](./remove/)(SharedPtr\<System::Object\>) | يزيل أول نسخة من العنصر المحدد من القائمة. |
| virtual [RemoveAt](./removeat/)(int) | يزيل العنصر من القائمة عند الفهرس المحدد. |
## انظر أيضًا

* Class [ICollection](../icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
