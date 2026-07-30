---
title: "Classe System::Net::Http::Headers::MediaTypeWithQualityHeaderValue"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::MediaTypeWithQualityHeaderValue. Représente un type MIME avec un facteur de qualité supplémentaire dans la valeur de l'en-tête ''Content-Type''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1300
url: /fr/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


Représente un type MIME avec un facteur de qualité supplémentaire dans la valeur de l'en-tête 'Content-Type'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Quality](./get_quality/)() | Informations RTTI. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | Construit une nouvelle instance. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | Construit une nouvelle instance. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | Construit une nouvelle instance. |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [MediaTypeWithQualityHeaderValue](./). |
| [set_Quality](./set_quality/)(Nullable\<double\>) | Définit une valeur de qualité. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [MediaTypeWithQualityHeaderValue](./). |
## Voir aussi

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
