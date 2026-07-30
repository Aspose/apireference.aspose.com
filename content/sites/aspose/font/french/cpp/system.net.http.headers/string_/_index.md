---
title: "System::Net::Http::Headers::HttpHeaderValueCollection< System::String > classe"
linktitle: "String >"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::HttpHeaderValueCollection< System::String >. La spécialisation partielle du modèle HttpHeaderValueCollection pour le type String. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() function. Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.net.http.headers/string_/
---
## String > class


La spécialisation partielle du modèle [HttpHeaderValueCollection](../httpheadervaluecollection/) pour le type [String](../../system/string/). Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en argument.

```cpp
class String > : public System::Collections::Generic::ICollection<System::String>,
                 public System::Collections::Generic::ICollection<System::String>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const String\&) override | Ajoute un élément à la collection. |
| [Clear](./clear/)() override | Supprime tous les éléments de la collection. |
| [Contains](./contains/)(const String\&) const override | Vérifie si l’élément est présent dans la collection. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override |  |
| [get_Count](./get_count/)() const override | Obtient le nombre d'éléments dans la collection. |
| [get_IsReadOnly](./get_isreadonly/)() |  |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() |  |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<String\>\>, String\>) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, String) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, String, Action\<System::SharedPtr\<HttpHeaderValueCollection\<String\>\>, String\>) |  |
| [ParseAdd](./parseadd/)(String) |  |
| [Remove](./remove/)(const String\&) override | Supprime l’élément de la collection. |
| [RemoveSpecialValue](./removespecialvalue/)() |  |
| [SetSpecialValue](./setspecialvalue/)() |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définir le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| [TryParseAdd](./tryparseadd/)(String) |  |
## Voir aussi

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
