---
title: "classe System::Net::SocketAddress"
linktitle: "SocketAddress"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::SocketAddress. Utilisée pour stocker des informations sérialisées sur les instances de la classe EndPoint. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 3300
url: /fr/cpp/system.net/socketaddress/
---
## SocketAddress class


Utilisée pour stocker des informations sérialisées sur les instances de la classe [EndPoint](../endpoint/). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class SocketAddress : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Family](./get_family/)() | Informations RTTI. |
| [get_Size](./get_size/)() | Renvoie la taille du tampon sous-jacent. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| [idx_get](./idx_get/)(int32_t) | Obtient une valeur du tampon sous-jacent à l'index spécifié. |
| [idx_set](./idx_set/)(int32_t, uint8_t) | Définit une valeur du tampon sous-jacent à l'index spécifié. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | Construit une nouvelle instance. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | Construit une nouvelle instance. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
