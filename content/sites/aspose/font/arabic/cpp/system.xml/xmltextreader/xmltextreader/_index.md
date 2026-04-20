---
title: "منشئ System::Xml::XmlTextReader::XmlTextReader"
linktitle: "XmlTextReader"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Xml::XmlTextReader::XmlTextReader. يهيئ نسخة جديدة من فئة XmlTextReader باستخدام الدفق المحدد في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


يهيئ نسخة جديدة من فئة [XmlTextReader](../) باستخدام الدفق المحدد.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML للقراءة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


يهيئ نسخة جديدة من فئة [XmlTextReader](../) باستخدام الدفق المحدد و[XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML للقراءة. |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ[XmlNameTable](../../xmlnametable/) للاستخدام. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


يهيئ نسخة جديدة من فئة [XmlTextReader](../) باستخدام الدفق المحدد، [XmlNodeType](../../xmlnodetype/)، و[XmlParserContext](../../xmlparsercontext/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على مقطع XML للتحليل. |
| fragType | XmlNodeType | [XmlNodeType](../../xmlnodetype/) لمقطع XML. هذا أيضًا يحدد ما يمكن أن يحتويه المقطع. |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) الذي سيتم فيه تحليل **xmlFragment**. يتضمن ذلك [XmlNameTable](../../xmlnametable/) للاستخدام، الترميز، نطاق الفضاء الاسمي، **xml:lang** الحالي، ونطاق **xml:space**. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


يهيئ نسخة جديدة من فئة [XmlTextReader](../) باستخدام القارئ النصي المحدد.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<IO::TextReader\>\& | قارئ النص TextReader الذي يحتوي على بيانات XML للقراءة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


يقوم بتهيئة نسخة جديدة من الفئة [XmlTextReader](../) باستخدام الـ TextReader المحدد و[XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<IO::TextReader\>\& | قارئ النص TextReader الذي يحتوي على بيانات XML للقراءة. |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ[XmlNameTable](../../xmlnametable/) للاستخدام. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


يقوم بتهيئة نسخة جديدة من الفئة [XmlTextReader](../) باستخدام الملف المحدد.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| url | const String\& | عنوان URL للملف الذي يحتوي على بيانات XML. يتم تعيين [XmlTextReader::get_BaseURI](../get_baseuri/) إلى هذه القيمة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


يقوم بتهيئة نسخة جديدة من الفئة [XmlTextReader](../) باستخدام عنوان URL المحدد وتدفق البيانات.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| url | const String\& | عنوان URL المستخدم لحل الموارد الخارجية. يتم تعيين [XmlTextReader::get_BaseURI](../get_baseuri/) إلى هذه القيمة. |
| الإدخال | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML للقراءة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


يقوم بتهيئة نسخة جديدة من الفئة [XmlTextReader](../) باستخدام عنوان URL المحدد، وتدفق البيانات، و[XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| url | const String\& | عنوان URL المستخدم لحل الموارد الخارجية. يتم تعيين [XmlTextReader::get_BaseURI](../get_baseuri/) إلى هذه القيمة. إذا كان **url** هو **nullptr**، يتم تعيين **BaseURI** إلى [String::Empty](../../../system/string/empty/). |
| الإدخال | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML للقراءة. |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ[XmlNameTable](../../xmlnametable/) للاستخدام. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


يقوم بتهيئة نسخة جديدة من الفئة [XmlTextReader](../) باستخدام عنوان URL المحدد وTextReader.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| url | const String\& | عنوان URL المستخدم لحل الموارد الخارجية. يتم تعيين [XmlTextReader::get_BaseURI](../get_baseuri/) إلى هذه القيمة. |
| الإدخال | const SharedPtr\<IO::TextReader\>\& | قارئ النص TextReader الذي يحتوي على بيانات XML للقراءة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


يقوم بتهيئة نسخة جديدة من الفئة [XmlTextReader](../) باستخدام عنوان URL المحدد، وTextReader، و[XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| url | const String\& | عنوان URL المستخدم لحل الموارد الخارجية. يتم تعيين [XmlTextReader::get_BaseURI](../get_baseuri/) إلى هذه القيمة. إذا كان **url** هو **nullptr**، يتم تعيين **BaseURI** إلى [String::Empty](../../../system/string/empty/). |
| الإدخال | const SharedPtr\<IO::TextReader\>\& | قارئ النص TextReader الذي يحتوي على بيانات XML للقراءة. |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ[XmlNameTable](../../xmlnametable/) للاستخدام. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


يقوم بتهيئة نسخة جديدة من الفئة [XmlTextReader](../) باستخدام الملف المحدد و[XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| url | const String\& | عنوان URL للملف الذي يحتوي على بيانات XML للقراءة. |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ[XmlNameTable](../../xmlnametable/) للاستخدام. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


يقوم بتهيئة نسخة جديدة من الفئة [XmlTextReader](../) باستخدام السلسلة المحددة، و[XmlNodeType](../../xmlnodetype/)، و[XmlParserContext](../../xmlparsercontext/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xmlFragment | const String\& | السلسلة التي تحتوي على قطعة XML لتحليلها. |
| fragType | XmlNodeType | نوع [XmlNodeType](../../xmlnodetype/) لقطعة XML. هذا أيضًا يحدد ما يمكن أن تحتويه سلسلة القطعة. |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) الذي سيتم فيه تحليل **xmlFragment**. يتضمن ذلك [XmlNameTable](../../xmlnametable/) للاستخدام، الترميز، نطاق الفضاء الاسمي، **xml:lang** الحالي، ونطاق **xml:space**. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
