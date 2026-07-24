---
title: "classe System::Globalization::SortVersion"
linktitle: "SortVersion"
second_title: "Aspose.Page per C++"
description: "classe System::Globalization::SortVersion. Fornisce informazioni sulla versione Unicode utilizzata per confrontare e ordinare le stringhe. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2300
url: /it/cpp/system.globalization/sortversion/
---
## SortVersion class


Fornisce informazioni sulla versione Unicode utilizzata per confrontare e ordinare le stringhe. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | Verifica se l'istanza corrente di [SortVersion](./) è uguale a un oggetto [SortVersion](./) specificato. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Verifica se l'istanza corrente di [SortVersion](./) è uguale a un oggetto [SortVersion](./) specificato. |
| [get_FullVersion](./get_fullversion/)() | Restituisce il numero di versione completo. |
| [get_SortId](./get_sortid/)() | Restituisce l'identificatore univoco per questo oggetto. |
| [GetHashCode](./gethashcode/)() const override | Restituisce il codice hash per l'oggetto corrente. |
| [operator!=](./operator!=/)(const SortVersion\&) | Verifica se l'istanza corrente di [SortVersion](./) non è uguale a un oggetto [SortVersion](./) specificato. |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | Verifica se l'istanza corrente di [SortVersion](./) è uguale a un oggetto [SortVersion](./) specificato. |
| [SortVersion](./sortversion/)(int, const Guid\&) | Informazioni RTTI. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## Vedi anche

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
