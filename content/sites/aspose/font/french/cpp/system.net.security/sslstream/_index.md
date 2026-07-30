---
title: "Classe System::Net::Security::SslStream"
linktitle: "SslStream"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Security::SslStream. Un flux qui utilise le protocole SSL pour authentifier le serveur et éventuellement le client en C++."
type: docs
weight: 200
url: /fr/cpp/system.net.security/sslstream/
---
## SslStream class


Un flux qui utilise le protocole SSL pour authentifier le serveur et éventuellement le client.

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | Authentifie le côté client de la connexion. |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | Authentifie le côté client de la connexion. |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Initie une opération de lecture asynchrone. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Initie une opération d'écriture asynchrone. |
| [Close](./close/)() override | Ferme le flux. |
| [Dispose](./dispose/)(bool) override | Libère toutes les ressources utilisées par l'objet actuel et ferme le flux. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Attends jusqu'à ce que l'opération de lecture asynchrone spécifiée soit terminée. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Termine une opération d'écriture asynchrone. Attend jusqu'à ce que l'opération d'écriture asynchrone spécifiée soit terminée. |
| [Flush](./flush/)() override | Efface les tampons de ce flux et écrit toutes les données tamponnées dans le stockage sous-jacent. |
| [get_CanRead](./get_canread/)() const override | Détermine si le flux est lisible. |
| [get_CanSeek](./get_canseek/)() const override | Détermine si le flux prend en charge le repositionnement. |
| [get_CanTimeout](./get_cantimeout/)() const override | Obtient une valeur qui détermine si le flux actuel peut expirer. |
| [get_CanWrite](./get_canwrite/)() const override | Détermine si le flux est accessible en écriture. |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | Renvoie une valeur indiquant si la liste de révocation des certificats est vérifiée pendant le processus de validation du certificat. |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | Renvoie l'algorithme de chiffrement. |
| virtual [get_CipherStrength](./get_cipherstrength/)() | Renvoie la force de l'algorithme de chiffrement utilisé. |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | Renvoie l'algorithme de hachage. |
| virtual [get_HashStrength](./get_hashstrength/)() | Renvoie la force de l'algorithme de hachage utilisé. |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | Renvoie une valeur indiquant si l'authentification a réussi. |
| [get_IsEncrypted](./get_isencrypted/)() const override | Renvoie une valeur indiquant si les données envoyées via ce flux sont cryptées. |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | Renvoie une valeur indiquant si le serveur et le client sont authentifiés. |
| [get_IsServer](./get_isserver/)() const override | Renvoie une valeur indiquant si le côté local de la connexion est le serveur. |
| [get_IsSigned](./get_issigned/)() const override | Renvoie une valeur indiquant si les données envoyées via ce flux sont signées. |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | Renvoie la force de l'algorithme d'échange de clés utilisé. |
| [get_Length](./get_length/)() const override | Renvoie la longueur du flux en octets. |
| virtual [get_LocalCertificate](./get_localcertificate/)() | Renvoie le certificat utilisé pour authentifier le point de terminaison local. |
| [get_Position](./get_position/)() const override | Renvoie la position actuelle du flux. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Obtient une valeur, en millisecondes, qui détermine la durée pendant laquelle le flux tentera de lire avant d'expirer. |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | Renvoie le certificat utilisé pour authentifier le point de terminaison distant. |
| virtual [get_SslProtocol](./get_sslprotocol/)() | Renvoie le protocole SSL. |
| [get_WriteTimeout](./get_writetimeout/)() const override | Obtient une valeur, en millisecondes, qui détermine la durée pendant laquelle le flux tentera d'écrire avant d'expirer. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Définit la position du flux représentée par l'objet actuel. |
| [set_Position](./set_position/)(int64_t) override | Définit la position du flux. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Définit une valeur qui détermine si le flux actuel peut expirer. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Définit une valeur, en millisecondes, qui détermine la durée pendant laquelle le flux tentera de lire avant d'expirer. |
| [SetLength](./setlength/)(int64_t) override | Définit la longueur du flux représentée par l'objet actuel. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | Construit une nouvelle instance. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | Construit une nouvelle instance. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | Construit une nouvelle instance. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | Construit une nouvelle instance. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | Construit une nouvelle instance. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | Écrit le tableau d'octets spécifié dans le flux. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | Écrit le tableau d'octets spécifié dans le flux. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Un flux sans stockage sous-jacent. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | Informations RTTI. |
| [StreamImplementationPtr](./streamimplementationptr/) | Type de pointeur vers l'implémentation. |
## Voir aussi

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
