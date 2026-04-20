---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlAttributeCollection class. يمثل مجموعة من السمات التي يمكن الوصول إليها بالاسم أو الفهرس في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


يمثل مجموعة من السمات التي يمكن الوصول إليها بالاسم أو الفهرس.

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | يدرج السمة المحددة كآخر عقدة في المجموعة. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | ينسخ جميع كائنات [XmlAttribute](../xmlattribute/) من هذه المجموعة إلى المصفوفة المعطاة. |
| [idx_get](./idx_get/)(int32_t) | يعيد السمة ذات الفهرس المحدد. |
| [idx_get](./idx_get/)(const String\&) | يعيد السمة ذات الاسم المحدد. |
| [idx_get](./idx_get/)(const String\&, const String\&) | يعيد السمة ذات الاسم المحلي والمساحة الاسمية المحددة (Uniform Resource Identifier (URI)). |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | يدرج السمة المحددة مباشرةً بعد السمة المرجعية المحددة. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | يدرج السمة المحددة مباشرةً قبل السمة المرجعية المحددة. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | يدرج السمة المحددة كأول عقدة في المجموعة. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | يزيل السمة المحددة من المجموعة. |
| [RemoveAll](./removeall/)() | يزيل جميع السمات من المجموعة. |
| [RemoveAt](./removeat/)(int32_t) | يزيل السمة المقابلة للفهرس المحدد من المجموعة. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | يضيف [XmlNode](../xmlnode/) باستخدام نتيجة [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
