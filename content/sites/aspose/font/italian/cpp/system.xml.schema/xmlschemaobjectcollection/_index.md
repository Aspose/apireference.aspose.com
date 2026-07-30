---
title: "System::Xml::Schema::XmlSchemaObjectCollection class"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaObjectCollection class. Una collezione di XmlSchemaObjects in C++."
type: docs
weight: 5100
url: /it/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


Una raccolta di XmlSchemaObjects.

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | Aggiunge un [XmlSchemaObject](../xmlschemaobject/) alla [XmlSchemaObjectCollection](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | Indica se il [XmlSchemaObject](../xmlschemaobject/) specificato è presente nella [XmlSchemaObjectCollection](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | Copia tutti gli XmlSchemaObjects dalla collezione nell'array fornito, iniziando dall'indice specificato. |
| [GetEnumerator](./getenumerator/)() override | Restituisce un enumeratore per iterare attraverso gli XmlSchemaObjects contenuti nella [XmlSchemaObjectCollection](./). |
| virtual [idx_get](./idx_get/)(int32_t) | Restituisce il [XmlSchemaObject](../xmlschemaobject/) all'indice specificato. |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | Imposta il [XmlSchemaObject](../xmlschemaobject/) all'indice specificato. |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | Restituisce l'indice della collezione corrispondente al [XmlSchemaObject](../xmlschemaobject/) specificato. |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | Inserisce un [XmlSchemaObject](../xmlschemaobject/) nella [XmlSchemaObjectCollection](./). |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | Rimuove un [XmlSchemaObject](../xmlschemaobject/) dalla [XmlSchemaObjectCollection](./). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del template a un puntatore debole (invece di condiviso). Consente di passare i puntatori nei contenitori alla modalità debole. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | Inizializza una nuova istanza della classe [XmlSchemaObjectCollection](./). |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | Inizializza una nuova istanza della classe [XmlSchemaObjectCollection](./) che accetta un [XmlSchemaObject](../xmlschemaobject/). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
