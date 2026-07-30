---
title: "Classe System::Net::CookieComparer"
linktitle: "CookieComparer"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::CookieComparer. Utilisée pour comparer les instances de la classe Cookie. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.net/cookiecomparer/
---
## CookieComparer class


Utilisé pour comparer les instances de la classe [Cookie](../cookie/). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Compare les objets spécifiés. |
| static [get_Instance](./get_instance/)() | Informations RTTI. |
## Voir aussi

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
