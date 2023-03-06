---
title: Class Identifier
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.SpatialReferencing.Identifier classe. Rappresenta un identificatore  un riferimento alla descrizione esterna di un oggetto. Se crei un SRS da WKTIdentifier corrisponde alla parola chiave AUTHORITY.
type: docs
weight: 2160
url: /it/net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

Rappresenta un identificatore - un riferimento alla descrizione esterna di un oggetto. Se crei un SRS da WKT,`Identifier` corrisponde alla parola chiave "AUTHORITY".

```csharp
public class Identifier : IEquatable<Identifier>
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Identifier](identifier/)(string, string) | Crea nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | Un nome di autorità, che ha dato un[`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/) . |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | Un modo unico per rappresentare un oggetto all'interno di a[`AuthorityName`](./authorityname/) . |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | Crea un nuovo identificatore che rappresenta l'identificatore EPSG con il codice*epsgCode* . |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | Indica se l'oggetto corrente è uguale a un altro oggetto dello stesso tipo. |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | Determina se l'oggetto specificato è uguale all'oggetto corrente. |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | Se questo oggetto rappresenta un identificatore EPSG valido (ad es. - il nome dell'autorità è "EPSG" e l'identificatore univoco dell'autorità è un numero intero) - lo restituisce. Altrimenti - ritorna -1. |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | Funge da funzione hash predefinita. |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | Implementa l'operatore ==. |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | Implementa l'operatore !=. |

### Esempi

WGS 84 Il sistema di riferimento spaziale ha il codice EPSG 4326, quindi potrebbe contenere l'identificatore: L'ellissoide WGS 84 ha il codice EPSG 7030 e potrebbe contenere l'identificatore:

```csharp
new  {  = "EPSG",  = 4326 };
```

```csharp
new  {  = "EPSG",  = 7030 };
```

### Guarda anche

* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assemblea [Aspose.GIS](../../)


