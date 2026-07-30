---
title: "الفئة System::Xml::Schema::XmlSchemaSet"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaSet. تحتوي على ذاكرة مؤقتة لمخططات لغة تعريف مخطط XML (XSD) في C++."
type: docs
weight: 5800
url: /ar/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


يحتوي على ذاكرة مؤقتة لمخططات XML [Schema](../) لغة التعريف (XSD).

```cpp
class XmlSchemaSet : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(String, const String\&) | يضيف مخطط XML [Schema](../) لغة التعريف (XSD) الموجود في عنوان URL المحدد إلى [XmlSchemaSet](./). |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | يضيف مخطط XML [Schema](../) لغة التعريف (XSD) الموجود داخل [XmlReader](../../system.xml/xmlreader/) إلى [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | يضيف جميع مخططات XML [Schema](../) لغة التعريف (XSD) الموجودة في [XmlSchemaSet](./) المحدد إلى [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | يضيف [XmlSchema](../xmlschema/) المحدد إلى [XmlSchemaSet](./). |
| [Compile](./compile/)() | يقوم بتجميع مخططات XML [Schema](../) لغة التعريف (XSD) المضافة إلى [XmlSchemaSet](./) في مخطط منطقي واحد. |
| [Contains](./contains/)(String) | يشير إلى ما إذا كان مخطط XML [Schema](../) لغة التعريف (XSD) مع مساحة الاسم الهدف المحددة موجودًا في [XmlSchemaSet](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | يشير إلى ما إذا كان كائن XML [Schema](../) لغة التعريف (XSD) [XmlSchema](../xmlschema/) المحدد موجودًا في [XmlSchemaSet](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | ينسخ جميع كائنات [XmlSchema](../xmlschema/) من [XmlSchemaSet](./) إلى المصفوفة المحددة، بدءًا من الفهرس المحدد. |
| [get_CompilationSettings](./get_compilationsettings/)() | يعيد [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) الخاص بـ [XmlSchemaSet](./). |
| [get_Count](./get_count/)() | يعيد عدد مخططات XML [Schema](../) لغة التعريف (XSD) المنطقية في [XmlSchemaSet](./). |
| [get_GlobalAttributes](./get_globalattributes/)() | يعيد جميع السمات العامة في جميع مخططات XML [Schema](../) لغة التعريف (XSD) في [XmlSchemaSet](./). |
| [get_GlobalElements](./get_globalelements/)() | يعيد جميع العناصر العامة في جميع مخططات XML [Schema](../) لغة التعريف (XSD) في [XmlSchemaSet](./). |
| [get_GlobalTypes](./get_globaltypes/)() | يعيد جميع الأنواع البسيطة والمعقدة العامة في جميع مخططات XML [Schema](../) لغة التعريف (XSD) في [XmlSchemaSet](./). |
| [get_IsCompiled](./get_iscompiled/)() | يعيد قيمة تشير إلى ما إذا كانت مخططات XML [Schema](../) لغة التعريف (XSD) في [XmlSchemaSet](./) قد تم تجميعها. |
| [get_NameTable](./get_nametable/)() | يعيد جدول [XmlNameTable](../../system.xml/xmlnametable/) الافتراضي المستخدم بواسطة [XmlSchemaSet](./) عند تحميل مخططات XML [Schema](../) لغة التعريف (XSD) الجديدة. |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | يزيل مخطط XML [Schema](../) لغة التعريف (XSD) المحدد من [XmlSchemaSet](./). |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | يزيل مخطط XML [Schema](../) لغة التعريف (XSD) المحدد وجميع المخططات التي يستوردها من [XmlSchemaSet](./). |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | يعيد معالجة مخطط XML [Schema](../) لغة التعريف (XSD) الموجود بالفعل في [XmlSchemaSet](./). |
| [Schemas](./schemas/)() | يعيد مجموعة من جميع مخططات XML [Schema](../) لغة التعريف (XSD) في [XmlSchemaSet](./). |
| [Schemas](./schemas/)(String) | إرجاع مجموعة من جميع مخططات تعريف لغة XML [Schema](../) (XSD) في مجموعة [XmlSchemaSet](./) التي تنتمي إلى مساحة الاسم المحددة. |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | يضبط إعدادات [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) لمجموعة [XmlSchemaSet](./). |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | يضبط الـ [XmlResolver](../../system.xml/xmlresolver/) المستخدم لحل مساحات الأسماء أو المواقع المشار إليها في عناصر include و import في مخطط. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | يضيف معالج حدث لتلقي معلومات حول أخطاء التحقق من مخطط تعريف لغة XML [Schema](../) (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | يزيل معالج حدث لتلقي معلومات حول أخطاء التحقق من مخطط تعريف لغة XML [Schema](../) (XSD). |
| [XmlSchemaSet](./xmlschemaset/)() | يُنشئ مثيلاً جديدًا للفئة [XmlSchemaSet](./). |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | يُنشئ مثيلاً جديدًا للفئة [XmlSchemaSet](./) باستخدام [XmlNameTable](../../system.xml/xmlnametable/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
