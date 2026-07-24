---
title: "System::Xml::Xsl::XsltContext klasse"
linktitle: "XsltContext"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XsltContext class. Omvat de huidige uitvoeringcontext van de Extensible Stylesheet Language for Transformations (XSLT) processor, waardoor XML Path Language (XPath) functies, parameters en namespaces kan oplossen binnen XPath-expressies in C++."
type: docs
weight: 500
url: /nl/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Omvat de huidige uitvoeringcontext van de Extensible Stylesheet Language for Transformations (XSLT) processor, waardoor XML Path Language ([XPath](../../system.xml.xpath/)) functies, parameters en namespaces kan oplossen binnen [XPath](../../system.xml.xpath/) expressies.

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | Wanneer overschreven in een afgeleide klasse, vergelijkt de basis Uniform Resource Identifiers (URI's) van twee documenten op basis van de volgorde waarin de documenten werden geladen door de XSLT-processor (dat wil zeggen, de [XslTransform](../xsltransform/) class). |
| virtual [get_Whitespace](./get_whitespace/)() | Wanneer overschreven in een afgeleide klasse, krijgt een waarde die aangeeft of witruimtenodes in de uitvoer moeten worden opgenomen. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Wanneer overschreven in een afgeleide klasse, evalueert of witruimtenodes moeten worden behouden of verwijderd voor de gegeven context. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | Wanneer overschreven in een afgeleide klasse, lost een functieverwijzing op en retourneert een [IXsltContextFunction](../ixsltcontextfunction/) die de functie vertegenwoordigt. De [IXsltContextFunction](../ixsltcontextfunction/) wordt tijdens de uitvoering gebruikt om de retourwaarde van de functie te verkrijgen. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | Wanneer overschreven in een afgeleide klasse, lost een variabelereferentie op en retourneert een [IXsltContextVariable](../ixsltcontextvariable/) die de variabele vertegenwoordigt. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
