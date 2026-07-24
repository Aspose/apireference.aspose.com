---
title: "System::Security::Cryptography::Oid klass"
linktitle: "Oid"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::Oid klass. Kryptografisk objektidentifierare. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 2500
url: /sv/cpp/system.security.cryptography/oid/
---
## Oid class


Kryptografisk objektidentifierare. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class Oid : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | Skapa OID-objekt från det angivna OID-vänliga namnet. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | Skapa OID-objekt från det angivna OID-värdet. |
| [get_FriendlyName](./get_friendlyname/)() const | Hämtar användarvänligt namn på objektet. |
| [get_Value](./get_value/)() const | Hämtar objektidentifierarens sträng. |
| [Oid](./oid/)() | RTTI-information. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | Kopieringskonstruktor. |
| [Oid](./oid/)(const String\&) | Konstruktor. |
| [Oid](./oid/)(const String\&, const String\&) | Konstruktor. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Ställer in användarvänligt namn på objektet. |
| [set_Value](./set_value/)(const String\&) | Ställer in objektidentifierarens sträng. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
