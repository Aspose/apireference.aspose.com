---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke Methode"
linktitle: "Invoke"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke Methode. Stellt die Methode bereit, um die Funktion mit den angegebenen Argumenten im angegebenen Kontext in C++ aufzurufen."
type: docs
weight: 500
url: /de/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


Stellt die Methode bereit, um die Funktion mit den angegebenen Argumenten im angegebenen Kontext aufzurufen.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | Der XSLT-Kontext für den Funktionsaufruf. |
| args | ArrayPtr\<SharedPtr\<Object\>\> | Die Argumente des Funktionsaufrufs. Jedes Argument ist ein Element im Array. |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Der Kontextknoten für den Funktionsaufruf. |

### ReturnValue

Ein [Object](../../../system/object/) repräsentiert den Rückgabewert der Funktion.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
