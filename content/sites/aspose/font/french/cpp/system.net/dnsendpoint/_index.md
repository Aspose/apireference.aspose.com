---
title: "System::Net::DnsEndPoint classe"
linktitle: "DnsEndPoint"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::DnsEndPoint. Contient les informations utilisées par l’application pour se connecter au service. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des assertions. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 800
url: /fr/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


Contient les informations utilisées par l’application pour se connecter au service. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des assertions. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument.

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | Construit une nouvelle instance. |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | Construit une nouvelle instance. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_AddressFamily](./get_addressfamily/)() override | Informations RTTI. |
| [get_Host](./get_host/)() | Informations RTTI. |
| [get_Port](./get_port/)() | Renvoie le numéro de port. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
