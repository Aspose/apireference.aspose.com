---
title: "Classe System::Xml::Schema::XmlSchemaComplexContentRestriction"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Page per C++"
description: "Classe System::Xml::Schema::XmlSchemaComplexContentRestriction. Rappresenta l'elemento restriction dallo XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe è per tipi complessi con un modello di contenuto complesso derivato per restrizione. Restringe il contenuto del tipo complesso a un sottoinsieme del tipo complesso ereditato in C++."
type: docs
weight: 2000
url: /it/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


Rappresenta l'elemento **restriction** dallo XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe è per tipi complessi con un modello di contenuto complesso derivato per restrizione. Restringe il contenuto del tipo complesso a un sottoinsieme del tipo complesso ereditato.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Restituisce il componente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) del modello di contenuto complesso. |
| [get_Attributes](./get_attributes/)() | Restituisce la raccolta di attributi per il tipo complesso. Contiene gli elementi [XmlSchemaAttribute](../xmlschemaattribute/) e [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Restituisce il nome di un tipo complesso da cui questo tipo è derivato per restrizione. |
| [get_Particle](./get_particle/)() | Restituisce una delle classi [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Imposta il componente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) del modello di contenuto complesso. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome di un tipo complesso da cui questo tipo è derivato per restrizione. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Imposta una delle classi [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | Inizializza una nuova istanza della classe [XmlSchemaComplexContentRestriction](./). |
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
