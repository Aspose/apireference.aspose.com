---
title: GmlOptions.SchemaLocation
second_title: Riferimento API Aspose.GIS per .NET
description: GmlOptions proprietà. Elenco separato da spazi di coppie di URI. Il primo URI in ogni coppia è un URI dello spazio dei nomi il secondo URI è un percorso dello schema XML dello spazio dei nomi. Se impostato sunull GmlDriver proverà a leggere schemaLocation dallelemento radice del documento. Limpostazione predefinita ènull .
type: docs
weight: 50
url: /it/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

Elenco separato da spazi di coppie di URI. Il primo URI in ogni coppia è un URI dello spazio dei nomi, il secondo URI è un percorso dello schema XML dello spazio dei nomi. Se impostato su`null` ,[`GmlDriver`](../../gmldriver/) proverà a leggere schemaLocation dall'elemento radice del documento. L'impostazione predefinita è`null` .

```csharp
public string SchemaLocation { get; set; }
```

### Osservazioni

Aspose.GIS utilizza lo schema XML del file GML per creare[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) Per impostazione predefinita, la posizione dello schema viene estratta dall'attributo schemaLocation. Se non esiste tale attributo o punta a una posizione non valida, Aspose.GIS non riuscirà a leggere il file GML. In questo caso, imposta questa opzione, in modo che Aspose.GIS possa caricare lo schema.

### Esempi

"http://site.com/spazio dei nomi http://site.com/schema.xsd"

### Guarda anche

* class [GmlOptions](../)
* spazio dei nomi [Aspose.Gis.Formats.Gml](../../gmloptions/)
* assemblea [Aspose.GIS](../../../)


