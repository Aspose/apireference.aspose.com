---
title: Layer.IsVisible
second_title: Aspose.PSD für .NET-API-Referenz
description: Layer eigendom. Ruft einen Wert ab oder legt einen Wert fest der angibt ob die Ebene sichtbar ist
type: docs
weight: 170
url: /de/net/aspose.psd.fileformats.psd.layers/layer/isvisible/
---
## Layer.IsVisible property

Ruft einen Wert ab oder legt einen Wert fest, der angibt, ob die Ebene sichtbar ist

```csharp
public bool IsVisible { get; set; }
```

### Eigentumswert

`WAHR` wenn diese Instanz sichtbar ist; ansonsten,`FALSCH` .

### Beispiele

Das folgende Beispiel zeigt, wie Sie die LayerGroup-Sichtbarkeit in Aspose.PSD ändern können

```csharp
[C#]

string sourceFilePath = "input.psd";
string outputFilePath = "output.psd";

// Änderungen an den Ebenennamen vornehmen und speichern
using (var image = (PsdImage)Image.Load(sourceFilePath))
{
    for (int i = 0; i < image.Layers.Length; i++)
    {
        var layer = image.Layers[i];

        // Alles innerhalb einer Gruppe ausschalten
        if (layer is LayerGroup)
        {
            layer.IsVisible = false;
        }
    }

    image.Save(outputFilePath);
}
```

### Siehe auch

* class [Layer](../)
* namensraum [Aspose.PSD.FileFormats.Psd.Layers](../../layer/)
* Montage [Aspose.PSD](../../../)


