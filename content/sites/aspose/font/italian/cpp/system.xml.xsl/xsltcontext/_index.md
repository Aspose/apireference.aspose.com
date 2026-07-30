---
title: "System::Xml::Xsl::XsltContext classe"
linktitle: "XsltContext"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::XsltContext classe. Incapsula il contesto di esecuzione corrente del processore Extensible Stylesheet Language for Transformations (XSLT) consentendo al Linguaggio di Percorso XML (XPath) di risolvere funzioni, parametri e namespace all'interno delle espressioni XPath in C++."
type: docs
weight: 500
url: /it/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Incapsula il contesto di esecuzione corrente del processore Extensible Stylesheet Language for Transformations (XSLT) consentendo al Linguaggio di Percorso XML ([XPath](../../system.xml.xpath/)) di risolvere funzioni, parametri e namespace all'interno delle espressioni [XPath](../../system.xml.xpath/).

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | Quando sovrascritto in una classe derivata, confronta gli Uniform Resource Identifier (URI) di base di due documenti in base all'ordine in cui i documenti sono stati caricati dal processore XSLT (cioè, la classe [XslTransform](../xsltransform/)). |
| virtual [get_Whitespace](./get_whitespace/)() | Quando sovrascritto in una classe derivata, ottiene un valore che indica se includere i nodi di spazio bianco nell'output. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Quando sovrascritto in una classe derivata, valuta se preservare i nodi di spazio bianco o rimuoverli per il contesto dato. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | Quando sovrascritto in una classe derivata, risolve un riferimento a funzione e restituisce un [IXsltContextFunction](../ixsltcontextfunction/) che rappresenta la funzione. Il [IXsltContextFunction](../ixsltcontextfunction/) è usato al momento dell'esecuzione per ottenere il valore di ritorno della funzione. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | Quando sovrascritto in una classe derivata, risolve un riferimento a variabile e restituisce un [IXsltContextVariable](../ixsltcontextvariable/) che rappresenta la variabile. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
