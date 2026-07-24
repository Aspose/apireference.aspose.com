---
title: "System::Xml::XmlDocumentType klasse"
linktitle: "XmlDocumentType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDocumentType klasse. Vertegenwoordigt de documenttypeverklaring in C++."
type: docs
weight: 1600
url: /nl/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


Stelt de documenttype‑declaratie voor.

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. |
| [get_Entities](./get_entities/)() | Retourneert de verzameling van [XmlEntity](../xmlentity/) knooppunten die zijn gedeclareerd in de documenttypeverklaring. |
| [get_InternalSubset](./get_internalsubset/)() | Retourneert de waarde van de interne subset van de documenttype-definitie (DTD) op de DOCTYPE-verklaring. |
| [get_IsReadOnly](./get_isreadonly/)() override | Geeft een waarde terug die aangeeft of het knooppunt alleen-lezen is. |
| [get_LocalName](./get_localname/)() override | Geeft de lokale naam van het knooppunt terug. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het knooppunt terug. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_Notations](./get_notations/)() | Retourneert de verzameling van [XmlNotation](../xmlnotation/) knooppunten die aanwezig zijn in de documenttypeverklaring. |
| [get_PublicId](./get_publicid/)() | Retourneert de waarde van de publieke identifier op de DOCTYPE-verklaring. |
| [get_SystemId](./get_systemid/)() | Retourneert de waarde van de systeemidentifier op de DOCTYPE-verklaring. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat alle kinderen van het knooppunt op naar de opgegeven [XmlWriter](../xmlwriter/). Voor [XmlDocumentType](./) knooppunten heeft deze methode geen effect. |
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
