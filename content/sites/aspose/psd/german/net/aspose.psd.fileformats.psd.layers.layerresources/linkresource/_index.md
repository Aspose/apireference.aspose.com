---
title: Class LinkResource
second_title: Aspose.PSD für .NET-API-Referenz
description: Aspose.PSD.FileFormats.Psd.Layers.LayerResources.LinkResource klas. Definiert die LinkResourceKlasse die Informationen über verknüpfte oder eingebettete Dateien im Bild im PSDFormat enthält. Die LinkRessource kann mehrere enthaltenLinkDataSource Instanzen auf die von Indexern in jeder abgeleiteten Klasse zugegriffen werden kann.
type: docs
weight: 2710
url: /de/net/aspose.psd.fileformats.psd.layers.layerresources/linkresource/
---
## LinkResource class

Definiert die LinkResource-Klasse, die Informationen über verknüpfte oder eingebettete Dateien im Bild im PSD-Format enthält. Die Link-Ressource kann mehrere enthalten[`LinkDataSource`](../linkdatasource/) Instanzen, auf die von Indexern in jeder abgeleiteten Klasse zugegriffen werden kann.

```csharp
public abstract class LinkResource : LayerResource
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [DataSourceCount](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/datasourcecount/) { get; } | Ruft die Anzahl der Link-Datenquellen ab, auf die der Indexer zugreifen kann. |
| [IsEmpty](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/isempty/) { get; } | Ruft einen Wert ab, der angibt, ob diese Link-Ressourceninstanz leer ist. |
| [Item](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/item/) { get; } | Ruft die ab[`LinkDataSource`](../linkdatasource/) am angegebenen Index, der die eindeutige Kennung der Linkdatenquelle ist.. |
| abstract [Key](../../aspose.psd.fileformats.psd.layers/layerresource/key/) { get; } | Ruft den Layer-Ressourcenschlüssel ab. |
| override [Length](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/length/) { get; } | Ruft die globale PSD-Link-Ressourcenlänge in Byte ab. |
| override [PsdVersion](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/psdversion/) { get; } | Ruft die Version im PSD-Format ab. |
| override [Signature](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/signature/) { get; } | Ruft die Signatur der globalen PSD-Link-Ressource ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| override [Save](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/save/)(StreamContainer, int) | Speichert die Ressourcenblockdaten. |
| override [ToString](../../aspose.psd.fileformats.psd.layers/layerresource/tostring/)() | Gibt a zurückString die diese Instanz darstellt. |

### Siehe auch

* class [LayerResource](../../aspose.psd.fileformats.psd.layers/layerresource/)
* namensraum [Aspose.PSD.FileFormats.Psd.Layers.LayerResources](../../aspose.psd.fileformats.psd.layers.layerresources/)
* Montage [Aspose.PSD](../../)


