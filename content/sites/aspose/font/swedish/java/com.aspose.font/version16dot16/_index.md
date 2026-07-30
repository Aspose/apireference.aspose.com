---
title: "Version16Dot16"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar Version16Dot16-datatypen"
type: docs
weight: 118
url: /sv/java/com.aspose.font/version16dot16/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Cloneable
```
public class Version16Dot16 implements Cloneable
```

Representerar Version16Dot16-datatypen
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [Version16Dot16()](#Version16Dot16--) | Konstruktor |
| [Version16Dot16(int majorNumber, int minorNumber)](#Version16Dot16-int-int-) | Konstruktor |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [clone()](#clone--) | Skapa en kopia av  Version16Dot16  objektet. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMajorNumber()](#getMajorNumber--) | Hämtar huvudversionsnummer. |
| [getMinorNumber()](#getMinorNumber--) | Hämtar mindre versionsnummer. |
| [getRawBytes()](#getRawBytes--) | Hämtar alla råa bitar för Version16Dot16 versionsnummer som byte-array med storlek 4 byte. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMajorNumber(int value)](#setMajorNumber-int-) | Ställer in huvudversionsnummer. |
| [setMinorNumber(int value)](#setMinorNumber-int-) | Ställer in mindre versionsnummer. |
| [toString()](#toString--) | Returnerar versionsvärdet som en formaterad sträng. Till exempel "0.5", "1.1", "3.0" osv. |
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| majorNumber | int | Huvudversionsnummer |
| minorNumber | int | Mindre versionsnummer |

### clone() {#clone--}
```
public Object clone()
```


Skapa en kopia av  Version16Dot16  objektet.

**Returns:**
java.lang.Object - Objekt av typen  Version16Dot16
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Hämtar huvudversionsnummer. Värdet har bara mening i hexadecimal notation, till exempel version 0.5 för 'maxp' i faktiska teckensnittsfiler är 4 byte: \{0, 0, 80, 0\}, vilket har hexadecimal representation 0x00005000. Efter att ha läst denna version från teckensnittsfilen kommer huvud- och sekundära nummer för objektet  Version16Dot16  att vara 0 respektive 20480. Och dessa värden i hexadecimal form är 0x0000 och 0x5000.

**Returns:**
int - Huvudversionsnummer.
### getMinorNumber() {#getMinorNumber--}
```
public int getMinorNumber()
```


Hämtar mindre versionsnummer. Värdet har bara mening i hexadecimal notation, till exempel version 0.5 för 'maxp' i faktiska teckensnittsfiler är 4 byte: \{0, 0, 80, 0\}, vilket har hexadecimal representation 0x00005000. Efter att ha läst denna version från teckensnittsfilen kommer huvud- och sekundära nummer för objektet  Version16Dot16  att vara 0 respektive 20480. Och dessa värden i hexadecimal form är 0x0000 och 0x5000.

**Returns:**
int - Mindre versionsnummer.
### getRawBytes() {#getRawBytes--}
```
public byte[] getRawBytes()
```


Hämtar alla råa bitar för Version16Dot16 versionsnummer som byte-array med storlek 4 byte.

**Returns:**
byte[] - Alla råa bitar för Version16Dot16 versionsnummer som byte-array med storlek 4 byte.
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


Ställer in huvudversionsnummer. Värdet har bara mening i hexadecimal notation, till exempel version 0.5 för 'maxp' i faktiska teckensnittsfiler är 4 byte: \{0, 0, 80, 0\}, vilket har hexadecimal representation 0x00005000. Efter att ha läst denna version från teckensnittsfilen kommer huvud- och sekundära nummer för objektet  Version16Dot16  att vara 0 respektive 20480. Och dessa värden i hexadecimal form är 0x0000 och 0x5000.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | int | Huvudversionsnummer. |

### setMinorNumber(int value) {#setMinorNumber-int-}
```
public void setMinorNumber(int value)
```


Ställer in mindre versionsnummer. Värdet har bara mening i hexadecimal notation, till exempel version 0.5 för 'maxp' i faktiska teckensnittsfiler är 4 byte: \{0, 0, 80, 0\}, vilket har hexadecimal representation 0x00005000. Efter att ha läst denna version från teckensnittsfilen kommer huvud- och sekundära nummer för objektet  Version16Dot16  att vara 0 respektive 20480. Och dessa värden i hexadecimal form är 0x0000 och 0x5000.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | int | Mindre versionsnummer. |

### toString() {#toString--}
```
public String toString()
```


Returnerar versionsvärdet som en formaterad sträng. Till exempel "0.5", "1.1", "3.0" osv.

**Returns:**
java.lang.String - Objekt av  String  typ
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

