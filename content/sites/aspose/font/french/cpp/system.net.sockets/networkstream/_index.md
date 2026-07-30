---
title: "System::Net::Sockets::NetworkStream classe"
linktitle: "NetworkStream"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::NetworkStream class. Fournit le flux sous-jacent des données pour l'accès réseau. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.net.sockets/networkstream/
---
## NetworkStream class


Fournit le flux sous-jacent des données pour l'accès réseau. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class NetworkStream : public System::IO::Stream
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Initie une opération de lecture asynchrone. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Initie une opération d'écriture asynchrone. |
| [Close](./close/)(int) | Ferme l'instance actuelle après l'expiration du délai spécifié. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Attends jusqu'à ce que l'opération de lecture asynchrone spécifiée soit terminée. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Termine une opération d'écriture asynchrone. Attend jusqu'à ce que l'opération d'écriture asynchrone spécifiée soit terminée. |
| [Flush](./flush/)() override | Efface les tampons de ce flux et écrit toutes les données tamponnées dans le stockage sous-jacent. |
| [get_CanRead](./get_canread/)() const override | Informations RTTI. |
| [get_CanSeek](./get_canseek/)() const override | Détermine si le flux prend en charge le repositionnement. |
| [get_CanTimeout](./get_cantimeout/)() const override | Obtient une valeur qui détermine si le flux actuel peut expirer. |
| [get_CanWrite](./get_canwrite/)() const override | Détermine si le flux est accessible en écriture. |
| [get_DataAvailable](./get_dataavailable/)() const | Renvoie une valeur qui indique s'il y a des données disponibles à lire. |
| [get_Length](./get_length/)() const override | Renvoie la longueur du flux en octets. |
| [get_Position](./get_position/)() const override | Renvoie la position actuelle du flux. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Obtient une valeur, en millisecondes, qui détermine la durée pendant laquelle le flux tentera de lire avant d'expirer. |
| [get_Socket](./get_socket/)() | Obtient le [Socket](../socket/). |
| [get_WriteTimeout](./get_writetimeout/)() const override | Obtient une valeur, en millisecondes, qui détermine la durée pendant laquelle le flux tentera d'écrire avant d'expirer. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>) | Construit une nouvelle instance. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) | Construit une nouvelle instance. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) | Construit une nouvelle instance. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Définit la position du flux représentée par l'objet actuel. |
| [set_Position](./set_position/)(int64_t) override | Définit la position du flux. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Définit une valeur qui détermine si le flux actuel peut expirer. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Définit une valeur, en millisecondes, qui détermine la durée pendant laquelle le flux tentera de lire avant d'expirer. |
| [SetLength](./setlength/)(int64_t) override | Définit la longueur du flux représentée par l'objet actuel. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux. |
| virtual [~NetworkStream](./~networkstream/)() | Détruit l'instance actuelle. |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Un flux sans stockage sous-jacent. |
## Voir aussi

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
