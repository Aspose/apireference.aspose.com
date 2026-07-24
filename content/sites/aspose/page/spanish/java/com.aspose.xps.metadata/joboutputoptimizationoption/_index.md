---
title: "JobOutputOptimization.JobOutputOptimizationOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe las opciones de la característica JobOutputOptimization."
type: docs
weight: 10
url: /es/java/com.aspose.xps.metadata/joboutputoptimization.joboutputoptimizationoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobOutputOptimization.JobOutputOptimizationOption extends Option
```

Describe las opciones de la función JobOutputOptimization.
## Campos

| Campo | Descripción |
| --- | --- |
| [ArchiveFormat](#ArchiveFormat) | especifica que el procesamiento del trabajo se optimice para salida de archivo. |
| [None](#None) | Especifica que el procesamiento del trabajo no debe optimizarse para un escenario particular. |
| [OptimizeForPortability](#OptimizeForPortability) | Especifica que el procesamiento del trabajo se optimice para la portabilidad (multidispositivo) de la salida. |
| [OptimizeForQuality](#OptimizeForQuality) | Especifica que el procesamiento del trabajo se optimice para la calidad de la salida. |
| [OptimizeForSpeed](#OptimizeForSpeed) | Especifica que el procesamiento del trabajo se optimice para la velocidad de la salida. |
## Métodos

| Método | Descripción |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Agrega una lista de elementos al final de la lista de ítems de esta opción. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Obtiene el nombre del elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ArchiveFormat {#ArchiveFormat}
```
public static final JobOutputOptimization.JobOutputOptimizationOption ArchiveFormat
```


especifica que el procesamiento del trabajo se optimice para salida de archivo.

### None {#None}
```
public static JobOutputOptimization.JobOutputOptimizationOption None
```


Especifica que el procesamiento del trabajo no debe optimizarse para un escenario particular.

### OptimizeForPortability {#OptimizeForPortability}
```
public static final JobOutputOptimization.JobOutputOptimizationOption OptimizeForPortability
```


Especifica que el procesamiento del trabajo se optimice para la portabilidad (multidispositivo) de la salida.

### OptimizeForQuality {#OptimizeForQuality}
```
public static final JobOutputOptimization.JobOutputOptimizationOption OptimizeForQuality
```


Especifica que el procesamiento del trabajo se optimice para la calidad de la salida.

### OptimizeForSpeed {#OptimizeForSpeed}
```
public static final JobOutputOptimization.JobOutputOptimizationOption OptimizeForSpeed
```


Especifica que el procesamiento del trabajo se optimice para la velocidad de la salida.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Agrega una lista de elementos al final de la lista de ítems de esta opción. Cada uno debe ser una instancia de  ScoredProperty  o de  Property .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista de elementos a agregar. |

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
### getName() {#getName--}
```
public String getName()
```


Obtiene el nombre del elemento.

**Returns:**
java.lang.String
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

