---
title: "System::Xml::Schema::XmlSchemaGroup classe"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaGroup classe. Rappresenta l'elemento group dello XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe definisce gruppi a livello di schema che sono referenziati dai tipi complessi. Raggruppa un insieme di dichiarazioni di elementi in modo che possano essere incorporati come gruppo nelle definizioni di tipi complessi in C++."
type: docs
weight: 3100
url: /it/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


Rappresenta l'elemento **group** dello XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe definisce gruppi a livello di **schema** che sono referenziati dai tipi complessi. Raggruppa un insieme di dichiarazioni di elementi in modo che possano essere incorporati come gruppo nelle definizioni di tipi complessi.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Name](./get_name/)() | Restituisce il nome del gruppo di schema. |
| [get_Particle](./get_particle/)() | Restituisce una delle classi [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/). |
| [get_QualifiedName](./get_qualifiedname/)() | Restituisce il nome qualificato del gruppo di schema. |
| [set_Name](./set_name/)(const String\&) | Imposta il nome del gruppo di schema. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | Imposta una delle classi [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaGroup](./xmlschemagroup/)() | Inizializza una nuova istanza della classe [XmlSchemaGroup](./). |
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
