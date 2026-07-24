---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke-methode"
linktitle: "Invoke"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke-methode. Biedt de methode om de functie aan te roepen met de gegeven argumenten in de opgegeven context in C++."
type: docs
weight: 500
url: /nl/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


Biedt de methode om de functie aan te roepen met de gegeven argumenten in de opgegeven context.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | De XSLT-context voor de functieaanroep. |
| args | ArrayPtr\<SharedPtr\<Object\>\> | De argumenten van de functieaanroep. Elk argument is een element in de array. |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Het contextknooppunt voor de functieaanroep. |

### ReturnValue

Een [Object](../../../system.object/) die de retourwaarde van de functie vertegenwoordigt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
