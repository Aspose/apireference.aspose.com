---
title: "classe System::Xml::Schema::XmlSchemaSimpleContent"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Page per C++"
description: "classe System::Xml::Schema::XmlSchemaSimpleContent. Rappresenta l'elemento simpleContent dallo XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe è per tipi semplici e complessi con modello di contenuto semplice in C++."
type: docs
weight: 5900
url: /it/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


Rappresenta l'elemento **simpleContent** dallo XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe è per tipi semplici e complessi con modello di contenuto semplice.

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Content](./get_content/)() override | Restituisce uno dei seguenti: [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) o [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Restituisce uno dei seguenti: [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) o [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
