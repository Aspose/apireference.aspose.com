---
title: "XpsConverterOptions"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Representa la clase base de opciones para el complemento."
type: docs
weight: 11
url: /es/java/com.aspose.xps.plugins/xpsconverteroptions/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPluginOptions](../../com.aspose.page.plugins/ipluginoptions), [com.aspose.page.plugins.IDataContainer](../../com.aspose.page.plugins/idatacontainer), [com.aspose.page.plugins.ISaveInstruction](../../com.aspose.page.plugins/isaveinstruction)
```
public class XpsConverterOptions implements IPluginOptions, IDataContainer, ISaveInstruction
```

Representa la clase base de opciones para el complemento [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
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
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Obtiene la colección de objetivos añadidos para guardar los resultados de la operación. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Establece el valor que especifica el nivel de compresión de una imagen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
public String getOperationName()
```


Devuelve el nombre de la operación.

**Returns:**
java.lang.String
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

