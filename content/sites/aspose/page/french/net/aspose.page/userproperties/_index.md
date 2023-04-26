---
title: Class UserProperties
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.UserProperties classe. Classe de propriété spéciale qui permet de définir des propriétés typées et de les renvoyer . Il permet également de rechercher le raccordement de deux objets de propriété par défaut si cet objet de propriété ne contient pas la propriété.
type: docs
weight: 320
url: /fr/net/aspose.page/userproperties/
---
## UserProperties class

Classe de propriété spéciale qui permet de définir des propriétés typées et de les renvoyer . Il permet également de rechercher le raccordement de deux objets de propriété par défaut si cet objet de propriété ne contient pas la propriété.

```csharp
public class UserProperties : Dictionary<string, object>
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [UserProperties](userproperties/#constructor)() | Initialise une instance vide de la classe UserProperties. |
| [UserProperties](userproperties/#constructor_1)(Dictionary&lt;string, object&gt;) | Initialise une classe UserProperties avec les valeurs par défaut. |
| [UserProperties](userproperties/#constructor_2)(Dictionary&lt;string, object&gt;, Dictionary&lt;string, object&gt;) | Construit UserProperties avec une table defaults et altDefaults, qui sont recherchées dans cet ordre. |

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [Properties](../../aspose.page/userproperties/properties/) { set; } | Copie les propriétés, y compris ses valeurs par défaut dans ce UserProperties |

## Méthodes

| Nom | La description |
| --- | --- |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty/#getproperty)(string) | Obtient la valeur de la propriété de chaîne. |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty/#getproperty_1)(string, string) | Obtient la valeur de la propriété de chaîne. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor/#getpropertycolor)(string) | Obtient la valeur de la propriété de couleur. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor/#getpropertycolor_1)(string, Color) | Obtient la valeur de la propriété de couleur. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble/#getpropertydouble)(string) | Obtient une valeur de propriété double. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble/#getpropertydouble_1)(string, double) | Obtient une valeur de propriété double. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat/#getpropertyfloat)(string) | Obtient la valeur de la propriété float. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat/#getpropertyfloat_1)(string, float) | Obtient la valeur de la propriété float. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint/#getpropertyint)(string) | Obtient la valeur entière de la propriété. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint/#getpropertyint_1)(string, int) | Obtient la valeur de la propriété entière. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins/#getpropertymargins)(string) | Obtient la valeur de la propriété des marges. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins/#getpropertymargins_1)(string, Margins) | Obtient la valeur de la propriété des marges. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle/#getpropertyrectangle)(string) | Obtient la valeur de la propriété rectangle. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle/#getpropertyrectangle_1)(string, RectangleF) | Obtient la valeur de la propriété rectangle. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize/#getpropertysize)(string) | Obtient la valeur de la propriété size. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize/#getpropertysize_1)(string, Size) | Obtient la valeur de la propriété size. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray/#getpropertystringarray)(string) | Obtient la valeur de la propriété du tableau de chaînes. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray/#getpropertystringarray_1)(string, string[]) | Obtient la valeur de la propriété du tableau de chaînes. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty/#isproperty)(string) | Obtient la valeur de la propriété booléenne. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty/#isproperty_1)(string, bool) | Obtient la valeur de la propriété booléenne. Si la propriété demandée est absente, renvoie la valeur par défaut fournie. |
| virtual [PrintProperties](../../aspose.page/userproperties/printproperties/)() |  |
| virtual [PropertyNames](../../aspose.page/userproperties/propertynames/)() | Renvoie les noms des propriétés. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_1)(string, bool) | Définit la valeur de la propriété booléenne. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_5)(string, Color) | Définit la valeur de la propriété de couleur. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_2)(string, double) | Définit la valeur de la propriété double. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_4)(string, float) | Définit la valeur de la propriété float. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_3)(string, int) | Définit la valeur de la propriété entière. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty)(string, Margins) | Définit la valeur de la propriété des marges. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_6)(string, Rectangle) | Définit la valeur de la propriété rectangle. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_7)(string, Size) | Définit la valeur de la propriété de taille. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_8)(string, string) | Définit la valeur de la propriété de chaîne. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_9)(string, string[]) | Définit la valeur de la propriété du tableau de chaînes. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_1)(Dictionary&lt;string, object&gt;, string, bool) | Définit la valeur de propriété booléenne dans la table de propriétés spécifiée. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_5)(Dictionary&lt;string, object&gt;, string, Color) | Définit la valeur de la propriété de couleur dans la table de propriétés spécifiée. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_2)(Dictionary&lt;string, object&gt;, string, double) | Définit la valeur de propriété double dans la table de propriétés spécifiée. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_4)(Dictionary&lt;string, object&gt;, string, float) | Définit la valeur de la propriété flottante dans la table de propriétés spécifiée. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_3)(Dictionary&lt;string, object&gt;, string, int) | Définit la valeur de propriété entière dans la table de propriétés spécifiée. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty)(Dictionary&lt;string, object&gt;, string, Margins) | Définit la valeur de la propriété des marges dans la table de propriétés spécifiée. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_6)(Dictionary&lt;string, object&gt;, string, Rectangle) | Définit la valeur de la propriété rectangle dans la table de propriétés spécifiée. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_7)(Dictionary&lt;string, object&gt;, string, Size) | Définit la valeur de la propriété de taille dans la table de propriétés spécifiée. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_8)(Dictionary&lt;string, object&gt;, string, string[]) | Définit la valeur de la propriété du tableau de chaînes dans la table de propriétés spécifiée. |

### Voir également

* espace de noms [Aspose.Page](../../aspose.page/)
* Assemblée [Aspose.Page](../../)


