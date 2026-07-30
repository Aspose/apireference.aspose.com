---
title: "classe System::TypeInfo"
linktitle: "TypeInfo"
second_title: "Aspose.Font pour C++"
description: "classe System::TypeInfo. Représente un type particulier et fournit des informations à son sujet en C++."
type: docs
weight: 6600
url: /fr/cpp/system/typeinfo/
---
## TypeInfo class


Représente un type particulier et fournit des informations à son sujet.

```cpp
class TypeInfo
```

## Nested classes

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Ajoute l'attribut spécifié à la liste des attributs du type. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | Définit le constructeur par défaut pour le type T. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | Définit le constructeur par défaut via le foncteur qui crée une instance de classe. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | Ajoute le membre spécifié à la liste des membres du type. |
| static [BoxedValueType](./boxedvaluetype/)() | Fournit une structure [TypeInfo](./) unique pour le type [BoxedValue](./boxedvalue/) afin d'être partagée par plusieurs classes Boxed*. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | NON IMPLEMENTÉ. Retourne un pointeur vers l'assembly dans lequel le type représenté par l'objet actuel est déclaré. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | NON IMPLEMENTÉ. Retourne le nom complet incluant le nom de l'assembly du type représenté par l'objet actuel. |
| [get_BaseType](./get_basetype/)() const | Retourne le descripteur du type de base. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | Obtient une valeur indiquant si l'objet Type actuel possède des paramètres de type qui n'ont pas été remplacés par des types spécifiques. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | Obtient la liste des membres portant le nom spécifié. |
| [get_FullName](./get_fullname/)() const | Retourne le nom complet (mais sans le nom de l'assembly) du type représenté par l'objet actuel. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | Obtient un tableau des arguments de type générique pour ce type. |
| [get_IsAbstract](./get_isabstract/)() const | Obtient une valeur indiquant si le Type est abstrait et doit être remplacé. |
| [get_IsArray](./get_isarray/)() const | Obtient une valeur indiquant si le type est un tableau. |
| [get_IsClass](./get_isclass/)() const | Obtient une valeur indiquant si le Type est une classe ou un délégué ; c'est-à-dire, pas un type valeur ou une interface. |
| [get_IsEnum](./get_isenum/)() const | Obtient une valeur indiquant si le Type actuel représente une énumération. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | Obtient une valeur indiquant si le Type actuel représente une définition de type générique, à partir de laquelle d'autres types génériques peuvent être construits. |
| [get_IsInterface](./get_isinterface/)() const | Obtient une valeur indiquant si le Type est une interface ; c’est‑à‑dire, pas une classe ou un type valeur. |
| [get_IsSealed](./get_issealed/)() const | Obtient une valeur indiquant si le Type est déclaré scellé. |
| [get_IsValueType](./get_isvaluetype/)() const | Obtient une valeur indiquant si le Type est un type valeur. |
| [get_IsVisible](./get_isvisible/)() const | Obtient une valeur indiquant si le Type peut être accessible par du code en dehors de l’assembly. |
| [get_Name](./get_name/)() const | Renvoie le nom du type représenté par l’objet actuel. |
| [get_Namespace](./get_namespace/)() const | Obtient l’espace de noms du Type. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | Recherche un constructeur d’instance public dont les paramètres correspondent aux types du tableau spécifié. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | Recherche les constructeurs définis pour le Type actuel, en utilisant les BindingFlags spécifiés. |
| [GetConstructors](./getconstructors/)() const | Renvoie tous les constructeurs publics définis pour le Type actuel. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | Recherche l’attribut personnalisé appliqué ayant le type spécifié et appliqué au type représenté par l’objet actuel. |
| [GetCustomAttributes](./getcustomattributes/)() const | Renvoie un tableau contenant des objets qui représentent tous les attributs personnalisés appliqués au type. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Renvoie un tableau contenant des objets qui représentent des attributs spécifiques appliqués au type. |
| [GetElementType](./getelementtype/)() const | NON IMPLEMENTÉ. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | Recherche le champ spécifié, en utilisant les contraintes de liaison spécifiées. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | Recherche les champs définis pour le Type actuel, en utilisant les contraintes de liaison spécifiées. |
| [GetGenericArguments](./getgenericarguments/)() const | Obtient un tableau des arguments de type générique pour ce type. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage associé à cette instance. |
| [GetInterfaces](./getinterfaces/)() const | Obtient toutes les interfaces implémentées ou héritées par le Type actuel. |
| [GetMember](./getmember/)(const String\&) const | Obtient la liste des membres portant le nom spécifié. |
| [GetMethod](./getmethod/)(const String\&) const | Obtient la méthode avec le nom spécifié. |
| [GetProperties](./getproperties/)() const | Renvoie toutes les propriétés publiques du Type actuel. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | Recherche les propriétés du Type actuel, en utilisant les contraintes de liaison spécifiées. |
| [GetTemplParamType](./gettemplparamtype/)() const | Obtient le descripteur du type de paramètre de modèle. |
| [Hash](./hash/)() const | Renvoie une valeur de hachage associée au type représenté par l'objet actuel. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | Détermine si une instance d'un type spécifié peut être assignée à une variable du type actuel. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | NON IMPLEMENTÉ. Indique si un ou plusieurs attributs du type spécifié ou de ses types dérivés sont appliqués à ce membre. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | Détermine si l'objet spécifié est une instance du type actuel. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | Détermine si le type représenté par l'objet actuel est une sous‑classe de la classe spécifiée. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | Détermine si les objets [TypeInfo](./) actuels et spécifiés ne sont pas égaux. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Détermine si l'objet [TypeInfo](./) actuel n'est pas un objet nul, c’est‑à‑dire qu'il représente un type. |
| [operator==](./operator==/)(const TypeInfo\&) const | Détermine si les objets [TypeInfo](./) actuels et spécifiés sont égaux. |
| [operator==](./operator==/)(std::nullptr_t) const | Détermine si l'objet [TypeInfo](./) actuel est un objet nul, c’est‑à‑dire qu'il ne représente aucun type. |
| [reset](./reset/)() | Définit [TypeInfo](./) à null. |
| [set_IsValueType](./set_isvaluetype/)(bool) | Définit une valeur indiquant si le Type est un type valeur. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | Définit le descripteur du type de base. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | Définit le descripteur du type de paramètre de modèle. |
| static [StringHash](./stringhash/)(const char_t *) | Calcule le hachage pour la chaîne spécifiée. |
| [ToString](./tostring/)() const | Renvoie une chaîne contenant le nom du type représenté par l'objet actuel. |
| static [Type](./type/)() | Renvoie un objet [TypeInfo](./) qui représente la classe [TypeInfo](./). |
| [TypeInfo](./typeinfo/)() | Constructeur par défaut (aucun type n'est défini). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | Constructeur d'objet nul (aucun type n'est défini). |
| [TypeInfo](./typeinfo/)(const char_t *) | Constructeur. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | Constructeur. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | Constructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static [EmptyType](./emptytype/) | Constante représentant la liste vide de [TypeInfo](./). |
| static [EmptyTypes](./emptytypes/) | Constante représentant la liste vide de [TypeInfo](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | Pointeur de fonction pour construire le type. |
## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
