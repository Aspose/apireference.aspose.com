---
title: "Licence"
second_title: "Référence API Aspose.Page pour Java"
description: "Fournit des méthodes pour licencier le composant."
type: docs
weight: 14
url: /fr/java/com.aspose.page/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Fournit des méthodes pour licencier le composant.

Dans cet exemple, une tentative sera faite pour trouver un fichier de licence nommé MyLicense.lic dans le dossier qui contient le composant, dans le dossier qui contient l'assembly appelant, dans le dossier de l'assembly d'entrée puis dans les ressources intégrées de l'assembly appelant.

License license = new License();
license.setLicense("MyLicense.lic");
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [License()](#License--) | Initialise une nouvelle instance de cette classe. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | Par défaut, nous utilisons la sécurité jdk par défaut. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | Par défaut, nous utilisons la sécurité jre par défaut. |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Licence le composant. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Licence le composant. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Initialise une nouvelle instance de cette classe.

Dans cet exemple, une tentative sera faite pour trouver un fichier de licence nommé MyLicense.lic dans le dossier qui contient le composant, dans le dossier qui contient l'assembly appelant, dans le dossier de l'assembly d'entrée puis dans les ressources intégrées de l'assembly appelant.

License license = new License();
license.setLicense("MyLicense.lic");

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
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


Par défaut, nous utilisons la sécurité jdk par défaut. Valeur par défaut == false. Dans certains cas, un environnement java personnalisé ne peut pas prendre en charge les algorithmes requis, nous pouvons donc suggérer d'utiliser la sécurité FIPS interne intégrée.

**Returns:**
booléen - valeur booléenne
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


Par défaut, nous utilisons la sécurité jre par défaut. Valeur par défaut == false. Dans certains cas, un environnement java personnalisé ne peut pas prendre en charge les algorithmes requis, nous pouvons donc suggérer d'utiliser la sécurité FIPS interne intégrée.

Notez également : Selon l'algorithme JVM SecureRandom sur certains systèmes d'exploitation, /dev/random attend qu'une certaine quantité de \\u201cnoise\\u201d soit générée sur la machine hôte avant de renvoyer un résultat. La bibliothèque utilisée pour la génération de nombres aléatoires dans la JVM d'Oracle s'appuie sur /dev/random par défaut pour les plateformes UNIX. Bien que /dev/random soit plus sécurisé, il est recommandé d'utiliser /dev/urandom si la configuration JVM par défaut entraîne des délais, ou d'ajouter des dispositifs qui génèrent de l'entropie pour /dev/random.

L'option java suivante peut aider à éviter les délais et à remplacer le paramètre securerandom.source. -Djava.security.egd=file:/dev/./urandom

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| internalFIPSSecurity | boolean | valeur booléenne |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


Licence le composant.

Un flux qui contient la licence.

Utilisez cette méthode pour charger une licence à partir d'un flux.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| flux | java.io.InputStream | Flux de licence |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


Licence le composant.

Essaye de trouver la licence aux emplacements suivants :

1. Chemin explicite.

2. Le dossier du fichier jar du composant.

Dans cet exemple, une tentative sera faite pour trouver un fichier de licence nommé MyLicense.lic dans le dossier qui contient le composant, dans le dossier qui contient l'assembly appelant, dans le dossier de l'assembly d'entrée puis dans les ressources intégrées de l'assembly appelant.

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| licenseName | java.lang.String | Peut être un nom de fichier complet ou court ou le nom d'une ressource intégrée. Utilisez une chaîne vide pour passer en mode d'évaluation. |

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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

