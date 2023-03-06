---
title: VectorLayer.Add
second_title: Riferimento API Aspose.GIS per .NET
description: VectorLayer metodo. Aggiunge una nuova feature al layer se supportata daVectorLayer SDriver .
type: docs
weight: 80
url: /it/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

Aggiunge una nuova feature al layer, se supportata da[`VectorLayer`](../) S[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| feature | Feature | La funzionalità da aggiungere. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| InvalidOperationException | viene generato se il livello è di sola lettura. |

### Guarda anche

* class [Feature](../../feature/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

Aggiunge una nuova geometria con lo stile specificato al layer, se supportato da[`VectorLayer`](../) S[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| feature | Feature | La funzionalità da aggiungere. |
| style | IFeatureStyle | Lo stile della caratteristica. Utilizzo`null` per indicare lo stile mancante. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| InvalidOperationException | viene generato se il livello non supporta gli stili o il livello è di sola lettura. |
| InvalidOperationException | viene generato se i livelli modificabili non supportano gli stili. |
| ArgumentException | viene generato se lo stile non corrisponde al tipo di driver. |

### Guarda anche

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* spazio dei nomi [Aspose.Gis](../../vectorlayer/)
* assemblea [Aspose.GIS](../../../)


