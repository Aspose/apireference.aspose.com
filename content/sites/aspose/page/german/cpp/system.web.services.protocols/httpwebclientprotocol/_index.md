---
title: "System::Web::Services::Protocols::HttpWebClientProtocol Klasse"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Page für C++"
description: "System::Web::Services::Protocols::HttpWebClientProtocol Klasse. Diese Basisklasse wird in allen XML-Webservice-Client‑Proxys verwendet, die HTTP nutzen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


Diese Basisklasse wird in allen XML [Web](../../system.web/) Service‑Client‑Proxys verwendet, die HTTP nutzen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | Fügt Cookies aus der angegebenen Anforderung zum internen Cookie‑Container hinzu. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | Gibt einen Wert zurück, der angibt, ob der Client Server‑Weiterleitungen folgt. |
| [get_ClientCertificates](./get_clientcertificates/)() | Gibt die Sammlung der Client‑Zertifikate zurück. |
| [get_CookieContainer](./get_cookiecontainer/)() | Gibt einen Container zurück, der zum Speichern von Cookies verwendet wird. |
| [get_EnableDecompression](./get_enabledecompression/)() | Gibt einen Wert zurück, der angibt, ob die Dekompression aktiviert ist. |
| [get_Proxy](./get_proxy/)() | Gibt Proxy‑Informationen zurück. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | Gibt einen Wert zurück, der angibt, ob die Verbindungsfreigabe aktiviert ist, wenn der Client NTLM‑Authentifizierung verwendet. |
| [get_UserAgent](./get_useragent/)() | Ermittelt einen Wert des 'User-Agent'-Headers. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Setzt einen Wert, der angibt, ob der Client Server‑Weiterleitungen folgt. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Setzt einen Container, der zum Speichern von Cookies verwendet wird. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | Setzt einen Wert, der angibt, ob die Dekompression aktiviert ist. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | Setzt Proxy‑Informationen. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | Setzt einen Wert, der angibt, ob die Verbindungsfreigabe aktiviert ist, wenn der Client NTLM‑Authentifizierung verwendet. |
| [set_UserAgent](./set_useragent/)(String) | Setzt einen Wert des 'User-Agent'-Headers. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## Siehe auch

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
