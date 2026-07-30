---
title: "System::Collections::Generic::Stack::Enumerator Klasse"
linktitle: "Enumerator"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::Stack::Enumerator class. Enumerator zum Durchlaufen des Stapels. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2000
url: /de/cpp/system.collections.generic/stack/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through stack. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::ReverseEnumerator<stack_t>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | Konstruiert einen Enumerator, der den angegebenen Stapel durchläuft. |
## Siehe auch

* Class [ReverseEnumerator](../../reverseenumerator/)
* Class [Stack](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
