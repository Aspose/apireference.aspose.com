---
title: "System::Xml::Xsl::XsltContext::ResolveVariable Methode"
linktitle: "ResolveVariable"
second_title: "Aspose.Page für C++"
description: "System::Xml::Xsl::XsltContext::ResolveVariable Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, löst sie eine Variablenreferenz auf und gibt ein IXsltContextVariable zurück, das die Variable in C++ repräsentiert."
type: docs
weight: 500
url: /de/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, löst sie eine Variablenreferenz auf und gibt ein [IXsltContextVariable](../../ixsltcontextvariable/) zurück, das die Variable darstellt.

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| prefix | String | Das Präfix der Variablen, wie es im [XPath](../../../system.xml.xpath/) Ausdruck erscheint. |
| name | String | Der Name der Variablen. |

### ReturnValue

Ein [IXsltContextVariable](../../ixsltcontextvariable/) das die Variable zur Laufzeit darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
