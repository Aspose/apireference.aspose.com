---
title: "classe System::Globalization::SortKey"
linktitle: "SortKey"
second_title: "Aspose.Font per C++"
description: "classe System::Globalization::SortKey. Mappatura di una stringa alla sua chiave di ordinamento. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2200
url: /it/cpp/system.globalization/sortkey/
---
## SortKey class


Mappatura di una stringa alla sua chiave di ordinamento. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class SortKey : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | Confronta due chiavi di ordinamento. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Verifica se l'oggetto specificato è uguale all'oggetto [SortKey](./) corrente. |
| virtual [get_KeyData](./get_keydata/)() | Ottiene l'array di byte che rappresenta l'oggetto corrente. |
| virtual [get_OriginalString](./get_originalstring/)() | Ottiene la stringa originale usata per creare questo oggetto. |
| [GetHashCode](./gethashcode/)() const override | Ottiene il codice hash per l'oggetto [SortKey](./) corrente. |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | Converte l'oggetto corrente nella sua rappresentazione stringa. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
