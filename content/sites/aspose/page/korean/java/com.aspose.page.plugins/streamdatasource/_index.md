---
title: "StreamDataSource"
second_title: "Aspose.Page용 Java API 참조"
description: "플러그인의 로드 및 저장 작업을 위한 스트림 데이터 소스를 나타냅니다."
type: docs
weight: 17
url: /ko/java/com.aspose.page.plugins/streamdatasource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IDataSource](../../com.aspose.page.plugins/idatasource)
```
public final class StreamDataSource implements IDataSource
```

플러그인의 로드 및 저장 작업을 위한 스트림 데이터 소스를 나타냅니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [StreamDataSource(Object data)](#StreamDataSource-java.lang.Object-) | 지정된 스트림 객체를 사용하여 새로운 스트림 데이터 소스를 초기화합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | 현재 데이터 소스의 스트림 객체를 가져옵니다. |
| [getDataType()](#getDataType--) | 데이터 소스 유형(스트림). |
| [getInputStream()](#getInputStream--) |  |
| [getOutputStream()](#getOutputStream--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamDataSource(Object data) {#StreamDataSource-java.lang.Object-}
```
public StreamDataSource(Object data)
```


지정된 스트림 객체를 사용하여 새로운 스트림 데이터 소스를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 데이터 | java.lang.Object | 스트림 객체 |

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
### getData() {#getData--}
```
public final Object getData()
```


현재 데이터 소스의 스트림 객체를 가져옵니다.

**Returns:**
java.lang.Object
### getDataType() {#getDataType--}
```
public final int getDataType()
```


데이터 소스 유형(스트림).

**Returns:**
int
### getInputStream() {#getInputStream--}
```
public final InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getOutputStream() {#getOutputStream--}
```
public final OutputStream getOutputStream()
```




**Returns:**
java.io.OutputStream
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

