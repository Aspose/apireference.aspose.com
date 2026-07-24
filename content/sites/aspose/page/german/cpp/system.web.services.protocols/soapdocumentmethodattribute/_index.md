---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute Klasse"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Page für C++"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute Klasse. Gibt an, dass alle SOAP-Nachrichten, die von der Methode übergeben oder zurückgegeben werden, das Dokumentformat verwenden. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


Gibt an, dass alle SOAP-Nachrichten, die von der Methode übergeben oder zurückgegeben werden, das Dokumentformat verwenden. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Action](./get_action/)() | RTTI-Informationen. |
| [get_Binding](./get_binding/)() | Liefert die Bindung, für die eine XML-Webservice-Methode eine Operation implementiert. |
| [get_OneWay](./get_oneway/)() | Liefert einen Wert, der angibt, ob ein Client nicht darauf wartet, dass ein Server die Verarbeitung einer Methode beendet. |
| [get_ParameterStyle](./get_parameterstyle/)() | Liefert einen Wert, der angibt, ob Parameter in einem einzelnen XML-Element unterhalb des 'Body'-Elements gekapselt sind. |
| [get_RequestElementName](./get_requestelementname/)() | Liefert den Namen des XML-Elements, das mit der SOAP-Anforderung verknüpft ist und in einer Servicebeschreibung als Operation definiert wird. |
| [get_RequestNamespace](./get_requestnamespace/)() | Ermittelt den Namensraum, der mit der SOAP-Anforderung verknüpft ist. |
| [get_ResponseElementName](./get_responseelementname/)() | Ermittelt den Namen des XML-Elements, das mit der SOAP-Antwort verknüpft ist. |
| [get_ResponseNamespace](./get_responsenamespace/)() | Ermittelt den Namensraum, der mit der SOAP-Antwort verknüpft ist. |
| [get_Use](./get_use/)() | Ermittelt einen Wert, der die Kodierungsmethode der Nachricht bestimmt. |
| [set_Action](./set_action/)(String) | Legt einen Wert des 'SOAPAction'-Attributs fest. |
| [set_Binding](./set_binding/)(String) | Legt die Bindung fest, für die eine XML-Webservice-Methode eine Operation implementiert. |
| [set_OneWay](./set_oneway/)(bool) | Legt einen Wert fest, der angibt, ob der Client nicht wartet, bis der Server die Verarbeitung einer Methode abgeschlossen hat. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Legt einen Wert fest, der angibt, ob Parameter innerhalb eines einzelnen XML-Elements unterhalb des 'Body'-Elements gekapselt sind. |
| [set_RequestElementName](./set_requestelementname/)(String) | Legt den Namen des XML-Elements fest, das mit der SOAP-Anforderung verknüpft ist und in einer Servicebeschreibung als Operation definiert wird. |
| [set_RequestNamespace](./set_requestnamespace/)(String) | Legt den Namensraum fest, der mit der SOAP-Anforderung verknüpft ist. |
| [set_ResponseElementName](./set_responseelementname/)(String) | Legt den Namen des XML-Elements fest, das mit der SOAP-Antwort verknüpft ist. |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | Legt den Namensraum fest, der mit der SOAP-Antwort verknüpft ist. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Legt einen Wert fest, der die Kodierungsmethode der Nachricht bestimmt. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | Konstruiert eine neue Instanz. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | Konstruiert eine neue Instanz. |
## Siehe auch

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
