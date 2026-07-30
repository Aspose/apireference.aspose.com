---
title: "System::Collections::Generic::IKVCollection Klasse"
linktitle: "IKVCollection"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::IKVCollection Klasse. Schnittstelle eines Containers, der Schlüssel oder Werte des dictionary‑ähnlichen Containers enthält. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2500
url: /de/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


Schnittstelle eines Containers, der Schlüssel oder Werte des dictionary‑ähnlichen Containers enthält. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) Typ. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const T\&) override | Fügt ein Element zum Container hinzu. |
| [Clear](./clear/)() override | Löscht alle Elemente aus dem Container. |
| [Contains](./contains/)(const T\&) const override | Überprüft, ob das Element im Container vorhanden ist. |
| virtual [get_Count](./get_count/)() const | Ermittelt die Anzahl der Elemente im Container. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Prüft, ob der Container schreibgeschützt ist. |
| virtual [GetEnumerator](./getenumerator/)() | RTTI-Informationen. |
| virtual [idx_get](./idx_get/)(int) const | Getter-Funktion. |
| [idx_set](./idx_set/)(int, T) override | Setter-Funktion. |
| [IndexOf](./indexof/)(const T\&) const override | Ermittelt den Index des Elements im Container. |
| [Insert](./insert/)(int, const T\&) override | Fügt ein Element an der angegebenen Position ein. |
| [Remove](./remove/)(const T\&) override | Entfernt ein Element aus dem Container. |
| [RemoveAt](./removeat/)(int) override | Entfernt das Element an der angegebenen Position. |

## Siehe auch

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
