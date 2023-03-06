---
title: GmlOptions.LoadSchemasFromInternet
second_title: Référence de l'API Aspose.GIS pour .NET
description: GmlOptions propriété. Détermine si Aspose.GIS est autorisé à charger le schéma XML à partir dInternet. Si défini surfalse les schémas avec des URI absolus qui ne commencent pas par file// ne seraient pas chargés. La valeur par défaut estfalse .
type: docs
weight: 20
url: /fr/net/aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/
---
## GmlOptions.LoadSchemasFromInternet property

Détermine si Aspose.GIS est autorisé à charger le schéma XML à partir d'Internet. Si défini sur`false` les schémas avec des URI absolus qui ne commencent pas par 'file://' ne seraient pas chargés. La valeur par défaut est`false` .

```csharp
public bool LoadSchemasFromInternet { get; set; }
```

### Remarques

Aspose.GIS utilise le schéma XML du fichier GML afin de créer[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) . Les fichiers de schéma XML peuvent être distribués avec les fichiers GML ou peuvent être situés sur Internet. Dans le premier cas, vous devez définir cette option sur`true` pour permettre à Aspose.GIS de charger le schéma XML.

### Voir également

* class [GmlOptions](../)
* espace de noms [Aspose.Gis.Formats.Gml](../../gmloptions/)
* Assemblée [Aspose.GIS](../../../)


