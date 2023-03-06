---
title: Identifier.Epsg
second_title: Riferimento API Aspose.GIS per .NET
description: Identifier metodo. Crea un nuovo identificatore che rappresenta lidentificatore EPSG con il codiceepsgCode .
type: docs
weight: 20
url: /it/net/aspose.gis.spatialreferencing/identifier/epsg/
---
## Identifier.Epsg method

Crea un nuovo identificatore che rappresenta l'identificatore EPSG con il codice*epsgCode* .

```csharp
public static Identifier Epsg(int epsgCode)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| epsgCode | Int32 | Codice EPSG. |

### Valore di ritorno

Nuovo identificatore con[`AuthorityName`](../authorityname/) "EPSG" e[`AuthorityUniqueIdentifier`](../authorityuniqueidentifier/)*epsgCode* . Se*epsgCode* è minore di 0 - ritorno`null` ;

### Guarda anche

* class [Identifier](../)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../identifier/)
* assemblea [Aspose.GIS](../../../)


