---
title: "System::WeakReference<> classe"
linktitle: "WeakReference<>"
second_title: "Aspose.Font pour C++"
description: "System::WeakReference<> classe. Représente une référence faible, qui référence un objet tout en permettant que cet objet soit supprimé en C++."
type: docs
weight: 7800
url: /fr/cpp/system/weakreference__/
---
## WeakReference<> class


Représente une référence faible, qui référence un objet tout en permettant que cet objet soit supprimé.

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | Obtient une indication si l'objet référencé par l'objet [WeakReference](../weakreference/) actuel a été supprimé. |
| [get_Target](./get_target/)() const | Obtient l'objet (la cible) référencé par l'objet [WeakReference](../weakreference/) actuel. |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | Définit l'objet (la cible) référencé par l'objet [WeakReference](../weakreference/) actuel. |
| [WeakReference](./weakreference/)() | Constructeur par défaut. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Constructeur à partir de nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | Initialise une nouvelle instance de la classe [WeakReference](../weakreference/), référencant l'objet spécifié. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | Initialise une nouvelle instance de la classe [WeakReference](../weakreference/), référencant l'objet spécifié. |
## Voir aussi

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
