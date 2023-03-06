---
title: SpatialReferenceSystem.CreateFromWkt
second_title: Riferimento API Aspose.GIS per .NET
description: SpatialReferenceSystem metodo. Crea un nuovoSistema di riferimento spaziale basato sulla stringa WKT WellKnown Text.
type: docs
weight: 20
url: /it/net/aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/
---
## SpatialReferenceSystem.CreateFromWkt method

Crea un nuovo`Sistema di riferimento spaziale` basato sulla stringa WKT (Well-Known Text).

```csharp
public static SpatialReferenceSystem CreateFromWkt(string wkt)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| wkt | String | stringa WKT. |

### Valore di ritorno

Nuovo`Sistema di riferimento spaziale` .

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null` . |
| FormatException | La gerarchia dei valori wkt, il loro ordine o tipi, è errata. |
| NotSupportedException | L'elemento radice WKT non è supportato (ad esempio è FITTED_CS). |

### Guarda anche

* method [TryCreateFromWkt](../trycreatefromwkt/)
* class [SpatialReferenceSystem](../)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assemblea [Aspose.GIS](../../../)


