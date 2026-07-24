---
title: "فئة System::Xml::Serialization::XmlSerializerNamespaces"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::Serialization::XmlSerializerNamespaces. تحتوي على مساحات الأسماء XML والبادئات التي يستخدمها Serialization::XmlSerializer لإنشاء أسماء مؤهلة في نسخة مستند XML في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


تحتوي على مساحات الأسماء XML والبادئات التي يستخدمها [Serialization::XmlSerializer](../xmlserializer/) لإنشاء أسماء مؤهلة في نسخة مستند XML.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | يضيف زوجاً من البادئة ومساحة الاسم إلى كائن [Serialization::XmlSerializerNamespaces](./). |
| [get_Count](./get_count/)() | يرجع عدد أزواج البادئة ومساحات الأسماء في المجموعة. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | يرجع المصفوفة التي تحتوي على أزواج البادئة ومساحات الأسماء في كائن [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | يهيئ مثيلاً جديداً للفئة [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | يهيئ مثيلاً جديداً للفئة [Serialization::XmlSerializerNamespaces](./)، باستخدام المثيل المحدد من **[XmlSerializerNamespaces](./)** الذي يحتوي على مجموعة أزواج البادئة ومساحات الأسماء. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | يهيئ مثيلاً جديداً للفئة [Serialization::XmlSerializerNamespaces](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
