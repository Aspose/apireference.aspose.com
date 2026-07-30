---
title: "Licencia"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Proporciona métodos para licenciar el componente."
type: docs
weight: 58
url: /es/java/com.aspose.font/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Proporciona métodos para licenciar el componente.

En este ejemplo, se intentará encontrar un archivo de licencia llamado MyLicense.lic en la carpeta que contiene el componente, en la carpeta que contiene el ensamblado que llama, en la carpeta del ensamblado de entrada y luego en los recursos incrustados del ensamblado que llama.

License license = new License();
license.setLicense("MyLicense.lic");
## Constructores

| Constructor | Descripción |
| --- | --- |
| [License()](#License--) | Inicializa una nueva instancia de esta clase. |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Licencia el componente. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Licencia el componente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Inicializa una nueva instancia de esta clase.

En este ejemplo, se intentará encontrar un archivo de licencia llamado MyLicense.lic en la carpeta que contiene el componente, en la carpeta que contiene el ensamblado que llama, en la carpeta del ensamblado de entrada y luego en los recursos incrustados del ensamblado que llama.

License license = new License();
license.setLicense("MyLicense.lic");

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




### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


Licencia el componente.

Un flujo que contiene la licencia.

Utilice este método para cargar una licencia desde un flujo.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | java.io.InputStream | Flujo de licencia |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


Licencia el componente.

Intenta encontrar la licencia en las siguientes ubicaciones:

1. Ruta explícita.

2. La carpeta del archivo JAR del componente.

En este ejemplo, se intentará encontrar un archivo de licencia llamado MyLicense.lic en la carpeta que contiene el componente, en la carpeta que contiene el ensamblado que llama, en la carpeta del ensamblado de entrada y luego en los recursos incrustados del ensamblado que llama.

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| licenseName | java.lang.String | Puede ser un nombre de archivo completo o corto o el nombre de un recurso incrustado. Use una cadena vacía para cambiar al modo de evaluación. |

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

