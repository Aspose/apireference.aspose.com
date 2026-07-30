---
title: "classe System::DefaultBoxedValue"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Font per C++"
description: "classe System::DefaultBoxedValue. Implementazione della classe BoxedValue. Consente di dichiarare specializzazioni di BoxingValue senza duplicare il codice comune. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2000
url: /it/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | Costruisce una nuova istanza della classe [DefaultBoxedValue](./) che rappresenta il valore specificato. |
| [Equals](./equals/)(ptr) override | Determina l'uguaglianza dei valori incapsulati rappresentati dall'oggetto corrente e da quello specificato. |
| [GetHashCode](./gethashcode/)() const override | Restituisce un codice hash per l'oggetto corrente. |
| [GetType](./gettype/)() const override | Ottiene il tipo reale dell'oggetto. |
| [is](./is/)() const | Determina se il tipo del valore incapsulato rappresentato dall'oggetto corrente è **V**. |
| [ToString](./tostring/)() const override | Restituisce la rappresentazione stringa del valore boxed. |
| [unbox](./unbox/)() const | Estrae il valore boxed. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
