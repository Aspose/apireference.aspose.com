---
title: FileGdbOptions.ObjectIdFieldName
second_title: Aspose.GIS für .NET-API-Referenz
description: FileGdbOptions eigendom. Name des ObjektIDFelds.
type: docs
weight: 60
url: /de/net/aspose.gis.formats.filegdb/filegdboptions/objectidfieldname/
---
## FileGdbOptions.ObjectIdFieldName property

Name des Objekt-ID-Felds.

```csharp
public string ObjectIdFieldName { get; set; }
```

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Wert ist kein gültiger Feldname. Ein gültiger Feldname muss:  Sei nicht`null` und nicht leerBeginnen Sie mit einem lateinischen Buchstaben oder UnterstrichNur lateinische Buchstaben, Ziffern oder Unterstriche enthalten |

### Bemerkungen

Dies ist eine Erstellungsoption und wirkt sich nicht auf das Lesen aus. Definiert den Namen des Objekt-ID-Felds (Spalte). Standardmäßig „OBJECTID“. Wenn ein Attribut in[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) hat name gleich dem Wert dieser Eigenschaft, dann wird dieses Attribut umbenannt.

### Siehe auch

* class [FileGdbOptions](../)
* namensraum [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* Montage [Aspose.GIS](../../../)


