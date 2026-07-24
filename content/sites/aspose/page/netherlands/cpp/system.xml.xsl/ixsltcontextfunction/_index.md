---
title: "System::Xml::Xsl::IXsltContextFunction klasse"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::IXsltContextFunction klasse. Biedt een interface naar een gegeven functie die is gedefinieerd in het Extensible Stylesheet Language for Transformations (XSLT) stijlblad tijdens runtime-uitvoering in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


Biedt een interface naar een opgegeven functie die gedefinieerd is in het Extensible Stylesheet Language for Transformations (XSLT) stijlblad tijdens runtime‑uitvoering.

```cpp
class IXsltContextFunction : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | Retourneert de geleverde XML Path Language ([XPath](../../system.xml.xpath/)) typen voor de argumentenlijst van de functie. Deze informatie kan worden gebruikt om de handtekening van de functie te ontdekken, waardoor u onderscheid kunt maken tussen overbelaste functies. |
| virtual [get_Maxargs](./get_maxargs/)() | Retourneert het maximale aantal argumenten voor de functie. Dit stelt de gebruiker in staat om onderscheid te maken tussen overbelaste functies. |
| virtual [get_Minargs](./get_minargs/)() | Retourneert het minimale aantal argumenten voor de functie. Dit stelt de gebruiker in staat om onderscheid te maken tussen overbelaste functies. |
| virtual [get_ReturnType](./get_returntype/)() | Retourneert het XPathResultType dat het [XPath](../../system.xml.xpath/) type vertegenwoordigt dat door de functie wordt geretourneerd. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Biedt de methode om de functie aan te roepen met de gegeven argumenten in de opgegeven context. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
