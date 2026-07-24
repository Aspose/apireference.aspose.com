---
title: "System::Xml::Xsl::XsltContext::ResolveFunction metod"
linktitle: "ResolveFunction"
second_title: "Aspose.Page för C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction metod. När den åsidosätts i en avledd klass löser den en funktionsreferens och returnerar ett IXsltContextFunction som representerar funktionen. IXsltContextFunction används vid exekvering för att hämta funktionens returvärde i C++."
type: docs
weight: 400
url: /sv/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


När den åsidosätts i en avledd klass löser den en funktionsreferens och returnerar ett [IXsltContextFunction](../../ixsltcontextfunction/) som representerar funktionen. [IXsltContextFunction](../../ixsltcontextfunction/) används vid exekvering för att hämta funktionens returvärde.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| prefix | String | Prefixet för funktionen som den visas i [XPath](../../../system.xml.xpath/)-uttrycket. |
| namn | String | Namnet på funktionen. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | En array av argumenttyper för den funktion som löses. Detta gör det möjligt att välja mellan metoder med samma namn (till exempel överlagrade metoder). |

### ReturnValue

Ett [IXsltContextFunction](../../ixsltcontextfunction/) som representerar funktionen.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
