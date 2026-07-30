---
title: "System::Net::Dns classe"
linktitle: "Dns"
second_title: "Aspose.Font pour C++"
description: "System::Net::Dns classe. Fournit des méthodes pour travailler avec DNS en C++."
type: docs
weight: 700
url: /fr/cpp/system.net/dns/
---
## Dns class


Fournit des méthodes pour travailler avec le DNS.

```cpp
class Dns : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération asynchrone pour créer une nouvelle instance IPHostEntry-class en utilisant la chaîne spécifiée qui contient un nom d'hôte ou une adresse IP. |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération asynchrone pour créer une nouvelle instance IPHostEntry-class en utilisant le nom d'hôte spécifié. |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération asynchrone pour créer une nouvelle instance IPHostEntry-class en utilisant la chaîne spécifiée qui contient un nom d'hôte ou une adresse IP. |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération asynchrone pour créer une nouvelle instance IPHostEntry-class en utilisant l'adresse IP spécifiée. |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération asynchrone pour créer une nouvelle instance IPHostEntry-class en utilisant le nom d'hôte spécifié. |
| [Dns](./dns/)() | Le constructeur par défaut supprimé. |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | Attend jusqu'à ce que l'opération asynchrone spécifiée pour créer une nouvelle instance IPHostEntry-class se termine. |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | Attend jusqu'à ce que l'opération asynchrone spécifiée pour créer une nouvelle instance IPHostEntry-class se termine. |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | Attend jusqu'à ce que l'opération asynchrone spécifiée pour créer une nouvelle instance IPHostEntry-class se termine. |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | Attend jusqu'à ce que l'opération asynchrone spécifiée pour créer une nouvelle instance IPHostEntry-class se termine. |
| static [GetHostAddresses](./gethostaddresses/)(String) | Renvoie une collection d'adresses IP du nom d'hôte ou de l'adresse IP spécifiés. |
| static [GetHostByAddress](./gethostbyaddress/)(String) | Crée une nouvelle instance IPHostEntry-class en utilisant la représentation sous forme de chaîne de l'adresse IP spécifiée. |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | Crée une nouvelle instance IPHostEntry-class en utilisant l'adresse IP spécifiée. |
| static [GetHostByName](./gethostbyname/)(String) | Informations RTTI. |
| static [GetHostEntry](./gethostentry/)(String) | Crée une nouvelle instance IPHostEntry-class en utilisant la chaîne spécifiée qui contient un nom d'hôte ou une adresse IP. |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | Crée une nouvelle instance IPHostEntry-class en utilisant l'adresse IP spécifiée. |
| static [GetHostName](./gethostname/)() | Renvoie le nom d'hôte de la machine locale. |
| static [Resolve](./resolve/)(String) | Crée une nouvelle instance de la classe IPHostEntry en utilisant le nom d'hôte spécifié. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
