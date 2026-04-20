---
title: "System::Xml::Schema::XmlSchemaCollection class"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaCollection class. يحتوي على ذاكرة مخبأة لتعريفات لغة مخطط XML (XSD) ومخططات XML-Data Reduced (XDR) في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


يحتوي على ذاكرة مخبأة لتعريفات XML [Schema](../) (XSD) ومخططات XML-Data Reduced (XDR).

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | يضيف المخطط الموجود على عنوان URL المحدد إلى مجموعة المخططات. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | يضيف المخطط الموجود في [XmlReader](../../system.xml/xmlreader/) إلى مجموعة المخططات. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يضيف المخطط الموجود في [XmlReader](../../system.xml/xmlreader/) إلى مجموعة المخططات. يُستخدم [XmlResolver](../../system.xml/xmlresolver/) المحدد لحل أي موارد خارجية. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | يضيف [XmlSchema](../xmlschema/) إلى المجموعة. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يضيف [XmlSchema](../xmlschema/) إلى المجموعة. يُستخدم [XmlResolver](../../system.xml/xmlresolver/) المحدد لحل أي مراجع خارجية. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | يضيف جميع المساحات الاسمية المعرفة في المجموعة المعطاة (بما في ذلك المخططات المرتبطة بها) إلى هذه المجموعة. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | يعيد قيمة تشير إلى ما إذا كان **targetNamespace** للمخطط [XmlSchema](../xmlschema/) المحدد موجودًا في المجموعة. |
| [Contains](./contains/)(const String\&) | يعيد قيمة تشير إلى ما إذا كان مخطط بالمساحة الاسمية المحددة موجودًا في المجموعة. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | ينسخ جميع كائنات [XmlSchema](../xmlschema/) من هذه المجموعة إلى المصفوفة المعطاة بدءًا من الفهرس المحدد. |
| [get_Count](./get_count/)() | يعيد عدد المساحات الاسمية المعرفة في هذه المجموعة. |
| [get_NameTable](./get_nametable/)() | يعيد جدول الأسماء [XmlNameTable](../../system.xml/xmlnametable/) الافتراضي المستخدم بواسطة [XmlSchemaCollection](./) عند تحميل مخططات جديدة. |
| [GetEnumerator](./getenumerator/)() override | يوفر دعمًا للتكرار عبر مجموعة المخططات. |
| [idx_get](./idx_get/)(const String\&) | يعيد المخطط [XmlSchema](../xmlschema/) المرتبط بعنوان URI للمساحة الاسمية المعطاة. |
| [XmlSchemaCollection](./xmlschemacollection/)() | ينشئ نسخة جديدة من الفئة [XmlSchemaCollection](./). |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | ينشئ نسخة جديدة من الفئة [XmlSchemaCollection](./) باستخدام جدول الأسماء [XmlNameTable](../../system.xml/xmlnametable/) المحدد. يُستخدم [XmlNameTable](../../system.xml/xmlnametable/) عند تحميل المخططات. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات


## Deprecated
فئة XmlSchemaCollection قديمة. استخدم XmlSchemaSet بدلاً من ذلك.

يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
