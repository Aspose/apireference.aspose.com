---
title: "System::Net::ServicePointManager Klasse"
linktitle: "ServicePointManager"
second_title: "Aspose.Font für C++"
description: "System::Net::ServicePointManager Klasse. Verwaltet die Lebenszyklusphasen (Erstellen, Pflegen und Löschen) von Instanzen der ServicePoint‑Klasse. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen Zeiger vom Typ System::SmartPtr ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3200
url: /de/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


Verwaltet die Lebenszyklusphasen (Erstellen, Pflegen und Löschen) von Instanzen der [ServicePoint](../servicepoint/) Klasse. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen Zeiger vom Typ [System::SmartPtr](../../system/smartptr/) ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ServicePointManager : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | Gibt eine Zertifikatspolicy zurück. |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | Gibt einen Wert zurück, der angibt, ob das Zertifikat gegen die Sperrliste der Zertifizierungsstelle geprüft werden muss. |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | Gibt die maximale Anzahl gleichzeitiger Verbindungen zurück, die von ServicePoint‑Klasseninstanzen erlaubt sind. |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | Gibt einen Timeout in Millisekunden zurück, während dessen eine DNS‑Auflösung als gültig betrachtet wird. |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | Gibt einen Wert zurück, der angibt, ob eine DNS‑Auflösung zwischen den zutreffenden IP‑Adressen rotiert. |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | Gibt die Verschlüsselungspolicy zurück, die von der aktuellen Instanz verwendet wird. |
| static [get_Expect100Continue](./get_expect100continue/)() | Gibt einen Wert zurück, der angibt, ob ServicePoint‑Klasseninstanzen das 100‑Continue‑Verhalten verwenden. |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | Gibt die maximale Leerlaufzeit von ServicePoint‑Klasseninstanzen zurück. |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | Gibt die maximale Anzahl von ServicePoint‑Klasseninstanzen zurück, die von der aktuellen Instanz verwaltet werden können. |
| static [get_ReusePort](./get_reuseport/)() | Gibt einen Wert zurück, der angibt, ob die Ausgangs‑Socket‑Verbindungen die Option 'SO_REUSE_UNICASTPORT' verwenden. |
| static [get_SecurityProtocol](./get_securityprotocol/)() | Gibt den Sicherheitprotokolltyp zurück, der von ServicePoint‑Klasseninstanzen verwendet wird, die von der aktuellen Instanz verwaltet werden. |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | Gibt den Callback zurück, der zur Validierung eines Serverzertifikats verwendet wird. |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Gibt einen Wert zurück, der angibt, ob ServicePoint‑Klasseninstanzen den Nagle‑Algorithmus verwenden. |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | Setzt eine Zertifikatspolicy. |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | Setzt einen Wert, der angibt, ob das Zertifikat gegen die Sperrliste der Zertifizierungsstelle geprüft werden muss. |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | Legt die maximale Anzahl gleichzeitiger Verbindungen fest, die von den ServicePoint-class-Instanzen erlaubt sind. |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | Legt ein Timeout in Millisekunden fest, während dessen eine DNS-Auflösung als gültig betrachtet wird. |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | Legt einen Wert fest, der angibt, ob eine DNS-Auflösung zwischen den zutreffenden IP-Adressen rotiert. |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | Legt einen Wert fest, der angibt, ob die ServicePoint-class-Instanzen das 100-Continue-Verhalten verwenden. |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | Legt die maximale Leerlaufzeit der ServicePoint-class-Instanzen fest. |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | Legt die maximale Anzahl der ServicePoint-class-Instanzen fest, die von der aktuellen Instanz verwaltet werden können. |
| static [set_ReusePort](./set_reuseport/)(bool) | Legt einen Wert fest, der angibt, ob die Ausgangsverbindungssockets die Option 'SO_REUSE_UNICASTPORT' verwenden. |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | Legt den Sicherheitprotokolltyp fest, der von den ServicePoint-class-Instanzen verwendet wird, die von der aktuellen Instanz verwaltet werden. |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | Legt den Rückruf fest, der zur Validierung eines Serverzertifikats verwendet wird. |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Legt einen Wert fest, der angibt, ob die ServicePoint-class-Instanzen den Nagle-Algorithmus verwenden. |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Setzt den Wert, der angibt, ob die Option 'Keep-Alive' aktiviert ist. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | RTTI-Informationen. |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | Die Standardanzahl persistenter Verbindungen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
