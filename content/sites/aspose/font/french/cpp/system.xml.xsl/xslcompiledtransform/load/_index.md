---
title: "System::Xml::Xsl::XslCompiledTransform::Load method"
linktitle: "Charger"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Xsl::XslCompiledTransform::Load method. Compile la feuille de style contenue dans l'objet IXPathNavigable en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Compile la feuille de style contenue dans l'objet IXPathNavigable.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant la feuille de style. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


Compile la feuille de style XSLT contenue dans l'IXPathNavigable. Le [XmlResolver](../../../system.xml/xmlresolver/) résout tous les éléments XSLT **import** ou **include** et les paramètres XSLT déterminent les autorisations pour la feuille de style.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant la feuille de style. |
| settings | SharedPtr\<XsltSettings\> | Les [XsltSettings](../../xsltsettings/) à appliquer à la feuille de style. Si cette valeur est **nullptr**, le paramètre [XsltSettings::get_Default](../../xsltsettings/get_default/) est appliqué. |
| stylesheetResolver | SharedPtr\<XmlResolver\> | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre toutes les feuilles de style référencées dans les éléments XSLT **import** et **include**. Si cette valeur est **nullptr**, les ressources externes ne sont pas résolues. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


Compile la feuille de style contenue dans le [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Un [XmlReader](../../../system.xml/xmlreader/) contenant la feuille de style. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Compile la feuille de style XSLT contenue dans le [XmlReader](../../../system.xml/xmlreader/). Le [XmlResolver](../../../system.xml/xmlresolver/) résout tous les éléments XSLT **import** ou **include** et les paramètres XSLT déterminent les autorisations pour la feuille de style.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Le [XmlReader](../../../system.xml/xmlreader/) contenant la feuille de style. |
| settings | const SharedPtr\<XsltSettings\>\& | Les [XsltSettings](../../xsltsettings/) à appliquer à la feuille de style. Si cette valeur est **nullptr**, le paramètre [XsltSettings::get_Default](../../xsltsettings/get_default/) est appliqué. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre toutes les feuilles de style référencées dans les éléments XSLT **import** et **include**. Si cette valeur est **nullptr**, les ressources externes ne sont pas résolues. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


Charge et compile la feuille de style située à l'URI spécifié.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheetUri | const String\& | L'URI de la feuille de style. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Charge et compile la feuille de style XSLT spécifiée par l'URI. Le [XmlResolver](../../../system.xml/xmlresolver/) résout tous les éléments XSLT **import** ou **include** et les paramètres XSLT déterminent les autorisations pour la feuille de style.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| stylesheetUri | const String\& | L'URI de la feuille de style. |
| settings | const SharedPtr\<XsltSettings\>\& | Les [XsltSettings](../../xsltsettings/) à appliquer à la feuille de style. Si cette valeur est **nullptr**, le paramètre [XsltSettings::get_Default](../../xsltsettings/get_default/) est appliqué. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre l'URI de la feuille de style et toutes les feuilles de style référencées dans les éléments XSLT **import** et **include**. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
