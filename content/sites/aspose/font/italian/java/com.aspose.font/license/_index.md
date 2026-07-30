---
title: "Licenza"
second_title: "Riferimento API Aspose.Font per Java"
description: "Fornisce metodi per licenziare il componente."
type: docs
weight: 58
url: /it/java/com.aspose.font/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Fornisce metodi per licenziare il componente.

In questo esempio, si cercherà di trovare un file di licenza denominato MyLicense.lic nella cartella che contiene il componente, nella cartella che contiene l'assembly chiamante, nella cartella dell'assembly di ingresso e poi nelle risorse incorporate dell'assembly chiamante.

License license = new License();
license.setLicense("MyLicense.lic");
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [License()](#License--) | Inizializza una nuova istanza di questa classe. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Licenzia il componente. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Licenzia il componente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Inizializza una nuova istanza di questa classe.

In questo esempio, si cercherà di trovare un file di licenza denominato MyLicense.lic nella cartella che contiene il componente, nella cartella che contiene l'assembly chiamante, nella cartella dell'assembly di ingresso e poi nelle risorse incorporate dell'assembly chiamante.

License license = new License();
license.setLicense("MyLicense.lic");

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


Licenzia il componente.

Uno stream che contiene la licenza.

Utilizza questo metodo per caricare una licenza da uno stream.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | java.io.InputStream | Stream di licenza |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


Licenzia il componente.

Cerca di trovare la licenza nei seguenti percorsi:

1. Percorso esplicito.

2. La cartella del file jar del componente.

In questo esempio, si cercherà di trovare un file di licenza denominato MyLicense.lic nella cartella che contiene il componente, nella cartella che contiene l'assembly chiamante, nella cartella dell'assembly di ingresso e poi nelle risorse incorporate dell'assembly chiamante.

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| licenseName | java.lang.String | Può essere un nome file completo o abbreviato o il nome di una risorsa incorporata. Usa una stringa vuota per passare alla modalità di valutazione. |

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

