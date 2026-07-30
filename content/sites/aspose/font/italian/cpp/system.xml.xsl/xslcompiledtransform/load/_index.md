---
title: "System::Xml::Xsl::XslCompiledTransform::Load metodo"
linktitle: "Carica"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::XslCompiledTransform::Load metodo. Compila il foglio di stile contenuto nell'oggetto IXPathNavigable in C++."
type: docs
weight: 300
url: /it/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Compila il foglio di stile contenuto nell'oggetto IXPathNavigable.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente il foglio di stile. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


Compila il foglio di stile XSLT contenuto nell'IXPathNavigable. Il [XmlResolver](../../../system.xml/xmlresolver/) risolve tutti gli elementi XSLT **import** o **include** e le impostazioni XSLT determinano le autorizzazioni per il foglio di stile.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), oppure un XPathDocument contenente il foglio di stile. |
| settings | SharedPtr\<XsltSettings\> | Le [XsltSettings](../../xsltsettings/) da applicare al foglio di stile. Se questo è **nullptr**, viene applicata l'impostazione [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | SharedPtr\<XmlResolver\> | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere tutti i fogli di stile referenziati negli elementi XSLT **import** e **include**. Se questo è **nullptr**, le risorse esterne non vengono risolte. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


Compila il foglio di stile contenuto nel [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Un [XmlReader](../../../system.xml/xmlreader/) contenente il foglio di stile. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Compila il foglio di stile XSLT contenuto nel [XmlReader](../../../system.xml/xmlreader/). Il [XmlResolver](../../../system.xml/xmlresolver/) risolve tutti gli elementi XSLT **import** o **include** e le impostazioni XSLT determinano le autorizzazioni per il foglio di stile.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Il [XmlReader](../../../system.xml/xmlreader/) contenente il foglio di stile. |
| settings | const SharedPtr\<XsltSettings\>\& | Le [XsltSettings](../../xsltsettings/) da applicare al foglio di stile. Se questo è **nullptr**, viene applicata l'impostazione [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) usato per risolvere tutti i fogli di stile referenziati negli elementi XSLT **import** e **include**. Se questo è **nullptr**, le risorse esterne non vengono risolte. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


Carica e compila il foglio di stile situato all'URI specificato.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stylesheetUri | const String\& | L'URI del foglio di stile. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Carica e compila il foglio di stile XSLT specificato dall'URI. Il [XmlResolver](../../../system.xml/xmlresolver/) risolve tutti gli elementi XSLT **import** o **include** e le impostazioni XSLT determinano le autorizzazioni per il foglio di stile.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stylesheetUri | const String\& | L'URI del foglio di stile. |
| settings | const SharedPtr\<XsltSettings\>\& | Le [XsltSettings](../../xsltsettings/) da applicare al foglio di stile. Se questo è **nullptr**, viene applicata l'impostazione [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) utilizzato per risolvere l'URI del foglio di stile e tutti i fogli di stile referenziati negli elementi XSLT **import** e **include**. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
