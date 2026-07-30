---
title: "classe System::Net::FileWebRequest"
linktitle: "FileWebRequest"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::FileWebRequest. Fournit une implémentation de la classe abstraite WebRequest pour travailler avec le système de fichiers. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.net/filewebrequest/
---
## FileWebRequest class


Fournit une implémentation de la classe abstraite [WebRequest](../webrequest/) pour travailler avec le système de fichiers. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des assertions. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument.

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Abort](./abort/)() override | Interrompt la requête en cours. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Initie une opération asynchrone pour obtenir un flux afin d'écrire des données vers la ressource. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Initie une requête asynchrone pour la ressource. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Attend que l'opération asynchrone spécifiée pour obtenir un flux se termine. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Attend que la requête asynchrone spécifiée pour la ressource se termine. |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | Construit une nouvelle instance. |
| [get_ContentType](./get_contenttype/)() override | Obtient le type MIME de la requête. |
| [get_Headers](./get_headers/)() override | Obtient la collection des en-têtes HTTP. |
| [get_Method](./get_method/)() override | Obtient la méthode HTTP. |
| [get_RequestUri](./get_requesturi/)() override | Renvoie l'URI de la requête. |
| [GetResponse](./getresponse/)() override | Renvoie la réponse web associée à la requête web actuelle. |
| [set_ContentType](./set_contenttype/)(String) override | Définit le type MIME de la requête. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Définit la collection des en-têtes HTTP. |
| [set_Method](./set_method/)(String) override | Définit la méthode HTTP. |
| [set_Timeout](./set_timeout/)(int) override | Informations RTTI. |
## Voir aussi

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
