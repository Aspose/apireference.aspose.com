---
title: "System::Windows::Forms::Control::ControlCollection class"
linktitle: "ControlCollection"
second_title: "Aspose.Font لـ C++"
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
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | يضيف عنصر تحكم إلى المجموعة. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | يضيف عدة عناصر تحكم إلى المجموعة. |
| [Clear](./clear/)() override | يحذف جميع عناصر التحكم من المجموعة. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | يتحقق مما إذا كان عنصر التحكم المحدد موجودًا في المجموعة. |
| virtual [ContainsKey](./containskey/)(System::String) const | يتحقق مما إذا كان التحكم بالاسم المحدد موجودًا في المجموعة. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | المُنشئ. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | ينسخ محتويات المجموعة إلى عناصر المصفوفة الموجودة. |
| [Find](./find/)(const System::String\&, bool) const | يبحث عن التحكم المسمى في المجموعة. يختبر اختياريًا مجموعات التحكمات المحتواة بشكل متكرر. |
| [get_Count](./get_count/)() const override | يحصل على عدد التحكمات في المجموعة. |
| [get_Owner](./get_owner/)() const | يحصل على التحكم المالك للمجموعة. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | يبحث عن تحكم محدد. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | يبحث عن تحكم محدد. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد للتنقل عبر المجموعة. |
| [idx_get](./idx_get/)(int) const override | مُدخل بالفهارس. |
| virtual [idx_get](./idx_get/)(System::String) const | مُدخل بالاسم. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | مُدخل بالفهارس. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | مُدخل بالاسم. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | يبحث عن التحكم في المجموعة. |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | يبحث عن التحكم المسمى في المجموعة. |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | يدرج التحكم في المجموعة. |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | يزيل التحكم من المجموعة. |
| [RemoveAt](./removeat/)(int) override | يزيل التحكم من المجموعة. |
| virtual [RemoveByKey](./removebykey/)(System::String) | يزيل التحكم من المجموعة. |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | ينقل التحكم إلى موقع جديد. |
## انظر أيضًا

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Font for C++](../../../)
