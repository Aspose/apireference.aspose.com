---
title: "System::Web::Services::Protocols::SoapClientMessage Klasse"
linktitle: "SoapClientMessage"
second_title: "Aspose.Page für C++"
description: "System::Web::Services::Protocols::SoapClientMessage Klasse. Stellt die Daten in einer gesendeten SOAP-Anforderung oder einer empfangenen SOAP-Antwort dar. Objekte dieser Klasse sollten ausschließlich über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


Stellt die Daten in einer gesendeten SOAP-Anforderung oder einer empfangenen SOAP-Antwort dar. Objekte dieser Klasse sollten ausschließlich über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Action](./get_action/)() override | Gibt einen Wert des Attributs 'SOAPAction' zurück. |
| [get_Client](./get_client/)() | Gibt eine Instanz der Client-Proxy-Klasse zurück. |
| virtual [get_OneWay](./get_oneway/)() | Gibt einen Wert zurück, der angibt, ob ein Client nicht darauf wartet, dass ein Server die Verarbeitung einer Methode abschließt. |
| [get_SoapVersion](./get_soapversion/)() override | Gibt die verwendete SOAP-Version zurück. |
| [get_Url](./get_url/)() override | Gibt die XML [Web](../../system.web/) Service-URL zurück. |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Konstruiert eine neue Instanz. |
## Siehe auch

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
