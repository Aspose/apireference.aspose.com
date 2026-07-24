---
title: "فئة Aspose::Page::EPS::XMP::XmpMetadata"
linktitle: "XmpMetadata"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::EPS::XMP::XmpMetadata. توفر إمكانية الوصول إلى تدفق بيانات XMP التعريفية في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


توفر إمكانية الوصول إلى تدفق بيانات [XMP](../) التعريفية.

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | يضيف قيمة إلى البيانات التعريفية. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | يضيف قيمة إلى البيانات التعريفية. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | يضيف زوجًا من المفتاح والقيمة إلى القاموس. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | يضيف قيمة إلى مصفوفة. ستُضاف القيمة في نهاية المصفوفة. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | يضيف قيمة إلى مصفوفة حسب الفهرس المحدد. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | يضيف قيمة مسماة إلى بنية. |
| [Clear](./clear/)() override | يمسح البيانات التعريفية. |
| [Contains](./contains/)(const System::String\&) const | يتحقق مما إذا كان المفتاح موجودًا في البيانات التعريفية. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | يتحقق مما إذا كان زوج المفتاح-القيمة المحدد موجودًا في القاموس. |
| [ContainsKey](./containskey/)(const System::String\&) const override | يحدد ما إذا كان هذا القاموس يحتوي على المفتاح المحدد. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | ينسخ عناصر المجموعة إلى مصفوفة. |
| [get_Count](./get_count/)() const override | يحصل على عدد العناصر في المجموعة. |
| [get_IsFixedSize](./get_isfixedsize/)() const | يتحقق مما إذا كانت المجموعة ذات حجم ثابت. |
| [get_IsReadOnly](./get_isreadonly/)() const override | يتحقق مما إذا كانت المجموعة للقراءة فقط. |
| [get_IsSynchronized](./get_issynchronized/)() | يتحقق مما إذا كانت المجموعة متزامنة. |
| [get_Keys](./get_keys/)() const override | يحصل على مجموعة مفاتيح البيانات التعريفية. |
| [get_NamespaceManager](./get_namespacemanager/)() | يحصل على مدير مساحة الأسماء. |
| [get_SyncRoot](./get_syncroot/)() const | يحصل على كائن مزامنة المجموعة. |
| [get_Values](./get_values/)() const override | يحصل على القيم في البيانات التعريفية. |
| [GetEnumerator](./getenumerator/)() override | يعيد عداد القاموس. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | يعيد URI مساحة الاسم حسب البادئة. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | يعيد البادئة وفقًا لمساحة الاسم URI. |
| [idx_get](./idx_get/)(const System::String\&) const override | يحصل على البيانات من البيانات الوصفية. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | يضبط البيانات من البيانات الوصفية. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | يسجل مساحة الاسم URI. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | يسجل مساحة الاسم URI. |
| [Remove](./remove/)(const System::String\&) override | يزيل الإدخال من البيانات الوصفية. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | يزيل زوج المفتاح/القيمة من المجموعة. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | يضبط القيمة في مصفوفة. سيتم استبدال القيمة السابقة بأخرى جديدة. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | يضبط القيمة المسماة في بنية. القيمة المسماة السابقة، إذا كانت موجودة بالفعل، سيتم استبدالها بأخرى جديدة. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | يحاول العثور على المفتاح في القاموس ويسترجع القيمة إذا تم العثور عليها. |
## انظر أيضًا

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
