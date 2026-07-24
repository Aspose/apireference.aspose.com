---
title: "System::Xml::XmlAttribute class"
linktitle: "XmlAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlAttribute class. Vertegenwoordigt een attribuut. Geldige en standaardwaarden voor het attribuut worden gedefinieerd in een documenttype-definitie (DTD) of schema in C++."
type: docs
weight: 600
url: /nl/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


Stelt een attribuut voor. Geldige en standaardwaarden voor het attribuut worden gedefinieerd in een documenttype‑definitie (DTD) of schema.

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | Voegt het opgegeven knooppunt toe aan het einde van de lijst met kindknooppunten van dit knooppunt. |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. |
| [get_BaseURI](./get_baseuri/)() override | Retourneert de basis Uniform Resource Identifier (URI) van het knooppunt. |
| [get_LocalName](./get_localname/)() override | Geeft de lokale naam van het knooppunt terug. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het knooppunt terug. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Retourneert de namespace-URI van dit knooppunt. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Retourneert het [XmlDocument](../xmldocument/) waartoe dit knooppunt behoort. |
| virtual [get_OwnerElement](./get_ownerelement/)() | Retourneert het [XmlElement](../xmlelement/) waartoe het attribuut behoort. |
| [get_Prefix](./get_prefix/)() override | Retourneert het namespace-voorvoegsel van dit knooppunt. |
| [get_SchemaInfo](./get_schemainfo/)() override | Retourneert de post-schema-validatie-infoset die aan dit knooppunt is toegewezen als gevolg van schema-validatie. |
| virtual [get_Specified](./get_specified/)() | Retourneert een waarde die aangeeft of de attribuutwaarde expliciet is ingesteld. |
| [get_Value](./get_value/)() override | Geeft de waarde van het knooppunt terug. |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Voegt het opgegeven knooppunt direct na het opgegeven referentieknooppunt in. |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Voegt het opgegeven knooppunt direct vóór het opgegeven referentieknooppunt in. |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | Voegt het opgegeven knooppunt toe aan het begin van de lijst met onderliggende knooppunten van dit knooppunt. |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | Verwijdert het opgegeven kindknooppunt. |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Vervangt het opgegeven kindknooppunt door het opgegeven nieuwe kindknooppunt. |
| [set_InnerText](./set_innertext/)(String) override | Stelt de samengevoegde waarden van het knooppunt en al zijn kinderen in. |
| [set_InnerXml](./set_innerxml/)(String) override | Stelt de waarde van het attribuut in. |
| [set_Prefix](./set_prefix/)(String) override | Stelt het namespace-voorvoegsel van dit knooppunt in. |
| [set_Value](./set_value/)(String) override | Stelt de waarde van het knooppunt in. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat alle kinderen van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
