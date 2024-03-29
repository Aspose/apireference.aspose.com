---
title: Compress
second_title: Référence de l'API Aspose.Imaging pour .NET
description: Obtient ou définit une valeur indiquant si cetteICompressedOptions est compressé.
type: docs
weight: 40
url: /fr/net/aspose.imaging.imageoptions/svgoptions/compress/
---
## SvgOptions.Compress property

Obtient ou définit une valeur indiquant si cetteICompressedOptions est compressé.

```csharp
public bool Compress { get; set; }
```

### Valeur de la propriété

`vrai` si compressé ; Par ailleurs,`faux` .

### Exemples

L'exemple suivant montre comment convertir une image svg en svgz fromat

```csharp
[C#]

string file = "juanmontoya_lingerie.svg";
string baseFolder = System.IO.Path.Combine("D:", "Compressed");
string inputFile = System.IO.Path.Combine(baseFolder, file);
string outFile = inputFile + ".svgz";
using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(inputFile))
{
    Aspose.Imaging.ImageOptions.VectorRasterizationOptions vectorRasterizationOptions = new Aspose.Imaging.ImageOptions.SvgRasterizationOptions() { PageSize = image.Size};
    image.Save(outFile, new Aspose.Imaging.ImageOptions.SvgOptions() {VectorRasterizationOptions = vectorRasterizationOptions, Compress = true});
}
```

### Voir également

* class [SvgOptions](../../svgoptions)
* espace de noms [Aspose.Imaging.ImageOptions](../../svgoptions)
* Assemblée [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
