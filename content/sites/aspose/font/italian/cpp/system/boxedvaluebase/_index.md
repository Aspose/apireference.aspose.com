---
title: "Classe System::BoxedValueBase"
linktitle: "BoxedValueBase"
second_title: "Aspose.Font per C++"
description: "Classe System::BoxedValueBase. Una classe base che definisce un'interfaccia e implementa alcuni metodi fondamentali di una classe discendente che rappresenta un valore incapsulato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


Una classe base che definisce un'interfaccia e implementa alcuni metodi fondamentali di una classe discendente che rappresenta un valore incapsulato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class BoxedValueBase : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | Restituisce il valore che rappresenta il tipo del valore incapsulato rappresentato dall'oggetto corrente. |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | Converte il valore incapsulato rappresentato dall'oggetto corrente in un valore intero a 64 bit. |
| virtual [IsBoxedEnum](./isboxedenum/)() | Determina se l'oggetto corrente rappresenta un valore incapsulato di tipo enum. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | Incapsula il valore della costante di enumerazione dell'enumerazione specificata con il nome specificato. Un parametro indica se il case deve essere ignorato durante l'interpretazione della stringa che specifica il nome della costante di enumerazione. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | Incapsula il valore della costante di enumerazione dell'enumerazione specificata con il nome specificato. |
| [ToString](./tostring/)(const System::String\&) const | Converte l'oggetto incapsulato in stringa usando la stringa di formato specificata. |
| virtual [ToString](./tostring/)() const | Analogo del metodo C# [Object.ToString()](../object/tostring/). Consente di convertire oggetti personalizzati in stringa. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
