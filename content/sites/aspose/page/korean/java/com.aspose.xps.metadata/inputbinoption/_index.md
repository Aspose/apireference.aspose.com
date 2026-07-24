---
title: "InputBin.InputBinOption"
second_title: "Aspose.Page용 Java API 참조"
description: "JobInputBin, DocumentInputBin 및 PageInputBin 기능 옵션을 설명합니다."
type: docs
weight: 14
url: /ko/java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

JobInputBin, DocumentInputBin 및 PageInputBin 기능 옵션을 설명합니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | 새 인스턴스를 생성합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| [AutoSelect](#AutoSelect) | Device will automatically choose best option based on configuration. |
| [AutoSheetFeeder](#AutoSheetFeeder) | 잉크젯 프린터용 장치 입력 트레이. |
| [Cassette](#Cassette) | 피드 빈이 카세트임을 지정합니다. |
| [Manual](#Manual) | 기본 수동 피드 빈을 지정합니다. |
| [Tractor](#Tractor) | 피드 빈이 트랙터임을 지정합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | 옵션에 IInputBinOptionItem 인스턴스 배열을 추가합니다. |
| [clone()](#clone--) | 이 옵션 인스턴스를 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 요소 이름을 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items) {#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)
```


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| optionName | java.lang.String | 옵션 이름입니다. |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | IInputBinOptionItem 인스턴스의 임의 배열입니다. |

### AutoSelect {#AutoSelect}
```
public static final InputBin.InputBinOption AutoSelect
```


Device will automatically choose best option based on configuration.

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static final InputBin.InputBinOption AutoSheetFeeder
```


잉크젯 프린터용 장치 입력 트레이.

### Cassette {#Cassette}
```
public static final InputBin.InputBinOption Cassette
```


피드 빈이 카세트임을 지정합니다.

### Manual {#Manual}
```
public static final InputBin.InputBinOption Manual
```


기본 수동 피드 빈을 지정합니다.

### Tractor {#Tractor}
```
public static final InputBin.InputBinOption Tractor
```


피드 빈이 트랙터임을 지정합니다.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. 각 항목은 ScoredProperty 또는 Property 인스턴스여야 합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 추가할 항목 목록. |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```


옵션에 IInputBinOptionItem 인스턴스 배열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | IInputBinOptionItem 인스턴스의 임의 배열입니다. |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


이 옵션 인스턴스를 복제합니다.

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
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


요소 이름을 가져옵니다.

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
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

