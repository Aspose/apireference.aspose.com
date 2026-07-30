---
title: "System::Net::HttpWebResponse Klasse"
linktitle: "HttpWebResponse"
second_title: "Aspose.Font für C++"
description: "System::Net::HttpWebResponse Klasse. Stellt die HTTP-Webantwort dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2100
url: /de/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


Stellt die HTTP-Webantwort dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Schließt den Antwort-Stream. |
| [get_CharacterSet](./get_characterset/)() | Nicht implementiert. |
| [get_ContentLength](./get_contentlength/)() override | RTTI-Informationen. |
| [get_ContentType](./get_contenttype/)() override | Gibt den MIME-Typ der Ressource zurück. |
| virtual [get_Cookies](./get_cookies/)() | Gibt Cookies zurück, die mit der Webantwort verknüpft sind. |
| [get_Headers](./get_headers/)() override | Gibt die Sammlung der Header zurück, die mit der aktuellen Antwort verknüpft sind. |
| virtual [get_Method](./get_method/)() | Gibt die HTTP-Methode zurück. |
| [get_ResponseUri](./get_responseuri/)() override | Gibt die URI der Ressource zurück. |
| virtual [get_StatusCode](./get_statuscode/)() | Gibt den HTTP-Statuscode zurück, der mit der Webantwort verknüpft ist. |
| virtual [get_StatusDescription](./get_statusdescription/)() | Gibt die String-Darstellung des Statuscodes zurück. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Gibt einen Wert zurück, der angibt, ob die aktuelle Antwort Header unterstützt. |
| [GetResponseHeader](./getresponseheader/)(String) | Gibt den entsprechenden Wert für den angegebenen Header-Namen zurück. |
| [GetResponseStream](./getresponsestream/)() override | Gibt den Antwort-Stream zurück. |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
