---
title: Class BritResource
second_title: Aspose.PSD per riferimento API .NET
description: Aspose.PSD.FileFormats.Psd.Layers.LayerResources.BritResource classe. Classe BritResource. Risorsa di livello di regolazione luminosità/contrasto
type: docs
weight: 2340
url: /it/net/aspose.psd.fileformats.psd.layers.layerresources/britresource/
---
## BritResource class

Classe BritResource. Risorsa di livello di regolazione luminosità/contrasto

```csharp
public class BritResource : AdjustmentLayerResource
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [BritResource](britresource/#constructor)() | Inizializza una nuova istanza di`BritResource` classe. |
| [BritResource](britresource/#constructor_1)(byte[]) | Inizializza una nuova istanza di`BritResource`class. La specifica del formato PSD contiene la seguente descrizione: 2 Luminosità 2 Contrasto 2 Valore medio per luminosità e contrasto 1 Solo colore Lab Non è utilizzato nel PSD moderno (CS5 e versioni successive) dove CgEd è. CgEd memorizza le informazioni properties |
| [BritResource](britresource/#constructor_2)(short, short, short, bool) | Inizializza una nuova istanza di`BritResource` classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Brightness](../../aspose.psd.fileformats.psd.layers.layerresources/britresource/brightness/) { get; set; } | Ottiene o imposta la luminosità. |
| [Contrast](../../aspose.psd.fileformats.psd.layers.layerresources/britresource/contrast/) { get; set; } | Ottiene o imposta il contrasto. |
| override [Key](../../aspose.psd.fileformats.psd.layers.layerresources/britresource/key/) { get; } | Ottiene la chiave della risorsa del livello. |
| [LabColor](../../aspose.psd.fileformats.psd.layers.layerresources/britresource/labcolor/) { get; set; } | Ottiene o imposta un valore che indica se [lab color]. |
| override [Length](../../aspose.psd.fileformats.psd.layers.layerresources/britresource/length/) { get; } | Ottiene la lunghezza della risorsa del livello in byte. |
| [MeanValueForBrightnessAndContrast](../../aspose.psd.fileformats.psd.layers.layerresources/britresource/meanvalueforbrightnessandcontrast/) { get; set; } | Ottiene o imposta il valore medio per luminosità e contrasto. |
| override [PsdVersion](../../aspose.psd.fileformats.psd.layers.layerresources/britresource/psdversion/) { get; } | Ottiene la versione psd. |
| override [Signature](../../aspose.psd.fileformats.psd.layers.layerresources/adjustmentlayerresource/signature/) { get; } | Ottiene la firma. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| override [Save](../../aspose.psd.fileformats.psd.layers.layerresources/adjustmentlayerresource/save/)(StreamContainer, int) | Salva la risorsa nel contenitore del flusso specificato. |
| override [ToString](../../aspose.psd.fileformats.psd.layers/layerresource/tostring/)() | Restituisce aString che rappresenta questa istanza. |

## Campi

| Nome | Descrizione |
| --- | --- |
| const [TypeToolKey](../../aspose.psd.fileformats.psd.layers.layerresources/britresource/typetoolkey/) | Il tasto informazioni dello strumento testo. |

### Guarda anche

* class [AdjustmentLayerResource](../adjustmentlayerresource/)
* class [LayerResource](../../aspose.psd.fileformats.psd.layers/layerresource/)
* spazio dei nomi [Aspose.PSD.FileFormats.Psd.Layers.LayerResources](../../aspose.psd.fileformats.psd.layers.layerresources/)
* assemblea [Aspose.PSD](../../)


