---
title: "TtfEncodingParameters"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta i parametri di codifica TTF."
type: docs
weight: 93
url: /it/java/com.aspose.font/ttfencodingparameters/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IEncodingParameters](../../com.aspose.font/iencodingparameters)
```
public class TtfEncodingParameters implements IEncodingParameters
```

Rappresenta i parametri di codifica TTF. Dovrebbe essere usato per richiedere una codifica specifica dal font TTF.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [TtfEncodingParameters(int platformId, int platformSpecificId)](#TtfEncodingParameters-int-int-) | Inizializza una nuova istanza della classe TtfEncodingParameters. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPlatformId()](#getPlatformId--) | Ottieni il valore PlatformId. |
| [getPlatformSpecificId()](#getPlatformSpecificId--) | Ottiene il valore PlatformSpecificId. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setPlatformId(int value)](#setPlatformId-int-) | Imposta il valore PlatformId. |
| [setPlatformSpecificId(int value)](#setPlatformSpecificId-int-) | Imposta il valore PlatformSpecificId. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtfEncodingParameters(int platformId, int platformSpecificId) {#TtfEncodingParameters-int-int-}
```
public TtfEncodingParameters(int platformId, int platformSpecificId)
```


Inizializza una nuova istanza della classe TtfEncodingParameters. Accetta Platform Id e Platform-specific encoding id come parametri. Questi parametri sono usati per richiedere una sottotabella CMap speciale dalla tabella CMap principale del font, vedere la tabella 'CMap', 'name' nella specifica del file OpenType Font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| platformId | int | ID piattaforma. |
| platformSpecificId | int | ID di codifica specifica della piattaforma. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
### getPlatformId() {#getPlatformId--}
```
public int getPlatformId()
```


Ottieni il valore PlatformId.

**Returns:**
int - valore PlatformId.
### getPlatformSpecificId() {#getPlatformSpecificId--}
```
public int getPlatformSpecificId()
```


Ottiene il valore PlatformSpecificId.

**Returns:**
int - valore PlatformSpecificId.
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




### setPlatformId(int value) {#setPlatformId-int-}
```
public void setPlatformId(int value)
```


Imposta il valore PlatformId.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Valore PlatformId. |

### setPlatformSpecificId(int value) {#setPlatformSpecificId-int-}
```
public void setPlatformSpecificId(int value)
```


Imposta il valore PlatformSpecificId.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Valore PlatformSpecificId. |

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

