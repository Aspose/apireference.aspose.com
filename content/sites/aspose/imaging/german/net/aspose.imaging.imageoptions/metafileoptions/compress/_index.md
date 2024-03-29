---
title: Compress
second_title: Aspose.Imaging für .NET-API-Referenz
description: Ruft einen Wert ab oder legt einen Wert fest der angibt ob dies der Fall istICompressedOptions wird komprimiert.
type: docs
weight: 20
url: /de/net/aspose.imaging.imageoptions/metafileoptions/compress/
---
## MetafileOptions.Compress property

Ruft einen Wert ab oder legt einen Wert fest, der angibt, ob dies der Fall istICompressedOptions wird komprimiert.

```csharp
public bool Compress { get; set; }
```

### Eigentumswert

`Stimmt` wenn komprimiert; Andernfalls,`FALSCH` .

### Beispiele

Das folgende Beispiel zeigt, wie Sie ein EMF-Bild in ein EMZ-Format konvertieren

```csharp
[C#]

string file = "input.emf";
string baseFolder = System.IO.Path.Combine("D:", "Compressed");
string inputFile = System.IO.Path.Combine(baseFolder, file);
string outFile = inputFile + ".emz";
using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(inputFile))
{
    Aspose.Imaging.ImageOptions.VectorRasterizationOptions vectorRasterizationOptions = new Aspose.Imaging.ImageOptions.EmfRasterizationOptions() { PageSize = image.Size};
    image.Save(outFile, new Aspose.Imaging.ImageOptions.EmfOptions() {VectorRasterizationOptions = vectorRasterizationOptions, Compress = true});
}
```

Das folgende Beispiel zeigt, wie Sie ein WMF-Bild in ein WMF-Format konvertieren

```csharp
[C#]

string file = "castle.wmf";
string baseFolder = System.IO.Path.Combine("D:", "Compressed");
string inputFile = System.IO.Path.Combine(baseFolder, file);
string outFile = inputFile + ".wmz";
using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(inputFile))
{
    Aspose.Imaging.ImageOptions.VectorRasterizationOptions vectorRasterizationOptions = new Aspose.Imaging.ImageOptions.WmfRasterizationOptions() { PageSize = image.Size};
    image.Save(outFile, new Aspose.Imaging.ImageOptions.WmfOptions() {VectorRasterizationOptions = vectorRasterizationOptions, Compress = true});
}
```

### Siehe auch

* class [MetafileOptions](../../metafileoptions)
* namensraum [Aspose.Imaging.ImageOptions](../../metafileoptions)
* Montage [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
