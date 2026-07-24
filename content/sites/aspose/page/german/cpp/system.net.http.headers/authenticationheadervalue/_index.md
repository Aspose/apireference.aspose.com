---
title: "System::Net::Http::Headers::AuthenticationHeaderValue Klasse"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue Klasse. Stellt Werte der ''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'' und ''Proxy-Authenticate''-Header dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


Stellt Werte der 'Authorization', 'ProxyAuthorization', 'WWW-Authenticate' und 'Proxy-Authenticate'-Header dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | Konstruktor. |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | Konstruktor. |
| [Clone](./clone/)() override | RTTI-Informationen. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-[Object.Equals](../../system/object/equals/)-Semantik. |
| [get_Parameter](./get_parameter/)() | Ermittelt die Anmeldeinformationen, die die Authentifizierungsdaten enthalten. |
| [get_Scheme](./get_scheme/)() | RTTI-Informationen. |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Analysiert die angegebene Zeichenkette und gibt den letzten Index der Zeichenkettenrepräsentation zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [Parse](./parse/)(String) | Konvertiert eine übergebene Zeichenkette in eine Instanz der [AuthenticationHeaderValue](./) Klasse. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | Versucht, eine übergebene Zeichenkette in eine Instanz der [AuthenticationHeaderValue](./) Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
