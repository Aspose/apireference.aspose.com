---
title: "Classe System::Net::CookieContainer"
linktitle: "CookieContainer"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::CookieContainer. Fournit un conteneur pour les instances de la classe CookieCollection. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des défauts d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.net/cookiecontainer/
---
## CookieContainer class


Fournit un conteneur pour les instances de la classe CookieCollection. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des défauts d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class CookieContainer : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | Ajoute un cookie à la collection. |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | Ajoute un cookie à la collection. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Copie les cookies de la collection spécifiée vers la collection actuelle. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | Ajoute un cookie pour l'URI spécifié. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | Copie les cookies de la collection spécifiée pour l'URI spécifié vers la collection actuelle. |
| [CookieContainer](./cookiecontainer/)() | Construit une nouvelle instance. |
| [CookieContainer](./cookiecontainer/)(int32_t) | Construit une nouvelle instance. |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | Construit une nouvelle instance. |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | Copie les cookies de l'en-tête HTTP spécifié pour l'URI spécifié. |
| [get_Capacity](./get_capacity/)() | Obtient la capacité de la collection. |
| [get_Count](./get_count/)() | Renvoie le nombre d'éléments de la collection. |
| [get_MaxCookieSize](./get_maxcookiesize/)() | Obtient la taille maximale du cookie. |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | Obtient la capacité de la collection par domaine. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | Renvoie un en-tête HTTP contenant les cookies associés à l'URI spécifié. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | Renvoie un en-tête HTTP contenant les cookies associés à l'URI spécifié. |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | Renvoie une collection de cookies associés à l'URI spécifié. |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | Renvoie une collection de cookies associés à l'URI spécifié. |
| [IsLocalDomain](./islocaldomain/)(String) | Vérifie si le domaine spécifié est localhost. |
| [set_Capacity](./set_capacity/)(int32_t) | Définit la capacité de la collection. |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | Définit la taille maximale du cookie. |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | Définit la capacité de la collection par domaine. |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | Copie les cookies de l'en-tête spécifié vers la collection et les associe à l'URI spécifié. |
## Champs

| Champ | Description |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | La taille maximale du cookie. |
| static [DefaultCookieLimit](./defaultcookielimit/) | Informations RTTI. |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | Le nombre maximal d'éléments de la collection par domaine. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
