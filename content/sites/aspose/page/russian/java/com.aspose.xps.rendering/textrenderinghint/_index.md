---
title: "TextRenderingHint"
second_title: "Справочник API Aspose.Page для Java"
description: "Указывает качество отображения текста."
type: docs
weight: 25
url: /ru/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Указывает качество отображения текста.
## Поля

| Поле | Описание |
| --- | --- |
| [AntiAlias](#AntiAlias) | Каждый символ отрисовывается с использованием его сглаженного битмапа глифа без хинтинга. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Каждый символ отрисовывается с использованием его сглаженного битмапа глифа с хинтингом. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Каждый символ отрисовывается с использованием его битмапа глифа ClearType с хинтингом. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Каждый символ отрисовывается с использованием его битмапа глифа. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Каждый символ отрисовывается с использованием его битмапа глифа. |
| [SystemDefault](#SystemDefault) | Каждый символ отрисовывается с использованием его битмапа глифа, с системным режимом рендеринга по умолчанию. |
## Методы

| Метод | Описание |
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


Каждый символ отрисовывается с использованием его сглаженного битмапа глифа без хинтинга. Лучшее качество благодаря сглаживанию. Различия в ширине штрихов могут быть заметны, поскольку хинтинг отключён.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Каждый символ отрисовывается с использованием его сглаженного битмапа глифа с хинтингом. Значительно лучшее качество благодаря сглаживанию, но с более высокими затратами производительности.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Каждый символ отрисовывается с использованием его битмапа глифа ClearType с хинтингом. Наивысшее качество. Используется для применения возможностей шрифтов ClearType.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Каждый символ отрисовывается с использованием его битмапа глифа. Хинтинг не используется.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Каждый символ отрисовывается с использованием его битмапа глифа. Хинтинг используется для улучшения внешнего вида символов на штрихах и изгибах.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Каждый символ отрисовывается с использованием его битмапа глифа, с системным режимом рендеринга по умолчанию. Текст будет отрисован с учётом настроек сглаживания шрифтов, выбранных пользователем для системы.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
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
| Параметр | Тип | Описание |
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
| Параметр | Тип | Описание |
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
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String |  |

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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

