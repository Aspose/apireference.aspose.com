---
title: "منشئ System::Xml::XmlTextWriter::XmlTextWriter"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::Xml::XmlTextWriter::XmlTextWriter. ينشئ مثيلاً لفئة XmlTextWriter باستخدام الدفق المحدد والترميز في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


ينشئ مثيلاً لفئة [XmlTextWriter](../) باستخدام الدفق المحدد والترميز.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد الكتابة إليه. |
| الترميز | const SharedPtr\<Text::Encoding\>\& | الترميز المطلوب توليده. إذا كان الترميز **nullptr** فإنه يكتب الدفق كـ UTF-8 ويتجاهل سمة الترميز من **ProcessingInstruction**. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


ينشئ مثيلاً لفئة [XmlTextWriter](../) باستخدام الـ TextWriter المحدد.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | الـ TextWriter للكتابة إليه. يُفترض أن الـ TextWriter مضبوط مسبقًا على الترميز الصحيح. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


ينشئ مثيلاً لفئة [XmlTextWriter](../) باستخدام الملف المحدد.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| اسم الملف | const String\& | اسم الملف للكتابة إليه. إذا كان الملف موجودًا، يتم تقصيره وإعادة كتابة المحتوى الجديد فوقه. |
| الترميز | const SharedPtr\<Text::Encoding\>\& | الترميز المطلوب توليده. إذا كان الترميز **nullptr** فإنه يكتب الملف كـ UTF-8 ويتجاهل سمة الترميز من **ProcessingInstruction**. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
