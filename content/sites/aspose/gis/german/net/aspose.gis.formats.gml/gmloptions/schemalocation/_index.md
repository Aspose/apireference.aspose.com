---
title: GmlOptions.SchemaLocation
second_title: Aspose.GIS für .NET-API-Referenz
description: GmlOptions eigendom. Durch Leerzeichen getrennte Liste von URIPaaren. Der erste URI in jedem Paar ist ein URI des Namensraums der zweite URI ist ein Pfad zum XMLSchema des Namensraums. Wenn festgelegt aufnull GmlDriver wird versuchen schemaLocation aus dem Stammelement des Dokuments zu lesen. Standard istnull .
type: docs
weight: 50
url: /de/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

Durch Leerzeichen getrennte Liste von URI-Paaren. Der erste URI in jedem Paar ist ein URI des Namensraums, der zweite URI ist ein Pfad zum XML-Schema des Namensraums. Wenn festgelegt auf`null` ,[`GmlDriver`](../../gmldriver/) wird versuchen, schemaLocation aus dem Stammelement des Dokuments zu lesen. Standard ist`null` .

```csharp
public string SchemaLocation { get; set; }
```

### Bemerkungen

Aspose.GIS verwendet das XML-Schema der GML-Datei zum Erstellen[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) Standardmäßig wird die Schemaposition aus dem Attribut schemaLocation extrahiert . Wenn ein solches Attribut nicht vorhanden ist oder auf einen ungültigen Speicherort verweist, kann Aspose.GIS die GML-Datei nicht lesen. Setzen Sie in diesem Fall diese Option, damit Aspose.GIS schema. laden kann.

### Beispiele

"http://site.com/namespace http://site.com/schema.xsd"

### Siehe auch

* class [GmlOptions](../)
* namensraum [Aspose.Gis.Formats.Gml](../../gmloptions/)
* Montage [Aspose.GIS](../../../)


