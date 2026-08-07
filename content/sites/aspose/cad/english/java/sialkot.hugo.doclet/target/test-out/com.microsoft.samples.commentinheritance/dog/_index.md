---
title: Dog
second_title: Aspose.Sildes for Java API Reference
description: Canine and mans best friend.
type: docs
weight: 11
url: /java/com.microsoft.samples.commentinheritance/dog/
---
**Inheritance:**
java.lang.Object, [com.microsoft.samples.commentinheritance.Animal](../../com.microsoft.samples.commentinheritance/animal), [com.microsoft.samples.commentinheritance.Mammal](../../com.microsoft.samples.commentinheritance/mammal)

**All Implemented Interfaces:**
[com.microsoft.samples.commentinheritance.Omnivorous](../../com.microsoft.samples.commentinheritance/omnivorous), [com.microsoft.samples.commentinheritance.Viviparous](../../com.microsoft.samples.commentinheritance/viviparous)
```
public class Dog extends Mammal implements Omnivorous, Viviparous
```

Canine and man's best friend.
## Constructors

| Constructor | Description |
| --- | --- |
| [Dog()](#Dog--) |  |
## Methods

| Method | Description |
| --- | --- |
| [eat(Animal otherAnimal)](#eat-com.microsoft.samples.commentinheritance.Animal-) | \{@inheritDoc\} |
| [eat(Herbivorous.Plant plantToBeEaten)](#eat-com.microsoft.samples.commentinheritance.Herbivorous.Plant-) | \{@inheritDoc\} |
| [verballyCommunicate()](#verballyCommunicate--) | \{@inheritDoc\} Bark. |
| [giveBirth(int numberPuppies)](#giveBirth-int-) | \{@inheritDoc\} |
| [getHairColor()](#getHairColor--) | Provide the color of the dog's hair. |
| [feed()](#feed--) | \{@inheritDoc\} |
| [getKind()](#getKind--) | \{@inheritDoc\} Get kind from Dog. |
### Dog() {#Dog--}
```
public Dog()
```


### eat(Animal otherAnimal) {#eat-com.microsoft.samples.commentinheritance.Animal-}
```
public void eat(Animal otherAnimal)
```


Eat the provided animal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| otherAnimal | [Animal](../../com.microsoft.samples.commentinheritance/animal) | Tasty treat. |

### eat(Herbivorous.Plant plantToBeEaten) {#eat-com.microsoft.samples.commentinheritance.Herbivorous.Plant-}
```
public void eat(Herbivorous.Plant plantToBeEaten)
```


Eat the provided plant.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| plantToBeEaten | [Plant](../../com.microsoft.samples.commentinheritance/plant) | Plant that this dog will eat. |

### verballyCommunicate() {#verballyCommunicate--}
```
public void verballyCommunicate()
```


Communicate verbally. Bark.

### giveBirth(int numberPuppies) {#giveBirth-int-}
```
public void giveBirth(int numberPuppies)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| numberPuppies | int | Number of puppies being born. |

### getHairColor() {#getHairColor--}
```
public Color getHairColor()
```


Provide the color of the dog's hair.

**Returns:**
java.awt.Color - Color of the dog's fur.
### feed() {#feed--}
```
public void feed()
```


Feed offspring.

### getKind() {#getKind--}
```
public String getKind()
```


Get kind from Organism. Get kind from Animal. Get kind from Mammal. Get kind from Dog.

**Returns:**
java.lang.String
