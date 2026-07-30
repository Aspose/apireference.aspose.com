---
title: "System::Net::CookieContainer Klasse"
linktitle: "CookieContainer"
second_title: "Aspose.Font für C++"
description: "System::Net::CookieContainer Klasse. Stellt einen Container für die Instanzen der CookieCollection-Klasse bereit. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.net/cookiecontainer/
---
## CookieContainer class


Stellt einen Container für die Instanzen der CookieCollection-Klasse bereit. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class CookieContainer : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | Fügt ein Cookie zur Sammlung hinzu. |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | Fügt ein Cookie zur Sammlung hinzu. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Kopiert Cookies aus der angegebenen Sammlung in die aktuelle. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | Fügt ein Cookie für die angegebene URI hinzu. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | Kopiert Cookies aus der angegebenen Sammlung für die angegebene URI in die aktuelle Sammlung. |
| [CookieContainer](./cookiecontainer/)() | Erstellt eine neue Instanz. |
| [CookieContainer](./cookiecontainer/)(int32_t) | Erstellt eine neue Instanz. |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | Erstellt eine neue Instanz. |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | Kopiert Cookies aus dem angegebenen HTTP-Header für die angegebene URI. |
| [get_Capacity](./get_capacity/)() | Liefert die Kapazität der Sammlung. |
| [get_Count](./get_count/)() | Gibt die Anzahl der Elemente der Sammlung zurück. |
| [get_MaxCookieSize](./get_maxcookiesize/)() | Liefert die maximale Cookie-Größe. |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | Liefert die Sammlungs‑Kapazität pro Domain. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | Gibt einen HTTP-Header zurück, der Cookies enthält, die mit der angegebenen URI verknüpft sind. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | Gibt einen HTTP-Header zurück, der Cookies enthält, die mit der angegebenen URI verknüpft sind. |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | Gibt eine Sammlung von Cookies zurück, die mit der angegebenen URI verknüpft sind. |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | Gibt eine Sammlung von Cookies zurück, die mit der angegebenen URI verknüpft sind. |
| [IsLocalDomain](./islocaldomain/)(String) | Überprüft, ob die angegebene Domain localhost ist. |
| [set_Capacity](./set_capacity/)(int32_t) | Setzt die Kapazität der Sammlung. |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | Setzt die maximale Cookie-Größe. |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | Setzt die Sammlungs‑Kapazität pro Domain. |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | Kopiert Cookies aus dem angegebenen Header in die Sammlung und verknüpft sie mit der angegebenen URI. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | Die maximale Cookie-Größe. |
| static [DefaultCookieLimit](./defaultcookielimit/) | RTTI-Informationen. |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | Die maximale Anzahl von Sammlungs‑Elementen pro Domain. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
