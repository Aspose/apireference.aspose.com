---
title: "Classe System::Globalization::SortVersion"
linktitle: "SortVersion"
second_title: "Aspose.Font per C++"
description: "Classe System::Globalization::SortVersion. Fornisce informazioni sulla versione Unicode utilizzata per confrontare e ordinare le stringhe. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 2300
url: /it/cpp/system.globalization/sortversion/
---
## SortVersion class


Fornisce informazioni sulla versione Unicode utilizzata per confrontare e ordinare le stringhe. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | Verifica se l'istanza corrente di [SortVersion](./) è uguale a un oggetto [SortVersion](./) specificato. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Verifica se l'istanza corrente di [SortVersion](./) è uguale a un oggetto [SortVersion](./) specificato. |
| [get_FullVersion](./get_fullversion/)() | Ottiene il numero di versione completo. |
| [get_SortId](./get_sortid/)() | Ottiene l'identificatore univoco per questo oggetto. |
| [GetHashCode](./gethashcode/)() const override | Ottiene il codice hash per l'oggetto corrente. |
| [operator!=](./operator!=/)(const SortVersion\&) | Verifica se l'istanza corrente di [SortVersion](./) non è uguale a un oggetto [SortVersion](./) specificato. |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | Verifica se l'istanza corrente di [SortVersion](./) è uguale a un oggetto [SortVersion](./) specificato. |
| [SortVersion](./sortversion/)(int, const Guid\&) | Informazioni RTTI. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## Vedi anche

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
