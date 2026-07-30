---
title: "classe System::Net::WebResponse"
linktitle: "WebResponse"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::WebResponse. Représente une réponse web. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 4000
url: /fr/cpp/system.net/webresponse/
---
## WebResponse class


Représente une réponse web. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class WebResponse : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Close](./close/)() | Ferme le flux de réponse. |
| [Dispose](./dispose/)() override | Ne fait rien. |
| virtual [get_ContentLength](./get_contentlength/)() | Informations RTTI. |
| virtual [get_ContentType](./get_contenttype/)() | Renvoie le type MIME de la ressource. |
| virtual [get_Headers](./get_headers/)() | Renvoie la collection des en‑têtes associées à la réponse actuelle. |
| virtual [get_ResponseUri](./get_responseuri/)() | Renvoie l'URI de la ressource. |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | Renvoie une valeur indiquant si la réponse actuelle prend en charge les en‑têtes. |
| virtual [GetResponseStream](./getresponsestream/)() | Renvoie le flux de réponse. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
