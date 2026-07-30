---
title: "System::Collections::IEnumerator Klasse"
linktitle: "IEnumerator"
second_title: "Aspose.Font für C++"
description: "System::Collections::IEnumerator Klasse. Schnittstelle des Enumerators, die verwendet werden kann, um durch einige Elemente zu iterieren. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.collections/ienumerator/
---
## IEnumerator class


Schnittstelle des Enumerators, die verwendet werden kann, um durch einige Elemente zu iterieren. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| Parameter | Beschreibung |
| --- | --- |
| T | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Current](./current/)() const | Gibt das aktuelle Element zurück. |
| virtual [get_Current](./get_current/)() const | Gibt das aktuelle Element zurück. |
| virtual [MoveNext](./movenext/)() | Bewegt den Enumerator zum nächsten Element. Wenn zuvor kein Element referenziert wurde, wird die Referenz auf das erste verfügbare Element gesetzt. Wird das Ende des Containers erreicht, geschieht nichts. |
| virtual [Reset](./reset/)() | Setzt den Enumerator auf die Position vor dem ersten Element zurück. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [ValueType](./valuetype/) | RTTI-Informationen. |

## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
