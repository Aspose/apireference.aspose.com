---
title: "Version16Dot16"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt den Version16Dot16-Datentyp dar"
type: docs
weight: 118
url: /de/java/com.aspose.font/version16dot16/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Cloneable
```
public class Version16Dot16 implements Cloneable
```

Stellt den Version16Dot16-Datentyp dar
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Version16Dot16()](#Version16Dot16--) | Konstruktor |
| [Version16Dot16(int majorNumber, int minorNumber)](#Version16Dot16-int-int-) | Konstruktor |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clone()](#clone--) | Erstelle eine Kopie des  Version16Dot16  Objekts. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMajorNumber()](#getMajorNumber--) | Gibt die Hauptversionsnummer zurück. |
| [getMinorNumber()](#getMinorNumber--) | Gibt die Nebenversionsnummer zurück. |
| [getRawBytes()](#getRawBytes--) | Liefert alle Rohbits für die Version16Dot16 Versionsnummer als Byte-Array mit einer Größe von 4 Bytes. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMajorNumber(int value)](#setMajorNumber-int-) | Setzt die Hauptversionsnummer. |
| [setMinorNumber(int value)](#setMinorNumber-int-) | Setzt die Nebenversionsnummer. |
| [toString()](#toString--) | Gibt den Versionswert als formatierte Zeichenkette zurück, zum Beispiel "0.5", "1.1", "3.0" usw. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Version16Dot16() {#Version16Dot16--}
```
public Version16Dot16()
```


Konstruktor

### Version16Dot16(int majorNumber, int minorNumber) {#Version16Dot16-int-int-}
```
public Version16Dot16(int majorNumber, int minorNumber)
```


Konstruktor

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| majorNumber | int | Hauptversionsnummer |
| minorNumber | int | Nebenversionsnummer |

### clone() {#clone--}
```
public Object clone()
```


Erstelle eine Kopie des  Version16Dot16  Objekts.

**Returns:**
java.lang.Object - Objekt vom Typ  Version16Dot16
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMajorNumber() {#getMajorNumber--}
```
public int getMajorNumber()
```


Liefert die Hauptversionsnummer. Der Wert ist nur in hexadezimaler Schreibweise sinnvoll, zum Beispiel hat die Version 0.5 für 'maxp' in tatsächlichen Schriftdateien 4 Bytes: \{0, 0, 80, 0\}, was die hexadezimale Darstellung 0x00005000 hat. Nach dem Lesen dieser Version aus der Schriftdatei werden die Haupt- und Neben-Nummern für das Objekt  Version16Dot16  0 bzw. 20480 sein. Und diese Werte in hexadezimaler Form sind 0x0000 und 0x5000.

**Returns:**
int - Hauptversionsnummer.
### getMinorNumber() {#getMinorNumber--}
```
public int getMinorNumber()
```


Liefert die Nebenversionsnummer. Der Wert ist nur in hexadezimaler Schreibweise sinnvoll, zum Beispiel hat die Version 0.5 für 'maxp' in tatsächlichen Schriftdateien 4 Bytes: \{0, 0, 80, 0\}, was die hexadezimale Darstellung 0x00005000 hat. Nach dem Lesen dieser Version aus der Schriftdatei werden die Haupt- und Neben-Nummern für das Objekt  Version16Dot16  0 bzw. 20480 sein. Und diese Werte in hexadezimaler Form sind 0x0000 und 0x5000.

**Returns:**
int - Nebenversionsnummer.
### getRawBytes() {#getRawBytes--}
```
public byte[] getRawBytes()
```


Liefert alle Rohbits für die Version16Dot16 Versionsnummer als Byte-Array mit einer Größe von 4 Bytes.

**Returns:**
byte[] - Alle Rohbits für die Version16Dot16 Versionsnummer als Byte-Array mit einer Größe von 4 Bytes.
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




### setMajorNumber(int value) {#setMajorNumber-int-}
```
public void setMajorNumber(int value)
```


Setzt die Hauptversionsnummer. Der Wert ist nur in hexadezimaler Schreibweise sinnvoll, zum Beispiel hat die Version 0.5 für 'maxp' in tatsächlichen Schriftdateien 4 Bytes: \{0, 0, 80, 0\}, was die hexadezimale Darstellung 0x00005000 hat. Nach dem Lesen dieser Version aus der Schriftdatei werden die Haupt- und Neben-Nummern für das Objekt  Version16Dot16  0 bzw. 20480 sein. Und diese Werte in hexadezimaler Form sind 0x0000 und 0x5000.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Hauptversionsnummer. |

### setMinorNumber(int value) {#setMinorNumber-int-}
```
public void setMinorNumber(int value)
```


Setzt die Nebenversionsnummer. Der Wert ist nur in hexadezimaler Schreibweise sinnvoll, zum Beispiel hat die Version 0.5 für 'maxp' in tatsächlichen Schriftdateien 4 Bytes: \{0, 0, 80, 0\}, was die hexadezimale Darstellung 0x00005000 hat. Nach dem Lesen dieser Version aus der Schriftdatei werden die Haupt- und Neben-Nummern für das Objekt  Version16Dot16  0 bzw. 20480 sein. Und diese Werte in hexadezimaler Form sind 0x0000 und 0x5000.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Nebenversionsnummer. |

### toString() {#toString--}
```
public String toString()
```


Gibt den Versionswert als formatierte Zeichenkette zurück, zum Beispiel "0.5", "1.1", "3.0" usw.

**Returns:**
java.lang.String - Objekt vom Typ  String
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

