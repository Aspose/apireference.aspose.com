---
title: "System::Xml::Xsl::XslTransform::Load طريقة"
linktitle: "تحميل"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Xsl::XslTransform::Load طريقة. يقوم بتحميل ورقة الأنماط XSLT الموجودة في IXPathNavigable في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


يقوم بتحميل ورقة الأنماط XSLT الموجودة في IXPathNavigable.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن ينفّذ واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على ورقة الأنماط XSLT. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يقوم بتحميل ورقة الأنماط XSLT الموجودة في IXPathNavigable.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن ينفّذ واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على ورقة الأنماط XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | الـ [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لتحميل أي أوراق أنماط مشار إليها في عناصر **xsl:import** و **xsl:include**. إذا كان هذا **nullptr**، لن يتم حل الموارد الخارجية. الـ [XmlResolver](../../../system.xml/xmlresolver/) غير مخزن مؤقتًا بعد إكمال هذه الطريقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


يقوم بتحميل ورقة الأنماط XSLT الموجودة في XPathNavigator.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ورقة الأنماط | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | كائن XPathNavigator يحتوي على ورقة الأنماط XSLT. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يقوم بتحميل ورقة الأنماط XSLT الموجودة في XPathNavigator.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ورقة الأنماط | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | كائن XPathNavigator يحتوي على ورقة الأنماط XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | الـ [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لتحميل أي أوراق أنماط مشار إليها في عناصر **xsl:import** و **xsl:include**. إذا كان هذا **nullptr**، لن يتم حل الموارد الخارجية. الـ [XmlResolver](../../../system.xml/xmlresolver/) غير مخزن مؤقتًا بعد إكمال هذه الطريقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


يقوم بتحميل ورقة الأنماط XSLT الموجودة في [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | كائن [XmlReader](../../../system.xml/xmlreader/) يحتوي على ورقة الأنماط XSLT. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يقوم بتحميل ورقة الأنماط XSLT الموجودة في [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | كائن [XmlReader](../../../system.xml/xmlreader/) يحتوي على ورقة الأنماط XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | الـ [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لتحميل أي أوراق أنماط مشار إليها في عناصر **xsl:import** و **xsl:include**. إذا كان هذا **nullptr**، لن يتم حل الموارد الخارجية. الـ [XmlResolver](../../../system.xml/xmlresolver/) غير مخزن مؤقتًا بعد إكمال هذه الطريقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const String\&) method


يقوم بتحميل ورقة الأنماط XSLT المحددة بواسطة عنوان URL.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| url | const String\& | عنوان URL الذي يحدد ورقة الأنماط XSLT للتحميل. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يقوم بتحميل ورقة الأنماط XSLT المحددة بواسطة عنوان URL.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| url | const String\& | عنوان URL الذي يحدد ورقة الأنماط XSLT للتحميل. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | الـ [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لتحميل ورقة الأنماط وأي ورقة(ات) أنماط مشار إليها في عناصر **xsl:import** و **xsl:include**. إذا كان هذا **nullptr**، يتم استخدام [XmlUrlResolver](../../../system.xml/xmlurlresolver/) افتراضي بدون بيانات اعتماد مستخدم لفتح ورقة الأنماط. لا يُستخدم [XmlUrlResolver](../../../system.xml/xmlurlresolver/) الافتراضي لحل أي موارد خارجية في ورقة الأنماط، لذا لا يتم حل عناصر **xsl:import** و **xsl:include**. الـ [XmlResolver](../../../system.xml/xmlresolver/) غير مخزن مؤقتًا بعد إكمال هذه الطريقة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
