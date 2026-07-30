---
title: "System::Xml::Xsl::XslCompiledTransform::Load yöntemi"
linktitle: "Yükle"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::XslCompiledTransform::Load yöntemi. C++'ta IXPathNavigable nesnesinde bulunan stil sayfasını derler."
type: docs
weight: 300
url: /tr/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


IXPathNavigable nesnesinde bulunan stil sayfasını derler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da stil sayfasını içeren bir XPathDocument olabilir. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


IXPathNavigable içinde bulunan XSLT stil sayfasını derler. [XmlResolver](../../../system.xml/xmlresolver/) herhangi bir XSLT **import** veya **include** öğesini çözer ve XSLT ayarları stil sayfası için izinleri belirler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da stil sayfasını içeren bir XPathDocument olabilir. |
| settings | SharedPtr\<XsltSettings\> | Stil sayfasına uygulanacak [XsltSettings](../../xsltsettings/). Bu **nullptr** ise, [XsltSettings::get_Default](../../xsltsettings/get_default/) ayarı uygulanır. |
| stylesheetResolver | SharedPtr\<XmlResolver\> | XSLT **import** ve **include** öğelerinde başvurulan tüm stil sayfalarını çözmek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Eğer bu **nullptr** ise, dış kaynaklar çözülmez. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) içinde bulunan stil sayfasını derler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Stil sayfasını içeren bir [XmlReader](../../../system.xml/xmlreader/). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


XSLT stil sayfasını [XmlReader](../../../system.xml/xmlreader/) içinde derler. [XmlResolver](../../../system.xml/xmlresolver/) herhangi bir XSLT **import** veya **include** öğesini çözer ve XSLT ayarları stil sayfası için izinleri belirler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Stil sayfasını içeren [XmlReader](../../../system.xml/xmlreader/). |
| settings | const SharedPtr\<XsltSettings\>\& | Stil sayfasına uygulanacak [XsltSettings](../../xsltsettings/). Bu **nullptr** ise, [XsltSettings::get_Default](../../xsltsettings/get_default/) ayarı uygulanır. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | XSLT **import** ve **include** öğelerinde başvurulan tüm stil sayfalarını çözmek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Eğer bu **nullptr** ise, dış kaynaklar çözülmez. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


Belirtilen URI'da bulunan stil sayfasını yükler ve derler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| stylesheetUri | const String\& | Stil sayfasının URI'si. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


URI tarafından belirtilen XSLT stil sayfasını yükler ve derler. [XmlResolver](../../../system.xml/xmlresolver/) herhangi bir XSLT **import** veya **include** öğesini çözer ve XSLT ayarları stil sayfası için izinleri belirler.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| stylesheetUri | const String\& | Stil sayfasının URI'si. |
| settings | const SharedPtr\<XsltSettings\>\& | Stil sayfasına uygulanacak [XsltSettings](../../xsltsettings/). Bu **nullptr** ise, [XsltSettings::get_Default](../../xsltsettings/get_default/) ayarı uygulanır. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | Stil sayfası URI'sini ve XSLT **import** ve **include** öğelerinde başvurulan stil sayfalarını çözmek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
