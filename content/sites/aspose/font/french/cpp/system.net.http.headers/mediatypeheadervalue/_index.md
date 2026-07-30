---
title: "Classe System::Net::Http::Headers::MediaTypeHeaderValue"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::MediaTypeHeaderValue. Représente un type MIME dans la valeur de l’en‑tête ''Content-Type''. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 1200
url: /fr/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


Représente un type MIME dans la valeur de l’en‑tête 'Content-Type'. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument.

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_CharSet](./get_charset/)() | Informations RTTI. |
| [get_MediaType](./get_mediatype/)() | Obtient la valeur de l’en‑tête de type média. |
| [get_Parameters](./get_parameters/)() | Renvoie les paramètres de valeur de l’en‑tête de type média. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Convertit une chaîne passée à partir de l’index spécifié en une instance de la classe [MediaTypeHeaderValue](./). |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | Construit une nouvelle instance. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | Construit une nouvelle instance. |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [MediaTypeHeaderValue](./). |
| [set_CharSet](./set_charset/)(String) | Définit un jeu de caractères. |
| [set_MediaType](./set_mediatype/)(String) | Définit la valeur de l’en‑tête de type média. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [MediaTypeHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
