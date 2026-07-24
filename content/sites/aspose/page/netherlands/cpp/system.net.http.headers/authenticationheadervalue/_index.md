---
title: "System::Net::Http::Headers::AuthenticationHeaderValue klasse"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue klasse. Vertegenwoordigt waarden van de ''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'' en ''Proxy-Authenticate''-headers. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 100
url: /nl/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


Stelt waarden van de 'Authorization', 'ProxyAuthorization', 'WWW-Authenticate' en 'Proxy-Authenticate' headers voor. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | Constructor. |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | Constructor. |
| [Clone](./clone/)() override | RTTI-informatie. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Parameter](./get_parameter/)() | Haalt de referenties op die de authenticatie‑informatie bevatten. |
| [get_Scheme](./get_scheme/)() | RTTI-informatie. |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Parseert de opgegeven tekenreeks en retourneert de laatste index van de tekenreeksrepresentatie. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [Parse](./parse/)(String) | Converteert een opgegeven tekenreeks naar een instantie van de [AuthenticationHeaderValue](./) klasse. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | Probeert een opgegeven tekenreeks te converteren naar een instantie van de [AuthenticationHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
