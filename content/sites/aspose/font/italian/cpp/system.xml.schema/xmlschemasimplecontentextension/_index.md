---
title: "classe System::Xml::Schema::XmlSchemaSimpleContentExtension"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Font per C++"
description: "classe System::Xml::Schema::XmlSchemaSimpleContentExtension. Rappresenta l'elemento di estensione per contenuto semplice dallo XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe può essere usata per derivare tipi semplici mediante estensione. Tali derivazioni sono utilizzate per estendere il contenuto del tipo semplice dell'elemento aggiungendo attributi in C++."
type: docs
weight: 6000
url: /it/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


Rappresenta l'elemento **extension** per contenuto semplice dallo XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe può essere usata per derivare tipi semplici mediante estensione. Tali derivazioni sono utilizzate per estendere il contenuto del tipo semplice dell'elemento aggiungendo attributi.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Restituisce l'[XmlSchemaAnyAttribute](../xmlschemaanyattribute/) da utilizzare per il valore dell'attributo. |
| [get_Attributes](./get_attributes/)() | Restituisce la raccolta di [XmlSchemaAttribute](../xmlschemaattribute/) e [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Restituisce il nome di un tipo di dati incorporato o di un tipo semplice da cui questo tipo è esteso. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Imposta l'[XmlSchemaAnyAttribute](../xmlschemaanyattribute/) da utilizzare per il valore dell'attributo. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome di un tipo di dato incorporato o di un tipo semplice da cui questo tipo è esteso. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | Inizializza una nuova istanza della classe [XmlSchemaSimpleContentExtension](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
