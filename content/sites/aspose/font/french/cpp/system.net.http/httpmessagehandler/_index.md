---
title: "System::Net::Http::HttpMessageHandler classe"
linktitle: "HttpMessageHandler"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::HttpMessageHandler classe. Représente un type de base pour les gestionnaires de messages HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.net.http/httpmessagehandler/
---
## HttpMessageHandler class


Représente un type de base pour les gestionnaires de messages HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class HttpMessageHandler : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Ne fait rien. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | Informations RTTI. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
