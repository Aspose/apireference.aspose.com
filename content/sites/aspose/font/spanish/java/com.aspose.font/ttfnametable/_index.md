---
title: "TtfNameTable"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la tabla de nombres del archivo de fuente TTF."
type: docs
weight: 105
url: /es/java/com.aspose.font/ttfnametable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfNameTable extends TtfTableBase
```

Representa la tabla "name" del archivo de fuente TTF.
## Métodos

| Método | Descripción |
| --- | --- |
| [addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)](#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Extrae todas las cadenas multilingües del objeto  mlNames  pasado y crea la estructura NameRecord correspondiente para cada cadena extraída usando los parámetros pasados  platformId ,  platformSpecificId  y  nameId . |
| [addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)](#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-) | Agrega una entrada en la tabla. |
| [deleteRecords(PlatformId platformId, int platformSpecificId)](#deleteRecords-com.aspose.font.PlatformId-int-) | Elimina todos los registros relacionados con la plataforma especificada. |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Elimina todos los registros relacionados con los parámetros pasados. |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-) | Elimina registro(s) relacionado(s) con los parámetros especificados. |
| [deleteRecordsByNameId(NameId nameId)](#deleteRecordsByNameId-com.aspose.font.NameId-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllNameRecords()](#getAllNameRecords--) | Devuelve todas las estructuras  NameRecord  de la tabla. |
| [getClass()](#getClass--) |  |
| [getMultiLanguageNameById(NameId nameId)](#getMultiLanguageNameById-com.aspose.font.NameId-) | devuelve un nombre por nameId. |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-) | Devuelve un nombre por nameId usando el identificador de plataforma pasado. |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-) | Devuelve un nombre como objeto del tipo  MultiLanguageString . |
| [getNameById(NameId nameId)](#getNameById-com.aspose.font.NameId-) | Devuelve un nombre por nameId si se encuentra, null de lo contrario. |
| [getNameRecordsByNameId(NameId nameId)](#getNameRecordsByNameId-com.aspose.font.NameId-) | Devuelve todas las estructuras  NameRecord  cuyo campo NameId es igual al valor  nameId  pasado. |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento desde el inicio de sfnt. |
| [getTag()](#getTag--) | Obtiene la etiqueta de la tabla. |
| [getTtfTables()](#getTtfTables--) | Referencia al repositorio de tabla TTF. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)](#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-) | Actualiza el nombre en registro(s) que están relacionados con la plataforma especificada (combinación de platformId y platformSpecificId), categoría (nameId) y idioma (languageId). |
| [updateNamesByNameId(NameId nameId, String newName)](#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-) | Selecciona todos los registros que están relacionados con la categoría lógica de cadena, especificada por el parámetro nameId, y actualiza el campo nombre (datos de cadena) en esos registros. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId) {#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)
```


Extrae todas las cadenas multilingües del objeto  mlNames  pasado y crea la estructura NameRecord correspondiente para cada cadena extraída usando los parámetros pasados  platformId ,  platformSpecificId  y  nameId . Valor del campo languageID se extrae del objeto  mlNames  . El nuevo registro recién creado se agrega a la tabla. Si se encuentra un registro que coincide con el recién creado por los campos platformID, platformSpecificID, nameID y langugeId, entonces el registro recién creado no se añadirá y solo se actualizarán los datos de cadena del registro existente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| mlNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Cadena multilingüe |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificador de plataforma |
| platformSpecificId | int | Identificador de codificación específico de la plataforma |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificador de nombre, categoría lógica de cadena, especificado por la enumeración  NameId . |

### addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name) {#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-}
```
public void addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)
```


Agrega una entrada en la tabla. La categoría de datos de cadena a agregar se especifica mediante el parámetro name.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificador de nombre, categoría lógica de cadena, especificado por la enumeración [NameId](../../com.aspose.font/nameid). |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificador de plataforma. |
| platformSpecificId | int | Identificador de codificación específica de la plataforma. Por favor, use un valor de una de estas enumeraciones: UnicodePlatformSpecificId, MacPlatformSpecificId, MSPlatformSpecificId. Qué enumeración usar se define por el contexto (parámetro platformId). |
| languageId | int | Identificador de idioma. Por favor, use un valor de las enumeraciones MSLanguageId o MacLanguageId, según el contexto, definido por el parámetro platformId. |
| nombre | java.lang.String | Datos reales de cadena. |

### deleteRecords(PlatformId platformId, int platformSpecificId) {#deleteRecords-com.aspose.font.PlatformId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId)
```


Elimina todos los registros relacionados con la plataforma especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificador de plataforma |
| platformSpecificId | int | Identificador de codificación específico de la plataforma |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)
```


Elimina todos los registros relacionados con los parámetros pasados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificador de plataforma |
| platformSpecificId | int | Identificador de codificación específico de la plataforma |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificador de nombre, categoría lógica de cadena, especificado por la enumeración  NameId . |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)
```


Elimina registro(s) relacionado(s) con los parámetros especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificador de plataforma |
| platformSpecificId | int | Identificador de codificación específico de la plataforma |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificador de nombre, categoría lógica de cadena, especificado por la enumeración  NameId . |
| languageId | int | Identificador de idioma |

### deleteRecordsByNameId(NameId nameId) {#deleteRecordsByNameId-com.aspose.font.NameId-}
```
public void deleteRecordsByNameId(NameId nameId)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) |  |

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
### getAllNameRecords() {#getAllNameRecords--}
```
public NameRecord[] getAllNameRecords()
```


Devuelve todas las estructuras  NameRecord  de la tabla.

**Returns:**
com.aspose.font.NameRecord[] - Todas las estructuras NameRecord de la tabla.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMultiLanguageNameById(NameId nameId) {#getMultiLanguageNameById-com.aspose.font.NameId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId)
```


devuelve un nombre por nameId.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Id de nombre. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - name
### getMultiLanguageNameById(NameId nameId, PlatformId platformId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId)
```


Devuelve un nombre por nameId usando el identificador de plataforma pasado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Id de nombre. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Id de plataforma. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)
```


Devuelve un nombre como objeto del tipo MultiLanguageString. El método recopila todas las estructuras NameRecord que coinciden con los parámetros pasados nameId, platformId y platformSpecificId y luego construye el objeto resultante basándose en esta lista de estructuras.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Id de nombre. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Id de plataforma. |
| platformSpecificId | int | Id específico de la plataforma. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getNameById(NameId nameId) {#getNameById-com.aspose.font.NameId-}
```
public String getNameById(NameId nameId)
```


Devuelve un nombre por nameId si se encuentra, null de lo contrario.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | identificador de nombre |

**Returns:**
java.lang.String - name
### getNameRecordsByNameId(NameId nameId) {#getNameRecordsByNameId-com.aspose.font.NameId-}
```
public NameRecord[] getNameRecordsByNameId(NameId nameId)
```


Devuelve todas las estructuras NameRecord cuyo campo NameId es igual al valor nameId pasado. Si no se encuentran registros, se devolverá una matriz vacía.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | identificador de nombre |

**Returns:**
com.aspose.font.NameRecord[] - Matriz de estructuras NameRecord
### getOffset() {#getOffset--}
```
public long getOffset()
```


Obtiene el desplazamiento desde el inicio de sfnt.

**Returns:**
long - Desplazamiento desde el inicio de sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Obtiene la etiqueta de la tabla.

**Returns:**
java.lang.String - Etiqueta de tabla.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referencia al repositorio de tabla TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
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
### updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName) {#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-}
```
public void updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)
```


Actualiza el nombre en registro(s) que están relacionados con la plataforma especificada (combinación de platformId y platformSpecificId), categoría (nameId) y idioma (languageId).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Identificador de plataforma |
| platformSpecificId | int | Identificador de codificación específico de la plataforma |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificador de nombre, categoría lógica de cadena, especificado por la enumeración  NameId . |
| languageId | int | Identificador de idioma |
| newName | java.lang.String | Nuevo nombre o nuevos datos de cadena |

### updateNamesByNameId(NameId nameId, String newName) {#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-}
```
public void updateNamesByNameId(NameId nameId, String newName)
```


Selecciona todos los registros que están relacionados con la categoría lógica de cadena, especificada por el parámetro nameId, y actualiza el campo name (datos de cadena) en esos registros. Los campos relacionados con la plataforma (platformID, Platform-specific encoding ID) y el idioma (Language ID) no se ven afectados por este método. Sólo los datos de cadena del nombre se reemplazan por un nuevo nombre. Use este método con precaución, ya que reemplazará los nombres originales para todas las plataformas e idiomas relacionados con nameId. Puede generar conflictos en casos en los que los nombres originales tenían valores diferentes, porque la operación de reemplazo cambia todos esos valores por uno nuevo único. Y este nuevo valor puede presentar una inconsistencia lógica con algunas plataformas e idiomas. Este método es útil en casos en los que el nombre original tiene una única representación para todas las plataformas e idiomas, por ejemplo, cuando los datos de cadena del nombre están en inglés.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Identificador de nombre, categoría lógica de cadena, especificado por la enumeración  NameId . |
| newName | java.lang.String | Nuevo nombre o nuevos datos de cadena |

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

