---
title: "System::Web::Services::Protocols::WebClientProtocol Klasse"
linktitle: "WebClientProtocol"
second_title: "Aspose.Page für C++"
description: "System::Web::Services::Protocols::WebClientProtocol Klasse. Diese Basisklasse wird in allen XML-Webservice-Client-Proxy‑Klassen verwendet, die mit ASP.NET erstellt wurden. Objekte dieser Klasse sollten ausschließlich über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1100
url: /de/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


Diese Basisklasse wird in allen XML [Web](../../system.web/) Service-Client-Proxy‑Klassen verwendet, die mit ASP.NET erstellt wurden. Objekte dieser Klasse sollten ausschließlich über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class WebClientProtocol : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Abort](./abort/)() | Bricht die Anforderung ab. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | Liest den Namen der Verbindungsgruppe. |
| [get_Credentials](./get_credentials/)() | Gibt die Authentifizierungsinformationen zurück. |
| [get_PreAuthenticate](./get_preauthenticate/)() | Liefert einen Wert, der angibt, ob die Vorab-Authentifizierung aktiviert ist. |
| [get_RequestEncoding](./get_requestencoding/)() | Liefert die Kodierung, die für die Client-Anfragen verwendet wird. |
| [get_Timeout](./get_timeout/)() | Gibt die Zeitspanne zurück, die gewartet werden soll, bevor die Anfrage abläuft. |
| [get_Uri](./get_uri/)() | Liefert die XML [Web](../../system.web/) Service-URI. |
| [get_Url](./get_url/)() | Liefert die XML [Web](../../system.web/) Service-URL. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Ermittelt einen Wert, der angibt, ob die Eigenschaft 'Credential' gleich der Eigenschaft 'DefaultCredentials' ist. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | Setzt den Namen der Verbindungsgruppe. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | Setzt die Authentifizierungsinformationen. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | Setzt einen Wert, der angibt, ob die Vorab-Authentifizierung aktiviert ist. |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | Legt die Kodierung fest, die für die Client-Anfragen verwendet wird. |
| [set_Timeout](./set_timeout/)(int32_t) | Legt die Zeitspanne fest, die abgewartet wird, bevor die Anfrage abläuft. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | Legt die XML [Web](../../system.web/) Service-URI fest. |
| [set_Url](./set_url/)(String) | Legt die XML [Web](../../system.web/) Service-URL fest. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Setzt einen Wert, der angibt, ob die Eigenschaft 'Credential' gleich der Eigenschaft 'DefaultCredentials' ist. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
