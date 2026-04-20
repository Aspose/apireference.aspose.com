---
title: "فئة System::Xml::XmlTextWriter"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlTextWriter. تمثل كاتبًا يوفر طريقة سريعة غير مخزنة مؤقتًا وتعمل في اتجاه واحد لإنشاء تدفقات أو ملفات تحتوي على بيانات XML تتوافق مع توصيات W3C للغة القابلة للتوسيع (XML) 1.0 والمساحات الاسمية في XML في C++."
type: docs
weight: 4000
url: /ar/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


يمثل كاتبًا يوفر طريقة سريعة غير مخزنة مؤقتًا لإنشاء تدفقات أو ملفات تحتوي على بيانات XML تتوافق مع لغة الترميز القابلة للتوسيع (XML) 1.0 الصادرة عن W3C وتوصيات مساحات الأسماء في XML.

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق هذا التدفق والتدفق الأساسي. |
| [Flush](./flush/)() override | يفرغ كل ما هو في المخزن المؤقت إلى التدفقات الأساسية ويفرغ أيضًا التدفق الأساسي. |
| [get_BaseStream](./get_basestream/)() | يعيد كائن التدفق الأساسي. |
| [get_Formatting](./get_formatting/)() | يشير إلى كيفية تنسيق الإخراج. |
| [get_Indentation](./get_indentation/)() | يعيد عدد IndentChars التي يجب كتابتها لكل مستوى في التسلسل الهرمي عندما يتم تعيين [XmlTextWriter::set_Formatting](./set_formatting/) إلى [Formatting::Indented](../formatting/). |
| [get_IndentChar](./get_indentchar/)() | يعيد أي حرف يُستخدم للمسافة عندما يتم تعيين [XmlTextWriter::set_Formatting](./set_formatting/) إلى [Formatting::Indented](../formatting/). |
| [get_Namespaces](./get_namespaces/)() | يعيد قيمة تشير إلى ما إذا كان يجب دعم النطاقات. |
| [get_QuoteChar](./get_quotechar/)() | يعيد أي حرف يُستخدم لتحديد قيم السمات. |
| [get_WriteState](./get_writestate/)() override | يعيد حالة الكاتب. |
| [get_XmlLang](./get_xmllang/)() override | يعيد نطاق **xml:lang** الحالي. |
| [get_XmlSpace](./get_xmlspace/)() override | يعيد كائن [XmlSpace](../xmlspace/) يمثل نطاق **xml:space** الحالي. |
| [LookupPrefix](./lookupprefix/)(String) override | يعيد أقرب بادئة معرفة في نطاق النطاق الحالي لعنوان URI الخاص بالنطاق. |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | يشير إلى كيفية تنسيق الإخراج. |
| [set_Indentation](./set_indentation/)(int32_t) | يضبط عدد IndentChars التي يجب كتابتها لكل مستوى في التسلسل الهرمي عندما يتم تعيين [XmlTextWriter::set_Formatting](./set_formatting/) إلى [Formatting::Indented](../formatting/). |
| [set_IndentChar](./set_indentchar/)(char16_t) | يضبط أي حرف يُستخدم للمسافة عندما يتم تعيين [XmlTextWriter::set_Formatting](./set_formatting/) إلى [Formatting::Indented](../formatting/). |
| [set_Namespaces](./set_namespaces/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب دعم النطاقات. |
| [set_QuoteChar](./set_quotechar/)(char16_t) | يضبط أي حرف يُستخدم لتحديد قيم السمات. |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقوم بترميز البايتات الثنائية المحددة كـ base64 ويكتب النص الناتج. |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقوم بترميز البايتات الثنائية المحددة كـ binhex ويكتب النص الناتج. |
| [WriteCData](./writecdata/)(String) override | يكتب كتلة **...** تحتوي على النص المحدد. |
| [WriteCharEntity](./writecharentity/)(char16_t) override | يفرض إنشاء كيان حرف لقيمة الحرف Unicode المحددة. |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | يكتب النص مخزنًا مؤقتًا واحدًا في كل مرة. |
| [WriteComment](./writecomment/)(String) override | يكتب تعليق **** يحتوي على النص المحدد. |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | يكتب إعلان DOCTYPE بالاسم المحدد والسمات الاختيارية. |
| [WriteEndAttribute](./writeendattribute/)() override | يغلق الاستدعاء السابق لـ [XmlTextWriter::WriteStartAttribute](./writestartattribute/). |
| [WriteEndDocument](./writeenddocument/)() override | يغلق أي عناصر أو سمات مفتوحة ويعيد الكاتب إلى حالة البداية. |
| [WriteEndElement](./writeendelement/)() override | يغلق عنصرًا واحدًا ويزيل نطاق النطاق المقابل. |
| [WriteEntityRef](./writeentityref/)(const String\&) override | يكتب إشارة كيان كـ **&name**;. |
| [WriteFullEndElement](./writefullendelement/)() override | يغلق عنصرًا واحدًا ويزيل نطاق النطاق المقابل. |
| [WriteName](./writename/)(const String\&) override | يكتب الاسم المحدد، مع التأكد من أنه اسم صالح وفقًا لـ [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteNmToken](./writenmtoken/)(const String\&) override | يكتب الاسم المحدد، مع التأكد من أنه **NmToken** صالح وفقًا لـ [توصية W3C XML 1.0](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | يكتب تعليمًا معالجة مع مسافة بين الاسم والنص كما يلي: **<?name text?>**. |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | يكتب الاسم المؤهل بالمساحة الاسمية. تبحث هذه الطريقة عن البادئة المتاحة للمساحة الاسمية المعطاة. |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | يكتب العلامات الخام يدويًا من مخزن أحرف. |
| [WriteRaw](./writeraw/)(const String\&) override | يكتب العلامات الخام يدويًا من سلسلة نصية. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | يكتب بداية السمة. |
| [WriteStartDocument](./writestartdocument/)() override | يكتب إعلان XML بالإصدار "1.0". |
| [WriteStartDocument](./writestartdocument/)(bool) override | يكتب إعلان XML بالإصدار "1.0" والخاصية standalone. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | يكتب وسم البداية المحدد ويربطه بالمساحة الاسمية والبادئة المعطاة. |
| [WriteString](./writestring/)(const String\&) override | يكتب محتوى النص المعطى. |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | ينشئ ويكتب كيان الحرف البديل للزوج البديل من الأحرف. |
| [WriteWhitespace](./writewhitespace/)(String) override | يكتب المسافة البيضاء المعطاة. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | ينشئ مثيلًا من الفئة [XmlTextWriter](./) باستخدام الدفق والترميز المحددين. |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | ينشئ مثيلًا من الفئة [XmlTextWriter](./) باستخدام الملف المحدد. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | ينشئ مثيلًا من الفئة [XmlTextWriter](./) باستخدام كاتب النص المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يوصى باستخدام الفئة [XmlWriter](../xmlwriter/) بدلاً من ذلك.

يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
