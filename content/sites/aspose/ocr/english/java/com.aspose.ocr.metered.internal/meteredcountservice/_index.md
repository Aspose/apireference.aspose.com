---
title: MeteredCountService
second_title: Aspose.OCR for Java API Reference
description: This internal class is used to handle customers consumption data the unit is MB.
type: docs
weight: 11
url: /java/com.aspose.ocr.metered.internal/meteredcountservice/
---

**Inheritance:**
java.lang.Object
```
public class MeteredCountService
```

This internal class is used to handle customer's consumption data, the unit is MB.
## Methods

| Method | Description |
| --- | --- |
| [getInstance()](#getInstance--) |  |
| [increaseCount(double count)](#increaseCount-double-) | Increase customer consumption file size, and try to upload data |
| [increaseCredit(long credit)](#increaseCredit-long-) | Increase customer consumption credit, and try to upload |
### getInstance() {#getInstance--}
```
public static MeteredCountService getInstance()
```




**Returns:**
[MeteredCountService](../../com.aspose.ocr.metered.internal/meteredcountservice)
### increaseCount(double count) {#increaseCount-double-}
```
public void increaseCount(double count)
```


Increase customer consumption file size, and try to upload data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| count | double | increased quantities, in unit of MB |

### increaseCredit(long credit) {#increaseCredit-long-}
```
public void increaseCredit(long credit)
```


Increase customer consumption credit, and try to upload

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| credit | long | increased credit |

