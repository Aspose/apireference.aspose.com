---
title: FilterEffectMaskData.FilterEffectMaskData
second_title: Aspose.PSD für .NET-API-Referenz
description: FilterEffectMaskData constructeur. Initialisiert eine neue Instanz vonFilterEffectMaskData Klasse.
type: docs
weight: 10
url: /de/net/aspose.psd.fileformats.psd.layers.layerresources/filtereffectmaskdata/filtereffectmaskdata/
---
## FilterEffectMaskData constructor

Initialisiert eine neue Instanz von[`FilterEffectMaskData`](../) Klasse.

```csharp
public FilterEffectMaskData(string guid, Rectangle rectangle, int pixelsDepth, int maxChannels, 
    ChannelInformation[] channels, ChannelInformation userMask, Rectangle maskRectangle, 
    ChannelInformation sheetMask)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| guid | String | Der Ressourcenführer. |
| rectangle | Rectangle | Das Rechteck der Kanäle. |
| pixelsDepth | Int32 | Die Pixeltiefe. |
| maxChannels | Int32 | Der maximale Kanalwert. |
| channels | ChannelInformation[] | Die Kanäle. |
| userMask | ChannelInformation | Die Benutzermaske. |
| maskRectangle | Rectangle | Das Blattmaskenrechteck. |
| sheetMask | ChannelInformation | Die Tuchmaske. |

### Beispiele

Dieses Beispiel zeigt, wie Eigenschaften der FXidResource-Ressource abgerufen und festgelegt werden.

```csharp
[C#]

string inputFilePath = "psdnet414_3.psd";
string output = "out_psdnet414_3.psd";

int resLength = 1144;
int maskLength = 369;

void AssertAreEqual(object expected, object actual, string message = null)
{
    if (!object.Equals(expected, actual))
    {
        throw new FormatException(message ?? "Objects are not equal.");
    }
}

using (var psdImage = (PsdImage)Image.Load(inputFilePath))
{
    FXidResource fXidResource = (FXidResource)psdImage.GlobalLayerResources[3];

    AssertAreEqual(resLength, fXidResource.Length);
    foreach (var maskData in fXidResource.FilterEffectMasks)
    {
        AssertAreEqual(maskLength, maskData.Length);
    }

    psdImage.Save(output);
}

// Nach dem Speichern prüfen
using (var psdImage = (PsdImage)Image.Load(output))
{
    FXidResource fXidResource = (FXidResource)psdImage.GlobalLayerResources[3];

    AssertAreEqual(resLength, fXidResource.Length);
    foreach (var maskData in fXidResource.FilterEffectMasks)
    {
        AssertAreEqual(maskLength, maskData.Length);
    }
}
```

### Siehe auch

* struct [Rectangle](../../../aspose.psd/rectangle/)
* class [ChannelInformation](../../../aspose.psd.fileformats.psd.layers/channelinformation/)
* class [FilterEffectMaskData](../)
* namensraum [Aspose.PSD.FileFormats.Psd.Layers.LayerResources](../../filtereffectmaskdata/)
* Montage [Aspose.PSD](../../../)


