---
title: AbstractPath.Open
second_title: Riferimento API Aspose.GIS per .NET
description: AbstractPath metodo. Apre questoAbstractPathcome file.
type: docs
weight: 120
url: /it/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

Apre questo`AbstractPath`come file.

```csharp
public abstract Stream Open(FileAccess access)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| access | FileAccess | Specifica un sottoinsieme di operazioni che possono essere eseguite su aStream. |

### Valore di ritorno

UNStream aperto con il specificatoFileAccess .

### Osservazioni

Se*access* ha la bandieraWrite set e il file non esiste, deve essere creato da un erede. An`AbstractPath` può essere aperto più volte da`Aspose.GIS` . Ciò è necessario per leggere un file in modo indipendente con più flussi. Non dovresti memorizzare nella cache il risultato ma piuttosto restituire newStream ogni volta questo metodo viene chiamato.

### Guarda anche

* class [AbstractPath](../)
* spazio dei nomi [Aspose.Gis](../../abstractpath/)
* assemblea [Aspose.GIS](../../../)


