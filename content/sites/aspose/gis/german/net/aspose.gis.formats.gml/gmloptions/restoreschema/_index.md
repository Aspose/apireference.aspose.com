---
title: GmlOptions.RestoreSchema
second_title: Aspose.GIS für .NET-API-Referenz
description: GmlOptions eigendom. Legt fest ob Aspose.GIS Attribute in einer GmlDatei parsen darf in der ein XMLSchema fehlt oder nicht geladen werden kann. Wenn gesetzt auftrue  Aspose.GIS Reader erfordert nicht das Vorhandensein eines XMLSchemas. Standard istfalse .
type: docs
weight: 40
url: /de/net/aspose.gis.formats.gml/gmloptions/restoreschema/
---
## GmlOptions.RestoreSchema property

Legt fest, ob Aspose.GIS Attribute in einer Gml-Datei parsen darf, in der ein XML-Schema fehlt oder nicht geladen werden kann. Wenn gesetzt auf`true` , Aspose.GIS Reader erfordert nicht das Vorhandensein eines XML-Schemas. Standard ist`false` .

```csharp
public bool RestoreSchema { get; set; }
```

### Bemerkungen

Der Treiber versucht, die Feature-Classes und ihre zugehörigen Eigenschaften automatisch zu parsen, indem er die Datei scannt und nach „bekannten“ Objekten sucht, um die Organisation zu bestimmen. Obwohl dieser Ansatz fehleranfällig ist, hat er den Vorteil, dass er für GML-Dateien sogar funktioniert, falls die zugehörigen Das XML-Schema ist verloren gegangen oder kann nicht aus dem Internet geladen werden.

### Siehe auch

* class [GmlOptions](../)
* namensraum [Aspose.Gis.Formats.Gml](../../gmloptions/)
* Montage [Aspose.GIS](../../../)


