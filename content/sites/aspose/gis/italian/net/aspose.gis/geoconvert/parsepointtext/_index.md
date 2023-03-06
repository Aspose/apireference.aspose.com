---
title: GeoConvert.ParsePointText
second_title: Riferimento API Aspose.GIS per .NET
description: GeoConvert metodo. Converte la stringa che contiene le coordinate nelloggetto IPoint.
type: docs
weight: 20
url: /it/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

Converte la stringa che contiene le coordinate nell'oggetto IPoint.

```csharp
public static IPoint ParsePointText(string text)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | String | Una stringa che contiene le coordinate da convertire. La stringa deve contenere sia la latitudine che la longitudine delle coordinate. Le coordinate devono essere separate da spazi bianchi, virgola o punto e virgola. |

### Valore di ritorno

Oggetto IPoint con coordinate equivalenti alla stringa di input.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [GisException](../../gisexception/) |  |

### Osservazioni

Esempi: "80° 151°", "74°50.82', 172°08.21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Guarda anche

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* spazio dei nomi [Aspose.Gis](../../geoconvert/)
* assemblea [Aspose.GIS](../../../)


