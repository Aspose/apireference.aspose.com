---
title: "System::Collections::Specialized::NameValueCollection class"
linktitle: "NameValueCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Specialized::NameValueCollection class. مجموعة من مفاتيح String المرتبطة وقيم String التي يمكن الوصول إليها إما بالمفتاح أو بالفهرس في C++."
type: docs
weight: 200
url: /ar/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


مجموعة من مفاتيح [String](../../system/string/) المرتبطة وقيم [String](../../system/string/) التي يمكن الوصول إليها إما بالمفتاح أو بالفهرس.

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const String\&) override | تجاوز طريقة [ICollection](../../system.collections/icollection/) - غير مُنفَّذة. |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | ينسخ الإدخالات في [NameValueCollection](./) المحدد إلى الحالي. |
| virtual [Add](./add/)(const String\&, const String\&) | يضيف إدخالًا بالاسم والقيمة المحددين. |
| [Clear](./clear/)() override | يحذف جميع العناصر. |
| [Contains](./contains/)(const String\&) const override | يتحقق مما إذا كان العنصر موجودًا في المجموعة. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | ينسخ عناصر المجموعة إلى عناصر المصفوفة الموجودة. |
| virtual [Get](./get/)(const String\&) | يحصل على القيم المرتبطة بالمفتاح المحدد. |
| virtual [get_AllKeys](./get_allkeys/)() | يحصل على جميع المفاتيح. |
| [get_Count](./get_count/)() const override | يحصل على عدد أزواج المفتاح/القيمة. |
| virtual [get_Keys](./get_keys/)() | يحصل على جميع المفاتيح. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد للتنقل عبر المجموعة. |
| virtual [GetValues](./getvalues/)(const String\&) | يحصل على القيم المرتبطة بالمفتاح المحدد. |
| [HasKeys](./haskeys/)() | يحصل على قيمة تشير إلى ما إذا كان [NameValueCollection](./) يحتوي على مفاتيح ليست فارغة. |
| [idx_get](./idx_get/)(const String\&) | يحصل على القيمة في الفهرس المحدد. |
| [idx_set](./idx_set/)(const String\&, const String\&) | يضبط قيمة إدخال. |
| [NameValueCollection](./namevaluecollection/)() | ينشئ مثيلاً جديداً من الفئة [NameValueCollection](./) وهو فارغ. |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | ينسخ الإدخالات من [NameValueCollection](./) المحدد إلى [NameValueCollection](./) جديد. |
| [Remove](./remove/)(const String\&) override | يزيل العنصر المحدد. |
| virtual [Set](./set/)(const String\&, const String\&) | يضبط قيمة إدخال. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## انظر أيضًا

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
