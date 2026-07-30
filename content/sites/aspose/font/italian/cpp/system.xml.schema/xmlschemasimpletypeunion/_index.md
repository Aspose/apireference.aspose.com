---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion class"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion class. Rappresenta l'elemento union per i tipi semplici da XML Schema come specificato dal World Wide Web Consortium (W3C). Un tipo di dati union può essere usato per specificare il contenuto di un simpleType. Il valore dell'elemento simpleType deve essere uno qualsiasi di un insieme di tipi di dati alternativi specificati nella union. I tipi union sono sempre tipi derivati e devono comprendere almeno due tipi di dati alternativi in C++."
type: docs
weight: 6600
url: /it/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


Rappresenta l'elemento **union** per i tipi semplici da XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Un tipo di dati **union** può essere usato per specificare il contenuto di un **simpleType**. Il valore dell'elemento **simpleType** deve essere uno qualsiasi di un insieme di tipi di dati alternativi specificati nella **union**. I tipi **union** sono sempre tipi derivati e devono comprendere almeno due tipi di dati alternativi.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | Restituisce un array di oggetti [XmlSchemaSimpleType](../xmlschemasimpletype/) che rappresentano il tipo dell'elemento **simpleType** basato sui valori [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) e [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) del tipo semplice. |
| [get_BaseTypes](./get_basetypes/)() | Restituisce la collezione dei tipi base. |
| [get_MemberTypes](./get_membertypes/)() | Restituisce l'array dei nomi dei membri qualificati dei tipi di dati incorporati o degli elementi **simpleType** definiti in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Imposta l'array dei nomi dei membri qualificati dei tipi di dati incorporati o degli elementi **simpleType** definiti in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | Inizializza una nuova istanza della classe [XmlSchemaSimpleTypeUnion](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
