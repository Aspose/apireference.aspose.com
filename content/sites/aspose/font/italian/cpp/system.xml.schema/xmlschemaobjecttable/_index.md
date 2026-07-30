---
title: "System::Xml::Schema::XmlSchemaObjectTable classe"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaObjectTable classe. Fornisce le collezioni per gli elementi contenuti nella classe XmlSchema (ad esempio, Attributes, AttributeGroups, Elements e così via) in C++."
type: docs
weight: 5300
url: /it/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


Fornisce le collezioni per gli elementi contenuti nella classe [XmlSchema](../xmlschema/) (ad esempio, Attributes, AttributeGroups, Elements e così via).

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | Determina se il nome qualificato specificato esiste nella collezione. |
| [get_Count](./get_count/)() | Restituisce il numero di elementi contenuti nella [XmlSchemaObjectTable](./). |
| [get_Names](./get_names/)() | Restituisce una collezione di tutti gli elementi denominati nella [XmlSchemaObjectTable](./). |
| [get_Values](./get_values/)() | Restituisce una collezione di tutti i valori per tutti gli elementi nella [XmlSchemaObjectTable](./). |
| [GetEnumerator](./getenumerator/)() override | Restituisce un enumeratore che può iterare attraverso la [XmlSchemaObjectTable](./). |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | Restituisce l'elemento nella [XmlSchemaObjectTable](./) specificato dal nome qualificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
