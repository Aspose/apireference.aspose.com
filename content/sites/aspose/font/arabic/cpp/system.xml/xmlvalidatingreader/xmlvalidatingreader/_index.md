---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader مُنشئ"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader مُنشئ. يهيئ نسخة جديدة من فئة XmlValidatingReader بالقيم المحددة في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


يهيئ نسخة جديدة من الفئة [XmlValidatingReader](../) بالقيم المحددة.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على مقطع XML للتحليل. |
| fragType | XmlNodeType | الـ [XmlNodeType](../../xmlnodetype/) للقطعة XML. يحدد هذا ما يمكن أن تحتويه القطعة (انظر الجدول أدناه). |
| context | const SharedPtr\<XmlParserContext\>\& | الـ [XmlParserContext](../../xmlparsercontext/) الذي سيُحلل فيه قطعة XML. يتضمن ذلك [XmlNameTable](../../xmlnametable/) المستخدم، والترميز، ونطاق الفضاء الاسمي، و**xml:lang** الحالي، ونطاق **xml:space**. |
## ملاحظات



الجدول التالي يسرد القيم الصالحة لـ **fragType** وكيفية تحليل القارئ لكل نوع من أنواع العقد المختلفة. |||
|-|-|
| XmlNodeType | قد يحتوي الجزء |
| Element | أي محتوى عنصر صالح (على سبيل المثال، أي تركيبة من العناصر، التعليقات، تعليمات المعالجة، cdata، النص، وإشارات الكيان). |
| Attribute | قيمة السمة (الجزء داخل علامات الاقتباس). |
| مستند | محتويات مستند XML كامل؛ هذا يفرض قواعد مستوى المستند. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


ينشئ مثيلاً جديدًا من الفئة [XmlValidatingReader](../) التي تتحقق من صحة المحتوى المسترجع من [XmlReader](../../xmlreader/) المحدد.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | ‏[XmlReader](../../xmlreader/) الذي يُقرأ منه أثناء التحقق. التنفيذ الحالي يدعم فقط [XmlTextReader](../../xmltextreader/). |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


يهيئ نسخة جديدة من الفئة [XmlValidatingReader](../) بالقيم المحددة.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xmlFragment | const String\& | السلسلة التي تحتوي على قطعة XML لتحليلها. |
| fragType | XmlNodeType | ‏[XmlNodeType](../../xmlnodetype/) لجزء XML. هذا يحدد أيضًا ما يمكن أن يحتويه سلسلة الجزء (انظر الجدول أدناه). |
| context | const SharedPtr\<XmlParserContext\>\& | ‏[XmlParserContext](../../xmlparsercontext/) الذي يُ解析 فيه جزء XML. يتضمن ذلك [NameTable](../../nametable/) المستخدم، الترميز، نطاق الفضاء الاسمي، **xml:lang** الحالي، ونطاق **xml:space**. |
## ملاحظات



الجدول التالي يسرد القيم الصالحة لـ **fragType** وكيفية تحليل القارئ لكل نوع من أنواع العقد المختلفة. |||
|-|-|
| XmlNodeType | قد يحتوي الجزء |
| Element | أي محتوى عنصر صالح (على سبيل المثال، أي تركيبة من العناصر، التعليقات، تعليمات المعالجة، cdata، النص، وإشارات الكيان). |
| Attribute | قيمة السمة (الجزء داخل علامات الاقتباس). |
| مستند | محتويات مستند XML كامل؛ هذا يفرض قواعد مستوى المستند. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
