---
title: "System::Net::Security::AuthenticatedStream class"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Page voor C++"
description: "System::Net::Security::AuthenticatedStream klasse. Bevat de methoden voor het doorgeven van referenties via een stream. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


Bevat de methoden voor het doorgeven van referenties via een stream. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze aan functies door te geven als argument.

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | Retourneert een waarde die aangeeft of de authenticatie succesvol is verlopen. |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | Retourneert een waarde die aangeeft of de met deze stream verzonden gegevens versleuteld zijn. |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | Retourneert een waarde die aangeeft of een server en een client geauthenticeerd zijn. |
| virtual [get_IsServer](./get_isserver/)() const | Retourneert een waarde die aangeeft of de lokale kant van de verbinding de server is. |
| virtual [get_IsSigned](./get_issigned/)() const | Retourneert een waarde die aangeeft of de met deze stream verzonden gegevens ondertekend zijn. |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | RTTI-informatie. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Een stream zonder onderliggende opslag. |
## Zie ook

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
