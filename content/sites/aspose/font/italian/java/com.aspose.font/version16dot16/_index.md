---
title: "Version16Dot16"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta il tipo di dato Version16Dot16"
type: docs
weight: 118
url: /it/java/com.aspose.font/version16dot16/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Cloneable
```
public class Version16Dot16 implements Cloneable
```

Rappresenta il tipo di dato Version16Dot16
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [Version16Dot16()](#Version16Dot16--) | Costruttore |
| [Version16Dot16(int majorNumber, int minorNumber)](#Version16Dot16-int-int-) | Costruttore |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [clone()](#clone--) | Crea una copia dell'oggetto Version16Dot16. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMajorNumber()](#getMajorNumber--) | Ottiene il numero di versione maggiore. |
| [getMinorNumber()](#getMinorNumber--) | Ottiene il numero di versione minore. |
| [getRawBytes()](#getRawBytes--) | Ottiene tutti i bit grezzi per il numero di versione Version16Dot16 come array di byte di dimensione 4 byte. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMajorNumber(int value)](#setMajorNumber-int-) | Imposta il numero di versione maggiore. |
| [setMinorNumber(int value)](#setMinorNumber-int-) | Imposta il numero di versione minore. |
| [toString()](#toString--) | Restituisce il valore della versione come stringa formattata. Ad esempio "0.5", "1.1", "3.0" ecc. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Version16Dot16() {#Version16Dot16--}
```
public Version16Dot16()
```


Costruttore

### Version16Dot16(int majorNumber, int minorNumber) {#Version16Dot16-int-int-}
```
public Version16Dot16(int majorNumber, int minorNumber)
```


Costruttore

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| majorNumber | int | Numero di versione maggiore |
| minorNumber | int | Numero di versione minore |

### clone() {#clone--}
```
public Object clone()
```


Crea una copia dell'oggetto Version16Dot16.

**Returns:**
java.lang.Object - Oggetto di tipo Version16Dot16
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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


Ottiene il numero di versione maggiore. Il valore ha senso solo in notazione esadecimale, per esempio la versione 0.5 per 'maxp' nei file di font reali è di 4 byte: \{0, 0, 80, 0\}, che ha la rappresentazione esadecimale 0x00005000. Dopo aver letto questa versione dal file di font, i numeri maggiore e minore per l'oggetto Version16Dot16 saranno 0 e 20480 rispettivamente. E questi valori in forma esadecimale sono 0x0000 e 0x5000.

**Returns:**
int - Numero di versione maggiore.
### getMinorNumber() {#getMinorNumber--}
```
public int getMinorNumber()
```


Ottiene il numero di versione minore. Il valore ha senso solo in notazione esadecimale, per esempio la versione 0.5 per 'maxp' nei file di font reali è di 4 byte: \{0, 0, 80, 0\}, che ha la rappresentazione esadecimale 0x00005000. Dopo aver letto questa versione dal file di font, i numeri maggiore e minore per l'oggetto Version16Dot16 saranno 0 e 20480 rispettivamente. E questi valori in forma esadecimale sono 0x0000 e 0x5000.

**Returns:**
int - Numero di versione minore.
### getRawBytes() {#getRawBytes--}
```
public byte[] getRawBytes()
```


Ottiene tutti i bit grezzi per il numero di versione Version16Dot16 come array di byte di dimensione 4 byte.

**Returns:**
byte[] - Tutti i bit grezzi per il numero di versione Version16Dot16 come array di byte di dimensione 4 byte.
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


Imposta il numero di versione maggiore. Il valore ha senso solo in notazione esadecimale, per esempio la versione 0.5 per 'maxp' nei file di font reali è di 4 byte: \{0, 0, 80, 0\}, che ha la rappresentazione esadecimale 0x00005000. Dopo aver letto questa versione dal file di font, i numeri maggiore e minore per l'oggetto Version16Dot16 saranno 0 e 20480 rispettivamente. E questi valori in forma esadecimale sono 0x0000 e 0x5000.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Numero di versione maggiore. |

### setMinorNumber(int value) {#setMinorNumber-int-}
```
public void setMinorNumber(int value)
```


Imposta il numero di versione minore. Il valore ha senso solo in notazione esadecimale, per esempio la versione 0.5 per 'maxp' nei file di font reali è di 4 byte: \{0, 0, 80, 0\}, che ha la rappresentazione esadecimale 0x00005000. Dopo aver letto questa versione dal file di font, i numeri maggiore e minore per l'oggetto Version16Dot16 saranno 0 e 20480 rispettivamente. E questi valori in forma esadecimale sono 0x0000 e 0x5000.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Numero di versione minore. |

### toString() {#toString--}
```
public String toString()
```


Restituisce il valore della versione come stringa formattata. Ad esempio "0.5", "1.1", "3.0" ecc.

**Returns:**
java.lang.String - Oggetto di tipo String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

