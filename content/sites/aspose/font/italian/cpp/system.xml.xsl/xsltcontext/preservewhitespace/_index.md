---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace method"
linktitle: "PreserveWhitespace"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace method. Quando sovrascritto in una classe derivata, valuta se preservare i nodi di spazio bianco o rimuoverli per il contesto fornito in C++."
type: docs
weight: 300
url: /it/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


Quando sovrascritto in una classe derivata, valuta se preservare i nodi di spazio bianco o rimuoverli per il contesto dato.

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nodo | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Il nodo di spazio bianco da preservare o rimuovere nel contesto corrente. |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
