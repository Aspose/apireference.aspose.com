---
title: GmlOptions.RestoreSchema
second_title: Riferimento API Aspose.GIS per .NET
description: GmlOptions proprietà. Determina se Aspose.GIS può analizzare gli attributi in un file Gml in cui manca uno schema XML o non può essere caricato. Se impostato sutrue  Aspose.GIS reader non richiede la presenza di uno schema XML. Il valore predefinito èfalse .
type: docs
weight: 40
url: /it/net/aspose.gis.formats.gml/gmloptions/restoreschema/
---
## GmlOptions.RestoreSchema property

Determina se Aspose.GIS può analizzare gli attributi in un file Gml in cui manca uno schema XML o non può essere caricato. Se impostato su`true` , Aspose.GIS reader non richiede la presenza di uno schema XML. Il valore predefinito è`false` .

```csharp
public bool RestoreSchema { get; set; }
```

### Osservazioni

Il driver tenta di analizzare automaticamente le feature class e le proprietà associate scansionando il file e cercando oggetti "conosciuti" per determinare l'organizzazione. Sebbene questo approccio sia soggetto a errori, ha il vantaggio di funzionare per i file GML anche se l'associato Lo schema XML è stato perso o non può essere caricato da Internet.

### Guarda anche

* class [GmlOptions](../)
* spazio dei nomi [Aspose.Gis.Formats.Gml](../../gmloptions/)
* assemblea [Aspose.GIS](../../../)


