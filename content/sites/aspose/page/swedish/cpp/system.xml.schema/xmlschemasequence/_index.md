---
title: "System::Xml::Schema::XmlSchemaSequence klass"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaSequence klass. Representerar sekvenselementet (kompositör) från XML‑schemat enligt World Wide Web Consortium (W3C). Sekvensen kräver att elementen i gruppen visas i den angivna ordningen inom det omgivande elementet i C++."
type: docs
weight: 5700
url: /sv/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


Representerar **sequence**‑elementet (kompositör) från XML [Schema](../) enligt World Wide [Web](../../system.web/) Consortium (W3C). **sequence** kräver att elementen i gruppen visas i den angivna sekvensen inom det omgivande elementet.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Items](./get_items/)() override | Elementen som finns inom kompositören. Samling av [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaSequence](./) eller [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaSequence](./xmlschemasequence/)() | Initierar en ny instans av klassen [XmlSchemaSequence](./). |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Ptr](./ptr/) | Ett alias för delad pekare till en instans av denna klass. |
## Anmärkningar



Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig instanser av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

## Se även

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
