---
title: "System::Net::Http::HttpClientHandler Klasse"
linktitle: "HttpClientHandler"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::HttpClientHandler Klasse. Stellt den Standard-Nachrichten-Handler dar, der von der HttpClient-Klasse verwendet wird. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


Stellt den Standard-Nachrichten-Handler dar, der von der [HttpClient](../httpclient/) Klasse verwendet wird. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Dispose](./dispose/)() override | Tut nichts. |
| [get_CookieContainer](./get_cookiecontainer/)() | Liest den Cookie-Container, der zum Speichern von Server-Cookies verwendet wird. |
| [get_Credentials](./get_credentials/)() | Liest die Authentifizierungsinformationen. |
| [HttpClientHandler](./httpclienthandler/)() | RTTI-Informationen. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | RTTI-Informationen. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Setzt den Cookie-Container, der zum Speichern von Server-Cookies verwendet wird. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Setzt die Authentifizierungsinformationen. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Setzt die Proxy-Informationen. |
| [set_Timeout](./set_timeout/)(int32_t) | Liest die Zeitdauer in Millisekunden, nach der die Anforderung abläuft. |
| [set_UseCookies](./set_usecookies/)(bool) | Setzt den Wert, der angibt, ob die aktuelle Instanz den Cookie-Container zum Speichern von Server-Cookies verwendet und ob die Instanz Server-Cookies beim Senden von Anfragen nutzt. |
| [set_UseProxy](./set_useproxy/)(bool) | Setzt den Wert, der angibt, ob die aktuelle Instanz den Proxy zum Senden von Anfragen verwendet. |
## Siehe auch

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
