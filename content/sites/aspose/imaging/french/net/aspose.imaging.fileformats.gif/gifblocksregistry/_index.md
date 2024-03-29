---
title: GifBlocksRegistry
second_title: Référence de l'API Aspose.Imaging pour .NET
description: Représente le registre des ouvreurs de blocs gif.
type: docs
weight: 6690
url: /fr/net/aspose.imaging.fileformats.gif/gifblocksregistry/
---
## GifBlocksRegistry class

Représente le registre des ouvreurs de blocs gif.

```csharp
public static class GifBlocksRegistry
```

## Propriétés

| Nom | La description |
| --- | --- |
| static [RegisteredDescriptors](../../aspose.imaging.fileformats.gif/gifblocksregistry/registereddescriptors) { get; } | Obtient les descripteurs enregistrés. |

## Méthodes

| Nom | La description |
| --- | --- |
| static [GetFirstSupportedDescriptor](../../aspose.imaging.fileformats.gif/gifblocksregistry/getfirstsupporteddescriptor)(Stream) | Obtient le premier descripteur d'ouverture pris en charge. |
| static [GetFirstSupportedDescriptorByTypeName](../../aspose.imaging.fileformats.gif/gifblocksregistry/getfirstsupporteddescriptorbytypename)(string) | Obtient le premier descripteur pris en charge par son nom de type. |
| static [LoadBlockByFirstSupportedDescriptor](../../aspose.imaging.fileformats.gif/gifblocksregistry/loadblockbyfirstsupporteddescriptor)(Stream, IColorPalette) | Charge le bloc gif en utilisant le premier opener trouvé adapté au spécifié*stream* . |
| static [RegisterOpener](../../aspose.imaging.fileformats.gif/gifblocksregistry/registeropener)(IGifBlockLoaderDescriptor) | Enregistre l'ouvre-porte. |
| static [UnregisterOpener](../../aspose.imaging.fileformats.gif/gifblocksregistry/unregisteropener)(IGifBlockLoaderDescriptor) | Désenregistre l'ouvreur. |

### Voir également

* espace de noms [Aspose.Imaging.FileFormats.Gif](../../aspose.imaging.fileformats.gif)
* Assemblée [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
