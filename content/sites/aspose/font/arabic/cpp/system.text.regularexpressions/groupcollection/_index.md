---
title: "فئة System::Text::RegularExpressions::GroupCollection"
linktitle: "GroupCollection"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Text::RegularExpressions::GroupCollection. قائمة مجموعات الالتقاط في مطابقة واحدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


قائمة مجموعات الالتقاط في مطابقة واحدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | يعطل إضافة عنصر إلى التجميع. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | يضيف مجموعة إلى التجميع. |
| [Clear](./clear/)() override | يعطل حذف العناصر من التجميع. |
| [get_Item](./get_item/)(int) const | الوصول إلى [Group](../group/). |
| [get_Item](./get_item/)(const String\&) const | الوصول إلى [Group](../group/). |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | المُنشئ. |
| virtual [idx_get](./idx_get/)(String) const | الوصول إلى [Group](../group/). |
| [idx_get](./idx_get/)(int) const override | الوصول إلى [Group](../group/). |
| [IsReadOnly](./isreadonly/)() const | يُعلِّم المجموعة كقراءة فقط. |
| [operator[]](./operator[]/)(const String\&) const | الوصول إلى [Group](../group/). |
| [operator[]](./operator[]/)(int) | الوصول إلى [Group](../group/). |
| [operator[]](./operator[]/)(int) const | الوصول إلى [Group](../group/). |
| [Remove](./remove/)(const GroupPtr\&) override | يعطل إزالة عنصر من التجميع. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Base](./base/) | فئة [Base](./base/). |
## انظر أيضًا

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
