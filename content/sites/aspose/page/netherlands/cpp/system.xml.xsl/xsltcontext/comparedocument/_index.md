---
title: "System::Xml::Xsl::XsltContext::CompareDocument-methode"
linktitle: "CompareDocument"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument-methode. Wanneer overschreven in een afgeleide klasse, vergelijkt het de basis Uniform Resource Identifiers (URI's) van twee documenten op basis van de volgorde waarin de documenten werden geladen door de XSLT-processor (dat wil zeggen, de XslTransform-klasse) in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


Wanneer overschreven in een afgeleide klasse, vergelijkt het de basis Uniform Resource Identifiers (URI's) van twee documenten op basis van de volgorde waarin de documenten werden geladen door de XSLT-processor (dat wil zeggen, de [XslTransform](../../xsltransform/) klasse).

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| baseUri | String | De basis-URI van het eerste te vergelijken document. |
| nextbaseUri | String | De basis-URI van het tweede te vergelijken document. |

### ReturnValue

Een geheel getal dat de relatieve volgorde van de twee basis-URI's beschrijft: -1 als **baseUri** vóór **nextbaseUri** voorkomt; 0 als de twee basis-URI's identiek zijn; en 1 als **baseUri** na **nextbaseUri** voorkomt.

## Zie ook

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
