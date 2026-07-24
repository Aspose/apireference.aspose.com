---
title: "طريقة System::Xml::Xsl::XslCompiledTransform::Load"
linktitle: "تحميل"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Xsl::XslCompiledTransform::Load. تُجَمِّع ورقة الأنماط الموجودة في كائن IXPathNavigable في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


يقوم بتجميع ورقة الأنماط الموجودة في كائن IXPathNavigable.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يُنفّذ واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً ما يكون [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على ورقة الأنماط. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


يُجَمِّع ورقة الأنماط XSLT الموجودة في IXPathNavigable. يقوم [XmlResolver](../../../system.xml/xmlresolver/) بحل أي عناصر XSLT **import** أو **include** وتحدد إعدادات XSLT الأذونات لورقة الأنماط.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | كائن يُنفّذ واجهة IXPathNavigable. يمكن أن يكون إما [XmlNode](../../../system.xml/xmlnode/) (عادةً ما يكون [XmlDocument](../../../system.xml/xmldocument/))، أو XPathDocument يحتوي على ورقة الأنماط. |
| settings | SharedPtr\<XsltSettings\> | ‏[XsltSettings](../../xsltsettings/) لتطبيقها على ورقة الأنماط. إذا كان هذا **nullptr**، يتم تطبيق الإعداد [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | SharedPtr\<XmlResolver\> | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل أي أوراق أنماط مُشار إليها في عناصر XSLT **import** و **include**. إذا كان هذا **nullptr**، لن يتم حل الموارد الخارجية. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


يُجَمِّع ورقة الأنماط الموجودة في [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) يحتوي على ورقة الأنماط. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


يُجَمِّع ورقة الأنماط XSLT الموجودة في [XmlReader](../../../system.xml/xmlreader/). يقوم [XmlResolver](../../../system.xml/xmlresolver/) بحل أي عناصر XSLT **import** أو **include** وتحدد إعدادات XSLT الأذونات لورقة الأنماط.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) يحتوي على ورقة الأنماط. |
| settings | const SharedPtr\<XsltSettings\>\& | ‏[XsltSettings](../../xsltsettings/) لتطبيقها على ورقة الأنماط. إذا كان هذا **nullptr**، يتم تطبيق الإعداد [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل أي أوراق أنماط مُشار إليها في عناصر XSLT **import** و **include**. إذا كان هذا **nullptr**، لن يتم حل الموارد الخارجية. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


يقوم بتحميل وتجميع ورقة الأنماط الموجودة في URI المحدد.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| stylesheetUri | const String\& | معرف URI لورقة الأنماط. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


يقوم بتحميل وتجميع ورقة الأنماط XSLT المحددة بواسطة URI. يقوم [XmlResolver](../../../system.xml/xmlresolver/) بحل أي عناصر **import** أو **include** في XSLT وتحدد إعدادات XSLT الأذونات لورقة الأنماط.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| stylesheetUri | const String\& | معرف URI لورقة الأنماط. |
| settings | const SharedPtr\<XsltSettings\>\& | ‏[XsltSettings](../../xsltsettings/) لتطبيقها على ورقة الأنماط. إذا كان هذا **nullptr**، يتم تطبيق الإعداد [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | الـ [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل معرف URI لورقة الأنماط وأي أوراق أنماط مُشار إليها في عناصر **import** و **include** في XSLT. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
