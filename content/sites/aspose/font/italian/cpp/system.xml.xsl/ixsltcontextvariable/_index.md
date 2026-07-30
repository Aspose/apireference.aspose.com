---
title: "System::Xml::Xsl::IXsltContextVariable classe"
linktitle: "IXsltContextVariable"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::IXsltContextVariable classe. Fornisce un'interfaccia a una variabile data che è definita nel foglio di stile durante l'esecuzione a runtime in C++."
type: docs
weight: 200
url: /it/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


Fornisce un'interfaccia a una variabile specifica definita nel foglio di stile durante l'esecuzione.

```cpp
class IXsltContextVariable : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | Valuta la variabile a runtime e restituisce un oggetto che rappresenta il valore della variabile. |
| virtual [get_IsLocal](./get_islocal/)() | Restituisce un valore che indica se la variabile è locale. |
| virtual [get_IsParam](./get_isparam/)() | Restituisce un valore che indica se la variabile è un parametro Extensible Stylesheet Language Transformations (XSLT). Questo può essere un parametro di un foglio di stile o di un modello. |
| virtual [get_VariableType](./get_variabletype/)() | Restituisce il tipo XPathResultType che rappresenta il tipo del Linguaggio di Percorso XML ([XPath](../../system.xml.xpath/)) della variabile. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
