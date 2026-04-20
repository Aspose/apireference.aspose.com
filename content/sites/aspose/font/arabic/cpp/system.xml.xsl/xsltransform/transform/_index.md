---
title: "طريقة System::Xml::Xsl::XslTransform::Transform"
linktitle: "تحويل"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Xsl::XslTransform::Transform. تقوم بتحويل بيانات XML في IXPathNavigable باستخدام **args** المحددة وتخرج النتيجة إلى XmlReader في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


يقوم بتحويل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |

### ReturnValue

[XmlReader](../../../system.xml/xmlreader/) يحتوي على نتائج التحويل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| الإخراج | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| الإخراج | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد إخراج البيانات إليه. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فلن يتم حل دالة **document()**. لا يتم تخزين [XmlResolver](../../../system.xml/xmlresolver/) في الذاكرة المؤقتة بعد إكمال طريقة [XslTransform::Transform](./). |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| الإخراج | const SharedPtr\<IO::TextWriter\>\& | TextWriter الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| الإخراج | const SharedPtr\<IO::TextWriter\>\& | TextWriter الذي تريد إخراج البيانات إليه. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فلن يتم حل دالة **document()**. لا يتم تخزين [XmlResolver](../../../system.xml/xmlresolver/) في الذاكرة المؤقتة بعد إكمال هذه الطريقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يقوم بتحويل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فلن يتم حل دالة **document()**. لا يتم تخزين [XmlResolver](../../../system.xml/xmlresolver/) في الذاكرة المؤقتة بعد إكمال هذه الطريقة. |

### ReturnValue

[XmlReader](../../../system.xml/xmlreader/) يحتوي على نتائج التحويل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


يقوم بتحويل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| output | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يقوم بتحويل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يطبق واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| output | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد إخراج البيانات إليه. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فلن يتم حل دالة **document()**. لا يتم تخزين [XmlResolver](../../../system.xml/xmlresolver/) في الذاكرة المؤقتة بعد إكمال هذه الطريقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XPathNavigator يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |

### ReturnValue

[XmlReader](../../../system.xml/xmlreader/) يحتوي على نتائج التحويل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XPathNavigator يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| الإخراج | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XPathNavigator يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| الإخراج | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد إخراج البيانات إليه. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فلن يتم حل دالة **document()**. لا يتم تخزين [XmlResolver](../../../system.xml/xmlresolver/) في الذاكرة المؤقتة بعد إكمال هذه الطريقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XPathNavigator يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| الإخراج | const SharedPtr\<IO::TextWriter\>\& | TextWriter الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XPathNavigator يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| الإخراج | const SharedPtr\<IO::TextWriter\>\& | TextWriter الذي تريد إخراج البيانات إليه. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فلن يتم حل دالة **document()**. لا يتم تخزين [XmlResolver](../../../system.xml/xmlresolver/) في الذاكرة المؤقتة بعد إكمال هذه الطريقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XPathNavigator يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فلن يتم حل دالة **document()**. لا يتم تخزين [XmlResolver](../../../system.xml/xmlresolver/) في الذاكرة المؤقتة بعد إكمال هذه الطريقة. |

### ReturnValue

[XmlReader](../../../system.xml/xmlreader/) يحتوي على نتائج التحويل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


يحوّل بيانات XML في XPathNavigator باستخدام args المحددة ويخرج النتيجة إلى [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XPathNavigator يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| output | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد إخراج البيانات إليه. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يحوّل بيانات XML في XPathNavigator باستخدام args المحددة ويخرج النتيجة إلى [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XPathNavigator يحتوي على البيانات التي سيتم تحويلها. |
| args | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) يحتوي على الوسائط المؤهلة بالمساحة الاسمية المستخدمة كمدخل للتحويل. |
| output | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) الذي تريد إخراج البيانات إليه. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فلن يتم حل دالة **document()**. لا يتم تخزين [XmlResolver](../../../system.xml/xmlresolver/) في الذاكرة المؤقتة بعد إكمال هذه الطريقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


يحوّل بيانات XML في ملف الإدخال ويخرج النتيجة إلى ملف الإخراج.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ملف الإدخال | const String\& | عنوان URL للمستند المصدر الذي سيتم تحويله. |
| ملف الإخراج | const String\& | عنوان URL لملف الإخراج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يحوّل بيانات XML في ملف الإدخال ويخرج النتيجة إلى ملف الإخراج.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ملف الإدخال | const String\& | عنوان URL للمستند المصدر الذي سيتم تحويله. |
| ملف الإخراج | const String\& | عنوان URL لملف الإخراج. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل دالة XSLT **document()**. إذا كان هذا **nullptr**، فلن يتم حل دالة **document()**. لا يتم تخزين [XmlResolver](../../../system.xml/xmlresolver/) في الذاكرة المؤقتة بعد إكمال طريقة [XslTransform::Transform](./). |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
