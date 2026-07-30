---
title: "Classe System::Xml::Schema::XmlSchemaInfo"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaInfo. Rappresenta l'infoset post-validazione dello schema di un nodo XML convalidato in C++."
type: docs
weight: 3800
url: /it/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


Rappresenta l'infoset post-validazione dello schema di un nodo XML convalidato.

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | Restituisce l'oggetto [XmlSchemaContentType](../xmlschemacontenttype/) che corrisponde al tipo di contenuto di questo nodo XML convalidato. |
| [get_IsDefault](./get_isdefault/)() override | Restituisce un valore che indica se questo nodo XML convalidato è stato impostato come risultato di un valore predefinito applicato durante la convalida dello schema XML [Schema](../) Definition Language (XSD). |
| [get_IsNil](./get_isnil/)() override | Restituisce un valore che indica se il valore per questo nodo XML convalidato è **nil**. |
| [get_MemberType](./get_membertype/)() override | Restituisce il tipo di schema dinamico per questo nodo XML convalidato. |
| [get_SchemaAttribute](./get_schemaattribute/)() override | Restituisce l'oggetto compilato [XmlSchemaAttribute](../xmlschemaattribute/) che corrisponde a questo nodo XML convalidato. |
| [get_SchemaElement](./get_schemaelement/)() override | Restituisce l'oggetto compilato [XmlSchemaElement](../xmlschemaelement/) che corrisponde a questo nodo XML convalidato. |
| [get_SchemaType](./get_schematype/)() override | Restituisce il tipo di schema statico XML [Schema](../) Definition Language (XSD) di questo nodo XML convalidato. |
| [get_Validity](./get_validity/)() override | Restituisce il valore [XmlSchemaValidity](../xmlschemavalidity/) di questo nodo XML convalidato. |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | Imposta l'oggetto [XmlSchemaContentType](../xmlschemacontenttype/) che corrisponde al tipo di contenuto di questo nodo XML convalidato. |
| [set_IsDefault](./set_isdefault/)(bool) | Imposta un valore che indica se questo nodo XML convalidato è stato impostato come risultato di un valore predefinito applicato durante la convalida dello schema XML [Schema](../) Definition Language (XSD). |
| [set_IsNil](./set_isnil/)(bool) | Imposta un valore che indica se il valore per questo nodo XML convalidato è **nil**. |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Imposta il tipo di schema dinamico per questo nodo XML convalidato. |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | Imposta l'oggetto compilato [XmlSchemaAttribute](../xmlschemaattribute/) che corrisponde a questo nodo XML convalidato. |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | Imposta l'oggetto compilato [XmlSchemaElement](../xmlschemaelement/) che corrisponde a questo nodo XML convalidato. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Imposta il tipo di schema statico XML [Schema](../) Definition Language (XSD) di questo nodo XML convalidato. |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | Imposta il valore [XmlSchemaValidity](../xmlschemavalidity/) di questo nodo XML convalidato. |
| [XmlSchemaInfo](./xmlschemainfo/)() | Inizializza una nuova istanza della classe [XmlSchemaInfo](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
