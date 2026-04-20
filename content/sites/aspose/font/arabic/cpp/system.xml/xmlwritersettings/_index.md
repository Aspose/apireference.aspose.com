---
title: "System::Xml::XmlWriterSettings فئة"
linktitle: "XmlWriterSettings"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlWriterSettings فئة. يحدد مجموعة من الميزات لدعم كائن XmlWriter الذي تم إنشاؤه بواسطة طريقة XmlWriter::Create في C++."
type: docs
weight: 4500
url: /ar/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


يحدد مجموعة من الميزات لدعم كائن [XmlWriter](../xmlwriter/) الذي تم إنشاؤه بواسطة طريقة [XmlWriter::Create](../xmlwriter/create/).

```cpp
class XmlWriterSettings : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | ينشئ نسخة من المثيل [XmlWriterSettings](./). |
| [get_CheckCharacters](./get_checkcharacters/)() | يرجع قيمة تشير إلى ما إذا كان كاتب XML يجب أن يتحقق لضمان أن جميع الأحرف في المستند تتطابق مع القسم "2.2 Characters" من توصية W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets). |
| [get_CloseOutput](./get_closeoutput/)() | يرجع قيمة تشير إلى ما إذا كان يجب على [XmlWriter](../xmlwriter/) إغلاق التدفق الأساسي أو TextWriter أيضًا عند استدعاء طريقة [XmlWriter::Close](../xmlwriter/close/). |
| [get_ConformanceLevel](./get_conformancelevel/)() | يرجع مستوى التوافق الذي يتحقق منه كاتب XML لإخراج XML. |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | يرجع قيمة تشير إلى ما إذا كان [XmlWriter](../xmlwriter/) لا يقوم بتهرب سمات URI. |
| [get_Encoding](./get_encoding/)() | يرجع نوع ترميز النص لاستخدامه. |
| [get_Indent](./get_indent/)() | يرجع قيمة تشير إلى ما إذا كان يجب إزاحة العناصر. |
| [get_IndentChars](./get_indentchars/)() | يرجع سلسلة الأحرف المستخدمة عند الإزاحة. يتم استخدام هذا الإعداد عندما تكون قيمة [XmlWriterSettings::set_Indent](./set_indent/) مضبوطة على **true**. |
| [get_NamespaceHandling](./get_namespacehandling/)() | يرجع قيمة تشير إلى ما إذا كان يجب على [XmlWriter](../xmlwriter/) إزالة إعلانات النطاق المكررة عند كتابة محتوى XML. السلوك الافتراضي هو أن يقوم الكاتب بإخراج جميع إعلانات النطاق الموجودة في محلل النطاق الخاص بالكاتب. |
| [get_NewLineChars](./get_newlinechars/)() | يرجع سلسلة الأحرف المستخدمة لفواصل الأسطر. |
| [get_NewLineHandling](./get_newlinehandling/)() | يرجع قيمة تشير إلى ما إذا كان يجب تطبيع فواصل الأسطر في الإخراج. |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | يعيد قيمة تشير إلى ما إذا كان يجب كتابة السمات في سطر جديد. |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | يعيد قيمة تشير إلى ما إذا كان يجب حذف إعلان XML. |
| [get_OutputMethod](./get_outputmethod/)() | يعيد الطريقة المستخدمة لتسلسل ناتج [XmlWriter](../xmlwriter/). |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | يعيد قيمة تشير إلى ما إذا كان [XmlWriter](../xmlwriter/) سيضيف علامات إغلاق لجميع علامات العناصر غير المغلقة عند استدعاء طريقة [XmlWriter::Close](../xmlwriter/close/). |
| [Reset](./reset/)() | يعيد ضبط أعضاء فئة الإعدادات إلى القيم الافتراضية. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | يضبط قيمة تشير إلى ما إذا كان كاتب XML يجب أن يتحقق لضمان أن جميع الأحرف في المستند تتوافق مع القسم "2.2 Characters" من توصية W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets). |
| [set_CloseOutput](./set_closeoutput/)(bool) | يضبط قيمة تشير إلى ما إذا كان [XmlWriter](../xmlwriter/) يجب أن يغلق أيضًا الدفق الأساسي أو TextWriter عند استدعاء طريقة [XmlWriter::Close](../xmlwriter/close/). |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | يضبط مستوى التوافق الذي يتحقق منه كاتب XML في ناتج XML. |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | يضبط قيمة تشير إلى ما إذا كان [XmlWriter](../xmlwriter/) لا يقوم بتهرب سمات URI. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | يضبط نوع ترميز النص لاستخدامه. |
| [set_Indent](./set_indent/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب إزاحة العناصر. |
| [set_IndentChars](./set_indentchars/)(const String\&) | يضبط سلسلة الأحرف المستخدمة عند الإزاحة. يتم استخدام هذا الإعداد عندما تكون قيمة [XmlWriterSettings::set_Indent](./set_indent/) مضبوطة على **true**. |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | يضبط قيمة تشير إلى ما إذا كان [XmlWriter](../xmlwriter/) يجب أن يزيل إعلانات النطاق المتكررة عند كتابة محتوى XML. السلوك الافتراضي هو أن يقوم الكاتب بإخراج جميع إعلانات النطاق الموجودة في محلل النطاق الخاص بالكاتب. |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | يضبط سلسلة الأحرف المستخدمة لفواصل الأسطر. |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | يضبط قيمة تشير إلى ما إذا كان يجب تطبيع فواصل الأسطر في الناتج. |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب كتابة السمات في سطر جديد. |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب حذف إعلان XML. |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | يضبط قيمة تشير إلى ما إذا كان [XmlWriter](../xmlwriter/) سيضيف علامات إغلاق لجميع علامات العناصر غير المغلقة عند استدعاء طريقة [XmlWriter::Close](../xmlwriter/close/). |
| [XmlWriterSettings](./xmlwritersettings/)() | ينشئ نسخة جديدة من فئة [XmlWriterSettings](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
