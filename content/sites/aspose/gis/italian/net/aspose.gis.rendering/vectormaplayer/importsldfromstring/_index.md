---
title: VectorMapLayer.ImportSldFromString
second_title: Riferimento API Aspose.GIS per .NET
description: VectorMapLayer metodo. Importa lo stile dalla stringa del descrittore di livello con stile specificato.
type: docs
weight: 70
url: /it/net/aspose.gis.rendering/vectormaplayer/importsldfromstring/
---
## VectorMapLayer.ImportSldFromString method

Importa lo stile dalla stringa del descrittore di livello con stile specificato.

```csharp
public void ImportSldFromString(string sld, SldImportOptions options = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sld | String | Descrittore di livello con stile. |
| options | SldImportOptions | Opzioni di importazione. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| XmlException | Si è verificato un errore durante l'analisi dell'XML. |
| FormatException | Nessuno stile SLD è stato trovato nell'XML. |

### Osservazioni

Questo metodo sovrascrive il valore di[`Symbolizer`](../symbolizer/) proprietà.

### Guarda anche

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* spazio dei nomi [Aspose.Gis.Rendering](../../vectormaplayer/)
* assemblea [Aspose.GIS](../../../)


