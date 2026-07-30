---
title: "Classe System::Net::Http::HttpMethod"
linktitle: "HttpMethod"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::HttpMethod. Représente une méthode HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.net.http/httpmethod/
---
## HttpMethod class


Représente une méthode HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | Détermine si l'objet actuel et l'objet spécifié sont égaux. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| static [get_Delete](./get_delete/)() | Renvoie la méthode HTTP 'DELETE'. |
| static [get_Get](./get_get/)() | Renvoie la méthode HTTP 'GET'. |
| static [get_Head](./get_head/)() | Renvoie la méthode HTTP 'HEAD'. |
| [get_Method](./get_method/)() | Renvoie une représentation sous forme de chaîne de la méthode HTTP. |
| static [get_Options](./get_options/)() | Renvoie la méthode HTTP 'OPTIONS'. |
| static [get_Post](./get_post/)() | Renvoie la méthode HTTP 'POST'. |
| static [get_Put](./get_put/)() | Renvoie la méthode HTTP 'PUT'. |
| static [get_Trace](./get_trace/)() | Renvoie la méthode HTTP 'TRACE'. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| [HttpMethod](./httpmethod/)(String) | Construit une nouvelle instance. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
