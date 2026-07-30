---
title: "System::Xml::Schema::XmlSchemaSequence class"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaSequence class. Rappresenta l'elemento sequence (compositore) dallo XML Schema come specificato dal World Wide Web Consortium (W3C). La sequence richiede che gli elementi nel gruppo compaiano nella sequenza specificata all'interno dell'elemento contenitore in C++."
type: docs
weight: 5700
url: /it/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


Rappresenta l'elemento **sequence** (compositore) dallo XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Il **sequence** richiede che gli elementi nel gruppo compaiano nella sequenza specificata all'interno dell'elemento contenitore.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Items](./get_items/)() override | Gli elementi contenuti nel compositore. Collezione di [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaSequence](./) o [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaSequence](./xmlschemasequence/)() | Inizializza una nuova istanza della classe [XmlSchemaSequence](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
