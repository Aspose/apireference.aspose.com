---
title: "System::Xml::Schema::XmlSchemaAnnotation classe"
linktitle: "XmlSchemaAnnotation"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaAnnotation. Rappresenta l'elemento di annotazione del World Wide Web Consortium (W3C) in C++."
type: docs
weight: 700
url: /it/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


Rappresenta il World Wide [Web](../../system.web/) Consortium (W3C) **annotation** elemento.

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Id](./get_id/)() | Restituisce l'ID della stringa. |
| [get_Items](./get_items/)() | Restituisce la collezione **Items** che viene usata per memorizzare gli elementi figlio **appinfo** e **documentation**. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Restituisce gli attributi qualificati che non appartengono allo spazio dei nomi di destinazione dello schema. |
| [set_Id](./set_id/)(const String\&) | Imposta l'ID della stringa. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Imposta gli attributi qualificati che non appartengono allo spazio dei nomi di destinazione dello schema. |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | Inizializza una nuova istanza della classe [XmlSchemaAnnotation](./). |
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
