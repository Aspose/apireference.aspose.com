---
title: "System::Xml::XmlDeclaration klasse"
linktitle: "XmlDeclaration"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDeclaration klasse. Vertegenwoordigt het XML-declaratieknooppunt <?xml version=''1.0''...?> in C++."
type: docs
weight: 1300
url: /nl/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


Stelt het XML‑declaratieknooppunt **<?xml version='1.0'...?>** voor.

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. |
| [get_Encoding](./get_encoding/)() | Retourneert het coderingsniveau van het XML-document. |
| [get_InnerText](./get_innertext/)() override | Retourneert de samengevoegde waarden van de [XmlDeclaration](./). |
| [get_LocalName](./get_localname/)() override | Geeft de lokale naam van het knooppunt terug. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het knooppunt terug. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_Standalone](./get_standalone/)() | Retourneert de waarde van het standalone‑attribuut. |
| [get_Value](./get_value/)() override | Retourneert de waarde van de [XmlDeclaration](./). |
| [get_Version](./get_version/)() | Retourneert de XML-versie van het document. |
| [set_Encoding](./set_encoding/)(const String\&) | Stelt het coderingsniveau van het XML-document in. |
| [set_InnerText](./set_innertext/)(String) override | Stelt de samengevoegde waarden van de [XmlDeclaration](./) in. |
| [set_Standalone](./set_standalone/)(const String\&) | Stelt de waarde van het standalone‑attribuut in. |
| [set_Value](./set_value/)(String) override | Stelt de waarde van de [XmlDeclaration](./) in. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat de kinderen van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). Omdat [XmlDeclaration](./)-knooppunten geen kinderen hebben, heeft deze methode geen effect. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
