---
title: "classe System::Xml::Schema::XmlSchemaAttributeGroupRef"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Page per C++"
description: "classe System::Xml::Schema::XmlSchemaAttributeGroupRef. Rappresenta l'elemento attributeGroup con l'attributo ref dallo Schema XML come specificato da . AttributesGroupRef è il riferimento per un attributeGroup, la proprietà name contiene il gruppo di attributi a cui si fa riferimento in C++."
type: docs
weight: 1300
url: /it/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


Rappresenta l'elemento **attributeGroup** con l'attributo **ref** dallo [Schema](../) XML come specificato dal [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454). AttributesGroupRef è il riferimento per un attributeGroup, la proprietà name contiene il gruppo di attributi a cui si fa riferimento.

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



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
