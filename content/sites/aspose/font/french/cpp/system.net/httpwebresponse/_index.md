---
title: "Classe System::Net::HttpWebResponse"
linktitle: "HttpWebResponse"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::HttpWebResponse. Représente la réponse web HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2100
url: /fr/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


Représente la réponse web HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Ferme le flux de réponse. |
| [get_CharacterSet](./get_characterset/)() | Non implémenté. |
| [get_ContentLength](./get_contentlength/)() override | Informations RTTI. |
| [get_ContentType](./get_contenttype/)() override | Renvoie le type MIME de la ressource. |
| virtual [get_Cookies](./get_cookies/)() | Renvoie les cookies associés à la réponse web. |
| [get_Headers](./get_headers/)() override | Renvoie la collection des en‑têtes associées à la réponse actuelle. |
| virtual [get_Method](./get_method/)() | Renvoie la méthode HTTP. |
| [get_ResponseUri](./get_responseuri/)() override | Renvoie l'URI de la ressource. |
| virtual [get_StatusCode](./get_statuscode/)() | Renvoie le code d'état HTTP associé à la réponse Web. |
| virtual [get_StatusDescription](./get_statusdescription/)() | Renvoie la représentation sous forme de chaîne du code d'état. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Renvoie une valeur indiquant si la réponse actuelle prend en charge les en‑têtes. |
| [GetResponseHeader](./getresponseheader/)(String) | Renvoie la valeur correspondante pour le nom d'en‑tête spécifié. |
| [GetResponseStream](./getresponsestream/)() override | Renvoie le flux de réponse. |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | Construit une nouvelle instance. |
## Voir aussi

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
