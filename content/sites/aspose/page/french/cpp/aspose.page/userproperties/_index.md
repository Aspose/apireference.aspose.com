---
title: "Aspose::Page::UserProperties classe"
linktitle: "UserProperties"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::UserProperties classe. Classe de propriété spéciale qui permet de définir et de récupérer des propriétés typées. Elle permet également de lier deux objets de propriété par défaut à rechercher si cet objet de propriété ne contient pas la propriété en C++."
type: docs
weight: 1600
url: /fr/cpp/aspose.page/userproperties/
---
## UserProperties class


Classe de propriété spéciale qui permet de définir et de récupérer des propriétés typées. Elle permet également de brancher deux objets de propriétés par défaut à rechercher si cet objet de propriété ne contient pas la propriété.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Obtient la valeur de la propriété string. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Obtient la valeur de la propriété string. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Obtient la valeur de la propriété color. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Obtient la valeur de la propriété color. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Obtient la valeur de la propriété double. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Obtient la valeur de la propriété double. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Obtient la valeur de la propriété float. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Obtient la valeur de la propriété float. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Obtient la valeur de la propriété integer. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Obtient la valeur de la propriété integer. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Obtient la valeur de la propriété margins. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Obtient la valeur de la propriété margins. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Obtient la valeur de la propriété matrix. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Obtient la valeur de la propriété matrix. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Obtient la valeur de la propriété rectangle. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Obtient la valeur de la propriété rectangle. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Obtient la valeur de la propriété size. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Obtient la valeur de la propriété size. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Obtient la valeur de la propriété string array. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Obtient la valeur de la propriété string array. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [IsProperty](./isproperty/)(System::String) | Obtient la valeur de la propriété boolean. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Obtient la valeur de la propriété boolean. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Renvoie les noms des propriétés. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Copie les propriétés, y compris leurs valeurs par défaut, dans cet [UserProperties](./). |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Définit la valeur de la propriété string. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Définit la valeur de la propriété tableau de chaînes. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Définit la valeur de la propriété tableau de chaînes dans la table de propriétés spécifiée. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Définit la valeur de la propriété couleur. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Définit la valeur de la propriété couleur dans la table de propriétés spécifiée. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Définit la valeur de la propriété rectangle. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Définit la valeur de la propriété rectangle dans la table de propriétés spécifiée. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Définit la valeur de la propriété marges. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Définit la valeur de la propriété marges dans la table de propriétés spécifiée. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Définit la valeur de la propriété taille. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Définit la valeur de la propriété taille dans la table de propriétés spécifiée. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Définit la valeur de la propriété entier. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Définit la valeur de la propriété entier dans la table de propriétés spécifiée. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Définit la valeur de la propriété double. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Définit la valeur de la propriété double dans la table de propriétés spécifiée. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Définit la valeur de la propriété flottant. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Définit la valeur de la propriété flottant dans la table de propriétés spécifiée. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Définit la valeur de la propriété booléenne. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Définit la valeur de la propriété booléenne dans la table de propriétés spécifiée. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Définit la valeur de la propriété matrice. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Définit la valeur de la propriété matrice dans la table de propriétés spécifiée. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définit le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
| [UserProperties](./userproperties/)() | Initialise une instance vide de la classe [UserProperties](./). |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Initialise une instance de la classe [UserProperties](./) avec des valeurs par défaut. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Construit [UserProperties](./) avec une table defaults et altDefaults, qui sont recherchées dans cet ordre. |
## Voir aussi

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
