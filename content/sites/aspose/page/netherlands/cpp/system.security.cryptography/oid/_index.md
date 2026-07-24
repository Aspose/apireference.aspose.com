---
title: "System::Security::Cryptography::Oid klasse"
linktitle: "Oid"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::Oid klasse. Cryptografische objectidentificatie. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2500
url: /nl/cpp/system.security.cryptography/oid/
---
## Oid class


Cryptografische objectidentificatie. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Oid : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | Maak OID‑object aan vanuit de opgegeven vriendelijke OID‑naam. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | Maak OID‑object aan vanuit de opgegeven OID‑waarde. |
| [get_FriendlyName](./get_friendlyname/)() const | Haalt de gebruiksvriendelijke naam van het object op. |
| [get_Value](./get_value/)() const | Haalt de objectidentificatiestring op. |
| [Oid](./oid/)() | RTTI-informatie. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | Copy-constructor. |
| [Oid](./oid/)(const String\&) | Constructor. |
| [Oid](./oid/)(const String\&, const String\&) | Constructor. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Stelt de gebruiksvriendelijke naam van het object in. |
| [set_Value](./set_value/)(const String\&) | Stelt de objectidentificatiestring in. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
