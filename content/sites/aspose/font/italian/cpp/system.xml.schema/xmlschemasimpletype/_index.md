---
title: "System::Xml::Schema::XmlSchemaSimpleType classe"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaSimpleType classe. Rappresenta l'elemento simpleType per contenuto semplice da XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe definisce un tipo semplice. I tipi semplici possono specificare informazioni e vincoli per il valore di attributi o elementi con contenuto solo di testo in C++."
type: docs
weight: 6200
url: /it/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


Rappresenta l'elemento **simpleType** per contenuto semplice da XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe definisce un tipo semplice. I tipi semplici possono specificare informazioni e vincoli per il valore di attributi o elementi con contenuto solo di testo.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Content](./get_content/)() | Restituisce uno di [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), o [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | Imposta uno di [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), o [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | Inizializza una nuova istanza della classe [XmlSchemaSimpleType](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
