---
title: "منشئ System::Xml::XmlValidatingReader::XmlValidatingReader"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::Xml::XmlValidatingReader::XmlValidatingReader. يهيئ نسخة جديدة من فئة XmlValidatingReader بالقيم المحددة في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


يهيئ نسخة جديدة من فئة [XmlValidatingReader](../) بالقيم المحددة.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على مقطع XML للتحليل. |
| fragType | XmlNodeType | الـ [XmlNodeType](../../xmlnodetype/) لجزء XML. يحدد ما يمكن أن يحتويه الجزء (انظر الجدول أدناه). |
| context | const SharedPtr\<XmlParserContext\>\& | الـ [XmlParserContext](../../xmlparsercontext/) الذي سيتم فيه تحليل جزء XML. يتضمن ذلك [XmlNameTable](../../xmlnametable/) المستخدم، والترميز، ونطاق الفضاء الاسمي، و**xml:lang** الحالي، ونطاق **xml:space**. |
## ملاحظات



الجدول التالي يسرد القيم الصالحة لـ **fragType** وكيفية معالجة القارئ لكل نوع من أنواع العقد المختلفة. |||
|-|-|
| XmlNodeType | قد يحتوي الجزء على |
| Element | أي محتوى عنصر صالح (على سبيل المثال، أي تركيبة من العناصر، التعليقات، تعليمات المعالجة، cdata، النص، وإشارات الكيان). |
| Attribute | قيمة السمة (الجزء داخل علامات الاقتباس). |
| Document | محتويات مستند XML كامل؛ هذا يفرض قواعد مستوى المستند. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


يهيئ نسخة جديدة من فئة [XmlValidatingReader](../) التي تتحقق من صحة المحتوى المُسترجع من [XmlReader](../../xmlreader/) المحدد.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | قارئ [XmlReader](../../xmlreader/) للقراءة منه أثناء التحقق. يدعم التنفيذ الحالي فقط [XmlTextReader](../../xmltextreader/). |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


يهيئ نسخة جديدة من فئة [XmlValidatingReader](../) بالقيم المحددة.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xmlFragment | const String\& | السلسلة التي تحتوي على مقطع XML للتحليل. |
| fragType | XmlNodeType | نوع [XmlNodeType](../../xmlnodetype/) لجزء XML. هذا يحدد أيضًا ما يمكن أن يحتويه نص الجزء (انظر الجدول أدناه). |
| context | const SharedPtr\<XmlParserContext\>\& | سياق [XmlParserContext](../../xmlparsercontext/) الذي سيتم فيه تحليل جزء XML. يتضمن ذلك [NameTable](../../nametable/) للاستخدام، الترميز، نطاق الاسم، **xml:lang** الحالي، ونطاق **xml:space**. |
## ملاحظات



الجدول التالي يسرد القيم الصالحة لـ **fragType** وكيفية معالجة القارئ لكل نوع من أنواع العقد المختلفة. |||
|-|-|
| XmlNodeType | قد يحتوي الجزء على |
| Element | أي محتوى عنصر صالح (على سبيل المثال، أي تركيبة من العناصر، التعليقات، تعليمات المعالجة، cdata، النص، وإشارات الكيان). |
| Attribute | قيمة السمة (الجزء داخل علامات الاقتباس). |
| Document | محتويات مستند XML كامل؛ هذا يفرض قواعد مستوى المستند. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
