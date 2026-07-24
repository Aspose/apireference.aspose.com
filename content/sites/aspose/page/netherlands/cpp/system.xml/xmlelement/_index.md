---
title: "System::Xml::XmlElement klasse"
linktitle: "XmlElement"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlElement klasse. Stelt een element in C++ voor."
type: docs
weight: 1700
url: /nl/cpp/system.xml/xmlelement/
---
## XmlElement class


Stelt een element voor.

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Retourneert een **bool** waarde die aangeeft of het huidige knooppunt attributen heeft. |
| [get_InnerText](./get_innertext/)() override | Retourneert de samengevoegde waarden van het knooppunt en al zijn kinderen. |
| [get_InnerXml](./get_innerxml/)() override | Retourneert de opmaak die alleen de kinderen van dit knooppunt weergeeft. |
| [get_IsEmpty](./get_isempty/)() | Retourneert het tagformaat van het element. |
| [get_LocalName](./get_localname/)() override | Retourneert de lokale naam van het huidige knooppunt. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het knooppunt terug. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Retourneert de namespace-URI van dit knooppunt. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Retourneert het [XmlDocument](../xmldocument/) waartoe dit knooppunt behoort. |
| [get_Prefix](./get_prefix/)() override | Retourneert het namespace-voorvoegsel van dit knooppunt. |
| [get_SchemaInfo](./get_schemainfo/)() override | Retourneert de post‑schema‑validatie‑infoset die aan dit knooppunt is toegewezen als gevolg van schema‑validatie. |
| virtual [GetAttribute](./getattribute/)(String) | Retourneert de waarde voor het attribuut met de opgegeven naam. |
| virtual [GetAttribute](./getattribute/)(String, String) | Retourneert de waarde voor het attribuut met de opgegeven lokale naam en namespace-URI. |
| virtual [GetAttributeNode](./getattributenode/)(String) | Retourneert het [XmlAttribute](../xmlattribute/) met de opgegeven naam. |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | Retourneert het [XmlAttribute](../xmlattribute/) met de opgegeven lokale naam en namespace-URI. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Retourneert een [XmlNodeList](../xmlnodelist/) met een lijst van alle afstammings‑elementen die overeenkomen met de opgegeven [XmlElement::get_Name](./get_name/). |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Retourneert een [XmlNodeList](../xmlnodelist/) met een lijst van alle afstammings‑elementen die overeenkomen met de opgegeven [XmlElement::get_LocalName](./get_localname/) en [XmlElement::get_NamespaceURI](./get_namespaceuri/) waarden. |
| virtual [HasAttribute](./hasattribute/)(String) | Bepaalt of het huidige knooppunt een attribuut heeft met de opgegeven naam. |
| virtual [HasAttribute](./hasattribute/)(String, String) | Bepaalt of het huidige knooppunt een attribuut heeft met de opgegeven lokale naam en namespace-URI. |
| [RemoveAll](./removeall/)() override | Verwijdert alle opgegeven attributen en kinderen van het huidige knooppunt. Standaardattributen worden niet verwijderd. |
| virtual [RemoveAllAttributes](./removeallattributes/)() | Verwijdert alle opgegeven attributen van het element. Standaardattributen worden niet verwijderd. |
| virtual [RemoveAttribute](./removeattribute/)(String) | Verwijdert een attribuut op naam. |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | Verwijdert een attribuut met de opgegeven lokale naam en namespace-URI. (Als het verwijderde attribuut een standaardwaarde heeft, wordt deze onmiddellijk vervangen). |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | Verwijdert het attribuutknooppunt met de opgegeven index uit het element. (Als het verwijderde attribuut een standaardwaarde heeft, wordt deze onmiddellijk vervangen). |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | Verwijdert de opgegeven [XmlAttribute](../xmlattribute/). |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | Verwijdert de [XmlAttribute](../xmlattribute/) die is opgegeven door de lokale naam en namespace-URI. (Als het verwijderde attribuut een standaardwaarde heeft, wordt deze onmiddellijk vervangen). |
| [set_InnerText](./set_innertext/)(String) override | Stelt de samengevoegde waarden van het knooppunt en al zijn kinderen in. |
| [set_InnerXml](./set_innerxml/)(String) override | Stelt de opmaak in die alleen de kinderen van dit knooppunt weergeeft. |
| [set_IsEmpty](./set_isempty/)(bool) | Stelt het tagformaat van het element in. |
| [set_Prefix](./set_prefix/)(String) override | Stelt het namespace-voorvoegsel van dit knooppunt in. |
| virtual [SetAttribute](./setattribute/)(String, String) | Stelt de waarde van het attribuut met de opgegeven naam in. |
| virtual [SetAttribute](./setattribute/)(String, String, String) | Stelt de waarde van het attribuut met de opgegeven lokale naam en namespace-URI in. |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | Voegt de opgegeven [XmlAttribute](../xmlattribute/) toe. |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | Voegt de opgegeven [XmlAttribute](../xmlattribute/) toe. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat alle kinderen van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat het huidige knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
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
