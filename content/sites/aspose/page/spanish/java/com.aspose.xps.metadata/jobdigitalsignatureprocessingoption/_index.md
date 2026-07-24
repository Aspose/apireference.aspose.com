---
title: "JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe las opciones de la característica JobDigitalSignatureProcessing."
type: docs
weight: 10
url: /es/java/com.aspose.xps.metadata/jobdigitalsignatureprocessing.jobdigitalsignatureprocessingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption extends Option
```

Describe las opciones de la característica JobDigitalSignatureProcessing.
## Campos

| Campo | Descripción |
| --- | --- |
| [PrintInvalidSignatures](#PrintInvalidSignatures) | Imprima el trabajo sin importar la validez de las firmas digitales. |
| [PrintInvalidSignaturesWithErrorReport](#PrintInvalidSignaturesWithErrorReport) | Imprima el trabajo sin importar la validez de las firmas digitales. |
| [PrintOnlyValidSignatures](#PrintOnlyValidSignatures) | Imprima el trabajo solo si todas las firmas digitales son válidas. |
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
### PrintInvalidSignatures {#PrintInvalidSignatures}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignatures
```


Imprima el trabajo sin importar la validez de las firmas digitales. Las firmas digitales PUEDEN ser ignoradas.

### PrintInvalidSignaturesWithErrorReport {#PrintInvalidSignaturesWithErrorReport}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignaturesWithErrorReport
```


Imprima el trabajo sin importar la validez de las firmas digitales. En caso de que se encuentre una firma inválida, se debe imprimir una página de error al final del trabajo. Las firmas digitales NO DEBEN ser ignoradas.

### PrintOnlyValidSignatures {#PrintOnlyValidSignatures}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintOnlyValidSignatures
```


Imprima el trabajo solo si todas las firmas digitales son válidas. Las firmas digitales NO DEBEN ser ignoradas.

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

