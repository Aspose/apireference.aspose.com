---
title: "Classe System::Object"
linktitle: "Object"
second_title: "Aspose.Font pour C++"
description: "Classe System::Object. Classe de base qui permet d'utiliser les méthodes disponibles pour la classe System.Object en C#. Toutes les classes non triviales utilisées avec l'environnement traduit doivent en hériter en C++."
type: docs
weight: 4800
url: /fr/cpp/system/object/
---
## Object class


Classe de base qui permet d'utiliser les méthodes disponibles pour la classe [System.Object](./) en C#. Toutes les classes non triviales utilisées avec l'environnement traduit doivent en hériter.

```cpp
class Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | Compare les objets en utilisant la sémantique C# [Object.Equals](./equals/). |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Compare les objets de type référence dans le style C#. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Compare les objets de type valeur dans le style C#. |
| static [Equals](./equals/)(float const\&, float const\&) | Émule la comparaison en virgule flottante de style C# où deux NaN sont considérés égaux même si, selon IEC 60559:1989, NaN n'est égal à aucune valeur, y compris NaN. |
| static [Equals](./equals/)(double const\&, double const\&) | Émule la comparaison en virgule flottante de style C# où deux NaN sont considérés égaux même si, selon IEC 60559:1989, NaN n'est égal à aucune valeur, y compris NaN. |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | À usage interne uniquement. |
| [GetCounter](./getcounter/)() | Obtient la structure de données du compteur de références associée à l'objet. |
| virtual [GetHashCode](./gethashcode/)() const | Analogue de la méthode C# [Object.GetHashCode()](./gethashcode/). Permet le hachage d'objets personnalisés. |
| virtual [GetType](./gettype/)() const | Obtient le type réel de l'objet. Analogue de l'appel C# [System.Object.GetType()](./gettype/). |
| virtual [Is](./is/)(const TypeInfo\&) const | Vérifie si l'objet représente une instance du type décrit par targetType. Analogue de l'opérateur C# 'is'. |
| [Lock](./lock/)() | Implémente le verrouillage de l'instruction C# lock(). Appelez directement ou utilisez l'objet sentinelle [LockContext](../lockcontext/). |
| virtual [MemberwiseClone](./memberwiseclone/)() const | Analogue de la méthode C# [Object.MemberwiseClone()](./memberwiseclone/). Permet le clonage de types personnalisés. |
| [Object](./object/)() | Crée l'objet. Initialise toutes les structures de données internes. |
| [Object](./object/)(Object const\&) | Constructeur de copie. Ne copie en fait rien, il initialise simplement un nouvel objet et permet la construction par copie des sous‑classes. |
| [operator=](./operator=/)(Object const\&) | Opérateur d'affectation. Ne copie en fait rien, il initialise simplement un nouvel objet et permet la construction par copie des sous‑classes. |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | Compare les objets par référence. |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | Compare les objets par référence. |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | Compare par référence un objet de type valeur avec nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | Spécialisation de [Object::ReferenceEquals](./referenceequals/) pour le cas d'une chaîne et nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | Spécialisation de [Object::ReferenceEquals](./referenceequals/) pour le cas de chaînes. |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | Diminue le compteur de références partagées de la valeur spécifiée. |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | Définir le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
| [SharedCount](./sharedcount/)() const | Obtient la valeur actuelle du compteur de références partagées. |
| [SharedRefAdded](./sharedrefadded/)() | Incrémente le compteur de références partagées. Ne doit pas être appelé directement ; utilisez plutôt les pointeurs intelligents ou ThisProtector. |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | Décrémente et renvoie le compteur de références partagées. Ne doit pas être appelé directement ; utilisez plutôt les pointeurs intelligents ou ThisProtector. |
| virtual [ToString](./tostring/)() const | Analogue de la méthode C# [Object.ToString()](./tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [Type](./type/)() | Implémente le construct C# typeof([System.Object](./)). |
| [Unlock](./unlock/)() | Implémente le déverrouillage de l'instruction C# lock(). Appelez directement ou utilisez l'objet sentinelle [LockContext](../lockcontext/). |
| [WeakRefAdded](./weakrefadded/)() | Incrémente le compteur de références faibles. Ne doit pas être appelé directement ; utilisez plutôt les pointeurs intelligents ou ThisProtector. |
| [WeakRefRemoved](./weakrefremoved/)() | Décrémente le compteur de références faibles. Ne doit pas être appelé directement ; utilisez plutôt les pointeurs intelligents ou ThisProtector. |
| virtual [~Object](./~object/)() | Détruit l'objet. Libère toutes les structures de données internes. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ptr](./ptr/) | Alias pour le type de pointeur intelligent. |
## Remarques


En plus des méthodes disponibles dans la classe C# [System.Object](./), il permet également la prise en charge de certains concepts spécifiques à l'environnement de code traduit. Cela inclut le comptage de références utilisé par les classes de pointeurs intelligents ([System::SmartPtr](../smartptr/), [System::WeakPtr](../weakptr/), [System::DynamicWeakPtr](../dynamicweakptr/)) et d'autres services liés à la gestion de la mémoire, au débogage, etc.

Chaque [Object](./) possède deux compteurs de références : le compteur de références partagé et le compteur de références faible. Le compteur de références faible est toujours stocké dans une structure de données détachée plutôt que dans le [Object](./) lui‑même, ce qui permet aux pointeurs faibles de survivre à l’objet référencé. Le compteur de références intelligent est stocké soit dans l’objet lui‑même, soit dans la même structure détachée, selon l’état de la macro ENABLE_EXTERNAL_REFCOUNT. Par défaut, il est activé dans les builds de débogage et désactivé dans les builds de version. Si le compteur de pointeur intelligent est stocké dans l’objet lui‑même, la structure de données détachée n’est créée que si des pointeurs faibles vers l’objet existent. Sinon, elle est créée en même temps que l’objet.

Tous les pointeurs intelligents utilisent ces deux compteurs de références et contribuent au même groupe de possession unique.

Si une sous‑classe de [Object](./) est créée sur la pile, aucun pointeur intelligent ne peut être créé vers celle‑ci, sinon il y a un problème de suppression de la pile.

Ce type peut être alloué soit sur la pile en tant que type valeur, soit sur le tas en utilisant la fonction [System::MakeObject()](../makeobject/). Une fois l’objet alloué, ne mélangez jamais ces deux cas d’utilisation : avoir des pointeurs [SmartPtr](../smartptr/) vers des objets alloués sur la pile est strictement interdit.
## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
