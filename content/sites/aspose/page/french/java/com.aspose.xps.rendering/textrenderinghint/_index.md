---
title: "TextRenderingHint"
second_title: "Référence API Aspose.Page pour Java"
description: "Spécifie la qualité du rendu du texte."
type: docs
weight: 25
url: /fr/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Spécifie la qualité du rendu du texte.
## Champs

| Champ | Description |
| --- | --- |
| [AntiAlias](#AntiAlias) | Chaque caractère est dessiné en utilisant son bitmap de glyphe antialiasé sans hinting. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Chaque caractère est dessiné en utilisant son bitmap de glyphe antialiasé avec hinting. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Chaque caractère est dessiné en utilisant son bitmap de glyphe ClearType avec hinting. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Chaque caractère est dessiné en utilisant son bitmap de glyphe. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Chaque caractère est dessiné en utilisant son bitmap de glyphe. |
| [SystemDefault](#SystemDefault) | Chaque caractère est dessiné en utilisant son bitmap de glyphe, avec l'indice de rendu par défaut du système. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AntiAlias {#AntiAlias}
```
public static final TextRenderingHint AntiAlias
```


Chaque caractère est dessiné en utilisant son bitmap de glyphe antialiasé sans hinting. Meilleure qualité grâce à l'antialiasing. Les différences de largeur des tiges peuvent être perceptibles car le hinting est désactivé.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Chaque caractère est dessiné en utilisant son bitmap de glyphe antialiasé avec hinting. Qualité bien meilleure grâce à l'antialiasing, mais à un coût de performance plus élevé.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Chaque caractère est dessiné en utilisant son bitmap de glyphe ClearType avec hinting. Le réglage de la plus haute qualité. Utilisé pour tirer parti des fonctionnalités de police ClearType.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Chaque caractère est dessiné en utilisant son bitmap de glyphe. Le hinting n'est pas utilisé.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Chaque caractère est dessiné en utilisant son bitmap de glyphe. Le hinting est utilisé pour améliorer l'apparence des caractères sur les tiges et les courbures.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Chaque caractère est dessiné en utilisant son bitmap de glyphe, avec l'indice de rendu par défaut du système. Le texte sera dessiné en fonction des paramètres de lissage des polices que l'utilisateur a sélectionnés pour le système.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| nom | java.lang.String |  |

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint)
### values() {#values--}
```
public static TextRenderingHint[] values()
```




**Returns:**
com.aspose.xps.rendering.TextRenderingHint[]
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

