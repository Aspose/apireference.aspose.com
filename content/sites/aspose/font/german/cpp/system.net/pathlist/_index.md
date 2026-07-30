---
title: "System::Net::PathList Klasse"
linktitle: "PathList"
second_title: "Aspose.Font für C++"
description: "System::Net::PathList Klasse. Stellt die Liste der Instanzen der CookieCollection‑Klasse dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3000
url: /de/cpp/system.net/pathlist/
---
## PathList class


Stellt die Liste der Instanzen der [CookieCollection](../cookiecollection/)‑Klasse dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class PathList : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Create](./create/)() | Erstellt eine neue Instanz. |
| [get_Count](./get_count/)() const | Gibt die Anzahl der Elemente zurück. |
| [get_SyncRoot](./get_syncroot/)() const | Gibt das Objekt zurück, über das die Sammlung synchronisiert wird. |
| [GetCookiesCount](./getcookiescount/)() | Gibt die Anzahl der Cookies aller Sammlungs‑Elemente zurück. |
| [GetEnumerator](./getenumerator/)() | Gibt den Enumerator für die aktuelle Sammlung zurück. |
| [idx_get](./idx_get/)(String) | Liest die Cookie‑Sammlung über den angegebenen Pfad. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | Setzt die Cookie‑Sammlung über den angegebenen Pfad. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
