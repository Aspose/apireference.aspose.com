---
title: "Classe System::Xml::Schema::XmlSchemaType"
linktitle: "XmlSchemaType"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaType. La classe base per tutti i tipi semplici e i tipi complessi in C++."
type: docs
weight: 6800
url: /it/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


La classe base per tutti i tipi semplici e i tipi complessi.

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | Restituisce il tipo di oggetto post-compilazione o il tipo di dati incorporato XML [Schema](../) Definition Language (XSD), elemento simpleType o elemento complexType. Questo è un valore dell'infoset post-compilazione dello schema. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | Restituisce il valore post-compilazione per il tipo base di questo tipo di schema. |
| [get_Datatype](./get_datatype/)() | Restituisce il valore post-compilazione per il tipo di dati del tipo complesso. |
| [get_DerivedBy](./get_derivedby/)() | Restituisce le informazioni post-compilazione su come questo elemento è stato derivato dal suo tipo base. |
| [get_Final](./get_final/)() | Restituisce l'attributo final della derivazione del tipo che indica se sono consentite ulteriori derivazioni. |
| [get_FinalResolved](./get_finalresolved/)() | Restituisce l'interpretazione post-compilazione del valore [XmlSchemaType::get_Final](./get_final/). |
| virtual [get_IsMixed](./get_ismixed/)() | Restituisce un valore che indica se questo tipo ha un modello di contenuto misto. Questa chiamata è valida solo in un tipo complesso. |
| [get_Name](./get_name/)() | Restituisce il nome del tipo. |
| [get_QualifiedName](./get_qualifiedname/)() | Restituisce il nome qualificato per il tipo costruito dall'attributo **Name** di questo tipo. Questo è un valore post-compilazione dello schema. |
| [get_TypeCode](./get_typecode/)() | Restituisce il [XmlTypeCode](../xmltypecode/) del tipo. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | Restituisce un [XmlSchemaComplexType](../xmlschemacomplextype/) che rappresenta il tipo complesso incorporato del tipo complesso specificato. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | Restituisce un [XmlSchemaComplexType](../xmlschemacomplextype/) che rappresenta il tipo complesso incorporato del tipo complesso specificato per nome qualificato. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | Restituisce un [XmlSchemaSimpleType](../xmlschemasimpletype/) che rappresenta il tipo semplice incorporato del tipo semplice specificato per nome qualificato. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | Restituisce un [XmlSchemaSimpleType](../xmlschemasimpletype/) che rappresenta il tipo semplice incorporato del tipo semplice specificato. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | Restituisce un valore che indica se il tipo di schema derivato specificato è derivato dal tipo di schema base specificato. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Imposta l'attributo final della derivazione del tipo che indica se sono consentite ulteriori derivazioni. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | Imposta un valore che indica se questo tipo ha un modello di contenuto misto. Questa chiamata è valida solo in un tipo complesso. |
| [set_Name](./set_name/)(const String\&) | Imposta il nome del tipo. |
| [XmlSchemaType](./xmlschematype/)() | Inizializza una nuova istanza della classe [XmlSchemaType](./). |
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
