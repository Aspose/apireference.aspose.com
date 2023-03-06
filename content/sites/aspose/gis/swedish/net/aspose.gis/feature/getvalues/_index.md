---
title: Feature.GetValues
second_title: Aspose.GIS för .NET API Referens
description: Feature metod. Returnerar värdena för alla attribut i en array.
type: docs
weight: 50
url: /sv/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

Returnerar värdena för alla attribut i en array.

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| values | Object[] | Arrayen som attributvärdena ska kopieras till. |
| defaultValue | Object | Värdet som ska returneras om attributvärdet saknas (ej inställt). Standardvärdet är`null`. Överväg att använda 'DBNull.Value' för att separera 'unset' och '`null` värden. |

### Returvärde

Ett antal attribut har kopierats.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argumentet är`null`. |
| InvalidOperationException | Attributet är inte låst. |

### Anmärkningar

Funktionens värdeattribut kopieras till värdematrisen som skickas som en parameter. För attribut med unset värde returneras den angivna 'unsetValue'-parametern.  Längden på värdematrisen behöver inte matcha antalet attribut i funktionen. Om matrislängden är större än antalet attribut, kopieras alla attributvärden till matrisen; om den är mindre, endast arraylängden antal attributvärden kopieras in i arrayen, med början på attributvärdet med ordningen 0.

### Se även

* class [Feature](../)
* namnutrymme [Aspose.Gis](../../feature/)
* hopsättning [Aspose.GIS](../../../)


