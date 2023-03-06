---
title: Extent.GetTransformed
second_title: Riferimento API Aspose.GIS per .NET
description: Extent metodo. Restituisce la nuova estensione specificataSpatialReferenceSystem che contiene questa estensione.
type: docs
weight: 150
url: /it/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

Restituisce la nuova estensione specificata[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) che contiene questa estensione.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) trasformare in. |

### Valore di ritorno

Il risultato della trasformazione di questa estensione nell'SRS specificato.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null` . |
| NotSupportedException | La trasformazione nell'SRS fornito non è supportata. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Trasformazione fallita. |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) di questa misura è`null` . |

### Guarda anche

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* spazio dei nomi [Aspose.Gis](../../extent/)
* assemblea [Aspose.GIS](../../../)


