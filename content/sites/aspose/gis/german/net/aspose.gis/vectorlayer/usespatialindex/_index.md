---
title: VectorLayer.UseSpatialIndex
second_title: Aspose.GIS für .NET-API-Referenz
description: VectorLayer methode. Lädt den räumlichen Index um das Filtern nach Attributwerten in Filtermethoden wie zWhereIntersects undNearestTo. Wenn der Index nicht existiert wird er zuerst erstellt. VerwendenforceRebuild um die Neuerstellung des Index zu erzwingen.
type: docs
weight: 190
url: /de/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

Lädt den räumlichen Index, um das Filtern nach Attributwerten in Filtermethoden wie z[`WhereIntersects`](../../featuressequence/whereintersects/) und[`NearestTo`](../nearestto/). Wenn der Index nicht existiert, wird er zuerst erstellt. Verwenden*forceRebuild* um die Neuerstellung des Index zu erzwingen.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| indexPath | String | Pfad zur Indexdatei. |
| forceRebuild | Boolean | Ob der Index neu erstellt werden soll, auch wenn er bereits vorhanden ist. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Pfad ist`null`. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| InvalidOperationException | Der räumliche Index ist für diese Ebene bereits geladen. |
| [GisException](../../gisexception/) | Die Datei ist vorhanden und es handelt sich nicht um eine von Aspose.GIS erstellte räumliche Indexdatei. |

### Siehe auch

* class [VectorLayer](../)
* namensraum [Aspose.Gis](../../vectorlayer/)
* Montage [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

Lädt den räumlichen Index, um das Filtern nach Attributwerten in Filtermethoden wie z[`WhereIntersects`](../../featuressequence/whereintersects/) und[`NearestTo`](../nearestto/). Wenn der Index nicht existiert, wird er zuerst erstellt. Verwenden*forceRebuild* um die Neuerstellung des Index zu erzwingen.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| indexPath | AbstractPath | Pfad zur Indexdatei. |
| forceRebuild | Boolean | Ob der Index neu erstellt werden soll, auch wenn er bereits vorhanden ist. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Pfad ist`null`. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| InvalidOperationException | Der räumliche Index ist für diese Ebene bereits geladen. |
| [GisException](../../gisexception/) | Die Datei ist vorhanden und es handelt sich nicht um eine von Aspose.GIS erstellte räumliche Indexdatei. |

### Siehe auch

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* namensraum [Aspose.Gis](../../vectorlayer/)
* Montage [Aspose.GIS](../../../)


