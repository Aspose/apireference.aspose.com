---
title: "System::Xml::Xsl::IXsltContextVariable klasse"
linktitle: "IXsltContextVariable"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::IXsltContextVariable klasse. Biedt een interface naar een gegeven variabele die is gedefinieerd in het stylesheet tijdens runtime‑uitvoering in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


Biedt een interface naar een opgegeven variabele die gedefinieerd is in het stijlblad tijdens runtime‑uitvoering.

```cpp
class IXsltContextVariable : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | Evalueert de variabele tijdens runtime en retourneert een object dat de waarde van de variabele vertegenwoordigt. |
| virtual [get_IsLocal](./get_islocal/)() | Retourneert een waarde die aangeeft of de variabele lokaal is. |
| virtual [get_IsParam](./get_isparam/)() | Retourneert een waarde die aangeeft of de variabele een Extensible Stylesheet Language Transformations (XSLT)-parameter is. Dit kan een parameter voor een stylesheet of een template zijn. |
| virtual [get_VariableType](./get_variabletype/)() | Retourneert het XPathResultType dat het type van de XML Path Language ([XPath](../../system.xml.xpath/)) van de variabele vertegenwoordigt. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
