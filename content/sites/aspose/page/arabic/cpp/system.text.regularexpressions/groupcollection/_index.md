---
title: "فئة System::Text::RegularExpressions::GroupCollection"
linktitle: "GroupCollection"
second_title: "Aspose.Page لـ C++"
description: "System::Text::RegularExpressions::GroupCollection class. قائمة مجموعات الالتقاط في مطابقة واحدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


قائمة مجموعات الالتقاط في مطابقة واحدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | يعطل إضافة عنصر إلى المجموعة. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | يضيف مجموعة إلى المجموعة. |
| [Clear](./clear/)() override | يعطل إسقاط العناصر من المجموعة. |
| [get_Item](./get_item/)(int) const | [Group](../group/) مُستَخدم. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) مُستَخدم. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | منشئ. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) مُستَخدم. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) مُستَخدم. |
| [IsReadOnly](./isreadonly/)() const | يُعلِّم المجموعة كقراءة‑فقط. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) مُستَخدم. |
| [operator[]](./operator[]/)(int) | [Group](../group/) مُستَخدم. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) مُستَخدم. |
| [Remove](./remove/)(const GroupPtr\&) override | يعطل إزالة عنصر من المجموعة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Base](./base/) | الفئة [Base](./base/). |
## انظر أيضًا

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
