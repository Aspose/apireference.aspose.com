---
title: "System::Xml::Schema::XmlSchemaAny class"
linktitle: "XmlSchemaAny"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaAny class. Vertegenwoordigt het World Wide Web Consortium (W3C) any‑element in C++."
type: docs
weight: 800
url: /nl/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


Vertegenwoordigt het World Wide [Web](../../system.web/) Consortium (W3C) **any**‑element.

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Namespace](./get_namespace/)() | Retourneert de namespaces die de elementen bevatten die kunnen worden gebruikt. |
| [get_ProcessContents](./get_processcontents/)() | Retourneert informatie over hoe een applicatie of XML‑processor de validatie van XML‑documenten moet afhandelen voor de elementen die zijn gespecificeerd door het **any**‑element. |
| [set_Namespace](./set_namespace/)(const String\&) | Stelt de namespaces in die de elementen bevatten die kunnen worden gebruikt. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | Stelt informatie in over hoe een applicatie of XML‑processor de validatie van XML‑documenten moet afhandelen voor de elementen die zijn gespecificeerd door het **any**‑element. |
| [XmlSchemaAny](./xmlschemaany/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaAny](./) class. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
