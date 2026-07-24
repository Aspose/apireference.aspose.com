---
title: "ByteArrayResult"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Representa el resultado de la operación en forma de matriz de bytes."
type: docs
weight: 11
url: /es/java/com.aspose.page.plugins/bytearrayresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public class ByteArrayResult implements IOperationResult
```

Representa el resultado de la operación en forma de matriz de bytes.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [ByteArrayResult(byte[][] data)](#ByteArrayResult-byte-----) | Inicializa una nueva instancia con la matriz de matriz de bytes. |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Obtiene datos sin procesar. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Indica si el resultado es una matriz de bytes. |
| [isFile()](#isFile--) | Indica si el resultado es una ruta a un archivo de salida. |
| [isStream()](#isStream--) | Indica si el resultado es un stream de salida. |
| [isString()](#isString--) | Indica si el resultado es una cadena de texto. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Intenta convertir el resultado a un archivo. |
| [toStream()](#toStream--) | Intenta convertir el resultado a un objeto de stream. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ByteArrayResult(byte[][] data) {#ByteArrayResult-byte-----}
```
public ByteArrayResult(byte[][] data)
```


Inicializa una nueva instancia con la matriz de matriz de bytes.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| datos | byte[][] | Matriz de matriz de bytes. Se utiliza para la conversión de documento a imagen. Una matriz de bytes contiene los bytes de la imagen de una página. |

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
### getData() {#getData--}
```
public final Object getData()
```


Obtiene datos sin procesar.

**Returns:**
java.lang.Object - Un objeto que representa los datos de salida.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Indica si el resultado es una matriz de bytes.

**Returns:**
boolean -  true  si el resultado es una matriz de bytes; de lo contrario  false .
### isFile() {#isFile--}
```
public final boolean isFile()
```


Indica si el resultado es una ruta a un archivo de salida.

**Returns:**
boolean -  true  si el resultado es un archivo; de lo contrario  false .
### isStream() {#isStream--}
```
public final boolean isStream()
```


Indica si el resultado es un stream de salida.

**Returns:**
boolean -  true  si el resultado es un objeto de flujo; de lo contrario  false .
### isString() {#isString--}
```
public final boolean isString()
```


Indica si el resultado es una cadena de texto.

**Returns:**
boolean -  true  si el resultado es una cadena; de lo contrario  false .
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


Intenta convertir el resultado a un archivo.

**Returns:**
java.lang.String - Una cadena que representa la ruta al archivo de salida si el resultado es un archivo; de lo contrario  null .
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Intenta convertir el resultado a un objeto de stream.

**Returns:**
java.io.OutputStream - Un objeto de flujo que representa los datos de salida si el resultado es un flujo; de lo contrario  null .
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

