---
title: "System::Windows::Forms::Control::ControlCollection class"
linktitle: "ControlCollection"
second_title: "Aspose.Page لـ C++"
description: "System::Windows::Forms::Control::ControlCollection class. مجموعة من عناصر التحكم. غير مُنفّذة في C++."
type: docs
weight: 200
url: /ar/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


مجموعة من عناصر التحكم. غير مُنفّذة.

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | يضيف عنصر التحكم إلى المجموعة. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | يضيف عدة عناصر تحكم إلى المجموعة. |
| [Clear](./clear/)() override | يحذف جميع عناصر التحكم من المجموعة. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | يتحقق مما إذا كان عنصر التحكم المحدد موجودًا في المجموعة. |
| virtual [ContainsKey](./containskey/)(System::String) const | يتحقق مما إذا كان عنصر التحكم ذو الاسم المحدد موجودًا في المجموعة. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | منشئ. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | ينسخ محتويات المجموعة إلى عناصر مصفوفة موجودة. |
| [Find](./find/)(const System::String\&, bool) const | يبحث عن عنصر التحكم المسمى في المجموعة. يختارياً يتحقق من مجموعات عناصر التحكم المحتواة بشكل متكرر. |
| [get_Count](./get_count/)() const override | يحصل على عدد عناصر التحكم في المجموعة. |
| [get_Owner](./get_owner/)() const | يحصل على عنصر التحكم المالك للمجموعة. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | يبحث عن عنصر التحكم المحدد. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | يبحث عن عنصر التحكم المحدد. |
| [GetEnumerator](./getenumerator/)() override | يسترجع المُعدِّد للتنقل عبر المجموعة. |
| [idx_get](./idx_get/)(int) const override | الوصول عبر الفهرس. |
| virtual [idx_get](./idx_get/)(System::String) const | وصول حسب الاسم. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | الوصول عبر الفهرس. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | وصول حسب الاسم. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | يبحث عن التحكم في المجموعة. |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | يبحث عن التحكم المسمى في المجموعة. |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | يدرج التحكم في المجموعة. |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | يزيل التحكم من المجموعة. |
| [RemoveAt](./removeat/)(int) override | يزيل التحكم من المجموعة. |
| virtual [RemoveByKey](./removebykey/)(System::String) | يزيل التحكم من المجموعة. |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | ينقل التحكم إلى موضع جديد. |
## انظر أيضًا

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Page for C++](../../../)
