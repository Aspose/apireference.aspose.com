---
title: "System::Net::EndPoint classe"
linktitle: "EndPoint"
second_title: "Aspose.Font pour C++"
description: "System::Net::EndPoint classe. La classe abstraite contient une adresse réseau. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.net/endpoint/
---
## EndPoint class


La classe abstraite contient une adresse réseau. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class EndPoint : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | Créez une nouvelle instance de la classe [EndPoint](./) en utilisant l'adresse socket spécifiée. |
| virtual [get_AddressFamily](./get_addressfamily/)() | Informations RTTI. |
| virtual [GetImpl](./getimpl/)() const | Renvoie un pointeur vers l'implémentation. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ImplPtr](./implptr/) | Un pointeur vers l'implémentation. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
