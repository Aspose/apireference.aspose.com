---
title: "System::Net::CookieCollection Klasse"
linktitle: "CookieCollection"
second_title: "Aspose.Font für C++"
description: "System::Net::CookieCollection Klasse. Stellt eine Liste sortierter Cookies dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.net/cookiecollection/
---
## CookieCollection class


Stellt eine Liste sortierter Cookies dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [Stamp](./stamp/) | RTTI-Informationen. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | Fügt ein Cookie zur Sammlung hinzu. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Fügt Cookies aus der angegebenen Sammlung zur aktuellen hinzu. |
| [Clear](./clear/)() override | Entfernt alle Cookies aus der Sammlung. |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | Überprüft, ob die Sammlung das angegebene Cookie enthält. |
| [CookieCollection](./cookiecollection/)() | Erstellt eine neue Instanz. |
| [get_Count](./get_count/)() const override | Ermittelt die Anzahl der Elemente in der Sammlung. |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | Gibt einen Wert zurück, der anzeigt, ob die Sammlung ein Cookie mit einer Version enthält, die nicht gleich [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/) ist. |
| [GetEnumerator](./getenumerator/)() override | Gibt Enumerator zurück. |
| [idx_get](./idx_get/)(int32_t) | Gibt ein Cookie aus der Cookie‑Sammlung am angegebenen Index zurück. |
| [idx_get](./idx_get/)(String) | Gibt ein Cookie aus der Cookie‑Sammlung anhand des angegebenen Namens zurück. |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | Gibt den Index des angegebenen Cookies zurück. |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | Fügt das angegebene Cookie der Sammlung hinzu. |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | Entfernt das angegebene Cookie aus der Sammlung. |
| [RemoveAt](./removeat/)(int32_t) | Entfernt ein Cookie am angegebenen Index. |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | Aktualisiert den Zeitstempel gemäß dem angegebenen Szenario und gibt einen neuen Wert zurück. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Siehe auch

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
