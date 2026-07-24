---
title: "فئة System::Xml::Schema::XmlSchemaCollection"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaCollection. تحتوي على ذاكرة مؤقتة لتعريفات مخططات XML Schema (XSD) وXML-Data Reduced (XDR) في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


تحتوي على ذاكرة مؤقتة لتعريف مخطط XML [Schema](../) (XSD) ومخططات XML-Data Reduced (XDR).

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | يضيف المخطط الموجود عبر عنوان URL المحدد إلى مجموعة المخططات. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | يضيف المخطط الموجود في [XmlReader](../../system.xml/xmlreader/) إلى مجموعة المخططات. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يضيف المخطط الموجود في [XmlReader](../../system.xml/xmlreader/) إلى مجموعة المخططات. يُستخدم [XmlResolver](../../system.xml/xmlresolver/) المحدد لحل أي موارد خارجية. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | يضيف الـ[XmlSchema](../xmlschema/) إلى المجموعة. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يضيف الـ[XmlSchema](../xmlschema/) إلى المجموعة. يُستخدم [XmlResolver](../../system.xml/xmlresolver/) المحدد لحل أي مراجع خارجية. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | يضيف جميع المساحات الاسمية المعرفة في المجموعة المحددة (بما في ذلك المخططات المرتبطة بها) إلى هذه المجموعة. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | يعيد قيمة تشير إلى ما إذا كان **targetNamespace** للـ[XmlSchema](../xmlschema/) المحدد موجودًا في المجموعة. |
| [Contains](./contains/)(const String\&) | يعيد قيمة تشير إلى ما إذا كان مخطط بالمساحة الاسمية المحددة موجودًا في المجموعة. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | ينسخ جميع كائنات [XmlSchema](../xmlschema/) من هذه المجموعة إلى المصفوفة المحددة بدءًا من الفهرس المحدد. |
| [get_Count](./get_count/)() | يعيد عدد المساحات الاسمية المعرفة في هذه المجموعة. |
| [get_NameTable](./get_nametable/)() | يعيد جدول [XmlNameTable](../../system.xml/xmlnametable/) الافتراضي المستخدم بواسطة [XmlSchemaCollection](./) عند تحميل مخططات جديدة. |
| [GetEnumerator](./getenumerator/)() override | يوفر دعمًا للتكرار عبر مجموعة المخططات. |
| [idx_get](./idx_get/)(const String\&) | يعيد الـ[XmlSchema](../xmlschema/) المرتبط بعنوان URI للمساحة الاسمية المحددة. |
| [XmlSchemaCollection](./xmlschemacollection/)() | ينشئ مثيلاً جديدًا للفئة [XmlSchemaCollection](./). |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | ينشئ مثيلاً جديدًا للفئة [XmlSchemaCollection](./) باستخدام [XmlNameTable](../../system.xml/xmlnametable/) المحدد. يُستخدم [XmlNameTable](../../system.xml/xmlnametable/) عند تحميل المخططات. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات


## Deprecated
فئة XmlSchemaCollection أصبحت قديمة. استخدم XmlSchemaSet بدلاً من ذلك.

يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
