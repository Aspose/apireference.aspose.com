---
title: FileGdbOptions.GeometryFieldName
second_title: Riferimento API Aspose.GIS per .NET
description: FileGdbOptions proprietà. Nome del campo della geometria.
type: docs
weight: 40
url: /it/net/aspose.gis.formats.filegdb/filegdboptions/geometryfieldname/
---
## FileGdbOptions.GeometryFieldName property

Nome del campo della geometria.

```csharp
public string GeometryFieldName { get; set; }
```

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentException | Il valore non è un nome di campo valido. Un nome di campo valido deve:  Non essere`null` e non vuotoInizia con una lettera latina o un trattino bassoContengono solo lettere latine, cifre o caratteri di sottolineatura |

### Osservazioni

Questa è un'opzione di creazione e non influisce sulla lettura. Definisce il nome del campo della geometria (colonna). Il valore predefinito è "SHAPE". Se qualsiasi attributo in[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) ha nome uguale al valore di questa proprietà, quindi questo attributo viene rinominato.

### Guarda anche

* class [FileGdbOptions](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* assemblea [Aspose.GIS](../../../)


