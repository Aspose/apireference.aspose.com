---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: Riferimento API Aspose.GIS per .NET
description: FileGdbCoordinatePrecisionGrid metodo. Crea nuovoFileGdbCoordinatePrecisionGrid tale che tutti i valori allinterno di un rettangolo siano rappresentabili.
type: docs
weight: 20
url: /it/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

Crea nuovo`FileGdbCoordinatePrecisionGrid` tale che tutti i valori all'interno di un rettangolo siano rappresentabili.

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| p1 | IPoint | Un angolo del rettangolo. |
| p2 | IPoint | Angolo opposto del rettangolo. Deve avere le stesse dimensioni di*p1*. |

### Valore di ritorno

Il`FileGdbCoordinatePrecisionGrid`tale che tutti i valori all'interno di un rettangolo siano rappresentabili. I valori al di fuori del rettangolo non sono rappresentabili, quindi tutte le coordinate che verranno scritte su FileGDB layer devono trovarsi all'interno del rettangolo.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null` . |
| ArgumentException | *p1* E*p2* non formare un rettangolo non vuoto valido: *p1* O*p2* è vuoto. Flag di HasZ'*p1* non è uguale al flag 'HasZ' di*p2* HasM' flag di*p1* non è uguale al flag 'HasM' di*p2* X' coordinata di*p1* è uguale alla coordinata 'X' di*p2* Y' coordinata di*p1* è uguale alla coordinata 'Y' di*p2* Z' coordinata di*p1* è uguale alla coordinata 'Z' di*p2* M' coordinata di*p1* è uguale alla coordinata 'M' di*p2* Qualsiasi coordinata èNaN o infinito. |

### Guarda anche

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* assemblea [Aspose.GIS](../../../)


