---
title: "Messbasiert"
second_title: "Aspose.Page for Java API-Referenz"
description: "Stellt Methoden zum Festlegen des gemessenen Schlüssels bereit."
type: docs
weight: 15
url: /de/java/com.aspose.page/metered/
---
**Inheritance:**
java.lang.Object
```
public final class Metered
```

Stellt Methoden zum Festlegen des gemessenen Schlüssels bereit.

--------------------

In diesem Beispiel wird versucht, den messbasierten öffentlichen und privaten Schlüssel zu setzen.

```
The component jar file:
  
 	Metered matered = new Metered();
 	matered.setMeteredKey("PublicKey", "PrivateKey");
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Metered()](#Metered--) | Initialisiert eine neue Instanz dieser Klasse. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clearMeteredLicense()](#clearMeteredLicense--) | Bereinigt die messbasierte Lizenz |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [flush()](#flush--) | Spült Zählerdaten auf dem Server. |
| [getClass()](#getClass--) |  |
| [getConsumptionCredit()](#getConsumptionCredit--) | Ermittelt den Verbrauchsguthaben |
| [getConsumptionQuantity()](#getConsumptionQuantity--) | Ermittelt die Verbrauchsdateigröße |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMeteredKey(String publicKey, String privateKey)](#setMeteredKey-java.lang.String-java.lang.String-) | Setzt den gemessenen öffentlichen und privaten Schlüssel |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Metered() {#Metered--}
```
public Metered()
```


Initialisiert eine neue Instanz dieser Klasse.

### clearMeteredLicense() {#clearMeteredLicense--}
```
public static void clearMeteredLicense()
```


Bereinigt die messbasierte Lizenz

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### flush() {#flush--}
```
public static void flush()
```


Spült Zähldaten auf dem Server. Wird nur zu Debug‑Zwecken verwendet.

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


Ermittelt den Verbrauchsguthaben

**Returns:**
double - Verbrauchsmenge
### getConsumptionQuantity() {#getConsumptionQuantity--}
```
public static double getConsumptionQuantity()
```


Ermittelt die Verbrauchsdateigröße

**Returns:**
double - Verbrauchsmenge
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


Setzt den gemessenen öffentlichen und privaten Schlüssel

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| publicKey | java.lang.String | öffentlicher Schlüssel |
| privateKey | java.lang.String | privater Schlüssel |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

