---
title: "System::Xml::Xsl::XsltContext::CompareDocument Methode"
linktitle: "CompareDocument"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, vergleicht sie die Basis‑Uniform Resource Identifiers (URIs) von zwei Dokumenten basierend auf der Reihenfolge, in der die Dokumente vom XSLT‑Prozessor (das heißt, der XslTransform‑Klasse) in C++ geladen wurden."
type: docs
weight: 100
url: /de/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, vergleicht sie die Basis‑Uniform Resource Identifiers (URIs) von zwei Dokumenten basierend auf der Reihenfolge, in der die Dokumente vom XSLT‑Prozessor (das heißt, die [XslTransform](../../xsltransform/) Klasse) geladen wurden.

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| baseUri | String | Die Basis-URI des ersten zu vergleichenden Dokuments. |
| nextbaseUri | String | Die Basis-URI des zweiten zu vergleichenden Dokuments. |

### ReturnValue

Ein ganzzahliger Wert, der die relative Reihenfolge der beiden Basis-URIs beschreibt: -1, wenn **baseUri** vor **nextbaseUri** vorkommt; 0, wenn die beiden Basis-URIs identisch sind; und 1, wenn **baseUri** nach **nextbaseUri** vorkommt.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
