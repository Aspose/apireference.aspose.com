---
title: TopoJsonOptions.DefaultObjectName
second_title: Référence de l'API Aspose.GIS pour .NET
description: TopoJsonOptions propriété. Nom de lobjet où les fonctionnalités sont mises par défaut.
type: docs
weight: 20
url: /fr/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

Nom de l'objet où les fonctionnalités sont mises par défaut.

```csharp
public string DefaultObjectName { get; set; }
```

### Remarques

Ceci est une option d'écriture - cela n'affecte pas la lecture. TopoJSON peut contenir n'importe quel nombre d'objets nommés. Chaque objet de ce type peut contenir plusieurs fonctionnalités. Afin de préciser dans quel objet mettre votre feature, use [`ObjectNameAttribute`](../objectnameattribute/) propriété. Si attribut avec nom[`ObjectNameAttribute`](../objectnameattribute/) est`null`ou unset for some feature, cette fonctionnalité est ajoutée à l'objet avec le nom`DefaultObjectName` . Si attribut avec nom[`ObjectNameAttribute`](../objectnameattribute/) n'est pas présent dans[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) collection, toutes les fonctionnalités sont placées dans un objet avec le nom[`ObjectNameAttribute`](../objectnameattribute/) . La valeur par défaut est "sans nom".

### Voir également

* class [TopoJsonOptions](../)
* espace de noms [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* Assemblée [Aspose.GIS](../../../)


