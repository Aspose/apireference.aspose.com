---
title: "Licens"
second_title: "Aspose.Font för Java API-referens"
description: "Tillhandahåller metoder för att licensiera komponenten."
type: docs
weight: 58
url: /sv/java/com.aspose.font/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Tillhandahåller metoder för att licensiera komponenten.

I det här exemplet kommer ett försök att hitta en licensfil med namnet MyLicense.lic i mappen som innehåller komponenten, i mappen som innehåller den anropande samlingen, i mappen för startsamlingen och sedan i de inbäddade resurserna för den anropande samlingen.

License license = new License();
license.setLicense("MyLicense.lic");
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [License()](#License--) | Initierar en ny instans av denna klass. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Licensierar komponenten. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Licensierar komponenten. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Initierar en ny instans av denna klass.

I det här exemplet kommer ett försök att hitta en licensfil med namnet MyLicense.lic i mappen som innehåller komponenten, i mappen som innehåller den anropande samlingen, i mappen för startsamlingen och sedan i de inbäddade resurserna för den anropande samlingen.

License license = new License();
license.setLicense("MyLicense.lic");

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Licensierar komponenten.

En ström som innehåller licensen.

Använd den här metoden för att läsa in en licens från en ström.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| ström | java.io.InputStream | license Stream |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


Licensierar komponenten.

Försöker hitta licensen på följande platser:

1. Explicit sökväg.

2. Mappen för komponentens jar-fil.

I det här exemplet kommer ett försök att hitta en licensfil med namnet MyLicense.lic i mappen som innehåller komponenten, i mappen som innehåller den anropande samlingen, i mappen för startsamlingen och sedan i de inbäddade resurserna för den anropande samlingen.

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| licenseName | java.lang.String | Kan vara ett fullständigt eller kort filnamn eller namn på en inbäddad resurs. Använd en tom sträng för att växla till utvärderingsläge. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

