---
title: "License"
second_title: "Aspose.Page för Java API-referens"
description: "Tillhandahåller metoder för att licensiera komponenten."
type: docs
weight: 14
url: /sv/java/com.aspose.page/license/
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
| [License()](#License--) | Initierar en ny instans av den här klassen. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | Som standard använder vi standard jdk-säkerhet. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | Som standard använder vi standard jre-säkerhet. |
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


Initierar en ny instans av den här klassen.

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
### isInternalFIPSSecurity() {#isInternalFIPSSecurity--}
```
public static boolean isInternalFIPSSecurity()
```


Som standard använder vi standard jdk-säkerhet. Standardvärde == false. I vissa fall kan en anpassad java-miljö inte stödja nödvändiga algoritmer, så vi kan föreslå att använda intern inbyggd FIPS-säkerhet.

**Returns:**
boolean - booleskt värde
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


Som standard använder vi standard jre-säkerhet. Standardvärde == false. I vissa fall kan en anpassad java-miljö inte stödja nödvändiga algoritmer, så vi kan föreslå att använda intern inbyggd FIPS-säkerhet.

Observera också: Enligt JVM SecureRandom-algoritmen väntar /dev/random på vissa operativsystem på en viss mängd \\u201cnoise\\u201d som genereras på värddatorn innan ett resultat returneras. Biblioteket som används för slumpmässig talgenerering i Oracle\\u2019s JVM förlitar sig som standard på /dev/random för UNIX-plattformar. Även om /dev/random är säkrare rekommenderas det att använda /dev/urandom om standard JVM‑konfigurationen ger fördröjningar, eller att lägga till enheter som genererar entropi för /dev/random.

Följande java‑alternativ kan hjälpa till att undvika fördröjningar och åsidosätta inställningen securerandom.source. -Djava.security.egd=file:/dev/./urandom

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| internalFIPSSecurity | boolean | booleskt värde |

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
| ström | java.io.InputStream | licensström |

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
| licenseName | java.lang.String | Kan vara ett fullständigt eller kort filnamn eller namnet på en inbäddad resurs. Använd en tom sträng för att växla till utvärderingsläge. |

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

