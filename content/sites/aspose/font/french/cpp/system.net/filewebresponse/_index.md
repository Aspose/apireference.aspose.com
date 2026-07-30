---
title: "classe System::Net::FileWebResponse"
linktitle: "FileWebResponse"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::FileWebResponse. Fournit une implémentation de la classe abstraite WebResponse pour travailler avec le système de fichiers. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Fournit une implémentation de la classe abstraite [WebResponse](../webresponse/) pour travailler avec le système de fichiers. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Ferme le flux de réponse. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | Construit une nouvelle instance. |
| [get_ContentLength](./get_contentlength/)() override | Informations RTTI. |
| [get_ContentType](./get_contenttype/)() override | Renvoie le type MIME de la ressource. |
| [get_Headers](./get_headers/)() override | Renvoie la collection des en‑têtes associées à la réponse actuelle. |
| [get_ResponseUri](./get_responseuri/)() override | Renvoie l'URI de la ressource. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Renvoie une valeur indiquant si la réponse actuelle prend en charge les en‑têtes. |
| [GetResponseStream](./getresponsestream/)() override | Renvoie le flux de réponse. |
## Voir aussi

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
