---
title: "classe System::Xml::Schema::XmlSchemaSimpleContentRestriction"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "Aspose.Page per C++"
description: "classe System::Xml::Schema::XmlSchemaSimpleContentRestriction. Rappresenta l'elemento di restrizione per contenuto semplice da XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe può essere utilizzata per derivare tipi semplici mediante restrizione. Tali derivazioni possono essere usate per limitare l'intervallo di valori dell'elemento a un sottoinsieme dei valori specificati nel tipo semplice ereditato in C++."
type: docs
weight: 6100
url: /it/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


Rappresenta l'elemento **restriction** per contenuto semplice da XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe può essere utilizzata per derivare tipi semplici mediante restrizione. Tali derivazioni possono essere usate per limitare l'intervallo di valori dell'elemento a un sottoinsieme dei valori specificati nel tipo semplice ereditato.

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Restituisce un [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) da utilizzare per il valore dell'attributo. |
| [get_Attributes](./get_attributes/)() | Restituisce la collezione di [XmlSchemaAttribute](../xmlschemaattribute/) e [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) degli attributi per il tipo semplice. |
| [get_BaseType](./get_basetype/)() | Restituisce il valore base del tipo semplice. |
| [get_BaseTypeName](./get_basetypename/)() | Restituisce il nome del tipo di dati incorporato o del tipo semplice da cui deriva questo tipo. |
| [get_Facets](./get_facets/)() | Restituisce una faccetta [Xml](../../system.xml/)[Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Imposta un [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) da utilizzare per il valore dell'attributo. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Imposta il valore base del tipo semplice. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome del tipo di dati incorporato o del tipo semplice da cui deriva questo tipo. |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | Inizializza una nuova istanza della classe [XmlSchemaSimpleContentRestriction](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
