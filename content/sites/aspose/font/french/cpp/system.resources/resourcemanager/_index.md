---
title: "Classe System::Resources::ResourceManager"
linktitle: "ResourceManager"
second_title: "Aspose.Font pour C++"
description: "Classe System::Resources::ResourceManager. Fournit une API pour gérer les ressources. Non implémentée. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.resources/resourcemanager/
---
## ResourceManager class


Fournit une API pour gérer les ressources. Non implémentée. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument.

```cpp
class ResourceManager : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | Obtient un objet à partir de la ressource. Le nom n’est pas GetObject() pour contourner le problème de définition de GetObjectA. |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Obtient un objet à partir de la ressource. Le nom n’est pas GetObject() pour contourner le problème de définition de GetObjectA. |
| virtual [GetString](./getstring/)(String) | Obtient la ressource chaîne. |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Obtient la ressource chaîne. |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Informations RTTI. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Font for C++](../../)
