---
title: "System::Xml::Schema::XmlSchemaValidator klasse"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaValidator klasse. Vertegenwoordigt een XML Schema Definition Language (XSD) schema‑validatie‑engine. De XmlSchemaValidator‑klasse kan niet worden geërfd in C++."
type: docs
weight: 7000
url: /nl/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


Vertegenwoordigt een XML [Schema](../) Definition Language (XSD) [Schema](../) validatie‑engine. De [XmlSchemaValidator](./) klasse kan niet worden geërfd.

```cpp
class XmlSchemaValidator : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | Voegt een XML [Schema](../) Definition Language (XSD) schema toe aan de set van schema's die worden gebruikt voor validatie. |
| [EndValidation](./endvalidation/)() | Beëindigt de validatie en controleert identiteitsbeperkingen voor het volledige XML‑document. |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | Retourneert de regelnummerinformatie voor het XML‑knooppunt dat wordt gevalideerd. |
| [get_SourceUri](./get_sourceuri/)() | Retourneert de bron‑URI voor het XML‑knooppunt dat wordt gevalideerd. |
| [get_ValidationEventSender](./get_validationeventsender/)() | Retourneert het object dat is verzonden als het verzenderobject van een validatie‑evenement. |
| [GetExpectedAttributes](./getexpectedattributes/)() | Retourneert de verwachte attributen voor de huidige elementcontext. |
| [GetExpectedParticles](./getexpectedparticles/)() | Retourneert de verwachte deeltjes in de huidige elementcontext. |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | Valideert identiteitsconstraints op de standaardattributen en vult de opgegeven List met [XmlSchemaAttribute](../xmlschemaattribute/) objecten voor alle attributen met standaardwaarden die nog niet eerder zijn gevalideerd met behulp van de [XmlSchemaValidator::ValidateAttribute](./validateattribute/) methode in de elementcontext. |
| [Initialize](./initialize/)() | Initialiseert de status van het [XmlSchemaValidator](./) object. |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | Initialiseert de status van het [XmlSchemaValidator](./) object met behulp van het opgegeven [XmlSchemaObject](../xmlschemaobject/) voor gedeeltelijke validatie. |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | Stelt de regelnummerinformatie in voor de XML‑knoop die wordt gevalideerd. |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | Stelt de bron‑URI in voor de XML‑knoop die wordt gevalideerd. |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | Stelt het object in dat wordt verzonden als het verzenderobject van een validatie‑evenement. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Stelt het [XmlResolver](../../system.xml/xmlresolver/) object in dat wordt gebruikt om **xs:import**- en **xs:include**‑elementen evenals **xsi:schemaLocation**- en **xsi:noNamespaceSchemaLocation**‑attributen op te lossen. |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Slaat de validatie van de huidige elementinhoud over en bereidt het [XmlSchemaValidator](./) object voor om inhoud te valideren in de context van het bovenliggende element. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Valideert de attribuutnaam, namespace‑URI en waarde in de huidige elementcontext. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | Valideert de attribuutnaam, namespace‑URI en waarde in de huidige elementcontext. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Valideert het element in de huidige context. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | Valideert het element in de huidige context met de opgegeven **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation**- en **xsi:NoNamespaceSchemaLocation**‑attribuutwaarden. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Controleert of de tekstinhoud van het element geldig is volgens het gegevenstype voor elementen met eenvoudige inhoud, en controleert of de inhoud van het huidige element volledig is voor elementen met complexe inhoud. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | Controleert of de tekstinhoud van het opgegeven element geldig is volgens het gegevenstype. |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | Controleert of alle vereiste attributen in de elementcontext aanwezig zijn en bereidt het [XmlSchemaValidator](./) object voor om de onderliggende inhoud van het element te valideren. |
| [ValidateText](./validatetext/)(const String\&) | Valideert of de opgegeven tekst **string** is toegestaan in de huidige elementcontext, en verzamelt de tekst voor validatie als het huidige element eenvoudige inhoud heeft. |
| [ValidateText](./validatetext/)(XmlValueGetter) | Valideert of de tekst die wordt geretourneerd door het opgegeven [XmlValueGetter](../xmlvaluegetter/) object is toegestaan in de huidige elementcontext, en verzamelt de tekst voor validatie als het huidige element eenvoudige inhoud heeft. |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | Valideert of de witruimte in de opgegeven **string** is toegestaan in de huidige elementcontext, en verzamelt de witruimte voor validatie als het huidige element eenvoudige inhoud heeft. |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | Valideert of de witruimte die wordt geretourneerd door het opgegeven [XmlValueGetter](../xmlvaluegetter/) object is toegestaan in de huidige elementcontext, en verzamelt de witruimte voor validatie als het huidige element eenvoudige inhoud heeft. |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | Initialiseert een nieuw exemplaar van de [XmlSchemaValidator](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
