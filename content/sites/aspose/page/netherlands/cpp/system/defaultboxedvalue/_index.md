---
title: "System::DefaultBoxedValue klasse"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Page voor C++"
description: "System::DefaultBoxedValue klasse. Implementatie van de BoxedValue‑klasse. Staat toe dat BoxingValue‑specialisaties worden gedeclareerd zonder gemeenschappelijke code te dupliceren. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2000
url: /nl/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | Construeert een nieuwe instantie van de [DefaultBoxedValue](./) klasse die de opgegeven waarde vertegenwoordigt. |
| [Equals](./equals/)(ptr) override | Bepaalt de gelijkheid van de verpakte waarden die door het huidige en het opgegeven object worden vertegenwoordigd. |
| [GetHashCode](./gethashcode/)() const override | Retourneert een hashcode voor het huidige object. |
| [GetType](./gettype/)() const override | Haalt het werkelijke type van het object op. |
| [is](./is/)() const | Bepaalt of het type van de verpakte waarde die door het huidige object wordt weergegeven **V** is. |
| [ToString](./tostring/)() const override | Retourneert de tekenreeksrepresentatie van de boxed value. |
| [unbox](./unbox/)() const | Deboxt de boxed value. |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
