---
title: "System::Globalization::CompareInfo classe"
linktitle: "CompareInfo"
second_title: "Aspose.Font per C++"
description: "classe System::Globalization::CompareInfo. Esegue confronti di stringhe sensibili alla cultura. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.globalization/compareinfo/
---
## CompareInfo class


Esegue confronti di stringhe sensibili alla cultura. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class CompareInfo : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | Confronta stringhe. Non implementato. |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | Confronta stringhe. Sono supportate solo le modalità Ordinal e OrdinalIgnoreCase. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | Confronta una sezione di una stringa con una sezione di un'altra stringa. Non implementato. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | Confronta la sezione finale di una stringa con la sezione finale di un'altra stringa usando i metodi di confronto delle stringhe. Non implementato. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | Confronta la sezione finale di una stringa con la sezione finale di un'altra stringa. Non implementato. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | Confronta una sezione di una stringa con una sezione di un'altra stringa usando i metodi di confronto delle stringhe. Non implementato. |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | Informazioni RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | Ottiene LCID della cultura associata al comparatore. |
| virtual [get_Name](./get_name/)() const | Ottiene il nome della cultura associata al comparatore. |
| [get_Version](./get_version/)() const | Ottiene informazioni sulla versione di ordinamento. |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | Ottiene [CompareInfo](./) associato alla cultura specificata e usando i metodi di confronto delle stringhe nell'assembly specificato. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Ottiene [CompareInfo](./) associato alla cultura specificata e usando i metodi di confronto delle stringhe nell'assembly specificato. |
| static [GetCompareInfo](./getcompareinfo/)(int) | Ottiene [CompareInfo](./) associato alla cultura specificata. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | Ottiene [CompareInfo](./) associato alla cultura specificata. |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | Ottiene il codice hash della stringa basato sulle opzioni di confronto specificate. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | Ottiene l'oggetto [SortKey](../sortkey/) per la stringa specificata usando le opzioni di confronto specificate. |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | Ottiene l'oggetto [SortKey](../sortkey/) per la stringa specificata. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | Cerca la sottostringa. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | Cerca la sottostringa. È supportata solo la modalità Ordinale. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | Cerca la sottostringa. È supportata solo la modalità Ordinale. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | Cerca il carattere specificato. È supportata solo la modalità Ordinale. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | Cerca la sottostringa. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | Cerca il carattere specificato. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | Cerca la sottostringa. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | Cerca il carattere specificato. È supportata solo la modalità Ordinale. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | Cerca il carattere specificato. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | Cerca il carattere specificato. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | Cerca la sottostringa. È supportata solo la modalità Ordinale. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | Cerca il carattere specificato. È supportata solo la modalità Ordinale. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | Verifica se la stringa specificata inizia con il prefisso specificato utilizzando le opzioni di confronto specificate. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | Verifica se la stringa specificata inizia con il prefisso specificato. |
| static [IsSortable](./issortable/)(char16_t) | Verifica se un carattere specificato è ordinabile. |
| static [IsSortable](./issortable/)(const String\&) | Verifica se una stringa specificata è ordinabile. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | Verifica se la stringa specificata termina con il suffisso specificato utilizzando le opzioni di confronto specificate. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | Verifica se la stringa specificata termina con il suffisso specificato. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | Cerca l'ultima occorrenza della sottostringa specificata. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | Cerca l'ultima occorrenza della sottostringa specificata utilizzando le opzioni di confronto specificate. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | Cerca l'ultima occorrenza del carattere specificato utilizzando le opzioni di confronto specificate. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | Cerca l'ultima occorrenza della stringa specificata. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | Cerca l'ultima occorrenza della stringa specificata utilizzando le opzioni di confronto specificate. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | Cerca l'ultima occorrenza del carattere specificato utilizzando le opzioni di confronto specificate. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | Cerca l'ultima occorrenza della stringa specificata. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | Cerca l'ultima occorrenza del carattere specificato. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | Cerca l'ultima occorrenza della stringa specificata utilizzando le opzioni di confronto specificate. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | Cerca l'ultima occorrenza del carattere specificato utilizzando le opzioni di confronto specificate. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | Cerca l'ultima occorrenza del carattere specificato. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | Cerca l'ultima occorrenza del carattere specificato. |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
