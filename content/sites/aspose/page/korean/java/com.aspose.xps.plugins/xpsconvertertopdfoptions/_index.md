---
title: "XpsConverterToPdfOptions"
second_title: "Aspose.Page용 Java API 참조"
description: "플러그인에 대한 XPS에서 PDF 변환 옵션을 나타냅니다."
type: docs
weight: 13
url: /ko/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

플러그인에 대한 XPS에서 PDF 변환 옵션을 나타냅니다 [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) 플러그인.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | 새 인스턴스를 초기화합니다 [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) 객체. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | 새 데이터 소스를 XpsConverter 플러그인 데이터 컬렉션에 추가합니다. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | 새 데이터 소스를 XpsConverterOptions 플러그인 데이터 컬렉션에 추가합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | XpsConverterOptions 플러그인 데이터 컬렉션을 반환합니다. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 이미지 압축 수준을 지정하는 값을 반환합니다. |
| [getOperationName()](#getOperationName--) | 작업 이름을 반환합니다. |
| [getPageNumbers()](#getPageNumbers--) | 변환할 XPS 문서의 페이지 번호 배열을 가져옵니다. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | 저장 작업 결과를 위한 추가된 대상 컬렉션을 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 이미지 압축 수준을 지정하는 값을 설정합니다. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | 변환할 XPS 문서의 페이지 수 배열을 설정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


새 인스턴스를 초기화합니다 [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) 객체.

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


새 데이터 소스를 XpsConverter 플러그인 데이터 컬렉션에 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | 추가할 데이터 소스입니다. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


새 데이터 소스를 XpsConverterOptions 플러그인 데이터 컬렉션에 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | 저장 작업 결과를 위한 데이터 소스(파일 또는 스트림)입니다. |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


XpsConverterOptions 플러그인 데이터 컬렉션을 반환합니다.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


이미지 압축 수준을 지정하는 값을 반환합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축이 높아지고 따라서 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를 생성하고, 100은 가장 높은 품질을 생성합니다.

**Returns:**
int - 이미지 압축 수준을 지정하는 값입니다.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


작업 이름을 반환합니다.

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


변환할 XPS 문서의 페이지 번호 배열을 가져옵니다.

**Returns:**
int[] - XPS 문서의 페이지 수 배열입니다.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


저장 작업 결과를 위한 추가된 대상 컬렉션을 가져옵니다.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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




### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


이미지 압축 수준을 지정하는 값을 설정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축이 높아지고 따라서 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를 생성하고, 100은 가장 높은 품질을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | int | 이미지 압축 수준을 지정하는 값입니다. |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


변환할 XPS 문서의 페이지 수 배열을 설정합니다. 설정하지 않으면 모든 페이지가 변환됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| pageNumbers | int[] | XPS 문서의 페이지 수 배열. |

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

