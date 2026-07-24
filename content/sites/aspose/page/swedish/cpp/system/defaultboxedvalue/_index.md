---
title: "System::DefaultBoxedValue-klass"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Page för C++"
description: "System::DefaultBoxedValue-klass. BoxedValue-klassimplementation. Tillåter dess BoxingValue-specialiseringar att deklareras utan att duplicera gemensam kod. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Wrapa alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 2000
url: /sv/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | Skapar en ny instans av [DefaultBoxedValue](./)-klassen som representerar det angivna värdet. |
| [Equals](./equals/)(ptr) override | Bestämmer likheten mellan de inneslutna värdena som representeras av det aktuella och det angivna objektet. |
| [GetHashCode](./gethashcode/)() const override | Returnerar en hashkod för det aktuella objektet. |
| [GetType](./gettype/)() const override | Hämtar den faktiska typen av objektet. |
| [is](./is/)() const | Bestämmer om typen av det inneslutna värdet som representeras av det aktuella objektet är **V**. |
| [ToString](./tostring/)() const override | Returnerar strängrepresentationen av det inlåsta värdet. |
| [unbox](./unbox/)() const | Packar upp det inlåsta värdet. |
## Se även

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
