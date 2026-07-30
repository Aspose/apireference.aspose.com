---
title: "System::Web::Services::Protocols::SoapClientMessage class"
linktitle: "SoapClientMessage"
second_title: "Aspose.Font für C++"
description: "System::Web::Services::Protocols::SoapClientMessage class. Stellt die Daten in einer gesendeten SOAP-Anfrage oder einer empfangenen SOAP-Antwort dar. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


Stellt die Daten in einer gesendeten SOAP-Anfrage oder einer empfangenen SOAP-Antwort dar. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Action](./get_action/)() override | Gibt den Wert des 'SOAPAction'-Attributs zurück. |
| [get_Client](./get_client/)() | Gibt eine Instanz der Client-Proxy-Klasse zurück. |
| virtual [get_OneWay](./get_oneway/)() | Gibt einen Wert zurück, der angibt, ob ein Client nicht darauf wartet, dass ein Server die Verarbeitung einer Methode beendet. |
| [get_SoapVersion](./get_soapversion/)() override | Gibt die verwendete SOAP-Version zurück. |
| [get_Url](./get_url/)() override | Gibt die XML [Web](../../system.web/) Service-URL zurück. |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
