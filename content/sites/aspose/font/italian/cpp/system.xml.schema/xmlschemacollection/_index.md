---
title: "System::Xml::Schema::XmlSchemaCollection classe"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaCollection classe. Contiene una cache di schemi XML Schema Definition Language (XSD) e XML-Data Reduced (XDR) in C++."
type: docs
weight: 1500
url: /it/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


Contiene una cache di schemi XML [Schema](../) Definition Language (XSD) e XML-Data Reduced (XDR).

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Aggiunge lo schema individuato dall'URL fornito nella collezione di schemi. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | Aggiunge lo schema contenuto nel [XmlReader](../../system.xml/xmlreader/) alla collezione di schemi. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Aggiunge lo schema contenuto nel [XmlReader](../../system.xml/xmlreader/) alla collezione di schemi. Il [XmlResolver](../../system.xml/xmlresolver/) specificato è usato per risolvere eventuali risorse esterne. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Aggiunge lo [XmlSchema](../xmlschema/) alla collezione. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Aggiunge lo [XmlSchema](../xmlschema/) alla collezione. Il [XmlResolver](../../system.xml/xmlresolver/) specificato è usato per risolvere eventuali riferimenti esterni. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | Aggiunge tutti i namespace definiti nella collezione fornita (inclusi i relativi schemi) a questa collezione. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Restituisce un valore che indica se il **targetNamespace** del [XmlSchema](../xmlschema/) specificato è nella collezione. |
| [Contains](./contains/)(const String\&) | Restituisce un valore che indica se uno schema con il namespace specificato è nella collezione. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Copia tutti gli oggetti [XmlSchema](../xmlschema/) da questa collezione nell'array fornito a partire dall'indice specificato. |
| [get_Count](./get_count/)() | Restituisce il numero di namespace definiti in questa collezione. |
| [get_NameTable](./get_nametable/)() | Restituisce la [XmlNameTable](../../system.xml/xmlnametable/) predefinita utilizzata da [XmlSchemaCollection](./) durante il caricamento di nuovi schemi. |
| [GetEnumerator](./getenumerator/)() override | Fornisce supporto per l'iterazione sulla collezione di schemi. |
| [idx_get](./idx_get/)(const String\&) | Restituisce lo [XmlSchema](../xmlschema/) associato all'URI del namespace fornito. |
| [XmlSchemaCollection](./xmlschemacollection/)() | Inizializza una nuova istanza della classe [XmlSchemaCollection](./). |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlSchemaCollection](./) con la [XmlNameTable](../../system.xml/xmlnametable/) specificata. La [XmlNameTable](../../system.xml/xmlnametable/) viene utilizzata durante il caricamento degli schemi. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni


## Deprecated
La classe XmlSchemaCollection è obsoleta. Usa XmlSchemaSet al suo posto.

Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
