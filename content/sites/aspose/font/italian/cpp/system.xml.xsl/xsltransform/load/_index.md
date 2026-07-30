---
title: "System::Xml::Xsl::XslTransform::Load metodo"
linktitle: "Carica"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::XslTransform::Load metodo. Carica il foglio di stile XSLT contenuto nell'IXPathNavigable in C++."
type: docs
weight: 200
url: /it/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Carica il foglio di stile XSLT contenuto nell'IXPathNavigable.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere sia un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), sia un XPathDocument contenente il foglio di stile XSLT. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Carica il foglio di stile XSLT contenuto nell'IXPathNavigable.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un oggetto che implementa l'interfaccia IXPathNavigable. Può essere sia un [XmlNode](../../../system.xml/xmlnode/) (tipicamente un [XmlDocument](../../../system.xml/xmldocument/)), sia un XPathDocument contenente il foglio di stile XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) utilizzato per caricare tutti i fogli di stile referenziati negli elementi **xsl:import** e **xsl:include**. Se è **nullptr**, le risorse esterne non vengono risolte. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


Carica il foglio di stile XSLT contenuto nel XPathNavigator.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| foglio di stile | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un oggetto XPathNavigator che contiene il foglio di stile XSLT. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Carica il foglio di stile XSLT contenuto nel XPathNavigator.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| foglio di stile | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un oggetto XPathNavigator che contiene il foglio di stile XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) utilizzato per caricare tutti i fogli di stile referenziati negli elementi **xsl:import** e **xsl:include**. Se è **nullptr**, le risorse esterne non vengono risolte. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


Carica il foglio di stile XSLT contenuto nel [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Un oggetto [XmlReader](../../../system.xml/xmlreader/) che contiene il foglio di stile XSLT. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Carica il foglio di stile XSLT contenuto nel [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Un oggetto [XmlReader](../../../system.xml/xmlreader/) che contiene il foglio di stile XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) utilizzato per caricare tutti i fogli di stile referenziati negli elementi **xsl:import** e **xsl:include**. Se è **nullptr**, le risorse esterne non vengono risolte. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const String\&) method


Carica il foglio di stile XSLT specificato da un URL.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| url | const String\& | L'URL che specifica il foglio di stile XSLT da caricare. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Carica il foglio di stile XSLT specificato da un URL.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| url | const String\& | L'URL che specifica il foglio di stile XSLT da caricare. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Il [XmlResolver](../../../system.xml/xmlresolver/) da utilizzare per caricare il foglio di stile e tutti i fogli di stile referenziati negli elementi **xsl:import** e **xsl:include**. Se è **nullptr**, viene utilizzato un [XmlUrlResolver](../../../system.xml/xmlurlresolver/) predefinito senza credenziali utente per aprire il foglio di stile. Il [XmlUrlResolver](../../../system.xml/xmlurlresolver/) predefinito non viene usato per risolvere risorse esterne nel foglio di stile, quindi gli elementi **xsl:import** e **xsl:include** non vengono risolti. Il [XmlResolver](../../../system.xml/xmlresolver/) non viene memorizzato nella cache dopo il completamento di questo metodo. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
