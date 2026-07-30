---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction class"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction class. Rappresenta l'elemento restriction per i tipi semplici da XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe può essere usata per limitare l'elemento simpleType in C++."
type: docs
weight: 6500
url: /it/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


Rappresenta l'elemento **restriction** per i tipi semplici da XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe può essere usata per limitare l'elemento **simpleType**.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_BaseType](./get_basetype/)() | Restituisce informazioni sul tipo base. |
| [get_BaseTypeName](./get_basetypename/)() | Restituisce il nome del tipo base qualificato. |
| [get_Facets](./get_facets/)() | Restituisce una faccetta [Xml](../../system.xml/)[Schema](../). |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Imposta informazioni sul tipo base. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome del tipo base qualificato. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | Inizializza una nuova istanza della classe [XmlSchemaSimpleTypeRestriction](./). |
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
