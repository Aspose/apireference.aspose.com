---
title: "فئة System::Xml::XmlWriter"
linktitle: "XmlWriter"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlWriter. تمثل كاتبًا يوفر طريقة سريعة، غير مخزنة مؤقتًا، وموجهة للأمام لإنشاء تدفقات أو ملفات تحتوي على بيانات XML في C++."
type: docs
weight: 4400
url: /ar/cpp/system.xml/xmlwriter/
---
## XmlWriter class


يمثل كاتبًا يوفر طريقة سريعة، غير مخزنة مؤقتًا، وموجهة للأمام لإنشاء تدفقات أو ملفات تحتوي على بيانات XML.

```cpp
class XmlWriter : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | عند تجاوزها في فئة مشتقة، تغلق هذا التدفق والتدفق الأساسي. |
| static [Create](./create/)(const String\&) | ينشئ كائنًا جديدًا من نوع [XmlWriter](./) باستخدام اسم الملف المحدد. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | ينشئ كائنًا جديدًا من نوع [XmlWriter](./) باستخدام اسم الملف و كائن [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | ينشئ كائنًا جديدًا من نوع [XmlWriter](./) باستخدام التدفق المحدد. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | ينشئ كائنًا جديدًا من نوع [XmlWriter](./) باستخدام التدفق وكائن [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | ينشئ كائنًا جديدًا من نوع [XmlWriter](./) باستخدام الـ TextWriter المحدد. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | ينشئ كائنًا جديدًا من نوع [XmlWriter](./) باستخدام الـ TextWriter وكائنات [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | ينشئ كائنًا جديدًا من نوع [XmlWriter](./) باستخدام الـ [Text::StringBuilder](../../system.text/stringbuilder/) المحدد. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | ينشئ كائنًا جديدًا من نوع [XmlWriter](./) باستخدام الـ [Text::StringBuilder](../../system.text/stringbuilder/) وكائنات [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | ينشئ كائنًا جديدًا من نوع [XmlWriter](./) باستخدام كائن [XmlWriter](./) المحدد. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | ينشئ كائنًا جديدًا من نوع [XmlWriter](./) باستخدام كائن [XmlWriter](./) وكائنات [XmlWriterSettings](../xmlwritersettings/) المحددة. |
| [Dispose](./dispose/)() override | يطلق جميع الموارد المستخدمة من قبل النسخة الحالية من فئة [XmlWriter](./). |
| virtual [Flush](./flush/)() | عند تجاوزها في فئة مشتقة، تقوم بتفريغ كل ما هو في المخزن المؤقت إلى التدفقات الأساسية وتفريغ التدفق الأساسي أيضًا. |
| virtual [get_Settings](./get_settings/)() | تُرجِع كائن [XmlWriterSettings](../xmlwritersettings/) المستخدم لإنشاء هذه المثيلة من [XmlWriter](./). |
| virtual [get_WriteState](./get_writestate/)() | عند تجاوزها في فئة مشتقة، تحصل على حالة الكاتب. |
| virtual [get_XmlLang](./get_xmllang/)() | عند تجاوزها في فئة مشتقة، تحصل على نطاق **xml:lang** الحالي. |
| virtual [get_XmlSpace](./get_xmlspace/)() | عند تجاوزها في فئة مشتقة، تحصل على كائن [XmlSpace](../xmlspace/) الذي يمثل نطاق **xml:space** الحالي. |
| virtual [LookupPrefix](./lookupprefix/)(String) | عند تجاوزها في فئة مشتقة، تُرجِع أقرب بادئة معرفة في نطاق الاسم الحالي لعنوان URI الخاص بالمساحة الاسمية. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | عند تجاوزها في فئة مشتقة، تكتب جميع السمات الموجودة في الموضع الحالي في [XmlReader](../xmlreader/). |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب سمة بالاسم المحلي المحدد، وعنوان URI للمساحة الاسمية، والقيمة. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب السمة بالاسم المحلي والقيمة المحددين. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب السمة بالبادئة المحددة، والاسم المحلي، وعنوان URI للمساحة الاسمية، والقيمة. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | عند تجاوزها في فئة مشتقة، تقوم بترميز البايتات الثنائية المحددة كـ Base64 وتكتب النص الناتج. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | عند تجاوزها في فئة مشتقة، تقوم بترميز البايتات الثنائية المحددة كـ **BinHex** وتكتب النص الناتج. |
| virtual [WriteCData](./writecdata/)(String) | عند تجاوزها في فئة مشتقة، تكتب كتلة **...** تحتوي على النص المحدد. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | عند تجاوزها في فئة مشتقة، تُجبر على توليد كيان حرف للقيمة المحددة من حرف Unicode. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | عند تجاوزها في فئة مشتقة، تكتب النص مخزنًا مؤقتًا واحدًا في كل مرة. |
| virtual [WriteComment](./writecomment/)(String) | عند تجاوزها في فئة مشتقة، تكتب تعليق **** يحتوي على النص المحدد. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب إعلان DOCTYPE بالاسم المحدد والسمات الاختيارية. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | يكتب عنصرًا بالاسم المحلي والقيمة المحددين. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | يكتب عنصرًا بالاسم المحلي، وعنوان URI للمساحة الاسمية، والقيمة المحددين. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | يكتب عنصرًا بالبادئة، والاسم المحلي، وعنوان URI للمساحة الاسمية، والقيمة المحددين. |
| virtual [WriteEndAttribute](./writeendattribute/)() | عند تجاوزها في فئة مشتقة، تغلق الاستدعاء السابق XmlWriter::WriteStartAttribute(String,String). |
| virtual [WriteEndDocument](./writeenddocument/)() | عند تجاوزها في فئة مشتقة، تغلق أي عناصر أو سمات مفتوحة وتعيد الكاتب إلى حالة البداية. |
| virtual [WriteEndElement](./writeendelement/)() | عند تجاوزها في فئة مشتقة، تغلق عنصرًا واحدًا وتزيل نطاق الاسم المقابل. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب إشارة كيان كـ **&name**;. |
| virtual [WriteFullEndElement](./writefullendelement/)() | عند تجاوزها في فئة مشتقة، تغلق عنصرًا واحدًا وتزيل نطاق الاسم المقابل. |
| virtual [WriteName](./writename/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب الاسم المحدد، مع التأكد من أنه اسم صالح وفقًا لتوصية W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب الاسم المحدد، مع التأكد من أنه NmToken صالح وفقًا لتوصية W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | عند تجاوزها في فئة مشتقة، تنسخ كل شيء من القارئ إلى الكاتب وتنتقل القارئ إلى بداية الأخ الأصغر التالي. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | ينسخ كل شيء من كائن XPathNavigator إلى الكاتب. يبقى موضع XPathNavigator دون تغيير. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | عند تجاوزها في فئة مشتقة، تكتب تعليمًا معالجة مع مسافة بين الاسم والنص كما يلي: **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب الاسم المؤهل بالمساحة الاسمية. تبحث هذه الطريقة عن البادئة المتاحة للمساحة الاسمية المعطاة. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | عند تجاوزها في فئة مشتقة، تكتب العلامات الخام يدويًا من مخزن الأحرف. |
| virtual [WriteRaw](./writeraw/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب العلامات الخام يدويًا من سلسلة نصية. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | يكتب بداية سمة بالاسم المحلي المحدد ومعرف مساحة الاسم. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب بداية سمة بالبادئة المحددة والاسم المحلي ومعرف مساحة الاسم. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | يكتب بداية سمة بالاسم المحلي المحدد. |
| virtual [WriteStartDocument](./writestartdocument/)() | عند تجاوزها في فئة مشتقة، تكتب إعلان XML بالإصدار "1.0". |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | عند تجاوزها في فئة مشتقة، تكتب إعلان XML بالإصدار "1.0" وخصيصة standalone. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب علامة البداية المحددة وتربطها بالمساحة الاسمية المعطاة. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | عند تجاوزها في فئة مشتقة، تكتب علامة البداية المحددة وتربطها بالمساحة الاسمية والبادئة المعطاة. |
| [WriteStartElement](./writestartelement/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب علامة بداية بالاسم المحلي المحدد. |
| virtual [WriteString](./writestring/)(const String\&) | عند تجاوزها في فئة مشتقة، تكتب محتوى النص المعطى. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | عند تجاوزها في فئة مشتقة، تُنشئ وتكتب كيان الحرف البديل للزوج البديل من الأحرف. |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | يكتب قيمة الكائن. |
| virtual [WriteValue](./writevalue/)(const String\&) | يكتب قيمة [String](../../system/string/). |
| virtual [WriteValue](./writevalue/)(bool) | يكتب قيمة [Boolean](../../system/boolean/). |
| virtual [WriteValue](./writevalue/)(DateTime) | يكتب قيمة [DateTime](../../system/datetime/). |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | يكتب قيمة [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [WriteValue](./writevalue/)(double) | يكتب قيمة [Double](../../system/double/). |
| virtual [WriteValue](./writevalue/)(float) | يكتب عددًا عائمًا بدقة أحادية. |
| virtual [WriteValue](./writevalue/)(Decimal) | يكتب قيمة [Decimal](../../system/decimal/). |
| virtual [WriteValue](./writevalue/)(int32_t) | يكتب قيمة [Int32](../../system/int32/). |
| virtual [WriteValue](./writevalue/)(int64_t) | يكتب قيمة [Int64](../../system/int64/). |
| virtual [WriteWhitespace](./writewhitespace/)(String) | عند تجاوزها في فئة مشتقة، تكتب المسافة البيضاء المعطاة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
