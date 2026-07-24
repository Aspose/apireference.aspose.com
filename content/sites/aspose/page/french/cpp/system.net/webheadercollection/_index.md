---
title: "Classe System::Net::WebHeaderCollection"
linktitle: "WebHeaderCollection"
second_title: "Aspose.Page pour C++"
description: "Classe System::Net::WebHeaderCollection. Représente la collection des en‑têtes du protocole. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 3600
url: /fr/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


Représente la collection des en‑têtes du protocole. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
class WebHeaderCollection : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(String, String) | Ajoute la paire spécifiée du nom d’en‑tête et de la valeur d’en‑tête à la collection. |
| [Add](./add/)(HttpResponseHeader, String) | Ajoute la paire spécifiée de l’en‑tête et de la valeur d’en‑tête à la collection. |
| [Add](./add/)(HttpRequestHeader, String) | Ajoute la paire spécifiée de l’en‑tête et de la valeur d’en‑tête à la collection. |
| [AllKeys](./allkeys/)() | Renvoie une collection de noms d’en‑têtes stockés dans la collection. |
| [get_Count](./get_count/)() const | Renvoie le nombre d’éléments dans la collection. |
| [get_Keys](./get_keys/)() | Renvoie une collection de noms d’en‑têtes stockés dans la collection. |
| [GetKey](./getkey/)(int) | Renvoie une clé à l’indice spécifié. |
| [GetValues](./getvalues/)(String) | Renvoie la collection des valeurs d’en‑tête. |
| [idx_get](./idx_get/)(HttpRequestHeader) | Obtient la valeur de l’en‑tête à partir de l’en‑tête de la requête spécifiée. |
| [idx_get](./idx_get/)(HttpResponseHeader) | Obtient la valeur de l’en‑tête à partir de l’en‑tête de la réponse spécifiée. |
| [idx_get](./idx_get/)(String) | Obtient la valeur de l’en‑tête à partir du nom d’en‑tête spécifié. |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | Définit la valeur de l’en‑tête spécifié. |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | Définit la valeur de l’en‑tête à partir de l’en‑tête de la réponse spécifiée. |
| [idx_set](./idx_set/)(String, String) | Définit la valeur de l’en‑tête à partir du nom d’en‑tête spécifié. |
| static [IsRestricted](./isrestricted/)(const String\&) | Teste si l’en‑tête HTTP spécifié peut être défini pour la requête. |
| [Remove](./remove/)(String) | Supprime l'en-tête par le nom d'en-tête spécifié. |
| [Remove](./remove/)(HttpResponseHeader) | Supprime l'en-tête de la réponse spécifiée. |
| [Remove](./remove/)(HttpRequestHeader) | Supprime l'en-tête de la requête spécifiée. |
| [Set](./set/)(String, String) | Définit la valeur de l'en-tête spécifié. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| [WebHeaderCollection](./webheadercollection/)() | Construit une nouvelle instance. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
