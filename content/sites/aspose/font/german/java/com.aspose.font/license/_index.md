---
title: "Lizenz"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt Methoden zum Lizenzieren der Komponente bereit."
type: docs
weight: 58
url: /de/java/com.aspose.font/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Stellt Methoden zum Lizenzieren der Komponente bereit.

In diesem Beispiel wird versucht, eine Lizenzdatei mit dem Namen MyLicense.lic im Ordner zu finden, der die Komponente enthält, im Ordner, der die aufrufende Assembly enthält, im Ordner der Einstieg‑Assembly und anschließend in den eingebetteten Ressourcen der aufrufenden Assembly.

License license = new License();
license.setLicense("MyLicense.lic");
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [License()](#License--) | Initialisiert eine neue Instanz dieser Klasse. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Lizenziert die Komponente. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Lizenziert die Komponente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Initialisiert eine neue Instanz dieser Klasse.

In diesem Beispiel wird versucht, eine Lizenzdatei mit dem Namen MyLicense.lic im Ordner zu finden, der die Komponente enthält, im Ordner, der die aufrufende Assembly enthält, im Ordner der Einstieg‑Assembly und anschließend in den eingebetteten Ressourcen der aufrufenden Assembly.

License license = new License();
license.setLicense("MyLicense.lic");

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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


Lizenziert die Komponente.

Ein Stream, der die Lizenz enthält.

Verwenden Sie diese Methode, um eine Lizenz aus einem Stream zu laden.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | java.io.InputStream | Lizenz-Stream |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


Lizenziert die Komponente.

Versucht, die Lizenz an den folgenden Orten zu finden:

1. Expliziter Pfad.

2. Der Ordner der Komponenten‑Jar‑Datei.

In diesem Beispiel wird versucht, eine Lizenzdatei mit dem Namen MyLicense.lic im Ordner zu finden, der die Komponente enthält, im Ordner, der die aufrufende Assembly enthält, im Ordner der Einstieg‑Assembly und anschließend in den eingebetteten Ressourcen der aufrufenden Assembly.

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| licenseName | java.lang.String | Kann ein voller oder kurzer Dateiname oder der Name einer eingebetteten Ressource sein. Verwenden Sie einen leeren String, um in den Evaluierungsmodus zu wechseln. |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

