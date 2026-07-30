---
title: "System::Xml::Schema::XmlSchemaRedefine classe"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaRedefine. Rappresenta l'elemento redefine dallo XML Schema come specificato dal World Wide Web Consortium (W3C). Questa classe può essere usata per consentire tipi semplici e complessi, gruppi e gruppi di attributi da file di schema esterni di essere ridefiniti nello schema corrente. Questa classe può anche essere usata per fornire versionamento per gli elementi dello schema in C++."
type: docs
weight: 5600
url: /it/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


Rappresenta l'elemento **redefine** dallo XML [Schema](../) come specificato dal World Wide [Web](../../system.web/) Consortium (W3C). Questa classe può essere usata per consentire tipi semplici e complessi, gruppi e gruppi di attributi da file di schema esterni di essere ridefiniti nello schema corrente. Questa classe può anche essere usata per fornire versionamento per gli elementi dello schema.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | Restituisce il [XmlSchemaObjectTable](../xmlschemaobjecttable/), per tutti gli attributi nello schema, che contiene l'interpretazione post-compilazione del valore **AttributeGroups**. |
| [get_Groups](./get_groups/)() | Restituisce il [XmlSchemaObjectTable](../xmlschemaobjecttable/), per tutti i gruppi nello schema, che contiene l'interpretazione post-compilazione del valore **Groups**. |
| [get_Items](./get_items/)() | Restituisce la collezione delle seguenti classi: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), e [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | Restituisce il [XmlSchemaObjectTable](../xmlschemaobjecttable/), per tutti i tipi semplici e complessi nello schema, che contiene l'interpretazione post-compilazione del valore **SchemaTypes**. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | Inizializza una nuova istanza della classe [XmlSchemaRedefine](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
