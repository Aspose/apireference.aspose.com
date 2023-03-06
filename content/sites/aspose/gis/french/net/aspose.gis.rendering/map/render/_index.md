---
title: Map.Render
second_title: Référence de l'API Aspose.GIS pour .NET
description: Map méthode. Rend la carte dans un fichier.
type: docs
weight: 140
url: /fr/net/aspose.gis.rendering/map/render/
---
## Render(string, Renderer) {#render_1}

Rend la carte dans un fichier.

```csharp
public void Render(string outputPath, Renderer renderer)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| outputPath | String | Chemin d'accès au fichier de sortie. |
| renderer | Renderer | Moteur de rendu à utiliser. |

### Voir également

* class [Renderer](../../renderer/)
* class [Map](../)
* espace de noms [Aspose.Gis.Rendering](../../map/)
* Assemblée [Aspose.GIS](../../../)

---

## Render(AbstractPath, Renderer) {#render}

Rend la carte dans un fichier.

```csharp
public void Render(AbstractPath outputPath, Renderer renderer)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| outputPath | AbstractPath | Chemin d'accès au fichier de sortie. |
| renderer | Renderer | Moteur de rendu à utiliser. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | N'importe quel argument`null`. |
| IOException | Une erreur d'E/S s'est produite. |
| [GisException](../../../aspose.gis/gisexception/) | Une erreur lors du traitement ou de la lecture des données SIG. |

### Voir également

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [Renderer](../../renderer/)
* class [Map](../)
* espace de noms [Aspose.Gis.Rendering](../../map/)
* Assemblée [Aspose.GIS](../../../)


