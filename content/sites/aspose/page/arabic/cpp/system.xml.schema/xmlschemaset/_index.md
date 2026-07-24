---
title: "System::Xml::Schema::XmlSchemaSet class"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaSet class. يحتوي على ذاكرة مخبأة لمخططات لغة تعريف مخطط XML (XSD) في C++."
type: docs
weight: 5800
url: /ar/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


يحتوي على ذاكرة مخبأة لمخططات لغة تعريف XML [Schema](../) (XSD).

```cpp
class XmlSchemaSet : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(String, const String\&) | يضيف مخطط XML [Schema](../) للغة التعريف (XSD) الموجود في عنوان URL المحدد إلى [XmlSchemaSet](./). |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | يضيف مخطط XML [Schema](../) للغة التعريف (XSD) الموجود داخل [XmlReader](../../system.xml/xmlreader/) إلى [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | يضيف جميع مخططات XML [Schema](../) للغة التعريف (XSD) الموجودة في [XmlSchemaSet](./) المحدد إلى [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | يضيف [XmlSchema](../xmlschema/) المحدد إلى [XmlSchemaSet](./). |
| [Compile](./compile/)() | يقوم بتجميع مخططات XML [Schema](../) للغة التعريف (XSD) المضافة إلى [XmlSchemaSet](./) في مخطط منطقي واحد. |
| [Contains](./contains/)(String) | يشير إلى ما إذا كان مخطط XML [Schema](../) للغة التعريف (XSD) مع مساحة الاسم الهدف المحددة موجودًا في [XmlSchemaSet](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | يشير إلى ما إذا كان كائن XML [Schema](../) للغة التعريف (XSD) [XmlSchema](../xmlschema/) المحدد موجودًا في [XmlSchemaSet](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | ينسخ جميع كائنات [XmlSchema](../xmlschema/) من [XmlSchemaSet](./) إلى المصفوفة المحددة، بدءًا من الفهرس المحدد. |
| [get_CompilationSettings](./get_compilationsettings/)() | إرجاع [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) لـ [XmlSchemaSet](./). |
| [get_Count](./get_count/)() | إرجاع عدد مخططات XML [Schema](../) المنطقية للغة التعريف (XSD) في [XmlSchemaSet](./). |
| [get_GlobalAttributes](./get_globalattributes/)() | إرجاع جميع السمات العامة في جميع مخططات XML [Schema](../) للغة التعريف (XSD) في [XmlSchemaSet](./). |
| [get_GlobalElements](./get_globalelements/)() | إرجاع جميع العناصر العامة في جميع مخططات XML [Schema](../) للغة التعريف (XSD) في [XmlSchemaSet](./). |
| [get_GlobalTypes](./get_globaltypes/)() | إرجاع جميع الأنواع البسيطة والمعقدة العامة في جميع مخططات XML [Schema](../) للغة التعريف (XSD) في [XmlSchemaSet](./). |
| [get_IsCompiled](./get_iscompiled/)() | إرجاع قيمة تشير إلى ما إذا كانت مخططات XML [Schema](../) للغة التعريف (XSD) في [XmlSchemaSet](./) قد تم تجميعها. |
| [get_NameTable](./get_nametable/)() | إرجاع جدول الأسماء الافتراضي [XmlNameTable](../../system.xml/xmlnametable/) المستخدم من قبل [XmlSchemaSet](./) عند تحميل مخططات XML [Schema](../) للغة التعريف (XSD) الجديدة. |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | إزالة مخطط XML [Schema](../) المحدد للغة التعريف (XSD) من [XmlSchemaSet](./). |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | إزالة مخطط XML [Schema](../) المحدد للغة التعريف (XSD) وجميع المخططات التي يستوردها من [XmlSchemaSet](./). |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | إعادة معالجة مخطط XML [Schema](../) للغة التعريف (XSD) الموجود بالفعل في [XmlSchemaSet](./). |
| [Schemas](./schemas/)() | إرجاع مجموعة من جميع مخططات XML [Schema](../) للغة التعريف (XSD) في [XmlSchemaSet](./). |
| [Schemas](./schemas/)(String) | إرجاع مجموعة من جميع مخططات XML [Schema](../) للغة التعريف (XSD) في [XmlSchemaSet](./) التي تنتمي إلى مساحة الاسم المحددة. |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | تعيين [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) لـ [XmlSchemaSet](./). |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | تعيين [XmlResolver](../../system.xml/xmlresolver/) المستخدم لحل مساحات الأسماء أو المواقع المشار إليها في عناصر include و import في المخطط. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | إضافة معالج حدث لتلقي معلومات حول أخطاء التحقق من صحة مخطط XML [Schema](../) للغة التعريف (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | إزالة معالج حدث لتلقي معلومات حول أخطاء التحقق من صحة مخطط XML [Schema](../) للغة التعريف (XSD). |
| [XmlSchemaSet](./xmlschemaset/)() | تهيئة نسخة جديدة من الفئة [XmlSchemaSet](./). |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | تهيئة نسخة جديدة من الفئة [XmlSchemaSet](./) باستخدام [XmlNameTable](../../system.xml/xmlnametable/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
