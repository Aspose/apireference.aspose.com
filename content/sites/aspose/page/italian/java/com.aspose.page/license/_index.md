---
title: "Licenza"
second_title: "Aspose.Page per Java API Reference"
description: "Fornisce metodi per licenziare il componente."
type: docs
weight: 14
url: /it/java/com.aspose.page/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Fornisce metodi per licenziare il componente.

In questo esempio, verrà tentato di trovare un file di licenza denominato MyLicense.lic nella cartella che contiene il componente, nella cartella che contiene l'assembly chiamante, nella cartella dell'assembly di ingresso e poi nelle risorse incorporate dell'assembly chiamante.

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
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | Per impostazione predefinita utilizziamo la sicurezza predefinita JDK. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | Per impostazione predefinita utilizziamo la sicurezza predefinita JRE. |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Concede licenza al componente. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Concede licenza al componente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Inizializza una nuova istanza di questa classe.

In questo esempio, verrà tentato di trovare un file di licenza denominato MyLicense.lic nella cartella che contiene il componente, nella cartella che contiene l'assembly chiamante, nella cartella dell'assembly di ingresso e poi nelle risorse incorporate dell'assembly chiamante.

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
### isInternalFIPSSecurity() {#isInternalFIPSSecurity--}
```
public static boolean isInternalFIPSSecurity()
```


Per impostazione predefinita utilizziamo la sicurezza predefinita JDK. Valore predefinito == false. In alcuni casi l'ambiente Java personalizzato non può supportare gli algoritmi richiesti, quindi possiamo suggerire di utilizzare la sicurezza FIPS interna incorporata.

**Returns:**
boolean - valore booleano
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setInternalFIPSSecurity(boolean internalFIPSSecurity) {#setInternalFIPSSecurity-boolean-}
```
public static void setInternalFIPSSecurity(boolean internalFIPSSecurity)
```


Per impostazione predefinita utilizziamo la sicurezza predefinita JRE. Valore predefinito == false. In alcuni casi l'ambiente Java personalizzato non può supportare gli algoritmi richiesti, quindi possiamo suggerire di utilizzare la sicurezza FIPS interna incorporata.

Nota anche: secondo l'algoritmo SecureRandom della JVM, su alcuni sistemi operativi /dev/random attende che venga generata una certa quantità di “rumore” sulla macchina host prima di restituire un risultato. La libreria usata per la generazione di numeri casuali nella JVM di Oracle si basa su /dev/random per impostazione predefinita sui platform UNIX. Sebbene /dev/random sia più sicuro, è consigliato utilizzare /dev/urandom se la configurazione predefinita della JVM presenta ritardi, oppure aggiungere dispositivi che generano entropia per /dev/random.

La seguente opzione Java può aiutare a evitare ritardi e sovrascrivere l'impostazione securerandom.source. -Djava.security.egd=file:/dev/./urandom

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| internalFIPSSecurity | boolean | valore booleano |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


Concede licenza al componente.

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


Concede licenza al componente.

Cerca di trovare la licenza nei seguenti percorsi:

1. Percorso esplicito.

2. La cartella del file JAR del componente.

In questo esempio, verrà tentato di trovare un file di licenza denominato MyLicense.lic nella cartella che contiene il componente, nella cartella che contiene l'assembly chiamante, nella cartella dell'assembly di ingresso e poi nelle risorse incorporate dell'assembly chiamante.

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| licenseName | java.lang.String | Può essere un nome file completo o breve o il nome di una risorsa incorporata. Usa una stringa vuota per passare alla modalità di valutazione. |

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

