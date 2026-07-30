---
title: "System::Net::ServicePointManager classe"
linktitle: "ServicePointManager"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::ServicePointManager. Gestisce le fasi del ciclo di vita (creazione, manutenzione e cancellazione) delle istanze della classe ServicePoint. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3200
url: /it/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


Gestisce le fasi del ciclo di vita (creazione, manutenzione e cancellazione) delle istanze della classe [ServicePoint](../servicepoint/). Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ServicePointManager : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | Ottiene una politica di certificato. |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | Ottiene un valore che indica se il certificato deve essere controllato rispetto all'elenco di revoca dell'autorità di certificazione. |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | Ottiene il numero massimo di connessioni concorrenti consentite dalle istanze della classe ServicePoint-class. |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | Ottiene un timeout in millisecondi durante il quale una risoluzione DNS è considerata valida. |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | Ottiene un valore che indica se una risoluzione DNS ruota tra gli indirizzi IP applicabili. |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | Restituisce la politica di crittografia utilizzata dall'istanza corrente. |
| static [get_Expect100Continue](./get_expect100continue/)() | Ottiene un valore che indica se le istanze della classe ServicePoint-class utilizzano il comportamento 100-Continue. |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | Ottiene il tempo di inattività massimo delle istanze della classe ServicePoint-class. |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | Ottiene il numero massimo di istanze della classe ServicePoint-class che possono essere gestite dall'istanza corrente. |
| static [get_ReusePort](./get_reuseport/)() | Ottiene un valore che indica se i socket delle connessioni in uscita utilizzano l'opzione 'SO_REUSE_UNICASTPORT'. |
| static [get_SecurityProtocol](./get_securityprotocol/)() | Ottiene il tipo di protocollo di sicurezza utilizzato dalle istanze della classe ServicePoint-class gestite dall'istanza corrente. |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | Ottiene la callback utilizzata per convalidare un certificato server. |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Ottiene un valore che indica se le istanze della classe ServicePoint-class utilizzano l'algoritmo Nagle. |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | Imposta una politica di certificato. |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | Imposta un valore che indica se il certificato deve essere controllato rispetto all'elenco di revoca dell'autorità di certificazione. |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | Imposta il numero massimo di connessioni concorrenti consentite dalle istanze di ServicePoint-class. |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | Imposta un timeout in millisecondi durante il quale una risoluzione DNS è considerata valida. |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | Imposta un valore che indica se una risoluzione DNS ruota tra gli indirizzi IP applicabili. |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | Imposta un valore che indica se le istanze di ServicePoint-class utilizzano il comportamento 100-Continue. |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | Imposta il tempo massimo di inattività delle istanze di ServicePoint-class. |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | Imposta il numero massimo di istanze di ServicePoint-class che possono essere gestite dall'istanza corrente. |
| static [set_ReusePort](./set_reuseport/)(bool) | Imposta un valore che indica se i socket delle connessioni in uscita utilizzano l'opzione 'SO_REUSE_UNICASTPORT'. |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | Imposta il tipo di protocollo di sicurezza utilizzato dalle istanze di ServicePoint-class gestite dall'istanza corrente. |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | Imposta la callback utilizzata per convalidare un certificato server. |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Imposta un valore che indica se le istanze di ServicePoint-class utilizzano l'algoritmo di Nagle. |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Imposta il valore che indica se l'opzione 'Keep-Alive' è abilitata. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | Informazioni RTTI. |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | Il numero predefinito di connessioni persistenti. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
