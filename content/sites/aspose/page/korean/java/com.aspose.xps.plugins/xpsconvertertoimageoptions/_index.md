---
title: "XpsConverterToImageOptions"
second_title: "Aspose.Page용 Java API 참조"
description: "플러그인에 대한 XPS에서 이미지로 변환기 옵션을 나타냅니다."
type: docs
weight: 12
url: /ko/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

플러그인 [XpsConverter](../../com.aspose.xps.plugins/xpsconverter)에 대한 XPS에서 이미지로 변환기 옵션을 나타냅니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | 새로운 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 객체 인스턴스를 초기화합니다. |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | 이미지 형식이 지정된 새로운 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 객체 인스턴스를 초기화합니다. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | 결과 이미지의 크기가 지정된 새로운 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 객체 인스턴스를 초기화합니다. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | 이미지 형식이 지정된 새로운 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 객체 인스턴스를 초기화합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | 새 데이터 소스를 XpsConverter 플러그인 데이터 컬렉션에 추가합니다. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | 새 데이터 소스를 XpsConverterOptions 플러그인 데이터 컬렉션에 추가합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | XpsConverterOptions 플러그인 데이터 컬렉션을 반환합니다. |
| [getImageFormat()](#getImageFormat--) | 이미지 형식을 가져옵니다. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 이미지 압축 수준을 지정하는 값을 반환합니다. |
| [getOperationName()](#getOperationName--) | 작업 이름을 반환합니다. |
| [getPageNumbers()](#getPageNumbers--) | 변환할 XPS 문서의 페이지 번호 배열을 가져옵니다. |
| [getResolution()](#getResolution--) | 이미지 해상도를 가져옵니다. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | 저장 작업 결과를 위한 추가된 대상 컬렉션을 가져옵니다. |
| [getSize()](#getSize--) | 결과 이미지의 크기를 가져옵니다. |
| [getSmoothingMode()](#getSmoothingMode--) | 이미지 렌더링을 위한 스무딩 모드를 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | 이미지 형식을 가져옵니다. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 이미지 압축 수준을 지정하는 값을 설정합니다. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | 변환할 XPS 문서의 페이지 수 배열을 설정합니다. |
| [setResolution(int resolution)](#setResolution-int-) | 이미지 해상도를 설정합니다. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | 결과 이미지의 크기를 설정합니다. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | 이미지 렌더링을 위한 스무딩 모드를 설정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


새로운 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 객체 인스턴스를 초기화합니다.

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


이미지 형식이 지정된 새로운 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 객체 인스턴스를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 결과 이미지의 형식입니다. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


결과 이미지의 크기가 지정된 새로운 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 객체 인스턴스를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 크기 | java.awt.Dimension | 결과 이미지의 크기입니다. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


이미지 형식이 지정된 새로운 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 객체 인스턴스를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 결과 이미지의 형식입니다. |
| 크기 | java.awt.Dimension |  |

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
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


이미지 형식을 가져옵니다.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
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
### getResolution() {#getResolution--}
```
public int getResolution()
```


이미지 해상도를 가져옵니다.

**Returns:**
int - 이미지 해상도입니다.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


저장 작업 결과를 위한 추가된 대상 컬렉션을 가져옵니다.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


결과 이미지의 크기를 가져옵니다.

**Returns:**
java.awt.Dimension - 이미지 크기입니다.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


이미지 렌더링을 위한 스무딩 모드를 가져옵니다.

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
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




### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


이미지 형식을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 결과 이미지의 형식입니다. |

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

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


이미지 해상도를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 해상도 | int | 결과 이미지의 해상도. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


결과 이미지의 크기를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 크기 | java.awt.Dimension | 결과 이미지의 크기. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


이미지 렌더링을 위한 스무딩 모드를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | 스무딩 모드. |

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

