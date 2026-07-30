---
title: "Version16Dot16"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет тип данных Version16Dot16"
type: docs
weight: 118
url: /ru/java/com.aspose.font/version16dot16/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Cloneable
```
public class Version16Dot16 implements Cloneable
```

Представляет тип данных Version16Dot16
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [Version16Dot16()](#Version16Dot16--) | Конструктор |
| [Version16Dot16(int majorNumber, int minorNumber)](#Version16Dot16-int-int-) | Конструктор |
## Методы

| Метод | Описание |
| --- | --- |
| [clone()](#clone--) | Создать копию объекта  Version16Dot16 . |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMajorNumber()](#getMajorNumber--) | Получает основной номер версии. |
| [getMinorNumber()](#getMinorNumber--) | Получает вспомогательный номер версии. |
| [getRawBytes()](#getRawBytes--) | Получает все необработанные биты номера версии Version16Dot16 в виде массива байтов размером 4 байта. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMajorNumber(int value)](#setMajorNumber-int-) | Устанавливает основной номер версии. |
| [setMinorNumber(int value)](#setMinorNumber-int-) | Устанавливает вспомогательный номер версии. |
| [toString()](#toString--) | Возвращает значение версии в виде отформатированной строки. Например, "0.5", "1.1", "3.0" и т.д. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Version16Dot16() {#Version16Dot16--}
```
public Version16Dot16()
```


Конструктор

### Version16Dot16(int majorNumber, int minorNumber) {#Version16Dot16-int-int-}
```
public Version16Dot16(int majorNumber, int minorNumber)
```


Конструктор

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| majorNumber | int | Основной номер версии |
| minorNumber | int | Вспомогательный номер версии |

### clone() {#clone--}
```
public Object clone()
```


Создать копию объекта  Version16Dot16 .

**Returns:**
java.lang.Object - Объект типа  Version16Dot16
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
### getMajorNumber() {#getMajorNumber--}
```
public int getMajorNumber()
```


Получает основной номер версии. Значение имеет смысл только в шестнадцатеричной нотации, например версия 0.5 для 'maxp' в реальных файлах шрифтов представлена 4 байтами: \{0, 0, 80, 0\}, что имеет шестнадцатеричное представление 0x00005000. После чтения этой версии из файла шрифта, основные и вспомогательные номера для объекта  Version16Dot16  будут 0 и 20480 соответственно. И эти значения в шестнадцатеричной форме 0x0000 и 0x5000.

**Returns:**
int - Основной номер версии.
### getMinorNumber() {#getMinorNumber--}
```
public int getMinorNumber()
```


Получает вспомогательный номер версии. Значение имеет смысл только в шестнадцатеричной нотации, например версия 0.5 для 'maxp' в реальных файлах шрифтов представлена 4 байтами: \{0, 0, 80, 0\}, что имеет шестнадцатеричное представление 0x00005000. После чтения этой версии из файла шрифта, основные и вспомогательные номера для объекта  Version16Dot16  будут 0 и 20480 соответственно. И эти значения в шестнадцатеричной форме 0x0000 и 0x5000.

**Returns:**
int - Вспомогательный номер версии.
### getRawBytes() {#getRawBytes--}
```
public byte[] getRawBytes()
```


Получает все необработанные биты номера версии Version16Dot16 в виде массива байтов размером 4 байта.

**Returns:**
byte[] - Все необработанные биты номера версии Version16Dot16 в виде массива байтов размером 4 байта.
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




### setMajorNumber(int value) {#setMajorNumber-int-}
```
public void setMajorNumber(int value)
```


Устанавливает основной номер версии. Значение имеет смысл только в шестнадцатеричной нотации, например версия 0.5 для 'maxp' в реальных файлах шрифтов представлена 4 байтами: \{0, 0, 80, 0\}, что имеет шестнадцатеричное представление 0x00005000. После чтения этой версии из файла шрифта, основные и вспомогательные номера для объекта  Version16Dot16  будут 0 и 20480 соответственно. И эти значения в шестнадцатеричной форме 0x0000 и 0x5000.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Основной номер версии. |

### setMinorNumber(int value) {#setMinorNumber-int-}
```
public void setMinorNumber(int value)
```


Устанавливает вспомогательный номер версии. Значение имеет смысл только в шестнадцатеричной нотации, например версия 0.5 для 'maxp' в реальных файлах шрифтов представлена 4 байтами: \{0, 0, 80, 0\}, что имеет шестнадцатеричное представление 0x00005000. После чтения этой версии из файла шрифта, основные и вспомогательные номера для объекта  Version16Dot16  будут 0 и 20480 соответственно. И эти значения в шестнадцатеричной форме 0x0000 и 0x5000.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Вспомогательный номер версии. |

### toString() {#toString--}
```
public String toString()
```


Возвращает значение версии в виде отформатированной строки. Например, "0.5", "1.1", "3.0" и т.д.

**Returns:**
java.lang.String - Объект типа  String .
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

