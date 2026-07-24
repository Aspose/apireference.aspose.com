---
title: "System::Xml::Schema::XmlSchemaChoice class"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Page per C++"
description: "System::Xml::Schema::XmlSchemaChoice class. Rappresenta l'elemento choice (compositore) dallo Schema XML come specificato dal World Wide Web Consortium (W3C). Il choice consente che solo uno dei suoi figli compaia in un'istanza in C++."
type: docs
weight: 1400
url: /it/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


Rappresenta l'elemento **choice** (compositore) dallo [Schema](../) XML come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Il **choice** consente che solo uno dei suoi figli compaia in un'istanza.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Items](./get_items/)() override | Restituisce la raccolta degli elementi contenuti nel compositore (**choice**): [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), o [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | Inizializza una nuova istanza della classe [XmlSchemaChoice](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
