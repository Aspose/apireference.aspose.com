---
title: "Лицензия"
second_title: "Справочник API Aspose.Font for Java"
description: "Предоставляет методы лицензирования компонента."
type: docs
weight: 58
url: /ru/java/com.aspose.font/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Предоставляет методы лицензирования компонента.

В этом примере будет предпринята попытка найти файл лицензии с именем MyLicense.lic в папке, содержащей компонент, в папке, содержащей вызывающую сборку, в папке входной сборки, а затем во встроенных ресурсах вызывающей сборки.

License license = new License();
license.setLicense(\"MyLicense.lic\");
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [License()](#License--) | Инициализирует новый экземпляр этого класса. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Лицензирует компонент. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Лицензирует компонент. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Инициализирует новый экземпляр этого класса.

В этом примере будет предпринята попытка найти файл лицензии с именем MyLicense.lic в папке, содержащей компонент, в папке, содержащей вызывающую сборку, в папке входной сборки, а затем во встроенных ресурсах вызывающей сборки.

License license = new License();
license.setLicense(\"MyLicense.lic\");

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
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


Лицензирует компонент.

Поток, содержащий лицензию.

Используйте этот метод для загрузки лицензии из потока.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | java.io.InputStream | Поток лицензии |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


Лицензирует компонент.

Пытается найти лицензию в следующих местах:

1. Явный путь.

2. Папка jar‑файла компонента.

В этом примере будет предпринята попытка найти файл лицензии с именем MyLicense.lic в папке, содержащей компонент, в папке, содержащей вызывающую сборку, в папке входной сборки, а затем во встроенных ресурсах вызывающей сборки.

License license = new License();
license.setLicense(\"MyLicense.lic\");

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| licenseName | java.lang.String | Может быть полным или коротким именем файла, или именем встроенного ресурса. Используйте пустую строку, чтобы переключиться в режим оценки. |

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

