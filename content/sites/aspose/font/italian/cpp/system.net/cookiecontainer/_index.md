---
title: "classe System::Net::CookieContainer"
linktitle: "CookieContainer"
second_title: "Aspose.Font per C++"
description: "classe System::Net::CookieContainer. Fornisce un contenitore per le istanze della classe CookieCollection. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.net/cookiecontainer/
---
## CookieContainer class


Fornisce un contenitore per le istanze della classe CookieCollection. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class CookieContainer : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | Aggiunge un cookie alla raccolta. |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | Aggiunge un cookie alla raccolta. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Copia i cookie dalla raccolta specificata a quella corrente. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | Aggiunge un cookie per l'URI specificato. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | Copia i cookie dalla raccolta specificata per l'URI specificato alla raccolta corrente. |
| [CookieContainer](./cookiecontainer/)() | Crea una nuova istanza. |
| [CookieContainer](./cookiecontainer/)(int32_t) | Crea una nuova istanza. |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | Crea una nuova istanza. |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | Copia i cookie dall'intestazione HTTP specificata per l'URI specificato. |
| [get_Capacity](./get_capacity/)() | Ottiene la capacità della raccolta. |
| [get_Count](./get_count/)() | Restituisce il numero degli elementi della raccolta. |
| [get_MaxCookieSize](./get_maxcookiesize/)() | Ottiene la dimensione massima del cookie. |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | Ottiene la capacità della raccolta per dominio. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | Restituisce un'intestazione HTTP che contiene i cookie associati all'URI specificato. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | Restituisce un'intestazione HTTP che contiene i cookie associati all'URI specificato. |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | Restituisce una raccolta di cookie associati all'URI specificato. |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | Restituisce una raccolta di cookie associati all'URI specificato. |
| [IsLocalDomain](./islocaldomain/)(String) | Verifica se il dominio specificato è localhost. |
| [set_Capacity](./set_capacity/)(int32_t) | Imposta la capacità della raccolta. |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | Imposta la dimensione massima del cookie. |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | Imposta la capacità della raccolta per dominio. |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | Copia i cookie dall'intestazione specificata alla raccolta e li associa all'URI specificato. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | La dimensione massima del cookie. |
| static [DefaultCookieLimit](./defaultcookielimit/) | Informazioni RTTI. |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | Il numero massimo di elementi della raccolta per dominio. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
