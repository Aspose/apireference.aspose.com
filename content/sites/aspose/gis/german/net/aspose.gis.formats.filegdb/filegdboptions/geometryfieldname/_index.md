---
title: FileGdbOptions.GeometryFieldName
second_title: Aspose.GIS für .NET-API-Referenz
description: FileGdbOptions eigendom. Name des Geometriefeldes.
type: docs
weight: 40
url: /de/net/aspose.gis.formats.filegdb/filegdboptions/geometryfieldname/
---
## FileGdbOptions.GeometryFieldName property

Name des Geometriefeldes.

```csharp
public string GeometryFieldName { get; set; }
```

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Wert ist kein gültiger Feldname. Ein gültiger Feldname muss:  Sei nicht`null` und nicht leerBeginnen Sie mit einem lateinischen Buchstaben oder UnterstrichNur lateinische Buchstaben, Ziffern oder Unterstriche enthalten |

### Bemerkungen

Dies ist eine Erstellungsoption und wirkt sich nicht auf das Lesen aus. Definiert den Namen des Geometriefelds (Spalte). Standardmäßig „SHAPE“. Wenn ein Attribut vorhanden ist[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) hat name gleich dem Wert dieser Eigenschaft, dann wird dieses Attribut umbenannt.

### Siehe auch

* class [FileGdbOptions](../)
* namensraum [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* Montage [Aspose.GIS](../../../)


