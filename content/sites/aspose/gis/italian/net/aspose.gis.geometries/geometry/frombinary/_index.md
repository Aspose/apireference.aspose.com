---
title: Geometry.FromBinary
second_title: Riferimento API Aspose.GIS per .NET
description: Geometry metodo. Crea una geometria dalla sua rappresentazione binaria ben nota.
type: docs
weight: 460
url: /it/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

Crea una geometria dalla sua rappresentazione binaria ben nota.

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| wkb | Byte[] | Ben noto Rappresentazione binaria di una geometria. |

### Valore di ritorno

Una geometria rappresentata dall'argomento.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è nullo. |
| NotSupportedException | L'argomento rappresenta una geometria di tipo non supportato. |
| FormatException | L'argomento non è un file binario noto valido. |

### Guarda anche

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometry/)
* assemblea [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

Crea una geometria dalla sua rappresentazione binaria ben nota.

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| wkb | Byte[] | Ben noto Rappresentazione binaria di una geometria. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema di riferimento spaziale da assegnare alla geometria. |

### Valore di ritorno

Una geometria rappresentata dall'argomento.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è nullo. |
| NotSupportedException | L'argomento rappresenta una geometria di tipo non supportato. |
| FormatException | L'argomento non è un file binario noto valido. |

### Osservazioni

Se ci sono byte extra dopo la geometria aFormatException viene generata un'eccezione.

### Guarda anche

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* spazio dei nomi [Aspose.Gis.Geometries](../../geometry/)
* assemblea [Aspose.GIS](../../../)


