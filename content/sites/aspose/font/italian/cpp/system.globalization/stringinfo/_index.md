---
title: "classe System::Globalization::StringInfo"
linktitle: "StringInfo"
second_title: "Aspose.Font per C++"
description: "classe System::Globalization::StringInfo. Divisore per iterare attraverso le parti della stringa. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2400
url: /it/cpp/system.globalization/stringinfo/
---
## StringInfo class


Divisore per iterare attraverso le parti della stringa. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StringInfo : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | Ottiene il numero di elementi di testo nell'oggetto [StringInfo](./). |
| [get_String](./get_string/)() const | Ottiene il valore dell'oggetto [StringInfo](./). |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | Ottiene il primo elemento nella stringa specificata. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | Ottiene l'elemento all'indice specificato della stringa specificata. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | Crea un enumeratore per iterare attraverso i caratteri della stringa. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | Crea un enumeratore per iterare attraverso i caratteri della stringa a partire dall'indice specificato. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | Ottiene gli indici dei caratteri base, dei surrogati alti e dei caratteri di controllo. |
| [set_String](./set_string/)(const String\&) | Imposta il valore dell'oggetto [StringInfo](./). |
| [StringInfo](./stringinfo/)() | Informazioni RTTI. |
| [StringInfo](./stringinfo/)(const String\&) | Costruttore. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | Ottiene la sottostringa di elementi di testo dall'elemento di testo specificato fino all'ultimo elemento di testo. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | Ottiene la sottostringa di elementi di testo dall'elemento di testo specificato fino al numero specificato di elementi di testo. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
