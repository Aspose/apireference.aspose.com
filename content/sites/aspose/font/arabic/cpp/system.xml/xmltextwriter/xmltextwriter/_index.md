---
title: "منشئ System::Xml::XmlTextWriter::XmlTextWriter"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Xml::XmlTextWriter::XmlTextWriter. ينشئ مثيلًا من فئة XmlTextWriter باستخدام الدفق المحدد والترميز في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


ينشئ مثيلًا من فئة [XmlTextWriter](../) باستخدام الدفق المحدد والترميز.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد الكتابة إليه. |
| encoding | const SharedPtr\<Text::Encoding\>\& | الترميز المراد إنشاؤه. إذا كان الترميز هو **nullptr** فإنه يكتب الدفق كـ UTF-8 ويُهمل سمة الترميز من **ProcessingInstruction**. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


ينشئ مثيلًا من فئة [XmlTextWriter](../) باستخدام كاتب النص المحدد.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | كاتب النص للكتابة إليه. يُفترض أن كاتب النص مضبوط مسبقًا على الترميز الصحيح. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


ينشئ مثيلًا من فئة [XmlTextWriter](../) باستخدام الملف المحدد.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| filename | const String\& | اسم الملف للكتابة إليه. إذا كان الملف موجودًا، يتم تقصيره وإعادة كتابة المحتوى الجديد. |
| encoding | const SharedPtr\<Text::Encoding\>\& | الترميز المراد إنشاؤه. إذا كان الترميز هو **nullptr** فإنه يكتب الملف كـ UTF-8 ويُهمل سمة الترميز من **ProcessingInstruction**. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
