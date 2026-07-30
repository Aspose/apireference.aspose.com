---
title: "System::Collections::Specialized::NameValueCollection classe"
linktitle: "NameValueCollection"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Specialized::NameValueCollection classe. Collection de paires de clés et valeurs String associées qui peuvent être accédées soit par la clé, soit par l'index en C++."
type: docs
weight: 200
url: /fr/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


Collection de paires de clés et valeurs [String](../../system/string/) associées qui peuvent être accédées soit par la clé, soit par l'index.

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const String\&) override | Remplacer la méthode [ICollection](../../system.collections/icollection/) - non implémentée. |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | Copie les entrées de la [NameValueCollection](./) spécifiée vers la collection actuelle. |
| virtual [Add](./add/)(const String\&, const String\&) | Ajoute une entrée avec le nom et la valeur spécifiés. |
| [Clear](./clear/)() override | Supprime tous les éléments. |
| [Contains](./contains/)(const String\&) const override | Vérifie si l'élément est présent dans la collection. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | Copie les éléments de la collection dans les éléments existants du tableau. |
| virtual [Get](./get/)(const String\&) | Obtient les valeurs associées à la clé spécifiée. |
| virtual [get_AllKeys](./get_allkeys/)() | Obtient toutes les clés. |
| [get_Count](./get_count/)() const override | Obtient le nombre de paires clé/valeur. |
| virtual [get_Keys](./get_keys/)() | Obtient toutes les clés. |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur pour parcourir la collection. |
| virtual [GetValues](./getvalues/)(const String\&) | Obtient les valeurs associées à la clé spécifiée. |
| [HasKeys](./haskeys/)() | Obtient une valeur indiquant si la [NameValueCollection](./) contient des clés qui ne sont pas null. |
| [idx_get](./idx_get/)(const String\&) | Obtient la valeur à l'index spécifié. |
| [idx_set](./idx_set/)(const String\&, const String\&) | Définit la valeur d'une entrée. |
| [NameValueCollection](./namevaluecollection/)() | Initialise une nouvelle instance de la classe [NameValueCollection](./) qui est vide. |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | Copie les entrées du [NameValueCollection](./) spécifié vers un nouveau [NameValueCollection](./). |
| [Remove](./remove/)(const String\&) override | Supprime l'élément spécifié. |
| virtual [Set](./set/)(const String\&, const String\&) | Définit la valeur d'une entrée. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Voir aussi

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
