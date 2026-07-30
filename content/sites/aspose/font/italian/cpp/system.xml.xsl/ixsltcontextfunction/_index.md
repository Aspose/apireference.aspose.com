---
title: "System::Xml::Xsl::IXsltContextFunction classe"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::IXsltContextFunction classe. Fornisce un'interfaccia a una funzione data definita nel foglio di stile Extensible Stylesheet Language for Transformations (XSLT) durante l'esecuzione a runtime in C++."
type: docs
weight: 100
url: /it/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


Fornisce un'interfaccia a una funzione specifica definita nel foglio di stile Extensible Stylesheet Language for Transformations (XSLT) durante l'esecuzione.

```cpp
class IXsltContextFunction : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | Restituisce i tipi del Linguaggio di Percorso XML ([XPath](../../system.xml.xpath/)) forniti per l'elenco degli argomenti della funzione. Queste informazioni possono essere utilizzate per scoprire la firma della funzione, il che consente di differenziare tra funzioni sovraccaricate. |
| virtual [get_Maxargs](./get_maxargs/)() | Restituisce il numero massimo di argomenti per la funzione. Questo consente all'utente di differenziare tra funzioni sovraccaricate. |
| virtual [get_Minargs](./get_minargs/)() | Restituisce il numero minimo di argomenti per la funzione. Questo consente all'utente di distinguere tra funzioni sovraccaricate. |
| virtual [get_ReturnType](./get_returntype/)() | Restituisce il tipo XPathResultType che rappresenta il tipo [XPath](../../system.xml.xpath/) restituito dalla funzione. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Fornisce il metodo per invocare la funzione con gli argomenti forniti nel contesto specificato. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
