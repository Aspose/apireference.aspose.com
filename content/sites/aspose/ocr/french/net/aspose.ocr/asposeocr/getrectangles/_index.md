---
title: AsposeOcr.GetRectangles
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Détecte les zones de texte sur limage.  La correction automatique de linclinaison de limage nest pas appliquée. Prend en charge GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 70
url: /fr/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

Détecte les zones de texte sur l'image.  La correction automatique de l'inclinaison de l'image n'est pas appliquée. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin vers l'image. |
| areasType | AreasType | Détermine les rectangles à retourner - ligne ou paragraphes. |
| detectAreas | Boolean | Activer la détection automatique des zones de texte. |

### Return_Value

Liste des zones de texte ou des lignes détectées.

### Voir également

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

Détecte les zones de texte sur l'image.  La correction automatique de l'inclinaison de l'image n'est pas appliquée. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| image | MemoryStream | Flux mémoire contenant l'image. |
| areasType | AreasType | Détermine les rectangles à retourner - ligne ou paragraphes. |
| detectAreas | Boolean | Activer la détection automatique des zones de texte. |

### Return_Value

Liste des zones de texte ou des lignes détectées.

### Voir également

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


