---
title: "System::Xml::Schema::XmlSchemaNotation class"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaNotation class. Rappresenta l'elemento notation dello Schema XML come specificato dal World Wide Web Consortium (W3C). Una dichiarazione XML Schemanotation è una ricostruzione delle dichiarazioni NOTATION di XML 1.0. Lo scopo delle notazioni è descrivere il formato dei dati non XML all'interno di un documento XML in C++."
type: docs
weight: 4800
url: /it/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


Rappresenta l'elemento **notation** dello XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Una dichiarazione XML [Schema](../)**notation** è una ricostruzione delle dichiarazioni **XML** 1.0 NOTATION. Lo scopo delle notazioni è descrivere il formato dei dati non-XML all'interno di un documento XML.

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Name](./get_name/)() | Restituisce il nome della notazione. |
| [get_Public](./get_public/)() | Restituisce l'identificatore **public**. |
| [get_System](./get_system/)() | Restituisce l'identificatore **system**. |
| [set_Name](./set_name/)(const String\&) | Imposta il nome della notazione. |
| [set_Public](./set_public/)(const String\&) | Imposta l'identificatore **public**. |
| [set_System](./set_system/)(const String\&) | Imposta l'identificatore **system**. |
| [XmlSchemaNotation](./xmlschemanotation/)() | Inizializza una nuova istanza della classe [XmlSchemaNotation](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
