---
title: "System::Xml::Schema::XmlSchemaAnyAttribute classe"
linktitle: "XmlSchemaAnyAttribute"
second_title: "Aspose.Page per C++"
description: "System::Xml::Schema::XmlSchemaAnyAttribute class. Rappresenta l'elemento anyAttribute del World Wide Web Consortium (W3C) in C++."
type: docs
weight: 900
url: /it/cpp/system.xml.schema/xmlschemaanyattribute/
---
## XmlSchemaAnyAttribute class


Rappresenta l'elemento **anyAttribute** del World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAnyAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Namespace](./get_namespace/)() | Restituisce gli spazi dei nomi contenenti gli attributi che possono essere utilizzati. |
| [get_ProcessContents](./get_processcontents/)() | Restituisce informazioni su come un'applicazione o un processore XML dovrebbe gestire la convalida dei documenti XML per gli attributi specificati dall'elemento **anyAttribute**. |
| [set_Namespace](./set_namespace/)(const String\&) | Imposta gli spazi dei nomi contenenti gli attributi che possono essere utilizzati. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | Imposta le informazioni su come un'applicazione o un processore XML dovrebbe gestire la convalida dei documenti XML per gli attributi specificati dall'elemento **anyAttribute**. |
| [XmlSchemaAnyAttribute](./xmlschemaanyattribute/)() | Inizializza una nuova istanza della classe [XmlSchemaAnyAttribute](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
