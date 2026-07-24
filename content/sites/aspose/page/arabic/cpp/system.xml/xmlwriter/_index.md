---
title: "فئة System::Xml::XmlWriter"
linktitle: "XmlWriter"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XmlWriter. تمثل كاتبًا يوفر طريقة سريعة غير مخزنة مؤقتًا وتعمل في اتجاه واحد لإنشاء تدفقات أو ملفات تحتوي على بيانات XML في C++."
type: docs
weight: 4400
url: /ar/cpp/system.xml/xmlwriter/
---
## XmlWriter class


يمثل كاتبًا يوفر طريقة سريعة غير مخزنة مؤقتًا لإنشاء تدفقات أو ملفات تحتوي على بيانات XML.

```cpp
class XmlWriter : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | عند تجاوزها في فئة مشتقة، تغلق هذا التدفق والتدفق الأساسي. |
| static [Create](./create/)(const String\&) | ينشئ نسخة جديدة من [XmlWriter](./) باستخدام اسم الملف المحدد. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | ينشئ نسخة جديدة من [XmlWriter](./) باستخدام اسم الملف وكائن [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | ينشئ نسخة جديدة من [XmlWriter](./) باستخدام التدفق المحدد. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | ينشئ نسخة جديدة من [XmlWriter](./) باستخدام التدفق وكائن [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | ينشئ نسخة جديدة من [XmlWriter](./) باستخدام كاتب النص المحدد (TextWriter). |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | ينشئ نسخة جديدة من [XmlWriter](./) باستخدام كاتب النص (TextWriter) وكائنات [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | ينشئ نسخة جديدة من [XmlWriter](./) باستخدام [Text::StringBuilder](../../system.text/stringbuilder/) المحدد. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | ينشئ نسخة جديدة من [XmlWriter](./) باستخدام كائن [Text::StringBuilder](../../system.text/stringbuilder/) وكائنات [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | ينشئ نسخة جديدة من [XmlWriter](./) باستخدام كائن [XmlWriter](./) المحدد. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | ينشئ نسخة جديدة من [XmlWriter](./) باستخدام كائن [XmlWriter](./) وكائنات [XmlWriterSettings](../xmlwritersettings/) المحددة. |
| [Dispose](./dispose/)() override | يطلق جميع الموارد المستخدمة من قبل النسخة الحالية من فئة [XmlWriter](./). |
| virtual [Flush](./flush/)() | عند تجاوزها في فئة مشتقة، تُفرغ ما هو في المخزن المؤقت إلى التدفقات الأساسية وتفرغ أيضًا التدفق الأساسي. |
| virtual [get_Settings](./get_settings/)() | يعيد كائن [XmlWriterSettings](../xmlwritersettings/) المستخدم لإنشاء هذه النسخة من [XmlWriter](./). |
| virtual [get_WriteState](./get_writestate/)() | عند تجاوزها في فئة مشتقة، يحصل على حالة الكاتب. |
| virtual [get_XmlLang](./get_xmllang/)() | عند تجاوزها في فئة مشتقة، تحصل على نطاق **xml:lang** الحالي. |
| virtual [get_XmlSpace](./get_xmlspace/)() | عند تجاوزها في فئة مشتقة، يحصل على كائن [XmlSpace](../xmlspace/) يمثل نطاق **xml:space** الحالي. |
| virtual [LookupPrefix](./lookupprefix/)(String) | عند تجاوزها في فئة مشتقة، يعيد أقرب بادئة معرفة في نطاق مساحة الأسماء الحالي لعنوان URI الخاص بمساحة الأسماء. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | عند تجاوزها في فئة مشتقة، يكتب جميع السمات الموجودة في الموضع الحالي في [XmlReader](../xmlreader/). |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | عند تجاوزها في فئة مشتقة، يكتب سمة بالاسم المحلي المحدد وعنوان URI لمساحة الأسماء والقيمة. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | عند تجاوزها في فئة مشتقة، يكتب السمة بالاسم المحلي والقيمة المحددين. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | عند تجاوزها في فئة مشتقة، يكتب السمة بالبادئة والاسم المحلي وعنوان URI لمساحة الأسماء والقيمة المحددة. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | عند تجاوزها في فئة مشتقة، يشفّر البايتات الثنائية المحددة كـ Base64 ويكتب النص الناتج. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | عند تجاوزها في فئة مشتقة، يشفّر البايتات الثنائية المحددة كـ **BinHex** ويكتب النص الناتج. |
| virtual [WriteCData](./writecdata/)(String) | عند تجاوزها في فئة مشتقة، تقوم بكتابة كتلة **...** تحتوي على النص المحدد. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | عند تجاوزها في فئة مشتقة، تُجبر على إنشاء كيان حرف للقيمة المحددة من حرف Unicode. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | عند تجاوزها في فئة مشتقة، تكتب النص مخزنًا مؤقتًا واحدًا في كل مرة. |
| virtual [WriteComment](./writecomment/)(String) | عند تجاوزها في فئة مشتقة، تكتب تعليق **** يحتوي على النص المحدد. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب إعلان DOCTYPE بالاسم المحدد والسمات الاختيارية. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | يكتب عنصرًا بالاسم المحلي المحدد والقيمة. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | يكتب عنصرًا بالاسم المحلي المحدد، ومعرّف مساحة الاسم، والقيمة. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | يكتب عنصرًا بالبادئة المحددة، والاسم المحلي، ومعرّف مساحة الاسم، والقيمة. |
| virtual [WriteEndAttribute](./writeendattribute/)() | عند تجاوزها في فئة مشتقة، تغلق الاستدعاء السابق XmlWriter::WriteStartAttribute(String,String). |
| virtual [WriteEndDocument](./writeenddocument/)() | عند تجاوزها في فئة مشتقة، تغلق أي عناصر أو سمات مفتوحة وتعيد الكاتب إلى حالة البدء. |
| virtual [WriteEndElement](./writeendelement/)() | عند تجاوزها في فئة مشتقة، تغلق عنصرًا واحدًا وتزيل نطاق مساحة الاسم المقابل. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب إشارة كيان كـ **&name**;. |
| virtual [WriteFullEndElement](./writefullendelement/)() | عند تجاوزها في فئة مشتقة، تغلق عنصرًا واحدًا وتزيل نطاق مساحة الاسم المقابل. |
| virtual [WriteName](./writename/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب الاسم المحدد، مع التأكد من أنه اسم صالح وفقًا لتوصية W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب الاسم المحدد، مع التأكد من أنه NmToken صالح وفقًا لتوصية W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | عند تجاوزها في فئة مشتقة، تنسخ كل شيء من القارئ إلى الكاتب وتنتقل بالقارئ إلى بداية الأخ التالي. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | ينسخ كل شيء من كائن XPathNavigator إلى الكاتب. يبقى موضع XPathNavigator دون تغيير. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | عند تجاوزها في فئة مشتقة، تكتب تعليمة معالجة مع مسافة بين الاسم والنص كما يلي: **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب الاسم المؤهل بمساحة الاسم. تبحث هذه الطريقة عن البادئة المتاحة للمساحة المحددة. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | عند تجاوزها في فئة مشتقة، تكتب العلامات الخام يدويًا من مخزن أحرف. |
| virtual [WriteRaw](./writeraw/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب العلامات الخام يدويًا من سلسلة نصية. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | يكتب بداية سمة بالاسم المحلي المحدد ومعرّف مساحة الاسم. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب بداية سمة بالبادئة المحددة، والاسم المحلي، ومعرّف مساحة الاسم. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | يكتب بداية سمة بالاسم المحلي المحدد. |
| virtual [WriteStartDocument](./writestartdocument/)() | عند تجاوزها في فئة مشتقة، تكتب إعلان XML بالإصدار "1.0". |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | عند تجاوزها في فئة مشتقة، تكتب إعلان XML بالإصدار "1.0" والخاصية المستقلة. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب علامة البداية المحددة وتربطها بالمساحة الاسمية المعطاة. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب علامة البداية المحددة وتربطها بالمساحة الاسمية المعطاة والبادئة. |
| [WriteStartElement](./writestartelement/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب علامة بداية بالاسم المحلي المحدد. |
| virtual [WriteString](./writestring/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب محتوى النص المعطى. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | عند تجاوزها في فئة مشتقة، تولد وتكتب كيان الحرف البديل لزوج الأحرف البديلة. |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | يكتب قيمة الكائن. |
| virtual [WriteValue](./writevalue/)(const String\&) | يكتب قيمة [String](../../system/string/). |
| virtual [WriteValue](./writevalue/)(bool) | يكتب قيمة [Boolean](../../system/boolean/). |
| virtual [WriteValue](./writevalue/)(DateTime) | يكتب قيمة [DateTime](../../system/datetime/). |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | يكتب قيمة [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [WriteValue](./writevalue/)(double) | يكتب قيمة [Double](../../system/double/). |
| virtual [WriteValue](./writevalue/)(float) | يكتب عددًا عشريًا بنقطة عائمة ذات دقة مفردة. |
| virtual [WriteValue](./writevalue/)(Decimal) | يكتب قيمة [Decimal](../../system/decimal/). |
| virtual [WriteValue](./writevalue/)(int32_t) | يكتب قيمة [Int32](../../system/int32/). |
| virtual [WriteValue](./writevalue/)(int64_t) | يكتب قيمة [Int64](../../system/int64/). |
| virtual [WriteWhitespace](./writewhitespace/)(String) | عند تجاوزها في فئة مشتقة، تكتب المسافة البيضاء المعطاة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
