---
title: "GlyphId"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta gli ID glifo disponibili nel Font."
type: docs
weight: 50
url: /it/java/com.aspose.font/glyphid/
---
**Inheritance:**
java.lang.Object
```
public abstract class GlyphId
```

Rappresenta gli ID glifo, disponibili nel Font. L'ID glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'ID di Type1 è un nome di glifo, istanza della classe ( GlyphStringId ). L'ID di TTF è un indice int, istanza della classe ( GlyphUInt32Id ).
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | Restituisce true se due ID di glifo non sono uguali. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) | Restituisce il codice hash dell'oggetto. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(GlyphId obj1, Object obj2)](#op-Equality-com.aspose.font.GlyphId-java.lang.Object-) | Restituisce true se due ID di glifo sono uguali. |
| [op_Inequality(GlyphId obj1, Object obj2)](#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-) | Restituisce true se due ID di glifo non sono uguali. |
| [toGlyphStringId()](#toGlyphStringId--) | Cast virtuale a GlyphStringId. |
| [toGlyphUInt32Id()](#toGlyphUInt32Id--) | Conversione virtuale a GlyphUInt32Id. |
| [toString()](#toString--) | Restituisce la rappresentazione stringa dell'ID glifo. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Restituisce true se due ID di glifo non sono uguali.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | java.lang.Object | Identificatore del glifo da confrontare. |

**Returns:**
boolean - Risultato del confronto.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public abstract int hashCode()
```


Restituisce il codice hash dell'oggetto.

**Returns:**
int - Codice hash dell'oggetto.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(GlyphId obj1, Object obj2) {#op-Equality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Equality(GlyphId obj1, Object obj2)
```


Restituisce true se due ID di glifo sono uguali.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | Primo identificatore del glifo da confrontare. |
| obj2 | java.lang.Object | Secondo identificatore del glifo da confrontare. |

**Returns:**
boolean - Risultato del confronto.
### op_Inequality(GlyphId obj1, Object obj2) {#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Inequality(GlyphId obj1, Object obj2)
```


Restituisce true se due ID di glifo non sono uguali.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | Primo identificatore del glifo da confrontare. |
| obj2 | java.lang.Object | Secondo identificatore del glifo da confrontare. |

**Returns:**
boolean - Risultato del confronto.
### toGlyphStringId() {#toGlyphStringId--}
```
public GlyphStringId toGlyphStringId()
```


Cast virtuale a GlyphStringId. GlyphStringId sovrascrive per restituire l'istanza.

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - null
### toGlyphUInt32Id() {#toGlyphUInt32Id--}
```
public GlyphUInt32Id toGlyphUInt32Id()
```


Conversione virtuale a GlyphUInt32Id. GlyphUInt32Id sovrascrive per restituire l'istanza.

**Returns:**
[GlyphUInt32Id](../../com.aspose.font/glyphuint32id) - null
### toString() {#toString--}
```
public abstract String toString()
```


Restituisce la rappresentazione stringa dell'ID glifo.

**Returns:**
java.lang.String - identificatore del glifo
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

