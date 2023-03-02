---
title: VectorLayer.Add
second_title: Aspose.GIS für .NET-API-Referenz
description: VectorLayer methode. Fügt dem Layer ein neues Feature hinzu falls vom unterstütztVectorLayer SDriver .
type: docs
weight: 80
url: /de/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

Fügt dem Layer ein neues Feature hinzu, falls vom unterstützt[`VectorLayer`](../) S[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| feature | Feature | Das hinzuzufügende Feature. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | wird ausgelöst, wenn die Ebene schreibgeschützt ist. |

### Siehe auch

* class [Feature](../../feature/)
* class [VectorLayer](../)
* namensraum [Aspose.Gis](../../vectorlayer/)
* Montage [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

Fügt dem Layer ein neues Feature mit dem angegebenen Stil hinzu, sofern vom unterstützt[`VectorLayer`](../) S[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| feature | Feature | Das hinzuzufügende Feature. |
| style | IFeatureStyle | Der Feature-Stil. Verwenden`null` um auf fehlenden Stil hinzuweisen. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | wird ausgelöst, wenn die Ebene keine Stile unterstützt oder die Ebene schreibgeschützt ist. |
| InvalidOperationException | wird ausgelöst, wenn die bearbeitbaren Ebenen keine Stile unterstützen. |
| ArgumentException | wird ausgelöst, wenn der Stil nicht mit dem Treibertyp übereinstimmt. |

### Siehe auch

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* namensraum [Aspose.Gis](../../vectorlayer/)
* Montage [Aspose.GIS](../../../)


