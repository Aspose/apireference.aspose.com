---
title: "classe System::Net::Http::Headers::HttpHeaderValueCollection"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Page pour C++"
description: "classe System::Net::Http::Headers::HttpHeaderValueCollection. Représente la collection des valeurs d'en-têtes. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 800
url: /fr/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


Représente la collection des valeurs d'en-têtes. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| Paramètre | Description |
| --- | --- |
| Le | type des valeurs d'en-têtes représentées dans la collection. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const T\&) override | Ajoute un élément à la collection. |
| [Clear](./clear/)() override | Supprime tous les éléments de la collection. |
| [Contains](./contains/)(const T\&) const override | Vérifie si l'élément est présent dans la collection. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | Copie tous les éléments de la collection dans les éléments d'un tableau existant. |
| [get_Count](./get_count/)() const override | Informations RTTI. |
| [get_IsReadOnly](./get_isreadonly/)() | Obtient une valeur qui indique si la collection actuelle est en lecture seule. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | Obtient une valeur qui indique si la collection actuelle contient une "valeur spéciale". |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | Renvoie une représentation sous forme de chaîne de la collection actuelle sans une "valeur spéciale". |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | Construit une nouvelle instance. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Construit une nouvelle instance. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | Construit une nouvelle instance. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Construit une nouvelle instance. |
| [ParseAdd](./parseadd/)(String) | Analyse une représentation sous forme de chaîne d’en-tête et l’ajoute à la collection actuelle. |
| [Remove](./remove/)(const T\&) override | Supprime l'élément de la collection. |
| [RemoveSpecialValue](./removespecialvalue/)() | Supprime une "valeur spéciale". |
| [SetSpecialValue](./setspecialvalue/)() | Définit une "valeur spéciale". |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définit le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| [TryParseAdd](./tryparseadd/)(String) | Essaie d’analyser une représentation sous forme de chaîne d’en-tête et de l’ajouter à la collection actuelle. |

## Voir aussi

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
