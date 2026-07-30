---
title: "classe System::Reflection::MemberInfo"
linktitle: "MemberInfo"
second_title: "Aspose.Font pour C++"
description: "classe System::Reflection::MemberInfo. Fournit des informations de réflexion sur les membres. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.reflection/memberinfo/
---
## MemberInfo class


Fournit des informations de réflexion sur les membres. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Ajoute un attribut à la collection. |
| [get_DeclaringType](./get_declaringtype/)() const | Obtient le type déclarant. |
| [get_FullName](./get_fullname/)() const | Obtient le nom complet du membre. Peut être différent dans les parties implémentées manuellement. |
| virtual [get_MemberType](./get_membertype/)() const | Obtient une valeur [System::Reflection::MemberTypes](../membertypes/) indiquant le type du membre - méthode, constructeur, événement, etc. |
| [get_Name](./get_name/)() const | Obtient le nom du membre. |
| [get_ReflectedType](./get_reflectedtype/)() const | Obtient le type reflété. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Renvoie un tableau contenant des objets représentant tous les attributs personnalisés appliqués au type représenté par l'objet actuel. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | Renvoie un tableau contenant des objets représentant tous les attributs personnalisés appliqués au type représenté par l'objet actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ObjectPtr](./objectptr/) | Alias d'un pointeur partagé vers [Object](../../system/object/). |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
