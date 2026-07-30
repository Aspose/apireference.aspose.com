---
title: "Classe System::Net::Sockets::Socket"
linktitle: "Socket"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Sockets::Socket. La classe Socket implémente l'interface de sockets Berkeley en C++."
type: docs
weight: 400
url: /fr/cpp/system.net.sockets/socket/
---
## Socket class


La classe [Socket](./) implémente l'interface de sockets Berkeley.

```cpp
class Socket : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Accept](./accept/)() | Crée un nouveau socket pour la connexion nouvellement créée. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération de connexion asynchrone. |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération de connexion asynchrone. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération de connexion asynchrone. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération de connexion asynchrone. |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération d'écriture asynchrone. |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération d'envoi asynchrone. |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | Lie le socket à l'extrémité locale spécifiée. |
| [Close](./close/)() | Ferme la connexion du socket. |
| [Close](./close/)(int) | Ferme la connexion du socket avec le délai spécifié pour permettre l'envoi des données en file d'attente. |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | Établit une connexion à l'extrémité distante spécifiée. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Établit une connexion à l'extrémité distante spécifiée. |
| [Connect](./connect/)(String, int32_t) | Établit une connexion à l'extrémité distante spécifiée. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Établit une connexion à l'extrémité distante spécifiée. |
| [Dispose](./dispose/)() override | Ne fait rien. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Attend que l'opération de connexion asynchrone spécifiée se termine. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | Attend que l'opération de réception asynchrone spécifiée se termine. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Attend que l'opération de réception asynchrone spécifiée se termine. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | Attend que l'opération d'envoi asynchrone spécifiée se termine. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Attend que l'opération d'envoi asynchrone spécifiée se termine. |
| [get_AddressFamily](./get_addressfamily/)() | Renvoie la famille d'adresses. |
| [get_Available](./get_available/)() | Obtient le nombre d'octets reçus du réseau et disponibles pour la lecture. |
| [get_Blocking](./get_blocking/)() | Obtient une valeur indiquant si le socket est en mode bloquant. |
| [get_Connected](./get_connected/)() | Renvoie une valeur indiquant si le socket est connecté à l'hôte distant. |
| [get_DontFragment](./get_dontfragment/)() | Obtient une valeur indiquant si le socket autorise la fragmentation des datagrammes IP. |
| [get_DualMode](./get_dualmode/)() | Obtient une valeur indiquant si le socket est en mode double. |
| [get_EnableBroadcast](./get_enablebroadcast/)() | Obtient une valeur indiquant si le socket autorise les paquets broadcast. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Obtient une valeur indiquant si un seul processus peut lier le socket à un port. |
| [get_IsBound](./get_isbound/)() | Renvoie une valeur indiquant si le socket est lié à un port local spécifique. |
| [get_LingerState](./get_lingerstate/)() | Obtient une valeur indiquant si le socket retardera la fermeture afin d'envoyer toutes les données en attente. |
| [get_LocalEndPoint](./get_localendpoint/)() | Renvoie l'extrémité locale. |
| [get_MulticastLoopback](./get_multicastloopback/)() | Obtient une valeur indiquant si le socket reçoit les paquets multicast sortants. |
| [get_NoDelay](./get_nodelay/)() | Obtient une valeur indiquant si le socket utilise l'algorithme de Nagle. |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | Renvoie une valeur indiquant si le système d'exploitation et les adaptateurs réseau prennent en charge IPv4. |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | Renvoie une valeur indiquant si le système d'exploitation et les adaptateurs réseau prennent en charge IPv6. |
| [get_ProtocolType](./get_protocoltype/)() | Renvoie le type de protocole. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Obtient la taille du tampon de réception. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Obtient une période après laquelle un appel 'Receive' expirera. |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | Renvoie le point de terminaison distant. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Obtient la taille du tampon d'envoi. |
| [get_SendTimeout](./get_sendtimeout/)() | Obtient une période après laquelle un appel 'Send' expirera. |
| [get_SocketType](./get_sockettype/)() | Renvoie le type de socket. |
| static [get_SupportsIPv4](./get_supportsipv4/)() | Informations RTTI. |
| [get_Ttl](./get_ttl/)() | Obtient la valeur TTL. |
| [GetImpl](./getimpl/)() const | Renvoie un pointeur vers l'implémentation. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | Renvoie la valeur correspondant au nom d'option spécifié. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Obtient la valeur correspondant au nom d'option spécifié. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Renvoie la valeur correspondant au nom d'option spécifié. |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Définit les modes de fonctionnement bas niveau pour le socket. |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Définit les modes de fonctionnement bas niveau pour le socket. |
| [Listen](./listen/)(int32_t) | Modifie l'état du socket en 'listen'. |
| [Poll](./poll/)(int32_t, SelectMode) | Renvoie l'état du socket basé sur le mode de sondage spécifié. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Reçoit des données du socket et les écrit dans le tableau d'octets spécifié. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Reçoit des données du socket et les écrit dans les tableaux d'octets spécifiés. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Reçoit des données du socket et les écrit dans les tableaux d'octets spécifiés. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Reçoit des données du socket et les écrit dans les tableaux d'octets spécifiés. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Envoie les données spécifiées au socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Envoie les données spécifiées au socket. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | Envoie les données spécifiées au point de terminaison spécifié. |
| [set_Blocking](./set_blocking/)(bool) | Définit une valeur indiquant si le socket est en mode bloquant. |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | Définit le délai d'expiration de la connexion. |
| [set_DontFragment](./set_dontfragment/)(bool) | Définit une valeur indiquant si le socket autorise la fragmentation des datagrammes IP. |
| [set_DualMode](./set_dualmode/)(bool) | Définit une valeur indiquant si le socket est en mode double. |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | Définit une valeur indiquant si le socket autorise les paquets de diffusion. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Définit une valeur indiquant si un seul processus peut lier le socket à un port. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Définit une valeur indiquant si le socket retardera la fermeture afin d'envoyer toutes les données en attente. |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | Définit une valeur indiquant si le socket reçoit les paquets multicast sortants. |
| [set_NoDelay](./set_nodelay/)(bool) | Définit une valeur indiquant si le socket utilise l'algorithme de Nagle. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Définit la taille du tampon de réception. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Définit une période après laquelle un appel 'Receive' expirera. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Définit la taille du tampon d'envoi. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Définit une période après laquelle un appel 'Send' expirera. |
| [set_Ttl](./set_ttl/)(int16_t) | Définit la valeur TTL. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Définit l'option de socket spécifiée à la valeur spécifiée. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Définit l'option de socket spécifiée à la valeur spécifiée. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | Définit l'option de socket spécifiée à la valeur spécifiée. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | Définit l'option de socket spécifiée à la valeur spécifiée. |
| [Shutdown](./shutdown/)(SocketShutdown) | Désactive les opérations d'envoi et de réception du socket. |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Construit une nouvelle instance. |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Construit une nouvelle instance. |
| virtual [~Socket](./~socket/)() | Détruit l'instance actuelle. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ImplPtr](./implptr/) | L'implémentation du socket. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
