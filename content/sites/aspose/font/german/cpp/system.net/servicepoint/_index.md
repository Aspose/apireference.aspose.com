---
title: "System::Net::ServicePoint Klasse"
linktitle: "ServicePoint"
second_title: "Aspose.Font für C++"
description: "System::Net::ServicePoint Klasse. Bietet HTTP-Verbindungsverwaltung. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3100
url: /de/cpp/system.net/servicepoint/
---
## ServicePoint class


Bietet HTTP-Verbindungsverwaltung. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ServicePoint : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | Schließt und entfernt Verbindungen, die zur angegebenen Verbindungsgruppe gehören. |
| [get_Address](./get_address/)() | Gibt die Server-URI zurück, zu der die aktuelle Instanz verbindet. |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | RTTI-Informationen. |
| [get_Certificate](./get_certificate/)() | Gibt ein Zertifikat zurück, das von der aktuellen Instanz verwendet wird. |
| [get_ClientCertificate](./get_clientcertificate/)() | Gibt das letzte Client-Zertifikat zurück. |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | Liest einen Timeout in Millisekunden, nach dem aktive [ServicePoint](./) geschlossen wird. |
| [get_ConnectionLimit](./get_connectionlimit/)() | Liest die maximale Anzahl von Verbindungen, die von der aktuellen Instanz erlaubt sind. |
| [get_ConnectionName](./get_connectionname/)() | Gibt den Verbindungsnamen zurück. |
| [get_CurrentConnections](./get_currentconnections/)() | Gibt die Anzahl geöffneter Verbindungen zurück. |
| [get_Expect100Continue](./get_expect100continue/)() | Liest einen Wert, der angibt, ob das 100-Continue-Verhalten verwendet wird. |
| [get_IdleSince](./get_idlesince/)() | Gibt Datum und Uhrzeit der letzten Verbindung zu einem Host zurück. |
| [get_MaxIdleTime](./get_maxidletime/)() | Liest eine Zeitspanne in Millisekunden, nach der eine Leerlaufverbindung geschlossen wird. |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | Gibt die HTTP-Version zurück. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Liest die Größe des Empfangspuffers. |
| [get_SupportsPipelining](./get_supportspipelining/)() | Gibt einen Wert zurück, der angibt, ob die aktuelle Instanz Pipeline-Verbindungen unterstützt. |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Liest einen Wert, der angibt, ob der Nagle-Algorithmus von von der aktuellen Instanz verwalteten Verbindungen verwendet wird. |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | Setzt den Delegaten, der verwendet wird, um den lokalen [IPEndPoint](../ipendpoint/) mit der aktuellen Instanz zu verknüpfen. |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | Setzt einen Timeout in Millisekunden, nach dem aktive [ServicePoint](./) geschlossen wird. |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | Setzt die maximale Anzahl von Verbindungen, die von der aktuellen Instanz erlaubt sind. |
| [set_Expect100Continue](./set_expect100continue/)(bool) | Setzt einen Wert, der angibt, ob das 100-Continue-Verhalten verwendet wird. |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | Setzt eine Zeitspanne in Millisekunden, nach der eine Leerlaufverbindung geschlossen wird. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Setzt die Größe des Empfangspuffers. |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Setzt einen Wert, der angibt, ob der Nagle-Algorithmus von von der aktuellen Instanz verwalteten Verbindungen verwendet wird. |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Setzt den Wert, der angibt, ob die Option 'Keep-Alive' aktiviert ist. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
