---
title: Omnivorous
second_title: Aspose.Sildes for Java API Reference
description: Eats plants and animals.
type: docs
weight: 15
url: /java/com.microsoft.samples.commentinheritance/omnivorous/
---
**All Implemented Interfaces:**
[com.microsoft.samples.commentinheritance.Carnivorous](../../com.microsoft.samples.commentinheritance/carnivorous), [com.microsoft.samples.commentinheritance.Herbivorous](../../com.microsoft.samples.commentinheritance/herbivorous)
```
public interface Omnivorous extends Carnivorous, Herbivorous
```

Eats plants and animals.
## Methods

| Method | Description |
| --- | --- |
| [eat(Animal animalToBeEaten)](#eat-com.microsoft.samples.commentinheritance.Animal-) |  |
| [eat(Herbivorous.Plant plantToBeEaten)](#eat-com.microsoft.samples.commentinheritance.Herbivorous.Plant-) |  |
| [getKind()](#getKind--) | \{@inheritDoc\} Get kind from Omnivorous. |
### eat(Animal animalToBeEaten) {#eat-com.microsoft.samples.commentinheritance.Animal-}
```
public abstract void eat(Animal animalToBeEaten)
```


Eat the provided animal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| animalToBeEaten | [Animal](../../com.microsoft.samples.commentinheritance/animal) |  |

### eat(Herbivorous.Plant plantToBeEaten) {#eat-com.microsoft.samples.commentinheritance.Herbivorous.Plant-}
```
public abstract void eat(Herbivorous.Plant plantToBeEaten)
```


Eat the provided plant.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| plantToBeEaten | [Plant](../../com.microsoft.samples.commentinheritance/plant) |  |

### getKind() {#getKind--}
```
public abstract String getKind()
```


Get kind from Carnivorous. Get kind from Omnivorous.

**Returns:**
java.lang.String
