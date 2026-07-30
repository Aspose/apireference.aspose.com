---
title: "System::StringComparer class"
linktitle: "StringComparer"
second_title: "Aspose.Font per C++"
description: "System::StringComparer class. Confronta le stringhe usando diverse modalità di confronto. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 5900
url: /it/cpp/system/stringcomparer/
---
## StringComparer class


Confronta le stringhe utilizzando diverse modalità di confronto. Gli oggetti di questa classe dovrebbero essere allocati solo tramite la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Confronta due stringhe usando le impostazioni correnti. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | Crea un comparatore specifico per la cultura. |
| [Equals](./equals/)(String, String) const override | Verifica se due stringhe sono uguali usando le impostazioni correnti. |
| static [get_CurrentCulture](./get_currentculture/)() | Singleton del comparatore per la cultura corrente. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | Singleton del comparatore per la cultura corrente che ignora il maiuscolo/minuscolo. |
| static [get_InvariantCulture](./get_invariantculture/)() | Singleton del comparatore per la cultura invariata. |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | Singleton del comparatore per la cultura invariata che ignora il maiuscolo/minuscolo. |
| static [get_Ordinal](./get_ordinal/)() | Singleton del comparatore ordinale. |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | Singleton del comparatore ordinale che ignora il maiuscolo/minuscolo. |
| [GetHashCode](./gethashcode/)(String) const override | Ottiene il codice hash della stringa. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [args_type](./args_type/) | Informazioni RTTI. |
## Vedi anche

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
