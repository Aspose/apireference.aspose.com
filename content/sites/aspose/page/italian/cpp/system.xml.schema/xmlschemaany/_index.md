---
title: "classe System::Xml::Schema::XmlSchemaAny"
linktitle: "XmlSchemaAny"
second_title: "Aspose.Page per C++"
description: "classe System::Xml::Schema::XmlSchemaAny. Rappresenta l'elemento any del World Wide Web Consortium (W3C) in C++."
type: docs
weight: 800
url: /it/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


Rappresenta l'elemento **any** del World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Namespace](./get_namespace/)() | Restituisce i namespace contenenti gli elementi che possono essere usati. |
| [get_ProcessContents](./get_processcontents/)() | Restituisce informazioni su come un'applicazione o un processore XML dovrebbe gestire la convalida dei documenti XML per gli elementi specificati dall'elemento **any**. |
| [set_Namespace](./set_namespace/)(const String\&) | Imposta i namespace contenenti gli elementi che possono essere usati. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | Imposta le informazioni su come un'applicazione o un processore XML dovrebbe gestire la convalida dei documenti XML per gli elementi specificati dall'elemento **any**. |
| [XmlSchemaAny](./xmlschemaany/)() | Inizializza una nuova istanza della classe [XmlSchemaAny](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
