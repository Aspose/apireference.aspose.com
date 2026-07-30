---
title: "System::Xml::Schema::XmlSchemaExternal classe"
linktitle: "XmlSchemaExternal"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaExternal classe. Fornisce informazioni sullo schema incluso in C++."
type: docs
weight: 2800
url: /it/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


Fornisce informazioni sullo schema incluso.

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Id](./get_id/)() | Restituisce l'ID della stringa. |
| [get_Schema](./get_schema/)() | Restituisce lo [XmlSchema](../xmlschema/) per lo schema di riferimento. |
| [get_SchemaLocation](./get_schemalocation/)() | Restituisce l'Uniform Resource Identifier (URI) della posizione dello schema, che indica al processore dello schema dove lo schema risiede fisicamente. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Restituisce gli attributi qualificati, che non appartengono allo spazio dei nomi di destinazione dello schema. |
| [set_Id](./set_id/)(const String\&) | Imposta l'ID della stringa. |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | Imposta lo [XmlSchema](../xmlschema/) per lo schema di riferimento. |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | Imposta l'Uniform Resource Identifier (URI) della posizione dello schema, che indica al processore dello schema dove lo schema risiede fisicamente. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Imposta gli attributi qualificati, che non appartengono allo spazio dei nomi di destinazione dello schema. |
| [XmlSchemaExternal](./xmlschemaexternal/)() | Inizializza una nuova istanza della classe [XmlSchemaExternal](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
