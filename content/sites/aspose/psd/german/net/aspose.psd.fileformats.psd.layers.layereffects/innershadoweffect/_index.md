---
title: Class InnerShadowEffect
second_title: Aspose.PSD für .NET-API-Referenz
description: Aspose.PSD.FileFormats.Psd.Layers.LayerEffects.InnerShadowEffect klas. Effekt der inneren Schattenebene
type: docs
weight: 2160
url: /de/net/aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/
---
## InnerShadowEffect class

Effekt der inneren Schattenebene

```csharp
public class InnerShadowEffect : IShadowEffect
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Angle](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/angle/) { get; set; } | Ruft den Winkel in Grad ab oder legt ihn fest. |
| [BlendMode](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/blendmode/) { get; set; } | Ruft den Mischmodus ab oder legt ihn fest. |
| [Color](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/color/) { get; set; } | Ruft die Farbe ab oder legt sie fest. |
| [Distance](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/distance/) { get; set; } | Holt oder setzt den Abstand in Pixel. |
| [EffectType](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/effecttype/) { get; } | Ruft eine Art Effekt ab |
| [IsVisible](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/isvisible/) { get; set; } | Ruft einen Wert ab oder legt einen Wert fest, der angibt, ob diese Instanz sichtbar ist. |
| [Noise](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/noise/) { get; set; } | Ruft das Rauschen ab oder legt es fest. |
| [Opacity](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/opacity/) { get; set; } | Ruft die Deckkraft ab oder legt sie fest. |
| [Size](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/size/) { get; set; } | Ruft den Unschärfewert in Pixel ab oder legt ihn fest. |
| [Spread](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/spread/) { get; set; } | Holt oder setzt den Spread (Choke) als Prozentsatz. |
| [UseGlobalLight](../../aspose.psd.fileformats.psd.layers.layereffects/innershadoweffect/usegloballight/) { get; set; } | Ruft einen Wert ab oder legt einen Wert fest, der angibt, ob [diesen Winkel in allen Ebeneneffekten verwenden]. |

### Beispiele

Der folgende Code zeigt, wie die Einstellungen des Effekts „Innere Schattenebene“ geändert werden.

```csharp
[C#]

string sourceFile = "example.psd";
string outputFile = "sample_out.psd";

// Ein vorhandenes Bild in eine Instanz der PsdImage-Klasse laden
var loadOptions = new PsdLoadOptions();
loadOptions.LoadEffectsResource = true;
using (var image = (PsdImage)Image.Load(sourceFile, loadOptions))
{
    var layer = image.Layers[image.Layers.Length - 1];
    var shadowEffect = (IShadowEffect)layer.BlendingOptions.Effects[0];

    shadowEffect.Color = Color.Green;
    shadowEffect.Opacity = 128;
    shadowEffect.Distance = 1;
    shadowEffect.UseGlobalLight = false;
    shadowEffect.Size = 2;
    shadowEffect.Angle = 45;
    shadowEffect.Spread = 50;
    shadowEffect.Noise = 5;

    image.Save(outputFile, new PsdOptions(image));
}
```

### Siehe auch

* interface [IShadowEffect](../ishadoweffect/)
* namensraum [Aspose.PSD.FileFormats.Psd.Layers.LayerEffects](../../aspose.psd.fileformats.psd.layers.layereffects/)
* Montage [Aspose.PSD](../../)


