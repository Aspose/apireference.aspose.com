---
title: "System::Collections::Generic::BaseEnumerator Klasse"
linktitle: "BaseEnumerator"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::BaseEnumerator Klasse. Enumerator-Definition, um STL‑stilierte Typen für C#‑artige Verwendung zu kapseln. Stellt keine Annahmen über die Containerstruktur außer der Existenz eines sequentiellen Iterators. Verwendet die Funktionen begin() und end(). Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| Parameter | Beschreibung |
| --- | --- |
| Container | STL‑stilierter Containertyp. |
| Element | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | Initialisiert den Iterator. |
| [IsValid](./isvalid/)() const | Überprüft, ob [MoveNext()](./movenext/) aufgerufen wurde und das Ende nicht erreicht wurde. |
| [MoveNext](./movenext/)() override | Inkrement im Enumerator-Stil. |
| [Reset](./reset/)() override | Setzt den Enumerator zurück, um eine erneute Aufzählung der Elemente zu ermöglichen. |

## Siehe auch

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
