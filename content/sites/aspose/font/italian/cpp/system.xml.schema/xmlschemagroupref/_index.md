---
title: "System::Xml::Schema::XmlSchemaGroupRef classe"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaGroupRef classe. Rappresenta l'elemento group con attributo ref dallo XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe è utilizzata all'interno dei tipi complessi che referenziano un gruppo definito a livello di schema in C++."
type: docs
weight: 3300
url: /it/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


Rappresenta l'elemento **group** con attributo **ref** dallo XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe è utilizzata all'interno dei tipi complessi che referenziano un **group** definito a livello di **schema**.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Particle](./get_particle/)() | Restituisce una delle classi [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) e [XmlSchemaSequence](../xmlschemasequence/), che contiene l'interpretazione post-compilazione del valore **Particle**. |
| [get_RefName](./get_refname/)() | Restituisce il nome di un gruppo definito in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome di un gruppo definito in questo schema (o in un altro schema indicato dallo spazio dei nomi specificato). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | Inizializza una nuova istanza della classe [XmlSchemaGroupRef](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
