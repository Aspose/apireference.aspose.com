---
title: SuperHero
second_title: Aspose.Sildes for Java API Reference
description: Hero is the main entity we will be using to something
type: docs
weight: 15
url: /java/com.microsoft.samples/superhero/
---
**Inheritance:**
java.lang.Object, com.microsoft.samples.subpackage.Person

**All Implemented Interfaces:**
java.io.Serializable, java.lang.Cloneable
```
public class SuperHero extends Person implements Serializable, Cloneable
```

Hero is the main entity we will be using to something
## Constructors

| Constructor | Description |
| --- | --- |
| [SuperHero()](#SuperHero--) |  |
| [SuperHero(String heroName, String uniquePower, int health, int defense)](#SuperHero-java.lang.String-java.lang.String-int-int-) |  |
## Fields

| Field | Description |
| --- | --- |
| [SOME_PUBLIC_STRING](#SOME-PUBLIC-STRING) |  |
## Methods

| Method | Description |
| --- | --- |
| [successfullyAttacked(int incomingDamage, String damageType)](#successfullyAttacked-int-java.lang.String-) | This is a simple description of the method. |
| [getHeroName()](#getHeroName--) |  |
| [setHeroName(String heroName)](#setHeroName-java.lang.String-) |  |
| [getLastName()](#getLastName--) | Get capitalized last name. |
| [getUniquePower()](#getUniquePower--) |  |
| [setUniquePower(String uniquePower)](#setUniquePower-java.lang.String-) |  |
| [getDefense()](#getDefense--) |  |
| [setDefense(int defense)](#setDefense-int-) |  |
### SuperHero() {#SuperHero--}
```
public SuperHero()
```


### SuperHero(String heroName, String uniquePower, int health, int defense) {#SuperHero-java.lang.String-java.lang.String-int-int-}
```
public SuperHero(String heroName, String uniquePower, int health, int defense)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| heroName | java.lang.String |  |
| uniquePower | java.lang.String |  |
| health | int |  |
| defense | int |  |

### SOME_PUBLIC_STRING {#SOME-PUBLIC-STRING}
```
public final String SOME_PUBLIC_STRING
```


### successfullyAttacked(int incomingDamage, String damageType) {#successfullyAttacked-int-java.lang.String-}
```
public int successfullyAttacked(int incomingDamage, String damageType)
```


This is a simple description of the method. . . [Superman!][Superman]


[Superman]: http://www.supermanisthegreatest.com

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| incomingDamage | int | the amount of incoming damage for [SuperHero](../../com.microsoft.samples/superhero) |
| damageType | java.lang.String | type of damage with similar word damageTypeLong, sure |

**Returns:**
int - the amount of health hero has after attack
### getHeroName() {#getHeroName--}
```
public String getHeroName()
```




**Returns:**
java.lang.String
### setHeroName(String heroName) {#setHeroName-java.lang.String-}
```
public void setHeroName(String heroName)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| heroName | java.lang.String |  |

### getLastName() {#getLastName--}
```
public String getLastName()
```


Get capitalized last name. But it's not the end, because of multiline comment

**Returns:**
java.lang.String - lastName in uppercase. But it's not the end, because of multiline comment
### getUniquePower() {#getUniquePower--}
```
public String getUniquePower()
```




**Returns:**
java.lang.String
### setUniquePower(String uniquePower) {#setUniquePower-java.lang.String-}
```
public void setUniquePower(String uniquePower)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| uniquePower | java.lang.String |  |

### getDefense() {#getDefense--}
```
public int getDefense()
```




**Returns:**
int
### setDefense(int defense) {#setDefense-int-}
```
public void setDefense(int defense)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| defense | int |  |

