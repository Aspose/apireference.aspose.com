---
title: "Classe System::Net::IPAddress"
linktitle: "IPAddress"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::IPAddress. Représente l’adresse IP. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 2400
url: /fr/cpp/system.net/ipaddress/
---
## IPAddress class


Représente l’adresse IP. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument.

```cpp
class IPAddress : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_AddressFamily](./get_addressfamily/)() | Renvoie la famille d'adresses. |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | Renvoie une valeur indiquant si l’adresse est une adresse IPv4 et est mappée à une adresse IPv6. |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | Renvoie une valeur indiquant si l’adresse est une adresse IPv6 link-local. |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | Renvoie une valeur indiquant si l’adresse est une adresse IPv6 multicast globale. |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | Renvoie une valeur indiquant si l’adresse est une adresse IPv6 site-local. |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | Renvoie une valeur indiquant si l’adresse est une adresse IPv6 Teredo. |
| [get_ScopeId](./get_scopeid/)() | Obtient l’identifiant de portée de l’adresse IPv6. |
| [GetAddressBytes](./getaddressbytes/)() | Renvoie un tableau d’octets de l’adresse IP. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| [GetImpl](./getimpl/)() const | Renvoie un pointeur vers l'implémentation. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | Convertit l’ordre d’octets hôte spécifié en l’ordre d’octets réseau correspondant. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | Convertit l’ordre d’octets hôte spécifié en l’ordre d’octets réseau correspondant. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | Convertit l’ordre d’octets hôte spécifié en l’ordre d’octets réseau correspondant. |
| [IPAddress](./ipaddress/)(int64_t) | Construit une nouvelle instance. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | Construit une nouvelle instance. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | Construit une nouvelle instance. |
| [IPAddress](./ipaddress/)() | Construit une nouvelle instance. |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | Renvoie une valeur indiquant si l’adresse spécifiée est une adresse de boucle (loopback). |
| [MapToIPv4](./maptoipv4/)() | Mappe l’adresse à l’adresse IPv4. |
| [MapToIPv6](./maptoipv6/)() | Mappe l'adresse à l'adresse IPv6. |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | Convertit l'ordre des octets réseau spécifié en l'ordre des octets hôte correspondant. |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | Convertit l'ordre des octets réseau spécifié en l'ordre des octets hôte correspondant. |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | Convertit l'ordre des octets réseau spécifié en l'ordre des octets hôte correspondant. |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [IPAddress](./). |
| [set_ScopeId](./set_scopeid/)(int64_t) | Définit l'identifiant de portée de l'adresse IPv6. |
| [SetImpl](./setimpl/)(ImplPtr) | Définit un pointeur vers l'implémentation. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | Tente de convertir une chaîne passée en une instance de la classe [IPAddress](./). |
## Champs

| Champ | Description |
| --- | --- |
| static [Any](./any/) | Informations RTTI. |
| static [Broadcast](./broadcast/) | L'adresse de diffusion IPv4. |
| static [IPv6Any](./ipv6any/) | L'adresse IPv6 qui indique si le serveur doit écouter toutes les interfaces réseau. |
| static [IPv6Loopback](./ipv6loopback/) | L'adresse de bouclage IPv6. |
| static [IPv6None](./ipv6none/) | L'adresse IPv6 qui indique si le serveur ne doit écouter aucune interface réseau. |
| static [Loopback](./loopback/) | L'adresse de bouclage IPv4. |
| static [None](./none/) | L'adresse IPv4 qui indique si le serveur ne doit écouter aucune interface réseau. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ImplPtr](./implptr/) | Un pointeur vers le type d'implémentation. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
