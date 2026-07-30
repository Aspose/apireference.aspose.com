---
title: "Classe System::Xml::Schema::XmlSchemaSimpleTypeList"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaSimpleTypeList. Rappresenta l'elemento list dallo XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe può essere usata per definire un elemento simpleType come una lista di valori di un tipo di dato specificato in C++."
type: docs
weight: 6400
url: /it/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


Rappresenta l'elemento **list** dallo XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe può essere usata per definire un elemento **simpleType** come una lista di valori di un tipo di dato specificato.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | Restituisce il [XmlSchemaSimpleType](../xmlschemasimpletype/) che rappresenta il tipo dell'elemento **simpleType** basato sui valori [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) e [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) del tipo semplice. |
| [get_ItemType](./get_itemtype/)() | Restituisce l'elemento **simpleType** che è derivato dal tipo specificato dal valore base. |
| [get_ItemTypeName](./get_itemtypename/)() | Restituisce il nome di un tipo di dato incorporato o dell'elemento **simpleType** definito in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Imposta il [XmlSchemaSimpleType](../xmlschemasimpletype/) che rappresenta il tipo dell'elemento **simpleType** basato sui valori [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) e [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) del tipo semplice. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Imposta l'elemento **simpleType** che è derivato dal tipo specificato dal valore base. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome di un tipo di dato incorporato o dell'elemento **simpleType** definito in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | Inizializza una nuova istanza della classe [XmlSchemaSimpleTypeList](./). |
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
