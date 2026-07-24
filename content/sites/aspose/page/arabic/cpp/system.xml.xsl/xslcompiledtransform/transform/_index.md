---
title: "System::Xml::Xsl::XslCompiledTransform::Transform method"
linktitle: "Transform"
second_title: "Aspose.Page لـ C++"
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


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يُنفّذ واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| results | const SharedPtr\<XmlWriter\>\& | ـ [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء الـ [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) المُعاد من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون للـ [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى تدفق. يوفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يُنفّذ واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة [XsltArgumentList](../../xsltargumentlist/) تحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد الإخراج إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى TextWriter. يوفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يُنفّذ واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة [XsltArgumentList](../../xsltargumentlist/) تحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::TextWriter\>\& | كائن TextWriter الذي تريد الإخراج إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/). يوفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يُنفّذ واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة [XsltArgumentList](../../xsltargumentlist/) تحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | ـ [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء الـ [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) المُعاد من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون للـ [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/). يوفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية ويقوم الـ [XmlResolver](../../../system.xml/xmlresolver/) بحل دالة XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | المستند المراد تحويله المحدد بواسطة كائن IXPathNavigable. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة الوسائط كـ [XsltArgumentList](../../xsltargumentlist/). |
| results | const SharedPtr\<XmlWriter\>\& | ـ [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء الـ [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) الذي يتم إرجاعه من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون للـ [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | المُحَلّ [XmlResolver](../../../system.xml/xmlresolver/) يُستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فإن دالة **document()** لن تُحل. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة كائن [XmlReader](../../../system.xml/xmlreader/) ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) الذي يحتوي على المستند الإدخالي. |
| results | const SharedPtr\<XmlWriter\>\& | ـ [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء الـ [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) المُعاد من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون للـ [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة كائن [XmlReader](../../../system.xml/xmlreader/) ويخرج النتائج إلى تدفق. توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) يحتوي على المستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة [XsltArgumentList](../../xsltargumentlist/) تحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد الإخراج إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة كائن [XmlReader](../../../system.xml/xmlreader/) ويخرج النتائج إلى TextWriter. توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) يحتوي على المستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة [XsltArgumentList](../../xsltargumentlist/) تحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::TextWriter\>\& | كائن TextWriter الذي تريد الإخراج إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة كائن [XmlReader](../../../system.xml/xmlreader/) ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/). توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) يحتوي على المستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة [XsltArgumentList](../../xsltargumentlist/) تحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | ـ [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء الـ [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) المُعاد من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون للـ [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة كائن [XmlReader](../../../system.xml/xmlreader/) ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/). توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية و[XmlResolver](../../../system.xml/xmlresolver/) يحل دالة XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) يحتوي على المستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة [XsltArgumentList](../../xsltargumentlist/) تحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | ـ [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء الـ [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) المُعاد من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون للـ [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | المُحَلّ [XmlResolver](../../../system.xml/xmlresolver/) يُستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فإن دالة **document()** لن تُحل. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة URI ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputUri | const String\& | URI للمستند الإدخالي. |
| results | const SharedPtr\<XmlWriter\>\& | ـ [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء الـ [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) المُعاد من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون للـ [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة URI ويخرج النتائج إلى تدفق. توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputUri | const String\& | URI للمستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة [XsltArgumentList](../../xsltargumentlist/) تحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد الإخراج إليه. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة URI ويخرج النتائج إلى TextWriter.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputUri | const String\& | URI للمستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة [XsltArgumentList](../../xsltargumentlist/) تحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| النتائج | const SharedPtr\<IO::TextWriter\>\& | كائن TextWriter الذي تريد الإخراج إليه. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة URI ويخرج النتائج إلى [XmlWriter](../../../system.xml/xmlwriter/). توفر [XsltArgumentList](../../xsltargumentlist/) وسائط تشغيل إضافية.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputUri | const String\& | URI للمستند الإدخالي. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | قائمة [XsltArgumentList](../../xsltargumentlist/) تحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. يمكن أن تكون هذه القيمة **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | ـ [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد الإخراج إليه. إذا احتوت ورقة الأنماط على عنصر **xsl:output**، يجب إنشاء الـ [XmlWriter](../../../system.xml/xmlwriter/) باستخدام كائن [XmlWriterSettings](../../../system.xml/xmlwritersettings/) المُعاد من قيمة [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). يضمن ذلك أن يكون للـ [XmlWriter](../../../system.xml/xmlwriter/) إعدادات الإخراج الصحيحة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


ينفّذ التحويل باستخدام المستند الإدخالي المحدد بواسطة URI ويخرج النتائج إلى ملف.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputUri | const String\& | URI للمستند الإدخالي. |
| resultsFile | const String\& | URI لملف الإخراج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
