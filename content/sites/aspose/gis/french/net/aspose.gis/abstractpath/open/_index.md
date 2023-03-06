---
title: AbstractPath.Open
second_title: Référence de l'API Aspose.GIS pour .NET
description: AbstractPath méthode. Ouvre ceciRésuméCheminsous forme de fichier.
type: docs
weight: 120
url: /fr/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

Ouvre ceci`RésuméChemin`sous forme de fichier.

```csharp
public abstract Stream Open(FileAccess access)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| access | FileAccess | Spécifie un sous-ensemble d'opérations pouvant être effectuées sur unStream. |

### Return_Value

UNStream ouvert avec le spécifiéFileAccess .

### Remarques

Si*access* a le drapeauWrite défini et que le fichier n'existe pas, un héritier doit le créer. Un`RésuméChemin` peut être ouvert plusieurs fois par`Aspose.GIS` . Ceci est nécessaire pour lire un file indépendamment avec plusieurs flux. Vous ne devez pas mettre en cache le résultat mais plutôt renvoyer newStream chaque fois cette méthode est appelée.

### Voir également

* class [AbstractPath](../)
* espace de noms [Aspose.Gis](../../abstractpath/)
* Assemblée [Aspose.GIS](../../../)


