---
title: "System::Xml::Schema::XmlSchemaSimpleContent class"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaSimpleContent class. Rappresenta l'elemento simpleContent da XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe è per tipi semplici e complessi con modello di contenuto semplice in C++."
type: docs
weight: 5900
url: /it/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


Rappresenta l'elemento **simpleContent** da XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe è per tipi semplici e complessi con modello di contenuto semplice.

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Content](./get_content/)() override | Restituisce uno dei [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) o [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Restituisce uno dei [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) o [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
