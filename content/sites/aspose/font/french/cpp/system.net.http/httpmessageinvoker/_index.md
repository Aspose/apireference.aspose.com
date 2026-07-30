---
title: "System::Net::Http::HttpMessageInvoker classe"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::HttpMessageInvoker classe. Permet aux applications d'appeler la méthode Send sur une chaîne de gestionnaires HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


Permet aux applications d'appeler la méthode Send sur une chaîne de gestionnaires HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Libère l'instance actuelle. Cette méthode libère également le gestionnaire si nécessaire. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | Informations RTTI. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Construit une nouvelle instance. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | Envoie la requête spécifiée. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
