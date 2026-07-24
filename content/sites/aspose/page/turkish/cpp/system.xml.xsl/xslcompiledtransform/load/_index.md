---
title: "System::Xml::Xsl::XslCompiledTransform::Load yöntemi"
linktitle: "Yükle"
second_title: "Aspose.Page için C++"
description: "System::Xml::Xsl::XslCompiledTransform::Load yöntemi. C++ içinde IXPathNavigable nesnesinde bulunan stil sayfasını derler."
type: docs
weight: 300
url: /tr/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


IXPathNavigable nesnesinde bulunan stil sayfasını derler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Stil sayfasını içeren bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da bir XPathDocument olabilir. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


IXPathNavigable içinde bulunan XSLT stil sayfasını derler. [XmlResolver](../../../system.xml/xmlresolver/) herhangi bir XSLT **import** veya **include** öğesini çözer ve XSLT ayarları stil sayfası için izinleri belirler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Stil sayfasını içeren bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da bir XPathDocument olabilir. |
| settings | SharedPtr\<XsltSettings\> | Stil sayfasına uygulanacak [XsltSettings](../../xsltsettings/). Bu **nullptr** ise, [XsltSettings::get_Default](../../xsltsettings/get_default/) ayarı uygulanır. |
| stylesheetResolver | SharedPtr\<XmlResolver\> | XSLT **import** ve **include** öğelerinde başvurulan stil sayfalarını çözmek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Bu **nullptr** ise, dış kaynaklar çözülmez. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) içinde bulunan stil sayfasını derler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Stil sayfasını içeren bir [XmlReader](../../../system.xml/xmlreader/). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/) içinde bulunan XSLT stil sayfasını derler. [XmlResolver](../../../system.xml/xmlresolver/) herhangi bir XSLT **import** veya **include** öğesini çözer ve XSLT ayarları stil sayfası için izinleri belirler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Stil sayfasını içeren [XmlReader](../../../system.xml/xmlreader/). |
| settings | const SharedPtr\<XsltSettings\>\& | Stil sayfasına uygulanacak [XsltSettings](../../xsltsettings/). Bu **nullptr** ise, [XsltSettings::get_Default](../../xsltsettings/get_default/) ayarı uygulanır. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | XSLT **import** ve **include** öğelerinde başvurulan stil sayfalarını çözmek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Bu **nullptr** ise, dış kaynaklar çözülmez. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


Belirtilen URI'de bulunan stil sayfasını yükler ve derler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stylesheetUri | const String\& | Stil sayfasının URI'si. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


URI tarafından belirtilen XSLT stil sayfasını yükler ve derler. [XmlResolver](../../../system.xml/xmlresolver/) XSLT **import** veya **include** öğelerini çözer ve XSLT ayarları stil sayfası için izinleri belirler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stylesheetUri | const String\& | Stil sayfasının URI'si. |
| settings | const SharedPtr\<XsltSettings\>\& | Stil sayfasına uygulanacak [XsltSettings](../../xsltsettings/). Bu **nullptr** ise, [XsltSettings::get_Default](../../xsltsettings/get_default/) ayarı uygulanır. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) stil sayfası URI'sini ve XSLT **import** ve **include** öğelerinde başvurulan stil sayfalarını çözmek için kullanılır. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
