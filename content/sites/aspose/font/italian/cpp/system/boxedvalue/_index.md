---
title: "Classe System::BoxedValue"
linktitle: "BoxedValue"
second_title: "Aspose.Font per C++"
description: "Classe System::BoxedValue. Rappresenta un valore incapsulato. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system/boxedvalue/
---
## BoxedValue class


Rappresenta un valore incapsulato. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo del valore incapsulato rappresentato dalla classe |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | Costruisce un oggetto che rappresenta il valore specificato incapsulato. |
| [Equals](./equals/)(ptr) override | Determina l'uguaglianza dei valori incapsulati rappresentati dall'oggetto corrente e da quello specificato. |
| [GetHashCode](./gethashcode/)() const override | Restituisce un codice hash per l'oggetto corrente. |
| [GetType](./gettype/)() const override | Ottiene il tipo reale dell'oggetto. |
| [GetTypeCode](./gettypecode/)() const override | Restituisce il valore che rappresenta il tipo del valore incapsulato rappresentato dall'oggetto corrente. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Restituisce il valore numerico dell'oggetto incapsulato se può essere convertito, zero altrimenti. |
| [is](./is/)() const | Determina se il tipo del valore incapsulato rappresentato dall'oggetto corrente è **V**. |
| [IsBoxedEnum](./isboxedenum/)() override | Determina se l'oggetto corrente rappresenta un valore incapsulato di tipo enum. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | Incapsula il valore della costante di enumerazione dell'enumerazione specificata con il nome specificato. Un parametro indica se il case deve essere ignorato durante l'interpretazione della stringa che specifica il nome della costante di enumerazione. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | Incapsula il valore della costante di enumerazione dell'enumerazione specificata con il nome specificato. |
| [ToString](./tostring/)() const override | Converte il valore incapsulato rappresentato dall'oggetto corrente in stringa. |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | Converte l'oggetto incapsulato in stringa usando la stringa di formato specificata. |
| [unbox](./unbox/)() const | Deincapsula il valore rappresentato dall'oggetto corrente. |

## Vedi anche

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
