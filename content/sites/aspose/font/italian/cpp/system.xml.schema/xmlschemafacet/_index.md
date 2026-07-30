---
title: "System::Xml::Schema::XmlSchemaFacet class"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaFacet class. Una classe base per tutte le facet utilizzate quando i tipi semplici sono derivati per restrizione in C++."
type: docs
weight: 2900
url: /it/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


Una classe base per tutte le faccette utilizzate quando i tipi semplici sono derivati per restrizione.

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | Restituisce informazioni che indicano che questa facet è fissa. |
| [get_Value](./get_value/)() | Restituisce l'attributo **value** della facet. |
| virtual [set_IsFixed](./set_isfixed/)(bool) | Imposta informazioni che indicano che questa facet è fissa. |
| [set_Value](./set_value/)(const String\&) | Imposta l'attributo **value** della facet. |
| [XmlSchemaFacet](./xmlschemafacet/)() | Inizializza una nuova istanza della classe [XmlSchemaFacet](./). |
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
