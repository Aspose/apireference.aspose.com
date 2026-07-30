---
title: "System::Collections::Generic::SimpleEnumerator Klasse"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::SimpleEnumerator Klasse. Iterator‑Klasse für einfache Container, die Elemente direkt über die Funktionen rbegin() und rend() halten. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3900
url: /de/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


Iterator‑Klasse für einfache Container, die Elemente direkt über die Funktionen rbegin() und rend() halten. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Parameter | Beschreibung |
| --- | --- |
| Container | Container‑Typ zum Durchlaufen. |
| Element | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Klonen des aktuellen Iterators. |
| [get_Current](./get_current/)() const override | Liefert das 'aktuelle' Element. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | Erstellt einen einfachen Iterator. |

## Siehe auch

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
