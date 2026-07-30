---
title: "System::Net::IPEndPoint classe"
linktitle: "IPEndPoint"
second_title: "Aspose.Font pour C++"
description: "System::Net::IPEndPoint classe. Représente un point de terminaison réseau qui contient une adresse IP et un port. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2500
url: /fr/cpp/system.net/ipendpoint/
---
## IPEndPoint class


Représente un point de terminaison réseau qui contient une adresse IP et un port. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | Créez une nouvelle instance de la classe [EndPoint](../endpoint/) en utilisant l'adresse socket spécifiée. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Address](./get_address/)() | Obtient l'adresse du point de terminaison. |
| [get_AddressFamily](./get_addressfamily/)() override | Informations RTTI. |
| [get_Port](./get_port/)() | Obtient le numéro de port. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| [GetImpl](./getimpl/)() const override | Renvoie un pointeur vers l'implémentation. |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | Construit une nouvelle instance. |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | Construit une nouvelle instance. |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | Définit l'adresse du point de terminaison. |
| [set_Port](./set_port/)(int32_t) | Définit le numéro de port. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Champs

| Champ | Description |
| --- | --- |
| static [Any](./any/) | Le point de terminaison pour n'importe quelle adresse IPv4 et n'importe quel port. |
| static [AnyPort](./anyport/) | Une valeur qui indique si n'importe quel port peut être utilisé. |
| static [IPv6Any](./ipv6any/) | Le point de terminaison pour n'importe quelle adresse IPv6 et n'importe quel port. |
| static [MaxPort](./maxport/) | Le numéro de port maximal. |
| static [MinPort](./minport/) | Informations RTTI. |
## Voir aussi

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
