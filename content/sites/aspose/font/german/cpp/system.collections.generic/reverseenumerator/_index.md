---
title: "System::Collections::Generic::ReverseEnumerator Klasse"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::ReverseEnumerator Klasse. Enumerator, der den Container rückwärts durchläuft. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3800
url: /de/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| Parameter | Beschreibung |
| --- | --- |
| Container | Container zum Durchlaufen. |
| Element | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Current](./get_current/)() const override | Liefert das 'aktuelle' Element. |
| [IsValid](./isvalid/)() const | Überprüft, ob [MoveNext()](./movenext/) aufgerufen wurde und das Ende nicht erreicht ist. |
| [MoveNext](./movenext/)() override | Enumerator-artige Inkrementierung. |
| [Reset](./reset/)() override | Setzt den Enumerator zurück, um ein erneutes Durchlaufen der Elemente zu ermöglichen. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | Initialisiert den Iterator. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | Destruktor. |

## Siehe auch

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
