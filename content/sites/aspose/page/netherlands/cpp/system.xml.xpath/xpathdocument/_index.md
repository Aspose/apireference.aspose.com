---
title: "System::Xml::XPath::XPathDocument-klasse"
linktitle: "XPathDocument"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathDocument class. Biedt een snelle, alleen-lezen, in‑memory weergave van een XML‑document door gebruik te maken van het XPath‑datamodel in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


Biedt een snelle, alleen-lezen, in‑memory weergave van een XML‑document door gebruik te maken van het [XPath](../) datamodel.

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | Initialiseert een alleen-lezen [XPathNavigator](../xpathnavigator/) object voor het navigeren door knooppunten in dit [XPathDocument](./). |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | Initialiseert een nieuw exemplaar van de [XPathDocument](./) class vanuit de XML‑gegevens die zijn opgenomen in het opgegeven [XmlReader](../../system.xml/xmlreader/) object. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | Initialiseert een nieuw exemplaar van de [XPathDocument](./) class vanuit de XML‑gegevens die zijn opgenomen in het opgegeven [XmlReader](../../system.xml/xmlreader/) object met de opgegeven witruimte‑verwerking. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | Initialiseert een nieuw exemplaar van de [XPathDocument](./) class vanuit de XML‑gegevens die zijn opgenomen in het opgegeven TextReader‑object. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | Initialiseert een nieuw exemplaar van de [XPathDocument](./) class vanuit de XML‑gegevens in het opgegeven Stream‑object. |
| [XPathDocument](./xpathdocument/)(const String\&) | Initialiseert een nieuw exemplaar van de [XPathDocument](./) class vanuit de XML‑gegevens in het opgegeven bestand. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | Initialiseert een nieuw exemplaar van de [XPathDocument](./) class vanuit de XML‑gegevens in het opgegeven bestand met de opgegeven witruimte‑verwerking. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
