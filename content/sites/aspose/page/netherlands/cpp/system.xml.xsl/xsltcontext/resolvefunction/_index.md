---
title: "System::Xml::Xsl::XsltContext::ResolveFunction-methode"
linktitle: "ResolveFunction"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction-methode. Wanneer overschreven in een afgeleide klasse, lost het een functiereferentie op en retourneert een IXsltContextFunction die de functie vertegenwoordigt. De IXsltContextFunction wordt tijdens uitvoering gebruikt om de retourwaarde van de functie te verkrijgen in C++."
type: docs
weight: 400
url: /nl/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


Wanneer overschreven in een afgeleide klasse, lost het een functiereferentie op en retourneert een [IXsltContextFunction](../../ixsltcontextfunction/) die de functie vertegenwoordigt. De [IXsltContextFunction](../../ixsltcontextfunction/) wordt tijdens uitvoering gebruikt om de retourwaarde van de functie te verkrijgen.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| prefix | String | Het voorvoegsel van de functie zoals het voorkomt in de [XPath](../../../system.xml.xpath/) expressie. |
| name | String | De naam van de functie. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | Een array van argumenttypen voor de functie die wordt opgelost. Hiermee kunt u kiezen tussen methoden met dezelfde naam (bijvoorbeeld overladen methoden). |

### ReturnValue

Een [IXsltContextFunction](../../ixsltcontextfunction/) die de functie vertegenwoordigt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
