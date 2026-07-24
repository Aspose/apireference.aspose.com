---
title: "Aspose::Page::EPS::XMP::XmpMetadata classe"
linktitle: "XmpMetadata"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata classe. Fournit l'accès au flux de métadonnées XMP en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


Fournit l'accès au flux de métadonnées [XMP](../).

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Ajoute une valeur aux métadonnées. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Ajoute une valeur aux métadonnées. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Ajoute une paire avec clé et valeur dans le dictionnaire. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Ajoute une valeur dans un tableau. La valeur sera ajoutée à la fin du tableau. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Ajoute une valeur dans un tableau à l'index spécifié. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Ajoute une valeur nommée dans une structure. |
| [Clear](./clear/)() override | Efface les métadonnées. |
| [Contains](./contains/)(const System::String\&) const | Vérifie si la clé est contenue dans les métadonnées. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Vérifie si la paire clé-valeur spécifiée est contenue dans le dictionnaire. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Détermine si ce dictionnaire contient la clé spécifiée. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Copie les éléments de la collection dans un tableau. |
| [get_Count](./get_count/)() const override | Obtient le nombre d'éléments dans la collection. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Vérifie si la collection a une taille fixe. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Vérifie si la collection est en lecture seule. |
| [get_IsSynchronized](./get_issynchronized/)() | Vérifie si la collection est synchronisée. |
| [get_Keys](./get_keys/)() const override | Obtient la collection des clés de métadonnées. |
| [get_NamespaceManager](./get_namespacemanager/)() | Obtient le gestionnaire d'espace de noms. |
| [get_SyncRoot](./get_syncroot/)() const | Obtient l'objet de synchronisation de la collection. |
| [get_Values](./get_values/)() const override | Obtient les valeurs dans les métadonnées. |
| [GetEnumerator](./getenumerator/)() override | Renvoie l'énumérateur du dictionnaire. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Renvoie l'URI d'espace de noms par préfixe. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Renvoie le préfixe à partir de l'URI d'espace de noms. |
| [idx_get](./idx_get/)(const System::String\&) const override | Obtient les données des métadonnées. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Définit les données à partir des métadonnées. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Enregistre l'URI d'espace de noms. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Enregistre l'URI d'espace de noms. |
| [Remove](./remove/)(const System::String\&) override | Supprime l'entrée des métadonnées. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Supprime la paire clé/valeur de la collection. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Définit la valeur dans un tableau. La valeur précédente sera remplacée par la nouvelle. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Définit une valeur nommée dans une structure. La valeur nommée précédente, si elle existe déjà, sera remplacée par la nouvelle. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Essaie de trouver la clé dans le dictionnaire et récupère la valeur si elle est trouvée. |
## Voir aussi

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
