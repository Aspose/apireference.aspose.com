---
title: "Classe System::OperatingSystem"
linktitle: "OperatingSystem"
second_title: "Aspose.Font pour C++"
description: "Classe System::OperatingSystem. Représente un système d'exploitation particulier et fournit des informations à son sujet. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 5100
url: /fr/cpp/system/operatingsystem/
---
## OperatingSystem class


Représente un système d'exploitation particulier et fournit des informations à son sujet. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class OperatingSystem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Platform](./get_platform/)() const | Renvoie l'identifiant de plateforme du système d'exploitation représenté par l'objet actuel. |
| [get_ServicePack](./get_servicepack/)() const | Renvoie le nom du service pack du système d'exploitation représenté par l'objet actuel. |
| [get_Version](./get_version/)() const | Renvoie une référence constante à un objet [Version](../version/) représentant la version du système d'exploitation représenté par l'objet actuel. |
| [get_VersionString](./get_versionstring/)() const | Renvoie la représentation sous forme de chaîne de caractères de la version du système d'exploitation représenté par l'objet actuel. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | Construit une instance qui représente un système d'exploitation spécifié par un identifiant de plateforme particulier et une version. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | Construit une instance qui représente un système d'exploitation spécifié par un identifiant de plateforme particulier, une version et un service pack. |
| [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne de caractères de la version du système d'exploitation représenté par l'objet actuel. |
## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
