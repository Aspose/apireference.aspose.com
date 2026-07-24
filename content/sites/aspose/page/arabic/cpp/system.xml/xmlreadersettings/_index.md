---
title: "System::Xml::XmlReaderSettings فئة"
linktitle: "XmlReaderSettings"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlReaderSettings فئة. يحدد مجموعة من الميزات لدعم كائن XmlReader الذي تم إنشاؤه بواسطة طريقة XmlReader::Create في C++."
type: docs
weight: 3400
url: /ar/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


يحدد مجموعة من الميزات لدعم كائن [XmlReader](../xmlreader/) الذي تم إنشاؤه بواسطة طريقة [XmlReader::Create](../xmlreader/create/).

```cpp
class XmlReaderSettings : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | ينشئ نسخة من المثيل [XmlReaderSettings](./). |
| [get_CheckCharacters](./get_checkcharacters/)() | يعيد قيمة تشير إلى ما إذا كان يجب إجراء فحص الأحرف. |
| [get_CloseInput](./get_closeinput/)() | يعيد قيمة تشير إلى ما إذا كان يجب إغلاق الدفق الأساسي أو TextReader عند إغلاق القارئ. |
| [get_ConformanceLevel](./get_conformancelevel/)() | يعيد مستوى الامتثال الذي سيتقيده [XmlReader](../xmlreader/). |
| [get_DtdProcessing](./get_dtdprocessing/)() | يعيد قيمة تحدد معالجة DTDs. |
| [get_IgnoreComments](./get_ignorecomments/)() | يعيد قيمة تشير إلى ما إذا كان يجب تجاهل التعليقات. |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | يعيد قيمة تشير إلى ما إذا كان يجب تجاهل تعليمات المعالجة. |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | يعيد قيمة تشير إلى ما إذا كان يجب تجاهل المسافات البيضاء غير المهمة. |
| [get_LineNumberOffset](./get_linenumberoffset/)() | يعيد إزاحة رقم السطر لكائن [XmlReader](../xmlreader/). |
| [get_LinePositionOffset](./get_linepositionoffset/)() | يعيد إزاحة موضع السطر لكائن [XmlReader](../xmlreader/). |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | يعيد قيمة تشير إلى الحد الأقصى المسموح لعدد الأحرف في المستند الناتجة عن توسيع الكيانات. |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | يرجع قيمة تشير إلى الحد الأقصى المسموح لعدد الأحرف في مستند XML. القيمة صفر (0) تعني عدم وجود حدود لحجم مستند XML. القيمة غير الصفرية تحدد الحد الأقصى للحجم، بالأحرف. |
| [get_NameTable](./get_nametable/)() | يرجع الـ [XmlNameTable](../xmlnametable/) المستخدم للمقارنات الذرية للسلاسل. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | يرجع قيمة تشير إلى ما إذا كان يجب حظر معالجة تعريف نوع المستند (DTD). |
| [get_Schemas](./get_schemas/)() | يرجع الـ XmlSchemaSet لاستخدامه عند إجراء التحقق من صحة المخطط. |
| [get_ValidationFlags](./get_validationflags/)() | يرجع قيمة تشير إلى إعدادات التحقق من صحة المخطط. هذا الإعداد ينطبق على كائنات [XmlReader](../xmlreader/) التي تتحقق من صحة المخططات (قيمة [XmlReaderSettings::get_ValidationType](./get_validationtype/) هي [ValidationType::Schema](../validationtype/)). |
| [get_ValidationType](./get_validationtype/)() | يرجع قيمة تشير إلى ما إذا كان الـ [XmlReader](../xmlreader/) سيجري التحقق أو تعيين النوع أثناء القراءة. |
| [Reset](./reset/)() | يعيد تعيين أعضاء فئة الإعدادات إلى قيمها الافتراضية. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب إجراء فحص الأحرف. |
| [set_CloseInput](./set_closeinput/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب إغلاق الدفق الأساسي أو الـ TextReader عند إغلاق القارئ. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | يضبط مستوى التوافق الذي سيتقيده الـ [XmlReader](../xmlreader/). |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | يضبط قيمة تحدد معالجة ملفات DTD. |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب تجاهل التعليقات. |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب تجاهل تعليمات المعالجة. |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب تجاهل الفراغات غير المهمة. |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) | يضبط إزاحة رقم السطر لكائن الـ [XmlReader](../xmlreader/). |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) | يضبط إزاحة موضع السطر لكائن الـ [XmlReader](../xmlreader/). |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | يضبط قيمة تشير إلى الحد الأقصى المسموح لعدد الأحرف في مستند ناتج عن توسيع الكيانات. |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | يضبط قيمة تشير إلى الحد الأقصى المسموح لعدد الأحرف في مستند XML. القيمة صفر (0) تعني عدم وجود حدود لحجم مستند XML. القيمة غير الصفرية تحدد الحد الأقصى للحجم، بالأحرف. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | يضبط الـ [XmlNameTable](../xmlnametable/) المستخدم للمقارنات الذرية للسلاسل. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب حظر معالجة تعريف نوع المستند (DTD). |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | يضبط الـ XmlSchemaSet لاستخدامه عند إجراء التحقق من صحة المخطط. |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | يضبط قيمة تشير إلى إعدادات التحقق من صحة المخطط. هذا الإعداد ينطبق على كائنات [XmlReader](../xmlreader/) التي تتحقق من صحة المخططات (قيمة [XmlReaderSettings::get_ValidationType](./get_validationtype/) هي [ValidationType::Schema](../validationtype/)). |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | يضبط قيمة تشير إلى ما إذا كان الـ [XmlReader](../xmlreader/) سيجري التحقق أو تعيين النوع أثناء القراءة. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | يضبط الـ [XmlResolver](../xmlresolver/) المستخدم للوصول إلى المستندات الخارجية. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | يضيف معالج حدث يحدث عندما يواجه القارئ أخطاء التحقق. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | يزيل معالج حدث يحدث عندما يواجه القارئ أخطاء التحقق. |
| [XmlReaderSettings](./xmlreadersettings/)() | يُنشئ مثيلاً جديدًا من الفئة [XmlReaderSettings](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
