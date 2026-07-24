---
title: "System::Xml::Xsl::XsltContext::CompareDocument‑metod"
linktitle: "CompareDocument"
second_title: "Aspose.Page för C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument‑metod. När den åsidosätts i en avledd klass jämför den de grundläggande Uniform Resource Identifiers (URI) för två dokument baserat på den ordning i vilken dokumenten laddades av XSLT‑processorn (det vill säga klassen XslTransform) i C++."
type: docs
weight: 100
url: /sv/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


När den åsidosätts i en avledd klass jämför den de grundläggande Uniform Resource Identifiers (URI) för två dokument baserat på den ordning i vilken dokumenten laddades av XSLT‑processorn (det vill säga klassen [XslTransform](../../xsltransform/)).

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| baseUri | String | Den grundläggande URI:n för det första dokumentet som ska jämföras. |
| nextbaseUri | String | Den grundläggande URI:n för det andra dokumentet som ska jämföras. |

### ReturnValue

Ett heltalsvärde som beskriver den relativa ordningen för de två grundläggande URI:erna: -1 om **baseUri** förekommer före **nextbaseUri**; 0 om de två URI:erna är identiska; och 1 om **baseUri** förekommer efter **nextbaseUri**.

## Se även

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
