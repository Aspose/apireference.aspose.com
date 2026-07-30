---
title: "Classe System::Net::IPHostEntry"
linktitle: "IPHostEntry"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::IPHostEntry. Représente les informations sur une adresse d'hôte Internet. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2600
url: /fr/cpp/system.net/iphostentry/
---
## IPHostEntry class


Représente les informations sur une adresse d'hôte Internet. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class IPHostEntry : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | Obtient la collection d'adresses IP de l'hôte. |
| [get_Aliases](./get_aliases/)() | Obtient la collection d'alias de l'hôte. |
| [get_HostName](./get_hostname/)() const | Informations RTTI. |
| [IPHostEntry](./iphostentry/)() | Construit une nouvelle instance. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | Définit une collection d'adresses IP de l'hôte. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | Définit une collection d'alias de l'hôte. |
| [set_HostName](./set_hostname/)(String) | Définit le nom d'hôte. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
