---
title: Class VectorMapLayer
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Rendering.VectorMapLayer classe. Uno strato allinternoMap che rappresenta i dati di un layer vettoriale.
type: docs
weight: 2000
url: /it/net/aspose.gis.rendering/vectormaplayer/
---
## VectorMapLayer class

Uno strato all'interno[`Map`](../map/) che rappresenta i dati di un layer vettoriale.

```csharp
public class VectorMapLayer : MapLayer
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [VectorMapLayer](vectormaplayer/#constructor)(FeaturesSequence) | Crea una nuova istanza con simbolo predefinito. |
| [VectorMapLayer](vectormaplayer/#constructor_1)(FeaturesSequence, VectorSymbolizer) | Crea una nuova istanza con simbolo predefinito. |
| [VectorMapLayer](vectormaplayer/#constructor_5)(VectorLayer, bool) | Crea una nuova istanza con simbolo predefinito. |
| [VectorMapLayer](vectormaplayer/#constructor_2)(FeaturesSequence, VectorSymbolizer, Labeling) | Crea una nuova istanza con simbolo predefinito. |
| [VectorMapLayer](vectormaplayer/#constructor_4)(VectorLayer, VectorSymbolizer, bool) | Crea una nuova istanza. |
| [VectorMapLayer](vectormaplayer/#constructor_3)(VectorLayer, VectorSymbolizer, Labeling, bool) | Crea una nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [FeaturesSequence](../../aspose.gis.rendering/vectormaplayer/featuressequence/) { get; } | La sequenza delle caratteristiche rappresentata da this`VectorMapLayer` . |
| [Labeling](../../aspose.gis.rendering/vectormaplayer/labeling/) { get; set; } | Specifica le opzioni di alterazione del livello della mappa. |
| [Opacity](../../aspose.gis.rendering/maplayer/opacity/) { get; set; } | Opacità del livello. |
| [Symbolizer](../../aspose.gis.rendering/vectormaplayer/symbolizer/) { get; set; } | Simbolizzatore da utilizzare per il rendering delle caratteristiche del layer. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| override [Dispose](../../aspose.gis.rendering/vectormaplayer/dispose/)() | Smaltisce le risorse. |
| [ImportSld](../../aspose.gis.rendering/vectormaplayer/importsld/#importsld)(AbstractPath, SldImportOptions) | Importa lo stile dal file Styled Layer Descriptor situato nel percorso specificato. |
| [ImportSld](../../aspose.gis.rendering/vectormaplayer/importsld/#importsld_1)(string, SldImportOptions) | Importa lo stile dal file Styled Layer Descriptor situato nel percorso specificato. |
| [ImportSldFromString](../../aspose.gis.rendering/vectormaplayer/importsldfromstring/)(string, SldImportOptions) | Importa lo stile dalla stringa del descrittore di livello con stile specificato. |

### Guarda anche

* class [MapLayer](../maplayer/)
* spazio dei nomi [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* assemblea [Aspose.GIS](../../)


