---
title: VectorMapLayer.ImportSldFromString
second_title: Référence de l'API Aspose.GIS pour .NET
description: VectorMapLayer méthode. Importe le style à partir de la chaîne de descripteur de calque stylisé spécifiée.
type: docs
weight: 70
url: /fr/net/aspose.gis.rendering/vectormaplayer/importsldfromstring/
---
## VectorMapLayer.ImportSldFromString method

Importe le style à partir de la chaîne de descripteur de calque stylisé spécifiée.

```csharp
public void ImportSldFromString(string sld, SldImportOptions options = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| sld | String | Descripteur de calque stylisé. |
| options | SldImportOptions | Options d'importation. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| XmlException | Une erreur s'est produite lors de l'analyse du XML. |
| FormatException | Aucun style SLD n'a été trouvé dans le XML. |

### Remarques

Cette méthode écrase la valeur du[`Symbolizer`](../symbolizer/) propriété.

### Voir également

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* espace de noms [Aspose.Gis.Rendering](../../vectormaplayer/)
* Assemblée [Aspose.GIS](../../../)


