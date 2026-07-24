---
title: "System::Xml::Schema::ValidationEventArgs klasse"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::ValidationEventArgs klasse. Retourneert gedetailleerde informatie gerelateerd aan de ValidationEventHandler in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


Retourneert gedetailleerde informatie gerelateerd aan de [ValidationEventHandler](../validationeventhandler/).

```cpp
class ValidationEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Exception](./get_exception/)() | Retourneert de [XmlSchemaException](../xmlschemaexception/) die bij het validatie‑evenement hoort. |
| [get_Message](./get_message/)() | Retourneert de tekstbeschrijving die overeenkomt met het validatie‑evenement. |
| [get_Severity](./get_severity/)() | Retourneert de ernst van het validatie‑evenement. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Een statisch lid dat een "lege" [EventArgs](../../system/eventargs/) gedeelde pointer (null-pointer) vertegenwoordigt. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
