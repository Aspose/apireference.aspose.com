---
title: "Méthode System::Xml::Xsl::XslTransform::Load"
linktitle: "Charger"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Xsl::XslTransform::Load. Charge la feuille de style XSLT contenue dans l'IXPathNavigable en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Charge la feuille de style XSLT contenue dans le IXPathNavigable.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), ou d'un XPathDocument contenant la feuille de style XSLT. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Charge la feuille de style XSLT contenue dans le IXPathNavigable.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), ou d'un XPathDocument contenant la feuille de style XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour charger les feuilles de style référencées dans les éléments **xsl:import** et **xsl:include**. Si cette valeur est **nullptr**, les ressources externes ne sont pas résolues. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


Charge la feuille de style XSLT contenue dans le XPathNavigator.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un objet XPathNavigator qui contient la feuille de style XSLT. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Charge la feuille de style XSLT contenue dans le XPathNavigator.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un objet XPathNavigator qui contient la feuille de style XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour charger les feuilles de style référencées dans les éléments **xsl:import** et **xsl:include**. Si cette valeur est **nullptr**, les ressources externes ne sont pas résolues. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


Charge la feuille de style XSLT contenue dans le [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Un objet [XmlReader](../../../system.xml/xmlreader/) qui contient la feuille de style XSLT. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Charge la feuille de style XSLT contenue dans le [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Un objet [XmlReader](../../../system.xml/xmlreader/) qui contient la feuille de style XSLT. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour charger les feuilles de style référencées dans les éléments **xsl:import** et **xsl:include**. Si cette valeur est **nullptr**, les ressources externes ne sont pas résolues. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const String\&) method


Charge la feuille de style XSLT spécifiée par une URL.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| url | const String\& | L'URL qui spécifie la feuille de style XSLT à charger. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Charge la feuille de style XSLT spécifiée par une URL.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| url | const String\& | L'URL qui spécifie la feuille de style XSLT à charger. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) à utiliser pour charger la feuille de style et toute(s) feuille(s) de style référencée(s) dans les éléments **xsl:import** et **xsl:include**. Si cette valeur est **nullptr**, un [XmlUrlResolver](../../../system.xml/xmlurlresolver/) par défaut sans informations d'identification utilisateur est utilisé pour ouvrir la feuille de style. Le [XmlUrlResolver](../../../system.xml/xmlurlresolver/) par défaut n'est pas utilisé pour résoudre les ressources externes de la feuille de style, de sorte que les éléments **xsl:import** et **xsl:include** ne sont pas résolus. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
