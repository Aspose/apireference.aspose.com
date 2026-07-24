---
title: "System::Xml::Xsl::XsltContext::ResolveFunction Methode"
linktitle: "ResolveFunction"
second_title: "Aspose.Page für C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, löst sie eine Funktionsreferenz auf und gibt ein IXsltContextFunction zurück, das die Funktion darstellt. Das IXsltContextFunction wird zur Ausführungszeit verwendet, um den Rückgabewert der Funktion in C++ zu erhalten."
type: docs
weight: 400
url: /de/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, löst sie eine Funktionsreferenz auf und gibt ein [IXsltContextFunction](../../ixsltcontextfunction/) zurück, das die Funktion darstellt. Das [IXsltContextFunction](../../ixsltcontextfunction/) wird zur Ausführungszeit verwendet, um den Rückgabewert der Funktion zu erhalten.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| prefix | String | Das Präfix der Funktion, wie es im [XPath](../../../system.xml.xpath/)-Ausdruck erscheint. |
| name | String | Der Name der Funktion. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | Ein Array von Argumenttypen für die aufgelöste Funktion. Dies ermöglicht die Auswahl zwischen Methoden mit demselben Namen (z. B. überladene Methoden). |

### ReturnValue

Ein [IXsltContextFunction](../../ixsltcontextfunction/), das die Funktion darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
