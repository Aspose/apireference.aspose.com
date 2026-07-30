---
title: "System::Xml::Serialization::XmlSerializerNamespaces class"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces class. يحتوي على مساحات أسماء XML والبادئات التي يستخدمها Serialization::XmlSerializer لإنشاء أسماء مؤهلة في نسخة مستند XML في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


يحتوي على مساحات أسماء XML والبادئات التي يستخدمها [Serialization::XmlSerializer](../xmlserializer/) لتوليد أسماء مؤهلة في نسخة مستند XML.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | يضيف زوجًا من البادئة ومساحة الاسم إلى كائن [Serialization::XmlSerializerNamespaces](./). |
| [get_Count](./get_count/)() | يعيد عدد أزواج البادئة ومساحات الأسماء في المجموعة. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | يعيد المصفوفة التي تحتوي على أزواج البادئة ومساحات الأسماء في كائن [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | يُهيئ نسخة جديدة من الفئة [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | يُهيئ نسخة جديدة من الفئة [Serialization::XmlSerializerNamespaces](./)، باستخدام النسخة المحددة من **[XmlSerializerNamespaces](./)** التي تحتوي على مجموعة أزواج البادئة ومساحات الأسماء. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | يُهيئ نسخة جديدة من الفئة [Serialization::XmlSerializerNamespaces](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
