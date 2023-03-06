---
title: VectorLayer.Add
second_title: Aspose.GIS for .NET API Referansı
description: VectorLayer yöntem. tarafından destekleniyorsa katmana yeni bir özellik ekler.VectorLayer SDriver .
type: docs
weight: 80
url: /tr/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

tarafından destekleniyorsa, katmana yeni bir özellik ekler.[`VectorLayer`](../) S[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| feature | Feature | Eklenecek özellik. |

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | katman salt okunur ise atılır. |

### Ayrıca bakınız

* class [Feature](../../feature/)
* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

tarafından destekleniyorsa, katmana belirtilen stille yeni bir özellik ekler.[`VectorLayer`](../) S[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| feature | Feature | Eklenecek özellik. |
| style | IFeatureStyle | Özellik stili. Kullanmak`null` eksik stili belirtmek için. |

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | katman stilleri desteklemiyorsa veya katman salt okunursa atılır. |
| InvalidOperationException | düzenlenebilir katmanlar stilleri desteklemiyorsa atılır. |
| ArgumentException | stil, sürücü tipiyle eşleşmiyorsa atılır. |

### Ayrıca bakınız

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)


