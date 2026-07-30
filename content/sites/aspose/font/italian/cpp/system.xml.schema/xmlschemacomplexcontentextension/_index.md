---
title: "Classe System::Xml::Schema::XmlSchemaComplexContentExtension"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaComplexContentExtension. Rappresenta l'elemento extension dallo XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe è per tipi complessi con modello di contenuto complesso derivato per estensione. Estende il tipo complesso aggiungendo attributi o elementi in C++."
type: docs
weight: 1900
url: /it/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


Rappresenta l'elemento **extension** dallo XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe è per tipi complessi con modello di contenuto complesso derivato per estensione. Estende il tipo complesso aggiungendo attributi o elementi.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Restituisce il componente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) del modello di contenuto complesso. |
| [get_Attributes](./get_attributes/)() | Restituisce la raccolta di attributi per il contenuto complesso. Contiene gli elementi [XmlSchemaAttribute](../xmlschemaattribute/) e [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Restituisce il nome del tipo complesso da cui questo tipo è derivato per estensione. |
| [get_Particle](./get_particle/)() | Restituisce una delle classi [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Imposta il componente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) del modello di contenuto complesso. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome del tipo complesso da cui questo tipo è derivato per estensione. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Imposta una delle classi [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | Inizializza una nuova istanza della classe [XmlSchemaComplexContentExtension](./). |
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
