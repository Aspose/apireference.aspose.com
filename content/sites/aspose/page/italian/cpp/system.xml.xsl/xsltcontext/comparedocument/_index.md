---
title: "System::Xml::Xsl::XsltContext::CompareDocument metodo"
linktitle: "CompareDocument"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::Xsl::XsltContext::CompareDocument. Quando sovrascritto in una classe derivata, confronta gli Uniform Resource Identifier (URI) di base di due documenti in base all'ordine in cui i documenti sono stati caricati dal processore XSLT (cioè dalla classe XslTransform) in C++."
type: docs
weight: 100
url: /it/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


Quando sovrascritto in una classe derivata, confronta gli Uniform Resource Identifier (URI) di base di due documenti in base all'ordine in cui i documenti sono stati caricati dal processore XSLT (cioè dalla classe [XslTransform](../../xsltransform/)).

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| baseUri | String | L'URI di base del primo documento da confrontare. |
| nextbaseUri | String | L'URI di base del secondo documento da confrontare. |

### ReturnValue

Un valore intero che descrive l'ordine relativo dei due URI di base: -1 se **baseUri** si verifica prima di **nextbaseUri**; 0 se i due URI di base sono identici; e 1 se **baseUri** si verifica dopo **nextbaseUri**.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
