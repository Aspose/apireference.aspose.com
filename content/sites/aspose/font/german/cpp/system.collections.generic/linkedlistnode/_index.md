---
title: "System::Collections::Generic::LinkedListNode Klasse"
linktitle: "LinkedListNode"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::LinkedListNode Klasse. Knoten einer verketteten Liste. Implementiert eine Wrapper‑Klasse über einen Iterator von std::list, der in einer verketteten Liste gekapselt ist. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3200
url: /de/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


Knoten einer verketteten Liste. Implementiert einen Wrapper über einen Iterator von std::list, der in einer verketteten Liste gekapselt ist. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ für gespeicherten Wert. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_List](./get_list/)() const | Gibt die enthaltende Liste zurück. |
| [get_Next](./get_next/)() const | Gibt den nächsten Knoten zurück. |
| [get_Previous](./get_previous/)() const | Gibt den vorherigen Knoten zurück. |
| [get_Value](./get_value/)() const | Gibt den gespeicherten Wert zurück. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | Konstruktor. |
| [set_Value](./set_value/)(const T\&) | Setzt den gespeicherten Wert. |

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
