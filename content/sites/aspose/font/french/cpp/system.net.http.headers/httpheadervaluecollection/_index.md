---
title: "System::Net::Http::Headers::HttpHeaderValueCollection classe"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::HttpHeaderValueCollection. Représente la collection des valeurs d’en-têtes. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() function. Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en argument en C++."
type: docs
weight: 800
url: /fr/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


Représente la collection des valeurs d’en-têtes. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en argument.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| Paramètre | Description |
| --- | --- |
| Le | type des valeurs d’en-têtes représentées dans la collection. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const T\&) override | Ajoute un élément à la collection. |
| [Clear](./clear/)() override | Supprime tous les éléments de la collection. |
| [Contains](./contains/)(const T\&) const override | Vérifie si l’élément est présent dans la collection. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | Copie tous les éléments de la collection dans les éléments existants du tableau. |
| [get_Count](./get_count/)() const override | Informations RTTI. |
| [get_IsReadOnly](./get_isreadonly/)() | Obtient une valeur indiquant si la collection actuelle est en lecture seule. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | Obtient une valeur qui indique si la collection actuelle contient une "special value". |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | Renvoie une représentation sous forme de chaîne de la collection actuelle sans une "special value". |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | Construit une nouvelle instance. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Construit une nouvelle instance. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | Construit une nouvelle instance. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Construit une nouvelle instance. |
| [ParseAdd](./parseadd/)(String) | Analyse une représentation sous forme de chaîne d’en-tête et l’ajoute à la collection actuelle. |
| [Remove](./remove/)(const T\&) override | Supprime l’élément de la collection. |
| [RemoveSpecialValue](./removespecialvalue/)() | Supprime une "special value". |
| [SetSpecialValue](./setspecialvalue/)() | Définit une "special value". |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définir le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| [TryParseAdd](./tryparseadd/)(String) | Essaie d’analyser une représentation sous forme de chaîne d’en-tête et de l’ajouter à la collection actuelle. |

## Voir aussi

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
