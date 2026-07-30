---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol Klasse"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Font für C++"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol Klasse. Die Client-Proxy-Dienste müssen diese Klasse erben, wenn SOAP verwendet wird. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


Die Client-Proxy-Dienste müssen diese Klasse erben, wenn SOAP verwendet wird. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Discover](./discover/)() | Bindet die aktuelle Instanz an den XML [Web](../../system.web/) Dienst. |
| [get_SoapVersion](./get_soapversion/)() | Liefert die SOAP-Version. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | Initialisiert die internen Felder. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | Setzt die SOAP-Version. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | Erstellt eine neue Instanz. |
## Siehe auch

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
