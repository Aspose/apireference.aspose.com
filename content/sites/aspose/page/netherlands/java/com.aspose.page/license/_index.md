---
title: "License"
second_title: "Aspose.Page voor Java API-referentie"
description: "Biedt methoden om het component te licentiëren."
type: docs
weight: 14
url: /nl/java/com.aspose.page/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Biedt methoden om het component te licentiëren.

In dit voorbeeld wordt geprobeerd een licentiebestand met de naam MyLicense.lic te vinden in de map die de component bevat, in de map die de aanroepende assembly bevat, in de map van de entry-assembly en vervolgens in de ingesloten resources van de aanroepende assembly.

License license = new License();
license.setLicense("MyLicense.lic");
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [License()](#License--) | Initialiseert een nieuw exemplaar van deze klasse. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | Standaard gebruiken we de standaard jdk-beveiliging. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | Standaard gebruiken we de standaard jre-beveiliging. |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Licentieert de component. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Licentieert de component. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Initialiseert een nieuw exemplaar van deze klasse.

In dit voorbeeld wordt geprobeerd een licentiebestand met de naam MyLicense.lic te vinden in de map die de component bevat, in de map die de aanroepende assembly bevat, in de map van de entry-assembly en vervolgens in de ingesloten resources van de aanroepende assembly.

License license = new License();
license.setLicense("MyLicense.lic");

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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


Standaard gebruiken we de standaard jdk-beveiliging. Standaardwaarde == false. In sommige gevallen kan een aangepaste Java-omgeving de vereiste algoritmen niet ondersteunen, dus we kunnen voorstellen om interne ingebouwde FIPS-beveiliging te gebruiken.

**Returns:**
boolean - booleaanse waarde
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


Standaard gebruiken we de standaard jre-beveiliging. Standaardwaarde == false. In sommige gevallen kan een aangepaste Java-omgeving de vereiste algoritmen niet ondersteunen, dus we kunnen voorstellen om interne ingebouwde FIPS-beveiliging te gebruiken.

Let op ook: Volgens het JVM SecureRandom-algoritme wacht /dev/random op sommige besturingssystemen op een bepaalde hoeveelheid \\u201cnoise\\u201d die op de hostmachine wordt gegenereerd voordat een resultaat wordt geretourneerd. De bibliotheek die wordt gebruikt voor willekeurige getalgeneratie in Oracle\\u2019s JVM vertrouwt standaard op /dev/random voor UNIX-platformen. Hoewel /dev/random veiliger is, wordt aanbevolen om /dev/urandom te gebruiken als de standaard JVM-configuratie vertragingen heeft, of om apparaten toe te voegen die entropie genereren voor /dev/random.

De volgende Java-optie kan helpen om vertragingen te vermijden en de instelling securerandom.source te overschrijven. -Djava.security.egd=file:/dev/./urandom

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| internalFIPSSecurity | boolean | booleaanse waarde |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


Licentieert de component.

Een stream die de licentie bevat.

Gebruik deze methode om een licentie uit een stream te laden.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | java.io.InputStream | license Stream |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


Licentieert de component.

Probeert de licentie te vinden op de volgende locaties:

1. Expliciet pad.

2. De map van het component‑jar‑bestand.

In dit voorbeeld wordt geprobeerd een licentiebestand met de naam MyLicense.lic te vinden in de map die de component bevat, in de map die de aanroepende assembly bevat, in de map van de entry-assembly en vervolgens in de ingesloten resources van de aanroepende assembly.

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| licenseName | java.lang.String | Kan een volledige of korte bestandsnaam of de naam van een ingesloten resource zijn. Gebruik een lege string om over te schakelen naar evaluatiemodus. |

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

