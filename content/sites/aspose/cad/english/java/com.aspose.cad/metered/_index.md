---
title: "Metered"
linktitle: "Metered"
second_title: "Aspose.CAD for Java"
description: ""
type: docs
weight: 10
url: /java/com.aspose.cad/metered/
---

## Methods

| Method | Description |
| --- | --- |
| [setMeteredKey(String publicKey, String privateKey)](#setMeteredKey-java.lang.String-java.lang.String) | Sets metered public and private key |
| [getConsumptionQuantity()](#getConsumptionQuantity) | Gets consumption file size |
| [isEvaluation()](#isEvaluation) | Gets evaluation status |
| [increaseCount(double uploadMeteringSize)](#increaseCount-double) | Increases data counter for absolute value |
| [resetMeteredKey()](#resetMeteredKey) | Removes previously setup license |
| [getConsumptionCredit()](#getConsumptionCredit) | Gets consumption credit |

### setMeteredKey(String publicKey, String privateKey) {#setMeteredKey-java.lang.String-java.lang.String}
```java
public static void setMeteredKey(String publicKey, String privateKey)
```

Sets metered public and private key

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| publicKey | String | public key |
| privateKey | String | private key |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - if publicKey is null or privateKey is null or publicKey is empty or privateKey is empty
- `com.aspose.ms.System.InvalidOperationException` - Authentication failed.

### getConsumptionQuantity() {#getConsumptionQuantity}
```java
public static BigDecimal getConsumptionQuantity()
```

Gets consumption file size

**Returns:** BigDecimal - consumption quantity

### isEvaluation() {#isEvaluation}
```java
public static boolean isEvaluation()
```

Gets evaluation status

**Returns:** boolean - Determines whether product is under evaluation or not

### increaseCount(double uploadMeteringSize) {#increaseCount-double}
```java
public static void increaseCount(double uploadMeteringSize)
```

Increases data counter for absolute value

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| uploadMeteringSize | double | number of bytes to increase |

### resetMeteredKey() {#resetMeteredKey}
```java
public static void resetMeteredKey()
```

Removes previously setup license

### getConsumptionCredit() {#getConsumptionCredit}
```java
public static BigDecimal getConsumptionCredit()
```

Gets consumption credit

**Returns:** BigDecimal - consumption quantity

