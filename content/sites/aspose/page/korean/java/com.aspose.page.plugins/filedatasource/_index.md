---
title: "FileDataSource"
second_title: "Aspose.Page용 Java API 참조"
description: "플러그인의 로드 및 저장 작업을 위한 파일 데이터 소스를 나타냅니다."
type: docs
weight: 13
url: /ko/java/com.aspose.page.plugins/filedatasource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IDataSource](../../com.aspose.page.plugins/idatasource)
```
public final class FileDataSource implements IDataSource
```

플러그인의 로드 및 저장 작업을 위한 파일 데이터 소스를 나타냅니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [FileDataSource(String path)](#FileDataSource-java.lang.String-) | 지정된 경로로 새로운 파일 데이터 소스를 초기화합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataType()](#getDataType--) | 데이터 소스 유형(파일). |
| [getPath()](#getPath--) | 현재 데이터 소스의 파일 경로를 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileDataSource(String path) {#FileDataSource-java.lang.String-}
```
public FileDataSource(String path)
```


지정된 경로로 새로운 파일 데이터 소스를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| path | java.lang.String | 소스 파일 경로를 나타내는 문자열입니다. |

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
### getDataType() {#getDataType--}
```
public final int getDataType()
```


데이터 소스 유형(파일).

**Returns:**
int
### getPath() {#getPath--}
```
public final String getPath()
```


현재 데이터 소스의 파일 경로를 가져옵니다.

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

