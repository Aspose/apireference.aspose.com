---
title: "System::Net::Http::Headers::NameValueHeaderValue Klasse"
linktitle: "NameValueHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::NameValueHeaderValue Klasse. Stellt ein Schlüssel/Wert‑Paar dar, das in Headern verwendet wird. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1400
url: /de/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


Stellt ein Schlüssel/Wert‑Paar dar, das in Headern verwendet wird. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | Findet die NameValueHeaderValue‑Klasseninstanz in einer Sammlung anhand des angegebenen Namens. |
| [get_Name](./get_name/)() | Gibt den Namen der aktuellen Instanz zurück. |
| [get_Value](./get_value/)() | Ermittelt den Wert der aktuellen Instanz. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Gibt einen Hashcode aller Elemente der Sammlung zurück. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [NameValueHeaderValue](./)-Klasse. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [NameValueHeaderValue](./)-Klasse. |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Konvertiert einen übergebenen String ab dem angegebenen Index in die Sammlung von NameValueHeaderValue-Klasseninstanzen und gibt die Länge eines geparsten Teilstrings zurück. |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | Gibt die Länge eines Werts ab dem angegebenen Index zurück. |
| [NameValueHeaderValue](./namevalueheadervalue/)() | Erstellt eine neue Instanz. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | Erstellt eine neue Instanz. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | Erstellt eine neue Instanz. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [NameValueHeaderValue](./)-Klasse. |
| [set_Value](./set_value/)(String) | Setzt einen Wert der aktuellen Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | Gibt eine String‑Darstellung der Sammlung von NameValueHeaderValue‑Klasseninstanzen zurück. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | Gibt eine String‑Darstellung der Sammlung von NameValueHeaderValue‑Klasseninstanzen zurück. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [NameValueHeaderValue](./)-Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
