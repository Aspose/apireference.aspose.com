---
title: "Metered"
second_title: "Aspose.Page voor Java API-referentie"
description: "Biedt methoden om een meter‑sleutel in te stellen."
type: docs
weight: 15
url: /nl/java/com.aspose.page/metered/
---
**Inheritance:**
java.lang.Object
```
public final class Metered
```

Biedt methoden om een meter‑sleutel in te stellen.

--------------------

In dit voorbeeld wordt geprobeerd de metered openbare en privésleutel in te stellen.

```
The component jar file:
  
 	Metered matered = new Metered();
 	matered.setMeteredKey("PublicKey", "PrivateKey");
```
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [Metered()](#Metered--) | Initialiseert een nieuw exemplaar van deze klasse. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [clearMeteredLicense()](#clearMeteredLicense--) | Schoont metered-licentie op. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [flush()](#flush--) | Leegt telgegevens op de server. |
| [getClass()](#getClass--) |  |
| [getConsumptionCredit()](#getConsumptionCredit--) | Haalt verbruikskrediet op. |
| [getConsumptionQuantity()](#getConsumptionQuantity--) | Haalt consumptiebestandsgrootte op |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMeteredKey(String publicKey, String privateKey)](#setMeteredKey-java.lang.String-java.lang.String-) | Stelt gemeten publieke en private sleutel in |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Metered() {#Metered--}
```
public Metered()
```


Initialiseert een nieuw exemplaar van deze klasse.

### clearMeteredLicense() {#clearMeteredLicense--}
```
public static void clearMeteredLicense()
```


Schoont metered-licentie op.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### flush() {#flush--}
```
public static void flush()
```


Leegt telgegevens op de server. Alleen gebruikt voor debugdoeleinden.

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConsumptionCredit() {#getConsumptionCredit--}
```
public static double getConsumptionCredit()
```


Haalt verbruikskrediet op.

**Returns:**
double - consumptiehoeveelheid
### getConsumptionQuantity() {#getConsumptionQuantity--}
```
public static double getConsumptionQuantity()
```


Haalt consumptiebestandsgrootte op

**Returns:**
double - consumptiehoeveelheid
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setMeteredKey(String publicKey, String privateKey) {#setMeteredKey-java.lang.String-java.lang.String-}
```
public void setMeteredKey(String publicKey, String privateKey)
```


Stelt gemeten publieke en private sleutel in

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| publicKey | java.lang.String | publieke sleutel |
| privateKey | java.lang.String | privésleutel |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

