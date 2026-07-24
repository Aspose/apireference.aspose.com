---
title: "classe System::Xml::Schema::XmlSchemaFacet"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Page per C++"
description: "classe System::Xml::Schema::XmlSchemaFacet. Una classe base per tutti i facet che sono usati quando i tipi semplici sono derivati per restrizione in C++."
type: docs
weight: 2900
url: /it/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


Una classe base per tutte le facet che vengono utilizzate quando i tipi semplici sono derivati per restrizione.

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | Restituisce informazioni che indicano che questo facet è fisso. |
| [get_Value](./get_value/)() | Restituisce l'attributo **value** del facet. |
| virtual [set_IsFixed](./set_isfixed/)(bool) | Imposta le informazioni che indicano che questo facet è fisso. |
| [set_Value](./set_value/)(const String\&) | Imposta l'attributo **value** del facet. |
| [XmlSchemaFacet](./xmlschemafacet/)() | Inizializza una nuova istanza della classe [XmlSchemaFacet](./). |
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
