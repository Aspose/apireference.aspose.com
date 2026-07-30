---
title: "MultiLanguageString"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa una cadena multilingüe."
type: docs
weight: 66
url: /es/java/com.aspose.font/multilanguagestring/
---
**Inheritance:**
java.lang.Object
```
public class MultiLanguageString
```

Representa una cadena multilingüe.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [MultiLanguageString()](#MultiLanguageString--) | Crea una cadena multilingüe vacía. |
## Métodos

| Método | Descripción |
| --- | --- |
| [addLanguageString(String str, int languageId)](#addLanguageString-java.lang.String-int-) | Agrega una cadena de un idioma específico. |
| [containsString(String str)](#containsString-java.lang.String-) | Devuelve true si la cadena está presente en todas las cadenas de idioma. |
| [equals(Object objToCompare)](#equals-java.lang.Object-) | Devuelve true si los objetos se consideran iguales. |
| [getAllLanguageIds()](#getAllLanguageIds--) | Obtiene los identificadores de idioma para todas las cadenas o una matriz vacía si no hay cadenas presentes. |
| [getAllStrings()](#getAllStrings--) | Devuelve todas las cadenas de todos los idiomas. |
| [getClass()](#getClass--) |  |
| [getEnglishString()](#getEnglishString--) | Devuelve la cadena en inglés si se encuentra. |
| [getStringForLanguageId(int languageId)](#getStringForLanguageId-int-) | Devuelve la cadena relacionada con el identificador de idioma proporcionado, si se encuentra. |
| [hashCode()](#hashCode--) | Implementación de GetHashCode. |
| [isEmpty()](#isEmpty--) | True, si MultiLanguageString no tiene cadenas de idiomas. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(MultiLanguageString obj1, String obj2)](#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-) | Implementación del operador de igualdad. |
| [op_Equality(String obj1, MultiLanguageString obj2)](#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-) | Implementación del operador de igualdad. |
| [op_Inequality(MultiLanguageString obj1, String obj2)](#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-) | Implementación del operador de desigualdad. |
| [op_Inequality(String obj1, MultiLanguageString obj2)](#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-) | Implementación del operador de desigualdad. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MultiLanguageString() {#MultiLanguageString--}
```
public MultiLanguageString()
```


Crea una cadena multilingüe vacía.

### addLanguageString(String str, int languageId) {#addLanguageString-java.lang.String-int-}
```
public void addLanguageString(String str, int languageId)
```


Agrega una cadena de un idioma específico.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| str | java.lang.String | Cadena a agregar |
| languageId | int | Identificador de idioma |

### containsString(String str) {#containsString-java.lang.String-}
```
public boolean containsString(String str)
```


Devuelve true si la cadena está presente en todas las cadenas de idioma.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| str | java.lang.String | Cadena a comprobar. |

**Returns:**
boolean - True si la cadena está presente en todas las cadenas de idioma.
### equals(Object objToCompare) {#equals-java.lang.Object-}
```
public boolean equals(Object objToCompare)
```


Devuelve true si los objetos se consideran iguales.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| objToCompare | java.lang.Object | objeto a comparar con |

**Returns:**
boolean - resultado de la comparación
### getAllLanguageIds() {#getAllLanguageIds--}
```
public int[] getAllLanguageIds()
```


Obtiene los identificadores de idioma para todas las cadenas o una matriz vacía si no hay cadenas presentes.

**Returns:**
int[] - Matriz con identificadores de idioma o matriz vacía si no hay cadenas presentes.
### getAllStrings() {#getAllStrings--}
```
public String[] getAllStrings()
```


Devuelve todas las cadenas de todos los idiomas.

**Returns:**
java.lang.String[] - Matriz de todas las cadenas de todos los idiomas.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEnglishString() {#getEnglishString--}
```
public String getEnglishString()
```


Devuelve la cadena en inglés si se encuentra. De lo contrario, devuelve la primera cadena que no sea en inglés.

**Returns:**
java.lang.String - Cadena en inglés si se encuentra, de lo contrario la primera cadena que no sea en inglés.
### getStringForLanguageId(int languageId) {#getStringForLanguageId-int-}
```
public String getStringForLanguageId(int languageId)
```


Devuelve la cadena relacionada con el identificador de idioma proporcionado, si se encuentra. Cadena vacía en caso contrario.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| languageId | int | Identificador de idioma. |

**Returns:**
java.lang.String - Cadena relacionada con el identificador de idioma proporcionado, si se encuentra. Cadena vacía en caso contrario.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Implementación de GetHashCode.

**Returns:**
int - código hash del objeto
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


True, si MultiLanguageString no tiene cadenas de idiomas.

**Returns:**
boolean - Verdadero, si MultiLanguageString no tiene cadenas de idiomas.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(MultiLanguageString obj1, String obj2) {#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Equality(MultiLanguageString obj1, String obj2)
```


Implementación del operador de igualdad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | primer objeto a comparar |
| obj2 | java.lang.String | segundo objeto a comparar |

**Returns:**
boolean - resultado de la comparación
### op_Equality(String obj1, MultiLanguageString obj2) {#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Equality(String obj1, MultiLanguageString obj2)
```


Implementación del operador de igualdad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj1 | java.lang.String | cadena a comparar |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | cadena multilingüe a comparar |

**Returns:**
boolean - resultado de la comparación
### op_Inequality(MultiLanguageString obj1, String obj2) {#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Inequality(MultiLanguageString obj1, String obj2)
```


Implementación del operador de desigualdad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | cadena a comparar |
| obj2 | java.lang.String | cadena multilingüe a comparar |

**Returns:**
boolean - resultado de la comparación
### op_Inequality(String obj1, MultiLanguageString obj2) {#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Inequality(String obj1, MultiLanguageString obj2)
```


Implementación del operador de desigualdad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj1 | java.lang.String | cadena a comparar |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | cadena multilingüe a comparar |

**Returns:**
boolean - resultado de la comparación
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

