---
title: "System::Net::WebProxy Klasse"
linktitle: "WebProxy"
second_title: "Aspose.Font für C++"
description: "System::Net::WebProxy Klasse. Stellt einen HTTP‑Web‑Proxy‑Server dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3700
url: /de/cpp/system.net/webproxy/
---
## WebProxy class


Stellt einen HTTP‑Web‑Proxy‑Server dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class WebProxy : public System::Net::IWebProxy
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Address](./get_address/)() | Ruft die Adresse des aktuellen Proxy‑Servers ab. |
| [get_BypassList](./get_bypasslist/)() | Ruft die Liste der Adressen ab, die den Proxy‑Server nicht verwenden. |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | Ruft einen Wert ab, der angibt, ob der Proxy‑Server für lokale Adressen verwendet werden muss. |
| virtual [get_Credentials](./get_credentials/)() | Ruft die Anmeldeinformationen ab, die zur Authentifizierung an den Proxy‑Server gesendet werden. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Ruft einen Wert ab, der angibt, ob die Standardanmeldeinformationen mit den Anfragen gesendet werden müssen. |
| static [GetDefaultProxy](./getdefaultproxy/)() | Gibt den Proxy zurück, der die nicht‑dynamischen Einstellungen des Internet Explorers verwendet. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Gibt die proxied URI für eine Webanfrage zurück. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Überprüft, ob der Proxy-Server für die angegebene URI nicht verwendet wird. |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | Legt die Adresse des aktuellen Proxy-Servers fest. |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | Legt die Liste von Adressen fest, die den Proxy-Server nicht verwenden. |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | Legt einen Wert fest, der angibt, ob der Proxy-Server für lokale Adressen verwendet werden muss. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Legt die Anmeldeinformationen fest, die zur Authentifizierung an den Proxy-Server gesendet werden. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Legt einen Wert fest, der angibt, ob die Standard-Anmeldeinformationen mit Anfragen gesendet werden müssen. |
| [WebProxy](./webproxy/)() | Erstellt eine neue Instanz. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | Erstellt eine neue Instanz. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | Erstellt eine neue Instanz. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | Erstellt eine neue Instanz. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Erstellt eine neue Instanz. |
| [WebProxy](./webproxy/)(String, int32_t) | Erstellt eine neue Instanz. |
| [WebProxy](./webproxy/)(String) | Erstellt eine neue Instanz. |
| [WebProxy](./webproxy/)(String, bool) | Erstellt eine neue Instanz. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | Erstellt eine neue Instanz. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
