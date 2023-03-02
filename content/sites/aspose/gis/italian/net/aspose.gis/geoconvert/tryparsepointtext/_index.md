---
title: GeoConvert.TryParsePointText
second_title: Riferimento API Aspose.GIS per .NET
description: GeoConvert metodo. Converte la stringa che contiene le coordinate nelloggetto IPoint. Un valore restituito indica se la conversione è riuscita o meno.
type: docs
weight: 30
url: /it/net/aspose.gis/geoconvert/tryparsepointtext/
---
## GeoConvert.TryParsePointText method

Converte la stringa che contiene le coordinate nell'oggetto IPoint. Un valore restituito indica se la conversione è riuscita o meno.

```csharp
public static bool TryParsePointText(string text, out IPoint point)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | String | Una stringa che contiene le coordinate da convertire. La stringa deve contenere sia la latitudine che la longitudine delle coordinate. Le coordinate devono essere separate da spazi bianchi, virgola o punto e virgola. |
| point | IPoint& | Quando questo metodo viene restituito, contiene l'oggetto IPoint con le coordinate analizzate, se la conversione è riuscita o null se la conversione non è riuscita. |

### Valore di ritorno

True se il testo è stato analizzato correttamente, altrimenti False.

### Osservazioni

Esempi: "80° 151°", "74°50.82', 172°08.21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Guarda anche

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* spazio dei nomi [Aspose.Gis](../../geoconvert/)
* assemblea [Aspose.GIS](../../../)


