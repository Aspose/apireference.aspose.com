---
title: "System::Net::PathList Klasse"
linktitle: "PathList"
second_title: "Aspose.Page für C++"
description: "System::Net::PathList Klasse. Stellt die Liste der CookieCollection-Klasseninstanzen dar. Objekte dieser Klasse sollten ausschließlich mit der System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3000
url: /de/cpp/system.net/pathlist/
---
## PathList class


Stellt die Liste der [CookieCollection](../cookiecollection/) Klasseninstanzen dar. Objekte dieser Klasse sollten ausschließlich mit der [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

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
| [idx_get](./idx_get/)(String) | Ermittelt die Cookie‑Sammlung anhand des angegebenen Pfads. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | Setzt die Cookie‑Sammlung anhand des angegebenen Pfads. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
