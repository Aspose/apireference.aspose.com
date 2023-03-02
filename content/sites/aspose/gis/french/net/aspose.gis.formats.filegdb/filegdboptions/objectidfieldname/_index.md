---
title: FileGdbOptions.ObjectIdFieldName
second_title: Référence de l'API Aspose.GIS pour .NET
description: FileGdbOptions propriété. Nom du champ ID de lobjet.
type: docs
weight: 60
url: /fr/net/aspose.gis.formats.filegdb/filegdboptions/objectidfieldname/
---
## FileGdbOptions.ObjectIdFieldName property

Nom du champ ID de l'objet.

```csharp
public string ObjectIdFieldName { get; set; }
```

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | La valeur n'est pas un nom de champ valide. Un nom de champ valide doit :  Pas être`null` et non videCommencer par une lettre latine ou un trait de soulignementNe contenir que des lettres latines, des chiffres ou des traits de soulignement |

### Remarques

Il s'agit d'une option de création et cela n'affecte pas la lecture. Définit le nom du champ d'ID d'objet (colonne). Par défaut, "OBJECTID". Si un attribut dans[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) a un nom égal à la valeur de cette propriété, alors cet attribut est renommé.

### Voir également

* class [FileGdbOptions](../)
* espace de noms [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* Assemblée [Aspose.GIS](../../../)


