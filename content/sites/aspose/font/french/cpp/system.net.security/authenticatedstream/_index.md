---
title: "System::Net::Security::AuthenticatedStream classe"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Font pour C++"
description: "System::Net::Security::AuthenticatedStream class. Contient les méthodes pour transmettre les informations d'identification à travers un flux. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


Contient les méthodes pour transmettre les informations d'identification à travers un flux. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | Renvoie une valeur indiquant si l'authentification a réussi. |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | Renvoie une valeur indiquant si les données envoyées via ce flux sont cryptées. |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | Renvoie une valeur indiquant si le serveur et le client sont authentifiés. |
| virtual [get_IsServer](./get_isserver/)() const | Renvoie une valeur indiquant si le côté local de la connexion est le serveur. |
| virtual [get_IsSigned](./get_issigned/)() const | Renvoie une valeur indiquant si les données envoyées via ce flux sont signées. |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | Informations RTTI. |
## Champs

| Champ | Description |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Un flux sans stockage sous-jacent. |
## Voir aussi

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
