---
title: "Classe System::Xml::Schema::XmlSchemaAttribute"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaAttribute. Rappresenta l'elemento attributo dallo Schema XML come specificato dal World Wide Web Consortium (W3C). Gli attributi forniscono informazioni aggiuntive per altri elementi del documento. Il tag attributo è annidato tra i tag dell'elemento di un documento per lo schema. Il documento XML visualizza gli attributi come elementi denominati nel tag di apertura di un elemento in C++."
type: docs
weight: 1100
url: /it/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


Rappresenta l'elemento **attribute** dallo [Schema](../) XML come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Gli attributi forniscono informazioni aggiuntive per altri elementi del documento. Il tag attributo è annidato tra i tag dell'elemento di un documento per lo schema. Il documento XML visualizza gli attributi come elementi denominati nel tag di apertura di un elemento.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | Restituisce un oggetto [XmlSchemaSimpleType](../xmlschemasimpletype/) che rappresenta il tipo dell'attributo basato sul valore [XmlSchemaAttribute::get_SchemaType](./get_schematype/) o [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) dell'attributo. |
| [get_AttributeType](./get_attributetype/)() | Restituisce l'oggetto basato sul valore [XmlSchemaAttribute::get_SchemaType](./get_schematype/) o [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) dell'attributo che contiene l'interpretazione post-compilazione del valore **AttributeType**. |
| [get_DefaultValue](./get_defaultvalue/)() | Restituisce il valore predefinito per l'attributo. |
| [get_FixedValue](./get_fixedvalue/)() | Restituisce il valore fisso per l'attributo. |
| [get_Form](./get_form/)() | Restituisce la forma per l'attributo. |
| [get_Name](./get_name/)() | Restituisce il nome dell'attributo. |
| [get_QualifiedName](./get_qualifiedname/)() | Restituisce il nome qualificato per l'attributo. |
| [get_RefName](./get_refname/)() | Restituisce il nome di un attributo dichiarato in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [get_SchemaType](./get_schematype/)() | Restituisce il tipo di attributo a un tipo semplice. |
| [get_SchemaTypeName](./get_schematypename/)() | Restituisce il nome del tipo semplice definito in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [get_Use](./get_use/)() | Restituisce informazioni su come viene utilizzato l'attributo. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Imposta il valore predefinito per l'attributo. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Imposta il valore fisso per l'attributo. |
| [set_Form](./set_form/)(XmlSchemaForm) | Imposta la forma per l'attributo. |
| [set_Name](./set_name/)(const String\&) | Imposta il nome dell'attributo. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome di un attributo dichiarato in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Imposta il tipo di attributo a un tipo semplice. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome del tipo semplice definito in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [set_Use](./set_use/)(XmlSchemaUse) | Imposta le informazioni su come viene utilizzato l'attributo. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | Inizializza una nuova istanza della classe [XmlSchemaAttribute](./). |
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
