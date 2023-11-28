---
title: Metered
second_title: Aspose.TeX for Java API Reference
description: Provides methods to set metered key.
type: docs
weight: 19
url: /java/com.aspose.tex/metered/
---
**Inheritance:**
java.lang.Object
```
public final class Metered
```

Provides methods to set metered key.

--------------------

In this example, an attempt will be made to set metered public and private key

```
The component jar file:
  
 	Metered metered = new Metered();
 	metered.setMeteredKey("PublicKey", "PrivateKey");
```
## Constructors

| Constructor | Description |
| --- | --- |
| [Metered()](#Metered--) | Initializes a new instance of this class. |
## Methods

| Method | Description |
| --- | --- |
| [setMeteredKey(String publicKey, String privateKey)](#setMeteredKey-java.lang.String-java.lang.String-) | Sets metered public and private key. |
| [getConsumptionQuantity()](#getConsumptionQuantity--) | Gets consumption file size. |
| [getConsumptionCredit()](#getConsumptionCredit--) | Gets consumption credit. |
### Metered() {#Metered--}
```
public Metered()
```


Initializes a new instance of this class.

### setMeteredKey(String publicKey, String privateKey) {#setMeteredKey-java.lang.String-java.lang.String-}
```
public void setMeteredKey(String publicKey, String privateKey)
```


Sets metered public and private key. If you purchase metered license, when start application, this API should be called, normally, this is enough. However, if always fail to upload consumption data and exceed 24 hours, the license will be set to evaluation status, to avoid such case, you should regularly check the license status, if it is evaluation status, call this API again.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| publicKey | java.lang.String | The public key. |
| privateKey | java.lang.String | The private key. |

### getConsumptionQuantity() {#getConsumptionQuantity--}
```
public static double getConsumptionQuantity()
```


Gets consumption file size.

**Returns:**
double - Consumption quantity.
### getConsumptionCredit() {#getConsumptionCredit--}
```
public static double getConsumptionCredit()
```


Gets consumption credit.

**Returns:**
double - Consumption credit.
