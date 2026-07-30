---
title: "System::Xml::Schema::XmlSchemaChoice classe"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaChoice classe. Rappresenta l'elemento choice (compositore) dello Schema XML come specificato dal World Wide Web Consortium (W3C). Il choice consente che solo uno dei suoi figli compaia in un'istanza in C++."
type: docs
weight: 1400
url: /it/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


Rappresenta l'elemento **choice** (compositore) dallo [Schema](../) XML come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). L'**choice** consente che solo uno dei suoi figli compaia in un'istanza.

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



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
