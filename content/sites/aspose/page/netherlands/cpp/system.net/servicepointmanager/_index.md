---
title: "System::Net::ServicePointManager class"
linktitle: "ServicePointManager"
second_title: "Aspose.Page voor C++"
description: "System::Net::ServicePointManager class. Beheert de levenscyclusfasen (aanmaken, onderhouden en verwijderen) van de ServicePoint‑klasse‑instanties. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3200
url: /nl/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


Beheert de levenscyclusfasen (aanmaken, onderhouden en verwijderen) van de [ServicePoint](../servicepoint/) klasse‑instanties. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ServicePointManager : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | Haalt een certificaatbeleid op. |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | Haalt een waarde op die aangeeft of het certificaat moet worden gecontroleerd tegen de intrekkingslijst van de certificaatautoriteit. |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | Haalt het maximale aantal gelijktijdige verbindingen op dat is toegestaan door de ServicePoint‑klasse‑instanties. |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | Haalt een time‑out op in milliseconden gedurende welke een DNS‑resolutie als geldig wordt beschouwd. |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | Haalt een waarde op die aangeeft of een DNS‑resolutie roteert tussen de toepasselijke IP‑adressen. |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | Retourneert het encryptiebeleid dat door de huidige instantie wordt gebruikt. |
| static [get_Expect100Continue](./get_expect100continue/)() | Haalt een waarde op die aangeeft of de ServicePoint‑klasse‑instanties het 100‑Continue‑gedrag gebruiken. |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | Haalt de maximale idle‑tijd van de ServicePoint‑klasse‑instanties op. |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | Haalt het maximale aantal ServicePoint‑klasse‑instanties op dat door de huidige instantie kan worden beheerd. |
| static [get_ReusePort](./get_reuseport/)() | Haalt een waarde op die aangeeft of de uitgaande verbindings‑sockets de 'SO_REUSE_UNICASTPORT'‑optie gebruiken. |
| static [get_SecurityProtocol](./get_securityprotocol/)() | Haalt het type beveiligingsprotocol op dat wordt gebruikt door de ServicePoint‑klasse‑instanties die door de huidige instantie worden beheerd. |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | Haalt de callback op die wordt gebruikt om een servercertificaat te valideren. |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Haalt een waarde op die aangeeft of de ServicePoint‑klasse‑instanties het Nagle‑algoritme gebruiken. |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | Stelt een certificaatbeleid in. |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | Stelt een waarde in die aangeeft of het certificaat moet worden gecontroleerd tegen de intrekkingslijst van de certificaatautoriteit. |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | Stelt het maximum aantal gelijktijdige verbindingen in dat is toegestaan door de ServicePoint-class instanties. |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | Stelt een time-out in milliseconden in gedurende welke een DNS-resolutie als geldig wordt beschouwd. |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | Stelt een waarde in die aangeeft of een DNS-resolutie roteert tussen de toepasselijke IP-adressen. |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | Stelt een waarde in die aangeeft of de ServicePoint-class instanties het 100-Continue-gedrag gebruiken. |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | Stelt de maximale idle-tijd van de ServicePoint-class instanties in. |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | Stelt het maximale aantal ServicePoint-class instanties in dat beheerd kan worden door de huidige instantie. |
| static [set_ReusePort](./set_reuseport/)(bool) | Stelt een waarde in die aangeeft of de uitgaande verbindingssockets de 'SO_REUSE_UNICASTPORT'-optie gebruiken. |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | Stelt het type beveiligingsprotocol in dat wordt gebruikt door de ServicePoint-class instanties die door de huidige instantie worden beheerd. |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | Stelt de callback in die wordt gebruikt om een servercertificaat te valideren. |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Stelt een waarde in die aangeeft of de ServicePoint-class instanties het Nagle-algoritme gebruiken. |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Stelt de waarde in die aangeeft of de 'Keep-Alive'-optie is ingeschakeld. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | RTTI-informatie. |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | Het standaard aantal persistente verbindingen. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
