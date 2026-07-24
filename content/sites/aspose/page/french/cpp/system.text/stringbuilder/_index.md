---
title: "System::Text::StringBuilder classe"
linktitle: "StringBuilder"
second_title: "Aspose.Page pour C++"
description: "System::Text::StringBuilder classe. Tampon pour accumuler une chaîne partie par partie. Ce type peut être alloué soit sur la pile en tant que type valeur, soit sur le tas en utilisant la fonction System::MakeObject(). Une fois l'objet alloué, ne mélangez jamais ces deux cas d'utilisation : avoir des pointeurs SmartPtr vers des objets alloués sur la pile est strictement interdit en C++."
type: docs
weight: 2400
url: /fr/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Append](./append/)(char_t) | Ajoute un caractère au builder. |
| [Append](./append/)(char_t, int) | Ajoute des caractères au builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | Ajoute un tableau de caractères au builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | Ajoute une tranche de tableau de caractères au builder. |
| [Append](./append/)(const String\&) | Ajoute une chaîne au builder. |
| [Append](./append/)(const String\&, int, int) | Ajoute une tranche de chaîne au builder. |
| [Append](./append/)(const SharedPtr\<T\>\&) | Ajoute la représentation sous forme de chaîne de l'objet au builder. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | Ajoute le contenu du builder au builder. |
| [Append](./append/)(float) | Ajoute une valeur à virgule flottante au builder. |
| [Append](./append/)(double) | Ajoute une valeur à virgule flottante au builder. |
| [Append](./append/)(int) | Ajoute une valeur entière au builder. |
| [Append](./append/)(T) | Ajoute une valeur arithmétique au builder. |
| [Append](./append/)(E) | Ajoute la représentation sous forme de chaîne de la valeur d'énumération au builder. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | Ajoute une chaîne formatée au builder. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | Ajoute une chaîne formatée au builder. |
| [AppendLine](./appendline/)() | Ajoute le caractère de nouvelle ligne au builder. |
| [AppendLine](./appendline/)(const String\&) | Ajoute une chaîne suivie du caractère de nouvelle ligne au builder. |
| [Clear](./clear/)() | Supprime tous les caractères du builder. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | Copie les données du builder dans les positions existantes du tableau. |
| [get_Capacity](./get_capacity/)() const | Obtient la capacité actuelle du string builder. |
| [get_Length](./get_length/)() const | Obtient la longueur de la chaîne actuellement dans le builder. |
| [idx_get](./idx_get/)(int) const | Obtient le caractère à la position spécifiée. |
| [idx_set](./idx_set/)(int, char_t) | Définit le caractère à la position spécifiée. |
| [Insert](./insert/)(int, const String\&) | Insère une chaîne à la position fixe du builder. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | Insère une chaîne répétée à la position fixe du builder. |
| [Insert](./insert/)(int, char_t) | Insère un caractère à la position fixe du builder. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | Insère des caractères à la position fixe du builder. |
| [Insert](./insert/)(int, T) | Insère une valeur à la position fixe du builder. |
| [operator[]](./operator[]/)(int) const | Obtient le caractère à la position spécifiée. |
| [Remove](./remove/)(int, int) | Supprime le fragment du builder. |
| [Replace](./replace/)(const String\&, const String\&) | Remplace la sous-chaîne via le builder. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Remplace la sous-chaîne via la plage du builder. |
| [Replace](./replace/)(char_t, char_t) | Remplace le caractère via le builder. |
| [Replace](./replace/)(char_t, char_t, int, int) | Remplace le caractère via la plage du builder. |
| [set_Capacity](./set_capacity/)(int) | Définit la capacité actuelle du string builder. |
| [set_Length](./set_length/)(int) | Tronque ou étend le string builder à la longueur spécifiée. |
| [StringBuilder](./stringbuilder/)() | Constructeur. |
| [StringBuilder](./stringbuilder/)(int) | Constructeur. |
| [StringBuilder](./stringbuilder/)(const String\&) | Constructeur. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | Constructeur. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | Constructeur. |
| [ToString](./tostring/)() const override | Obtient la chaîne actuellement contenue dans le builder. |
| [ToString](./tostring/)(int, int) const | Obtient la sous-chaîne actuellement contenue dans le builder. |
| [~StringBuilder](./~stringbuilder/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
