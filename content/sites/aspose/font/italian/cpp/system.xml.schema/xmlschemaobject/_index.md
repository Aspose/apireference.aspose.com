---
title: "System::Xml::Schema::XmlSchemaObject class"
linktitle: "XmlSchemaObject"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaObject class. Rappresenta la classe radice per la gerarchia del modello di oggetti dello schema Xml e funge da classe base per classi come la classe XmlSchema in C++."
type: docs
weight: 5000
url: /it/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


Rappresenta la classe radice per la gerarchia del modello di oggetti dello schema [Xml](../../system.xml/) e funge da classe base per classi come la classe [XmlSchema](../xmlschema/).

```cpp
class XmlSchemaObject : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | Restituisce il numero di riga nel file a cui si riferisce l'elemento **schema**. |
| [get_LinePosition](./get_lineposition/)() | Restituisce la posizione di colonna nel file a cui si riferisce l'elemento **schema**. |
| [get_Namespaces](./get_namespaces/)() | Restituisce gli XmlSerializerNamespaces da utilizzare con questo oggetto schema. |
| [get_Parent](./get_parent/)() | Restituisce il genitore di questo [XmlSchemaObject](./). |
| [get_SourceUri](./get_sourceuri/)() | Restituisce la posizione di origine del file che ha caricato lo schema. |
| [set_LineNumber](./set_linenumber/)(int32_t) | Imposta il numero di riga nel file a cui si riferisce l'elemento **schema**. |
| [set_LinePosition](./set_lineposition/)(int32_t) | Imposta la posizione di colonna nel file a cui si riferisce l'elemento **schema**. |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Imposta gli XmlSerializerNamespaces da utilizzare con questo oggetto schema. |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Imposta il genitore di questo [XmlSchemaObject](./). |
| [set_SourceUri](./set_sourceuri/)(const String\&) | Imposta la posizione di origine del file che ha caricato lo schema. |
| [XmlSchemaObject](./xmlschemaobject/)() | Inizializza una nuova istanza della classe [XmlSchemaObject](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
