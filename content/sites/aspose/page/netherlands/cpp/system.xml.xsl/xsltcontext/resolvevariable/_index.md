---
title: "System::Xml::Xsl::XsltContext::ResolveVariable-methode"
linktitle: "ResolveVariable"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XsltContext::ResolveVariable-methode. Wanneer overschreven in een afgeleide klasse, lost een variabelereferentie op en retourneert een IXsltContextVariable die de variabele vertegenwoordigt in C++."
type: docs
weight: 500
url: /nl/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


Wanneer overschreven in een afgeleide klasse, lost een variabelereferentie op en retourneert een [IXsltContextVariable](../../ixsltcontextvariable/) die de variabele vertegenwoordigt.

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| prefix | String | Het voorvoegsel van de variabele zoals het voorkomt in de [XPath](../../../system.xml.xpath/) expressie. |
| name | String | De naam van de variabele. |

### ReturnValue

Een [IXsltContextVariable](../../ixsltcontextvariable/) die de variabele tijdens runtime vertegenwoordigt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
