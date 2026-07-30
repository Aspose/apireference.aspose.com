---
title: "classe System::Nullable"
linktitle: "Nullable"
second_title: "Aspose.Font pour C++"
description: "classe System::Nullable. Déclaration anticipée en C++."
type: docs
weight: 4600
url: /fr/cpp/system/nullable/
---
## Nullable class


Déclaration anticipée.

```cpp
template<typename T>class Nullable
```


| Paramètre | Description |
| --- | --- |
| T | Le type de valeur sous-jacent qui est étendu par la classe [Nullable](./) |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | Détermine si la valeur représentée par l'objet actuel est égale à la valeur représentée par l'objet [Nullable](./) spécifié. |
| [get_HasValue](./get_hasvalue/)() const | Détermine si l'objet actuel représente une valeur quelconque. |
| [get_Value](./get_value/)() const | Renvoie une copie de la valeur représentée par l'objet actuel. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage pour l'objet actuel. |
| [GetValueOrDefault](./getvalueordefault/)(T) | Renvoie la valeur représentée par l'objet actuel ou la valeur spécifiée si la valeur représentée par l'objet actuel est nulle. |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | Détermine si l'objet actuel représente une valeur nulle. |
| [Nullable](./nullable/)() | Construit une instance qui représente une valeur nulle. |
| [Nullable](./nullable/)(std::nullptr_t) | Construit une instance qui représente null. |
| [Nullable](./nullable/)(const T1\&) | Construit une instance de la classe [Nullable](./) qui représente la valeur spécifiée convertie (si nécessaire) en la valeur du type sous-jacent T. |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | Construit une instance qui représente une valeur représentée par l'objet [Nullable](./) spécifié. L'objet nullable spécifié peut représenter une valeur d'un type différent de celui du type sous-jacent de l'instance construite, auquel cas la valeur représentée est convertie en une valeur de type T. |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | Fonction d'assistance pour vérifier si **other** et cet objet ne sont pas nuls et appeler une lambda le cas échéant. Utilisée dans implementation.s. |
| [operator const T &](./operatorconstt&/)() const | Renvoie une référence constante à la valeur représentée par l'objet actuel. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Détermine si la valeur représentée par l'objet actuel n'est pas nulle. |
| [operator!=](./operator!=/)(const T1\&) const | Détermine si la valeur représentée par l'objet actuel n'est pas égale à la valeur spécifiée. |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | Détermine si la valeur représentée par l'objet actuel n'est pas égale à la valeur représentée par l'objet [Nullable](./) spécifié. |
| [operator&=](./operator&=/)(bool) | Applique [operator&=()](./operator&=/) à la valeur représentée par l'objet actuel en utilisant la valeur spécifiée comme argument du côté droit. |
| [operator+](./operator+/)(std::nullptr_t) const | Renvoie une instance construite par défaut de la classe Nullable<T>. |
| [operator+](./operator+/)(const T1\&) const | Additionne les valeurs nullable et non nullable. |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | Additionne les valeurs nullable. |
| [operator+=](./operator+=/)(std::nullptr_t) | Réinitialise l'objet actuel afin qu'il représente une valeur nulle. |
| [operator+=](./operator+=/)(const T1\&) | Applique [operator+=()](./operator+=/) à la valeur représentée par l'objet actuel en utilisant la valeur spécifiée comme argument du côté droit. |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | Applique [operator+=()](./operator+=/) à la valeur représentée par l'objet actuel en utilisant la valeur représentée par l'objet [Nullable](./) spécifié comme argument du côté droit. |
| [operator-](./operator-/)(T1) const | Soustrait les valeurs nullable et null-pointées. |
| [operator-](./operator-/)(const T1\&) const | Soustrait les valeurs nullable et non nullable. |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | Soustrait les valeurs nullable. |
| [operator-=](./operator-=/)(T1) | Renvoie une instance de la classe [Nullable](./) qui représente une valeur nulle. |
| [operator-=](./operator-=/)(const T1\&) | Applique [operator-=()](./operator-=/) à la valeur représentée par l'objet actuel en utilisant la valeur spécifiée comme argument du côté droit. |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | Applique [operator-=()](./operator-=/) à la valeur représentée par l'objet actuel en utilisant la valeur représentée par l'objet [Nullable](./) spécifié comme argument du côté droit. |
| [operator<](./operator_/)(std::nullptr_t) const | Retourne toujours false. |
| [operator<](./operator_/)(const T1\&) const | Détermine si la valeur représentée par l'objet actuel est inférieure à la valeur spécifiée en appliquant [operator<()](./operator_/) à ces valeurs. |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | Détermine si la valeur représentée par l'objet actuel est inférieure à la valeur représentée par l'objet [Nullable](./) spécifié en appliquant [operator<()](./operator_/) à ces valeurs. |
| [operator<=](./operator_=/)(std::nullptr_t) const | Retourne toujours false. |
| [operator<=](./operator_=/)(const T1\&) const | Détermine si la valeur représentée par l'objet actuel est inférieure ou égale à la valeur spécifiée en appliquant [operator<=()](./operator_=/) à ces valeurs. |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | Détermine si la valeur représentée par l'objet actuel est inférieure ou égale à la valeur représentée par l'objet [Nullable](./) spécifié en appliquant [operator<=()](./operator_=/) à ces valeurs. |
| [operator=](./operator=/)(std::nullptr_t) | Assigne une valeur nulle à l'objet actuel. |
| [operator=](./operator=/)(const T1\&) | Remplace la valeur actuellement représentée de l'objet par celle spécifiée. |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | Remplace la valeur actuellement représentée de l'objet par celle spécifiée. |
| [operator==](./operator==/)(std::nullptr_t) const | Détermine si la valeur représentée par l'objet actuel est nulle. |
| [operator==](./operator==/)(const T1\&) const | Détermine si la valeur représentée par l'objet actuel est égale à la valeur spécifiée. |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | Détermine si la valeur représentée par l'objet actuel est égale à la valeur représentée par l'objet [Nullable](./) spécifié. |
| [operator>](./operator_/)(std::nullptr_t) const | Retourne toujours false. |
| [operator>](./operator_/)(const T1\&) const | Détermine si la valeur représentée par l'objet actuel est supérieure à la valeur spécifiée en appliquant [operator>()](./operator_/) à ces valeurs. |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | Détermine si la valeur représentée par l'objet actuel est supérieure à la valeur représentée par l'objet [Nullable](./) spécifié en appliquant [operator>()](./operator_/) à ces valeurs. |
| [operator>=](./operator_=/)(std::nullptr_t) const | Retourne toujours false. |
| [operator>=](./operator_=/)(const T1\&) const | Détermine si la valeur représentée par l'objet actuel est supérieure ou égale à la valeur représentée par l'objet spécifié en appliquant [operator>=()](./operator_=/) à ces valeurs. |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | Détermine si la valeur représentée par l'objet actuel est supérieure ou égale à la valeur représentée par l'objet [Nullable](./) spécifié en appliquant [operator>=()](./operator_=/) à ces valeurs. |
| [operator | =](./operator_=/)(bool) | Applies [operator | =()](./operator_=/) à la valeur représentée par l'objet actuel en utilisant la valeur spécifiée comme argument du côté droit. |
| [reset](./reset/)() | Définit la valeur actuellement représentée sur null. |
| [set_Value](./set_value/)(const T\&) | Attribue une nouvelle valeur à l'objet nullable. |
| [ToString](./tostring/)() const | Convertit la valeur représentée par l'objet actuel en chaîne. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ValueType](./valuetype/) | Un alias pour un type de la valeur représentée par cette classe. |
## Remarques


Représente une valeur du type spécifié qui peut être assignée à null. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer les objets de ce type.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
