---
title: "System::Xml::Schema::XmlSchemaAttributeGroup classe"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroup classe. Rappresenta l'elemento **attributeGroup** dallo Schema XML come specificato dal World Wide Web Consortium (W3C). AttributesGroups fornisce un meccanismo per raggruppare un insieme di dichiarazioni di attributi in modo che possano essere incorporate come gruppo nelle definizioni di tipi complessi in C++."
type: docs
weight: 1200
url: /it/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


Rappresenta l'elemento **attributeGroup** dallo Schema XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). AttributesGroups fornisce un meccanismo per raggruppare un insieme di dichiarazioni di attributi in modo che possano essere incorporate come gruppo nelle definizioni di tipi complessi.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Restituisce il componente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) del gruppo di attributi. |
| [get_Attributes](./get_attributes/)() | Restituisce la raccolta di attributi per il gruppo di attributi. Contiene gli elementi [XmlSchemaAttribute](../xmlschemaattribute/) e [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_Name](./get_name/)() | Restituisce il nome del gruppo di attributi. |
| [get_QualifiedName](./get_qualifiedname/)() | Restituisce il nome qualificato del gruppo di attributi. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | Restituisce la proprietà del gruppo di attributi ridefinita dallo Schema XML [Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Imposta il componente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) del gruppo di attributi. |
| [set_Name](./set_name/)(const String\&) | Imposta il nome del gruppo di attributi. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | Inizializza una nuova istanza della classe [XmlSchemaAttributeGroup](./). |
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
