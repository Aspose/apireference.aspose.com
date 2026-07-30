---
title: "System::Web::Services::Protocols::HttpWebClientProtocol class"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Font für C++"
description: "System::Web::Services::Protocols::HttpWebClientProtocol class. Diese Basisklasse wird in allen XML-Webdienst-Client-Proxy‑Klassen verwendet, die HTTP nutzen. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


Diese Basisklasse wird in allen XML [Web](../../system.web/) Dienst-Client-Proxy‑Klassen verwendet, die HTTP nutzen. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | Fügt Cookies aus der angegebenen Anforderung dem internen Cookie-Container hinzu. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | Ermittelt einen Wert, der angibt, ob der Client Server-Umleitungen folgt. |
| [get_ClientCertificates](./get_clientcertificates/)() | Gibt die Sammlung der Client-Zertifikate zurück. |
| [get_CookieContainer](./get_cookiecontainer/)() | Ermittelt einen Container, der zum Speichern von Cookies verwendet wird. |
| [get_EnableDecompression](./get_enabledecompression/)() | Ermittelt einen Wert, der angibt, ob die Dekomprimierung aktiviert ist. |
| [get_Proxy](./get_proxy/)() | Ermittelt Proxy-Informationen. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | Ermittelt einen Wert, der angibt, ob die Verbindungsfreigabe aktiviert ist, wenn der Client NTLM-Authentifizierung verwendet. |
| [get_UserAgent](./get_useragent/)() | Gibt einen Wert des 'User-Agent'-Headers zurück. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Legt einen Wert fest, der angibt, ob der Client Server-Umleitungen folgt. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Legt einen Container fest, der zum Speichern von Cookies verwendet wird. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | Legt einen Wert fest, der angibt, ob die Dekomprimierung aktiviert ist. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | Legt Proxy-Informationen fest. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | Legt einen Wert fest, der angibt, ob die Verbindungsfreigabe aktiviert ist, wenn der Client NTLM-Authentifizierung verwendet. |
| [set_UserAgent](./set_useragent/)(String) | Legt einen Wert des 'User-Agent'-Headers fest. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## Siehe auch

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
