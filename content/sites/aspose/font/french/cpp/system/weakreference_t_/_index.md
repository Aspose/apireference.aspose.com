---
title: "System::WeakReference< T > class"
linktitle: "WeakReference< T >"
second_title: "Aspose.Font pour C++"
description: "System::WeakReference< T > class. Représente une référence faible, qui référence un objet tout en permettant que cet objet soit supprimé en C++."
type: docs
weight: 7700
url: /fr/cpp/system/weakreference_t_/
---
## WeakReference< T > class


Représente une référence faible, qui référence un objet tout en permettant que cet objet soit supprimé.

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| Paramètre | Description |
| --- | --- |
| T | Type d'un objet référencé. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | Vérifie si l'objet référencé n'est pas nul. |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | Compare l'objet référencé à une autre instance de la classe [WeakReference](../weakreference/). |
| [operator==](./operator==/)(std::nullptr_t) const | Vérifie si l'objet référencé est nul. |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | Compare l'objet référencé à une autre instance de la classe [WeakReference](../weakreference/). |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | Définit l'objet (la cible) référencé par l'objet [WeakReference](../weakreference/) actuel. |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | Obtient l'objet (la cible) référencé par l'objet [WeakReference](../weakreference/) actuel. |
| [WeakReference](./weakreference/)() | Constructeur par défaut. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Constructeur à partir de nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | Initialise une nouvelle instance de la classe [WeakReference](../weakreference/), référencant l'objet spécifié. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | Initialise une nouvelle instance de la classe [WeakReference](../weakreference/), référencant l'objet spécifié. |

## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
