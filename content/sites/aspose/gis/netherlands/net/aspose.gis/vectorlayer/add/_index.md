---
title: VectorLayer.Add
second_title: Aspose.GIS voor .NET API-referentie
description: VectorLayer methode. Voegt een nieuw object toe aan de laag indien ondersteund door deVectorLayer SDriver .
type: docs
weight: 80
url: /nl/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

Voegt een nieuw object toe aan de laag, indien ondersteund door de[`VectorLayer`](../) S[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| feature | Feature | De functie om toe te voegen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | wordt gegenereerd als de laag alleen-lezen is. |

### Zie ook

* class [Feature](../../feature/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

Voegt een nieuw object met de gespecificeerde stijl toe aan de laag, indien ondersteund door de[`VectorLayer`](../) S[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| feature | Feature | De functie om toe te voegen. |
| style | IFeatureStyle | De kenmerkende stijl. Gebruik`null` om ontbrekende stijl aan te geven. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | wordt gegenereerd als de laag geen stijlen ondersteunt of als de laag alleen-lezen is. |
| InvalidOperationException | wordt gegenereerd als de bewerkbare lagen geen stijlen ondersteunen. |
| ArgumentException | wordt gegooid als de stijl niet overeenkomt met het drivertype. |

### Zie ook

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)


