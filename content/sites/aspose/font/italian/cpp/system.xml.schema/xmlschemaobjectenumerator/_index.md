---
title: "Classe System::Xml::Schema::XmlSchemaObjectEnumerator"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Schema::XmlSchemaObjectEnumerator. Rappresenta l'enumeratore per la XmlSchemaObjectCollection in C++."
type: docs
weight: 5200
url: /it/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


Rappresenta l'enumeratore per la [XmlSchemaObjectCollection](../xmlschemaobjectcollection/).

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona l'iteratore corrente. |
| [Dispose](./dispose/)() override | Non fa nulla. |
| [get_Current](./get_current/)() const override | Restituisce l'attuale [XmlSchemaObject](../xmlschemaobject/) nella collezione. |
| [MoveNext](./movenext/)() override | Si sposta all'elemento successivo nella collezione. |
| [Reset](./reset/)() override | Reimposta l'enumeratore all'inizio della collezione. |
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
