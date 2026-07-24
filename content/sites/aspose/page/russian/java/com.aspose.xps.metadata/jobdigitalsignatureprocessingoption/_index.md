---
title: "JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает параметры функции JobDigitalSignatureProcessing."
type: docs
weight: 10
url: /ru/java/com.aspose.xps.metadata/jobdigitalsignatureprocessing.jobdigitalsignatureprocessingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption extends Option
```

Описывает параметры функции JobDigitalSignatureProcessing.
## Поля

| Поле | Описание |
| --- | --- |
| [PrintInvalidSignatures](#PrintInvalidSignatures) | Печатать задание независимо от действительности цифровых подписей. |
| [PrintInvalidSignaturesWithErrorReport](#PrintInvalidSignaturesWithErrorReport) | Печатать задание независимо от действительности цифровых подписей. |
| [PrintOnlyValidSignatures](#PrintOnlyValidSignatures) | Печатать задание только если все цифровые подписи действительны. |
## Методы

| Метод | Описание |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Добавляет список элементов в конец списка элементов этой опции. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Получает имя элемента. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PrintInvalidSignatures {#PrintInvalidSignatures}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignatures
```


Печатать задание независимо от действительности цифровых подписей. Цифровые подписи МОГУТ быть проигнорированы.

### PrintInvalidSignaturesWithErrorReport {#PrintInvalidSignaturesWithErrorReport}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignaturesWithErrorReport
```


Печатать задание независимо от действительности цифровых подписей. В случае обнаружения недействительной подписи должна быть напечатана страница ошибки в конце задания. Цифровые подписи ДОЛЖНЫ не игнорироваться.

### PrintOnlyValidSignatures {#PrintOnlyValidSignatures}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintOnlyValidSignatures
```


Печатать задание только если все цифровые подписи действительны. Цифровые подписи ДОЛЖНЫ не игнорироваться.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Добавляет список элементов в конец списка элементов этой опции. Каждый из них должен быть экземпляром  ScoredProperty  или  Property  instance.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Список элементов для добавления. |

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
### getName() {#getName--}
```
public String getName()
```


Получает имя элемента.

**Returns:**
java.lang.String
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

