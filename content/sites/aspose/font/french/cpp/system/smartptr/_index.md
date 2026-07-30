---
title: "Classe System::SmartPtr"
linktitle: "SmartPtr"
second_title: "Aspose.Font pour C++"
description: "Classe System::SmartPtr. Classe de pointeur pour encapsuler les types alloués sur le tas. Utilisez‑la pour gérer la mémoire des classes héritant de Object. Ce type de pointeur suit la sémantique des pointeurs intrusifs. Le compteur de références est stocké soit dans Object lui‑même, soit dans une structure de compteur étroitement liée à l’instance de Object. Dans tous les cas, toutes les instances de SmartPtr forment un groupe de possession unique, quel que soit le mode de création, ce qui diffère du comportement de la classe std::shared_ptr. Convertir un pointeur brut en SmartPtr est sûr tant qu’il existe d’autres instances de SmartPtr détenant des références partagées vers le même objet. Une instance de la classe SmartPtr peut être dans l’un des deux états : pointeur partagé et pointeur faible. Pour garder l’objet vivant, le nombre de références partagées doit être positif. Les pointeurs faibles et partagés peuvent être utilisés pour accéder à l’objet pointé (appeler des méthodes, lire ou écrire des champs, etc.), mais les pointeurs faibles ne participent pas au comptage des références du pointeur partagé. L’objet est supprimé lorsque le dernier pointeur ''shared'' SmartPtr qui le référence est détruit. Veillez donc à ce que cela n’arrive pas lorsqu’aucun autre pointeur SmartPtr partagé vers l’objet n’existe, par exemple pendant la construction ou la destruction de l’objet. Utilisez les objets sentinelles System::Object::ThisProtector (dans le code C++) ou les attributs CppCTORSelfReference ou CppSelfReference (dans le code C# traduit) pour corriger ce problème. De même, assurez‑vous de rompre les références cycliques en utilisant la classe de pointeur System::WeakPtr ou le mode de pointeur System::SmartPtrMode::Weak (dans le code C++) ou l’attribut CppWeakPtr (dans le code C# traduit). Si deux objets ou plus se référencent mutuellement à l’aide de pointeurs ''shared'', ils ne seront jamais supprimés. Si le type de pointeur (faible ou partagé) doit être changé à l’exécution, utilisez la méthode System::SmartPtr<T>::set_Mode() ou la classe System::DynamicWeakPtr. La classe SmartPtr ne contient aucune méthode virtuelle. Vous ne devez l’hériter que si vous créez votre propre stratégie de gestion de mémoire. Ce type est un pointeur pour gérer la suppression d’un autre objet. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante en C++."
type: docs
weight: 5500
url: /fr/cpp/system/smartptr/
---
## SmartPtr class


Classe de pointeur pour encapsuler les types alloués sur le tas. Utilisez‑la pour gérer la mémoire des classes héritant de [Object](../object/). Ce type de pointeur suit la sémantique des pointeurs intrusifs. Le compteur de références est stocké soit dans [Object](../object/) lui‑même, soit dans une structure de compteur étroitement liée à l’instance de [Object](../object/). Dans tous les cas, toutes les instances de [SmartPtr](./) forment un groupe de possession unique, quel que soit le mode de création, ce qui diffère du comportement de la classe std::shared_ptr. Convertir un pointeur brut en [SmartPtr](./) est sûr tant qu’il existe d’autres instances de [SmartPtr](./) détenant des références partagées vers le même objet. Une instance de la classe [SmartPtr](./) peut être dans l’un des deux états : pointeur partagé et pointeur faible. Pour garder l’objet vivant, le nombre de références partagées doit être positif. Les pointeurs faibles et partagés peuvent être utilisés pour accéder à l’objet pointé (appeler des méthodes, lire ou écrire des champs, etc.), mais les pointeurs faibles ne participent pas au comptage des références du pointeur partagé. [Object](../object/) est supprimé lorsque le dernier pointeur 'shared' [SmartPtr](./) qui le référence est détruit. Veillez donc à ce que cela n’arrive pas lorsqu’aucun autre pointeur [SmartPtr](./) partagé vers l’objet n’existe, par exemple pendant la construction ou la destruction de l’objet. Utilisez les objets sentinelles System::Object::ThisProtector (dans le code C++) ou les attributs CppCTORSelfReference ou CppSelfReference (dans le code C# traduit) pour corriger ce problème. De même, assurez‑vous de rompre les références cycliques en utilisant la classe de pointeur [System::WeakPtr](../weakptr/) ou le mode de pointeur [System::SmartPtrMode::Weak](../smartptrmode/) (dans le code C++) ou l’attribut CppWeakPtr (dans le code C# traduit). Si deux objets ou plus se référencent mutuellement à l’aide de pointeurs 'shared', ils ne seront jamais supprimés. Si le type de pointeur (faible ou partagé) doit être changé à l’exécution, utilisez la méthode [System::SmartPtr<T>::set_Mode()](./set_mode/) ou la classe [System::DynamicWeakPtr](../dynamicweakptr/). La classe [SmartPtr](./) ne contient aucune méthode virtuelle. Vous ne devez l’hériter que si vous créez votre propre stratégie de gestion de mémoire. Ce type est un pointeur pour gérer la suppression d’un autre objet. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante.

```cpp
template<class T>class SmartPtr
```


| Paramètre | Description |
| --- | --- |
| T | Type de l’objet pointé. Doit être soit [System::Object](../object/), soit une sous‑classe de celui‑ci. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [begin](./begin/)() | Accesseur de la méthode [begin()](./begin/) d’une collection sous‑jacente. Ne compile que si [SmartPtr_](./smartptr_/) est un type spécialisé possédant la méthode [begin()](./begin/). |
| [begin](./begin/)() const | Accesseur de la méthode [begin()](./begin/) d’une collection sous‑jacente. Ne compile que si [SmartPtr_](./smartptr_/) est un type spécialisé possédant la méthode [begin()](./begin/). |
| [Cast](./cast/)() const | Convertit le pointeur en son propre type. |
| [Cast](./cast/)() const | Convertit le pointeur en type de base en utilisant static_cast. |
| [Cast](./cast/)() const | Convertit le pointeur en type dérivé en utilisant dynamic_cast. |
| [Cast](./cast/)() const | Convertit le pointeur en type dérivé en utilisant dynamic_cast. |
| [cbegin](./cbegin/)() const | Accesseur de la méthode [cbegin()](./cbegin/) d’une collection sous‑jacente. Ne compile que si [SmartPtr_](./smartptr_/) est un type spécialisé possédant la méthode [cbegin()](./cbegin/). |
| [cend](./cend/)() const | Accesseur de la méthode [cend()](./cend/) d’une collection sous‑jacente. Ne compile que si [SmartPtr_](./smartptr_/) est un type spécialisé possédant la méthode [cend()](./cend/). |
| [const_pointer_cast](./const_pointer_cast/)() const | Convertit le pointeur en un type différent en utilisant const_cast sur l’objet pointé. |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | Convertit le pointeur en un type différent en utilisant dynamic_cast sur l’objet pointé. |
| [end](./end/)() | Accesseur de la méthode [end()](./end/) d’une collection sous‑jacente. Ne compile que si [SmartPtr_](./smartptr_/) est un type spécialisé possédant la méthode [end()](./end/). |
| [end](./end/)() const | Accesseur de la méthode [end()](./end/) d’une collection sous‑jacente. Ne compile que si [SmartPtr_](./smartptr_/) est un type spécialisé possédant la méthode [end()](./end/). |
| [get](./get/)() const | Obtient l’objet pointé. |
| [get_Mode](./get_mode/)() const | Obtient le mode du pointeur. |
| [get_shared](./get_shared/)() const | Obtient l’objet pointé, mais vérifie que le pointeur est en mode partagé. |
| [get_shared_count](./get_shared_count/)() const | Obtient le nombre de pointeurs partagés existant vers l’objet référencé, y compris le pointeur actuel. Vérifie que le pointeur actuel est en mode partagé. |
| [GetHashCode](./gethashcode/)() const | Appelle [GetHashCode()](./gethashcode/) sur l’objet pointé. |
| [GetObjectNotNull](./getobjectnotnull/)() const | Obtient l’objet actuellement référencé (le cas échéant) ou lève une exception. |
| [GetObjectOrNull](./getobjectornull/)() const | Obtient l’objet pointé (le cas échéant) ou nullptr. Identique à [get()](./get/). |
| [GetObjectOwner](./getobjectowner/)() const | Obtient l’objet référencé. |
| [GetPointer](./getpointer/)() const | Obtient l’objet pointé (le cas échéant) ou nullptr. Identique à [get()](./get/). |
| [Is](./is/)(const System::TypeInfo\&) const | Vérifie si l’objet pointé est d’un type spécifique ou d’un de ses sous‑types. Suit la sémantique C# 'is'. |
| [IsAliasingPtr](./isaliasingptr/)() const | Vérifie si le pointeur pointe vers un autre objet que celui possédé (créé par un constructeur d’alias). |
| [IsShared](./isshared/)() const | Vérifie si le pointeur est en mode partagé. |
| [IsWeak](./isweak/)() const | Vérifie si le pointeur est en mode faible. |
| explicit [operator bool](./operatorbool/)() const | Vérifie si le pointeur n'est pas nul. |
| [operator!](./operator!/)() const | Vérifie si le pointeur est nul. |
| [operator*](./operator_/)() const | Obtient une référence à l'objet pointé. Vérifie que le pointeur n'est pas nul. |
| [operator->](./operator-_/)() const | Permet d'accéder aux membres de l'objet référencé. |
| [operator<](./operator_/)(Y *) const | Fournit une sémantique de comparaison inférieure pour la classe [SmartPtr](./). |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | Fournit une sémantique de comparaison inférieure pour la classe [SmartPtr](./). |
| [operator=](./operator=/)(SmartPtr_\&&) | Attribue par déplacement l'objet [SmartPtr](./). x devient inutilisable. |
| [operator=](./operator=/)(const SmartPtr_\&) | Attribue par copie l'objet [SmartPtr](./). |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Attribue par copie l'objet [SmartPtr](./). Effectue les conversions de type requises. |
| [operator=](./operator=/)(Pointee_ *) | Assigne le pointeur brut à l'objet [SmartPtr](./). |
| [operator=](./operator=/)(std::nullptr_t) | Définit la valeur du pointeur à nullptr. |
| [operator==](./operator==/)(std::nullptr_t) const | Vérifie si le pointeur pointe vers nullptr. |
| [operator[]](./operator[]/)(IdxType) const | Accesseur pour les éléments du tableau. Ne compile que si [SmartPtr_](./smartptr_/) est une spécialisation de [System::Array](../array/). |
| [RemoveAliasing](./removealiasing/)() const | Supprime l'aliasing (créé par un constructeur d'aliasing) du pointeur, s'assure qu'il gère (si partagé) ou suit (si faible) le même objet auquel il pointe. |
| [reset](./reset/)(Pointee_ *) | Définit l'objet pointé. |
| [reset](./reset/)() | Fait pointer le pointeur vers nullptr. |
| [set_Mode](./set_mode/)(SmartPtrMode) | Définit le mode du pointeur. Peut modifier les comptes de références de l'objet référencé. |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | Appelle la méthode SetTemplateWeakPtr() sur l'objet pointé (le cas échéant). |
| [SmartPtr](./smartptr/)(SmartPtrMode) | Crée un objet [SmartPtr](./) du mode requis. |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | Crée un objet [SmartPtr](./) nul du mode requis. |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | Crée un [SmartPtr](./) pointant vers l'objet spécifié, ou convertit un pointeur brut en [SmartPtr](./). |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | Construit par copie l'objet [SmartPtr](./). Les deux pointeurs pointent ensuite vers le même objet. |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | Construit par copie l'objet [SmartPtr](./). Les deux pointeurs pointent ensuite vers le même objet. Effectue la conversion de type si autorisée. |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | Construit par déplacement l'objet [SmartPtr](./). Effectivement, échange deux pointeurs s'ils sont tous deux du même mode. x peut être inutilisable après l'appel. |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | Convertit le type du tableau référencé en créant un nouveau tableau d'un type différent. Utile si, en C#, il existe un transtypage de tableau qui n'est pas supporté en C++. |
| explicit [SmartPtr](./smartptr/)(const Y\&) | Initialise un tableau vide. Utilisé pour traduire certaines constructions de code C#. |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | Construit un [SmartPtr](./) qui partage les informations de possession avec la valeur initiale de ptr, mais détient un pointeur p non lié et non géré. |
| [static_pointer_cast](./static_pointer_cast/)() const | Convertit le pointeur vers un type différent en utilisant static_cast sur l'objet pointé. |
| [ToObjectPtr](./toobjectptr/)() const | Convertit tout type de pointeur en pointeur vers [Object](../object/). Ne nécessite pas que le type [Pointee_](./pointee_/) soit complet. |
| static [Type](./type/)() | Raccourci pour obtenir l'objet [System::TypeInfo](../typeinfo/) du type [Pointee_](./pointee_/). |
| [~SmartPtr](./~smartptr/)() | Détruit l'objet [SmartPtr](./). Si nécessaire, diminue le compteur de références de l'objet pointé et supprime l'objet. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ArrayType](./arraytype/) | Identique à [Pointee_](./pointee_/), s'il s'agit d'une spécialisation de [System::Array](../array/), et void sinon. |
| [Pointee_](./pointee_/) | Type pointé. |
| [SmartPtr_](./smartptr_/) | Type de pointeur intelligent spécialisé. |
| [ValueType](./valuetype/) | Type de stockage du tableau pointé. Significatif uniquement si T est une spécialisation de [System::Array](../array/). |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
