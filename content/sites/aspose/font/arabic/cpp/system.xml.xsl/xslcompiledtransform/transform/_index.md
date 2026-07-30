---
title: "System::Xml::Xsl::XslCompiledTransform::Transform method"
linktitle: "تحويل"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Xsl::XslCompiledTransform::Transform method. ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى XmlWriter في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) الذي تم إرجاعه من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون لدى [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى تدفق. يوفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى TextWriter. يوفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::TextWriter\>\& | TextWriter الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/). يوفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) الذي تم إرجاعه من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون لدى [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/). يوفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية ويقوم [XmlResolver](../../../system.xml/xmlresolver/) بحل دالة XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | المستند المراد تحويله والذي يتم تحديده بواسطة كائن IXPathNavigable. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة الوسائط كـ [XsltArgumentList](../../xsltargumentlist/). |
| results | const SharedPtr\<XmlWriter\>\& | ‏[XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا كان ورقة الأنماط تحتوي على عنصر **xsl:output**، يجب عليك إنشاء الـ [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) الذي يتم إرجاعه من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). هذا يضمن أن الـ [XmlWriter](../../../system.xml/xmlwriter/) لديه إعدادات الإخراج الصحيحة. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | ‏[XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فإن دالة **document()** لن تُحل. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة كائن [XmlReader](../../../system.xml/xmlreader/) ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) الذي يحتوي على المستند الإدخالي. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) الذي تم إرجاعه من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون لدى [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة كائن [XmlReader](../../../system.xml/xmlreader/) ويخرج النتائج إلى تدفق. توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) يحتوي على المستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة كائن [XmlReader](../../../system.xml/xmlreader/) ويخرج النتائج إلى TextWriter. توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) يحتوي على المستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::TextWriter\>\& | TextWriter الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة كائن [XmlReader](../../../system.xml/xmlreader/) ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/). توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) يحتوي على المستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) الذي تم إرجاعه من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون لدى [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة كائن [XmlReader](../../../system.xml/xmlreader/) ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/). توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية و[XmlResolver](../../../system.xml/xmlresolver/) يحل دالة XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) يحتوي على المستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) الذي تم إرجاعه من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون لدى [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | ‏[XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فإن دالة **document()** لن تُحل. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة الـ URI ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputUri | const String\& | ‏URI الخاص بالمستند الإدخالي. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) الذي تم إرجاعه من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون لدى [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة الـ URI ويخرج النتائج إلى تدفق. توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputUri | const String\& | ‏URI الخاص بالمستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة URI ويخرج النتائج إلى TextWriter.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputUri | const String\& | ‏URI الخاص بالمستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::TextWriter\>\& | TextWriter الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة الـ URI ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/). توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputUri | const String\& | ‏URI الخاص بالمستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) الذي تم إرجاعه من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون لدى [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة URI ويخرج النتائج إلى ملف.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputUri | const String\& | ‏URI الخاص بالمستند الإدخالي. |
| resultsFile | const String\& | ‏URI الخاص بملف الإخراج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
