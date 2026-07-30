---
title: "Version16Dot16"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa el tipo de dato Version16Dot16"
type: docs
weight: 118
url: /es/java/com.aspose.font/version16dot16/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Cloneable
```
public class Version16Dot16 implements Cloneable
```

Representa el tipo de dato Version16Dot16
## Constructores

| Constructor | Descripción |
| --- | --- |
| [Version16Dot16()](#Version16Dot16--) | Constructor |
| [Version16Dot16(int majorNumber, int minorNumber)](#Version16Dot16-int-int-) | Constructor |
## Métodos

| Método | Descripción |
| --- | --- |
| [clone()](#clone--) | Crear una copia del objeto Version16Dot16. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMajorNumber()](#getMajorNumber--) | Obtiene el número de versión mayor. |
| [getMinorNumber()](#getMinorNumber--) | Obtiene el número de versión menor. |
| [getRawBytes()](#getRawBytes--) | Obtiene todos los bits sin procesar para el número de versión Version16Dot16 como una matriz de bytes de tamaño 4 bytes. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMajorNumber(int value)](#setMajorNumber-int-) | Establece el número de versión mayor. |
| [setMinorNumber(int value)](#setMinorNumber-int-) | Establece el número de versión menor. |
| [toString()](#toString--) | Devuelve el valor de la versión como una cadena formateada. Por ejemplo "0.5", "1.1", "3.0", etc. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Version16Dot16() {#Version16Dot16--}
```
public Version16Dot16()
```


Constructor

### Version16Dot16(int majorNumber, int minorNumber) {#Version16Dot16-int-int-}
```
public Version16Dot16(int majorNumber, int minorNumber)
```


Constructor

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| majorNumber | int | Número de versión mayor |
| minorNumber | int | Número de versión menor |

### clone() {#clone--}
```
public Object clone()
```


Crear una copia del objeto Version16Dot16.

**Returns:**
java.lang.Object - Objeto del tipo Version16Dot16
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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


Obtiene el número de versión mayor. El valor tiene sentido solo en notación hexadecimal, por ejemplo la versión 0.5 para 'maxp' en los archivos de fuentes reales son 4 bytes: \{0, 0, 80, 0\}, que tiene la representación hexadecimal 0x00005000. Después de leer esta versión del archivo de fuentes, los números mayor y menor para el objeto Version16Dot16 serán 0 y 20480 respectivamente. Y estos valores en forma hexadecimal son 0x0000 y 0x5000.

**Returns:**
int - Número de versión mayor.
### getMinorNumber() {#getMinorNumber--}
```
public int getMinorNumber()
```


Obtiene el número de versión menor. El valor tiene sentido solo en notación hexadecimal, por ejemplo la versión 0.5 para 'maxp' en los archivos de fuentes reales son 4 bytes: \{0, 0, 80, 0\}, que tiene la representación hexadecimal 0x00005000. Después de leer esta versión del archivo de fuentes, los números mayor y menor para el objeto Version16Dot16 serán 0 y 20480 respectivamente. Y estos valores en forma hexadecimal son 0x0000 y 0x5000.

**Returns:**
int - Número de versión menor.
### getRawBytes() {#getRawBytes--}
```
public byte[] getRawBytes()
```


Obtiene todos los bits sin procesar para el número de versión Version16Dot16 como una matriz de bytes de tamaño 4 bytes.

**Returns:**
byte[] - Todos los bits sin procesar para el número de versión Version16Dot16 como una matriz de bytes de tamaño 4 bytes.
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


Establece el número de versión mayor. El valor tiene sentido solo en notación hexadecimal, por ejemplo la versión 0.5 para 'maxp' en los archivos de fuentes reales son 4 bytes: \{0, 0, 80, 0\}, que tiene la representación hexadecimal 0x00005000. Después de leer esta versión del archivo de fuentes, los números mayor y menor para el objeto Version16Dot16 serán 0 y 20480 respectivamente. Y estos valores en forma hexadecimal son 0x0000 y 0x5000.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | int | Número de versión mayor. |

### setMinorNumber(int value) {#setMinorNumber-int-}
```
public void setMinorNumber(int value)
```


Establece el número de versión menor. El valor tiene sentido solo en notación hexadecimal, por ejemplo la versión 0.5 para 'maxp' en los archivos de fuentes reales son 4 bytes: \{0, 0, 80, 0\}, que tiene la representación hexadecimal 0x00005000. Después de leer esta versión del archivo de fuentes, los números mayor y menor para el objeto Version16Dot16 serán 0 y 20480 respectivamente. Y estos valores en forma hexadecimal son 0x0000 y 0x5000.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | int | Número de versión menor. |

### toString() {#toString--}
```
public String toString()
```


Devuelve el valor de la versión como una cadena formateada. Por ejemplo "0.5", "1.1", "3.0", etc.

**Returns:**
java.lang.String - Objeto del tipo String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

