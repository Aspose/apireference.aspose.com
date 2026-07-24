---
title: "PageDeviceColorSpaceProfileURI"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Especifica una URI relativa a la raíz del paquete para un perfil ICC contenido en un documento XPS."
type: docs
weight: 94
url: /es/java/com.aspose.xps.metadata/pagedevicecolorspaceprofileuri/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.StringParameterInit](../../com.aspose.xps.metadata/stringparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageDeviceColorSpaceProfileURI extends StringParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Especifica una URI relativa a la raíz del paquete a un perfil ICC contenido en un documento XPS. El procesamiento de esta opción depende de la configuración de la característica PageDeviceColorSpaceUsage. Se asume que todos los elementos que usan ese perfil ya están en el espacio de color del dispositivo apropiado, y no serán gestionados en color por el controlador o el dispositivo. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedevicecolorspaceprofileuri
## Constructores

| Constructor | Descripción |
| --- | --- |
| [PageDeviceColorSpaceProfileURI(String value)](#PageDeviceColorSpaceProfileURI-java.lang.String-) | Crea una nueva instancia. |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxLength()](#getMaxLength--) | Para valores de cadena, define la cadena más corta más larga. |
| [getMinLength()](#getMinLength--) | Para valores de cadena, define la cadena más corta permitida. |
| [getName()](#getName--) | Obtiene el nombre del elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageDeviceColorSpaceProfileURI(String value) {#PageDeviceColorSpaceProfileURI-java.lang.String-}
```
public PageDeviceColorSpaceProfileURI(String value)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.lang.String | El valor del parámetro. |

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
### getMaxLength() {#getMaxLength--}
```
public int getMaxLength()
```


Para valores de cadena, define la cadena más corta más larga.

**Returns:**
int - La cadena más larga permitida.
### getMinLength() {#getMinLength--}
```
public int getMinLength()
```


Para valores de cadena, define la cadena más corta permitida.

**Returns:**
int - La cadena más corta permitida.
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

