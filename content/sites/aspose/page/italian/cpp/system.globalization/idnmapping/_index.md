---
title: "Classe System::Globalization::IdnMapping"
linktitle: "IdnMapping"
second_title: "Aspose.Page per C++"
description: "Classe System::Globalization::IdnMapping. IdnMapping è usato per mappare i nomi in Punycode. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1300
url: /it/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Confronta due oggetti [IdnMapping](./). |
| [get_AllowUnassigned](./get_allowunassigned/)() const | Restituisce il flag che indica se i punti di codice non assegnati sono usati nelle operazioni. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | Restituisce il flag che indica se le convenzioni di denominazione standard sono usate nelle operazioni. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) nome di dominio Unicode in equivalente ASCII. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) nome di dominio Unicode in equivalente ASCII. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) nome di dominio Unicode in equivalente ASCII. |
| [GetHashCode](./gethashcode/)() const override | Restituisce il codice hash per l'oggetto [IdnMapping](./) corrente. |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) nome di dominio ASCII nella sua equivalenza Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) nome di dominio ASCII nella sua equivalenza Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) nome di dominio ASCII nella sua equivalenza Unicode. |
| [IdnMapping](./idnmapping/)() | Informazioni RTTI. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | Imposta il flag che indica se i punti di codice non assegnati sono usati nelle operazioni. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | Imposta il flag che indica se le convenzioni di denominazione standard sono usate nelle operazioni. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
