---
title: "Classe System::Xml::Schema::XmlSchemaCollectionEnumerator"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaCollectionEnumerator. Supporta un'iterazione semplice su una collezione. Questa classe non può essere ereditata in C++."
type: docs
weight: 1600
url: /it/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


Supporta un'iterazione semplice su una collezione. Questa classe non può essere ereditata.

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona l'iteratore corrente. |
| [Dispose](./dispose/)() override | Non fa nulla. |
| [get_Current](./get_current/)() const override | Restituisce l'[XmlSchema](../xmlschema/) corrente nella collezione. |
| [MoveNext](./movenext/)() override | Avanza l'enumeratore al prossimo schema nella collezione. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
