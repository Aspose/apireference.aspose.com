---
title: "classe System::Net::Sockets::LingerOption"
linktitle: "LingerOption"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Sockets::LingerOption. Spécifie si une socket restera connectée après un appel aux méthodes Close() ou Close(). Elle spécifie également la durée pendant laquelle la socket restera connectée si l'envoi des données se poursuit. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


Spécifie si une socket restera connectée après un appel aux méthodes Close() ou Close(). Elle spécifie également la durée pendant laquelle la socket restera connectée si l'envoi des données se poursuit. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class LingerOption : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Enabled](./get_enabled/)() | Informations RTTI. |
| [get_LingerTime](./get_lingertime/)() | Obtient un délai d'expiration en secondes. |
| [LingerOption](./lingeroption/)(bool, int32_t) | Construit une nouvelle instance. |
| [set_Enabled](./set_enabled/)(bool) | Définit une valeur indiquant si le socket retardera la fermeture afin d'envoyer toutes les données en attente. |
| [set_LingerTime](./set_lingertime/)(int32_t) | Définit un délai d'expiration en secondes. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
