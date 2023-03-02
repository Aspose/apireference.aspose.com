---
title: VectorLayer.Add
second_title: Référence de l'API Aspose.GIS pour .NET
description: VectorLayer méthode. Ajoute une nouvelle fonctionnalité à la couche si elle est prise en charge par leVectorLayer sDriver .
type: docs
weight: 80
url: /fr/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

Ajoute une nouvelle fonctionnalité à la couche, si elle est prise en charge par le[`VectorLayer`](../) s[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| feature | Feature | La fonctionnalité à ajouter. |

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | est levée si la couche est en lecture seule. |

### Voir également

* class [Feature](../../feature/)
* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

Ajoute une nouvelle entité avec le style spécifié au calque, si pris en charge par le[`VectorLayer`](../) s[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| feature | Feature | La fonctionnalité à ajouter. |
| style | IFeatureStyle | Le style de fonction. Utiliser`null` pour indiquer le style manquant. |

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | est levée si le calque ne prend pas en charge les styles ou si le calque est en lecture seule. |
| InvalidOperationException | est levée si les calques modifiables ne prennent pas en charge les styles. |
| ArgumentException | est lancé si le style ne correspond pas au type de pilote. |

### Voir également

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)


