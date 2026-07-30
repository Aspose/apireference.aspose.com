---
title: "System::Net::ServicePointManager classe"
linktitle: "ServicePointManager"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::ServicePointManager. Gère les étapes du cycle de vie (création, maintenance et suppression) des instances de la classe ServicePoint. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des assertions. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 3200
url: /fr/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


Gère les étapes du cycle de vie (création, maintenance et suppression) des instances de la classe [ServicePoint](../servicepoint/). Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des assertions. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument.

```cpp
class ServicePointManager : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | Obtient une politique de certificat. |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | Obtient une valeur indiquant si le certificat doit être vérifié par rapport à la liste de révocation de l’autorité de certification. |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | Obtient le nombre maximal de connexions simultanées autorisées par les instances de la classe ServicePoint. |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | Obtient un délai d’attente en millisecondes pendant lequel une résolution DNS est considérée comme valide. |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | Obtient une valeur indiquant si une résolution DNS tourne parmi les adresses IP applicables. |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | Renvoie la politique de chiffrement utilisée par l’instance actuelle. |
| static [get_Expect100Continue](./get_expect100continue/)() | Obtient une valeur indiquant si les instances de la classe ServicePoint utilisent le comportement 100‑Continue. |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | Obtient le temps d’inactivité maximal des instances de la classe ServicePoint. |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | Obtient le nombre maximal d’instances de la classe ServicePoint pouvant être gérées par l’instance actuelle. |
| static [get_ReusePort](./get_reuseport/)() | Obtient une valeur indiquant si les sockets de connexion de sortie utilisent l’option 'SO_REUSE_UNICASTPORT'. |
| static [get_SecurityProtocol](./get_securityprotocol/)() | Obtient le type de protocole de sécurité utilisé par les instances de la classe ServicePoint gérées par l’instance actuelle. |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | Obtient le rappel utilisé pour valider un certificat serveur. |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Obtient une valeur indiquant si les instances de la classe ServicePoint utilisent l’algorithme Nagle. |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | Définit une politique de certificat. |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | Définit une valeur indiquant si le certificat doit être vérifié par rapport à la liste de révocation de l’autorité de certification. |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | Définit le nombre maximal de connexions simultanées autorisées par les instances de la classe ServicePoint-class. |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | Définit un délai d’attente en millisecondes pendant lequel une résolution DNS est considérée comme valide. |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | Définit une valeur indiquant si une résolution DNS tourne parmi les adresses IP applicables. |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | Définit une valeur indiquant si les instances de la classe ServicePoint-class utilisent le comportement 100-Continue. |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | Définit le temps d’inactivité maximal des instances de la classe ServicePoint-class. |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | Définit le nombre maximal d’instances de la classe ServicePoint-class pouvant être gérées par l’instance actuelle. |
| static [set_ReusePort](./set_reuseport/)(bool) | Définit une valeur indiquant si les sockets de connexion de sortie utilisent l’option 'SO_REUSE_UNICASTPORT'. |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | Définit le type de protocole de sécurité utilisé par les instances de la classe ServicePoint-class gérées par l’instance actuelle. |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | Définit le rappel utilisé pour valider un certificat serveur. |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Définit une valeur indiquant si les instances de la classe ServicePoint-class utilisent l’algorithme de Nagle. |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Définit la valeur indiquant si l'option 'Keep-Alive' est activée. |
## Champs

| Champ | Description |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | Informations RTTI. |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | Le nombre par défaut de connexions persistantes. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
