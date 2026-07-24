---
title: "System::Net::CookieContainer klasse"
linktitle: "CookieContainer"
second_title: "Aspose.Page voor C++"
description: "System::Net::CookieContainer klasse. Biedt een container voor de CookieCollection-klasse‑instanties. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.net/cookiecontainer/
---
## CookieContainer class


Biedt een container voor de CookieCollection-klasse-instanties. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class CookieContainer : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | Voegt een cookie toe aan de collectie. |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | Voegt een cookie toe aan de collectie. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Kopieert cookies van de opgegeven collectie naar de huidige. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | Voegt een cookie toe voor de opgegeven URI. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | Kopieert cookies van de opgegeven collectie voor de opgegeven URI naar de huidige collectie. |
| [CookieContainer](./cookiecontainer/)() | Construeert een nieuw exemplaar. |
| [CookieContainer](./cookiecontainer/)(int32_t) | Construeert een nieuw exemplaar. |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | Construeert een nieuw exemplaar. |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | Kopieert cookies van de opgegeven HTTP-header voor de opgegeven URI. |
| [get_Capacity](./get_capacity/)() | Haalt de capaciteit van de collectie op. |
| [get_Count](./get_count/)() | Retourneert het aantal items in de collectie. |
| [get_MaxCookieSize](./get_maxcookiesize/)() | Haalt de maximale cookie‑grootte op. |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | Haalt de capaciteit van de collectie per domein op. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | Retourneert een HTTP-header die cookies bevat die gekoppeld zijn aan de opgegeven URI. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | Retourneert een HTTP-header die cookies bevat die gekoppeld zijn aan de opgegeven URI. |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | Retourneert een collectie cookies die gekoppeld zijn aan de opgegeven URI. |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | Retourneert een collectie cookies die gekoppeld zijn aan de opgegeven URI. |
| [IsLocalDomain](./islocaldomain/)(String) | Controleert of het opgegeven domein localhost is. |
| [set_Capacity](./set_capacity/)(int32_t) | Stelt de capaciteit van de collectie in. |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | Stelt de maximale cookie‑grootte in. |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | Stelt de capaciteit van de collectie per domein in. |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | Kopieert cookies van de opgegeven header naar de collectie en koppelt ze aan de opgegeven URI. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | De maximale cookie‑grootte. |
| static [DefaultCookieLimit](./defaultcookielimit/) | RTTI-informatie. |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | Het maximale aantal items in de collectie per domein. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
