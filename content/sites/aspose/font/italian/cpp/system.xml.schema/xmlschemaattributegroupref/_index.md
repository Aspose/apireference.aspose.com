---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef classe"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef classe. Rappresenta l'elemento **attributeGroup** con l'attributo **ref** dallo Schema XML come specificato da . AttributesGroupRef è il riferimento per un **attributeGroup**, la proprietà name contiene il gruppo di attributi a cui si fa riferimento in C++."
type: docs
weight: 1300
url: /it/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


Rappresenta l'elemento **attributeGroup** con l'attributo **ref** dallo Schema XML [Schema](../) come specificato dal [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454). AttributesGroupRef è il riferimento per un **attributeGroup**, la proprietà name contiene il gruppo di attributi a cui si fa riferimento.

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_RefName](./get_refname/)() | Restituisce il nome dell'elemento **attributeGroup** di riferimento. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Imposta il nome dell'elemento **attributeGroup** di riferimento. |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | Inizializza una nuova istanza della classe [XmlSchemaAttributeGroupRef](./). |
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
