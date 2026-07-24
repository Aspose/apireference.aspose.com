---
title: "XpsConverterToPdfOptions"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Representa las opciones del convertidor de XPS a PDF para el complemento."
type: docs
weight: 13
url: /es/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

Representa las opciones del convertidor de XPS a PDF para el complemento [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Constructores

| Constructor | Descripción |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | Inicializa una nueva instancia del objeto [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions). |
## Métodos

| Método | Descripción |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Agrega una nueva fuente de datos a la colección de datos del complemento XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Agrega una nueva fuente de datos a la colección de datos del complemento XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Devuelve la colección de datos del complemento XpsConverterOptions. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Devuelve el valor que especifica el nivel de compresión de una imagen. |
| [getOperationName()](#getOperationName--) | Devuelve el nombre de la operación. |
| [getPageNumbers()](#getPageNumbers--) | Obtiene la matriz de números de páginas en el documento XPS a convertir. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Obtiene la colección de objetivos añadidos para guardar los resultados de la operación. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Establece el valor que especifica el nivel de compresión de una imagen. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Establece la matriz de números de páginas en el documento XPS a convertir. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


Inicializa una nueva instancia del objeto [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions).

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Agrega una nueva fuente de datos a la colección de datos del complemento XpsConverter.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Fuente de datos a añadir. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Agrega una nueva fuente de datos a la colección de datos del complemento XpsConverterOptions.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Fuente de datos (archivo o flujo) para los resultados de la operación de guardado. |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Devuelve la colección de datos del complemento XpsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Devuelve el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Returns:**
int - El valor que especifica el nivel de compresión de una imagen.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Devuelve el nombre de la operación.

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Obtiene la matriz de números de páginas en el documento XPS a convertir.

**Returns:**
int[] - Una matriz de números de páginas en el documento XPS.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Obtiene la colección de objetivos añadidos para guardar los resultados de la operación.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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




### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Establece el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | El valor que especifica el nivel de compresión de una imagen. |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Establece la matriz de números de páginas en el documento XPS a convertir. Si no se establece, se convertirán todas las páginas.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pageNumbers | int[] | Una matriz de números de páginas en el documento XPS. |

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

