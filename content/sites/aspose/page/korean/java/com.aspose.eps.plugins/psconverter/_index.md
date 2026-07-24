---
title: "PsConverter"
second_title: "Aspose.Page용 Java API 참조"
description: "PsConverter 플러그인을 나타냅니다."
type: docs
weight: 10
url: /ko/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

PsConverter 플러그인을 나타냅니다.

이 예제는 PS/EPS 파일을 PDF 문서로 변환하는 방법을 보여줍니다.

// PsConverter 생성 PsConverter converter = new PsConverter(); // 파일로 출력 데이터 유형을 설정하기 위해 PsConverterToPdfOptions 객체 생성 PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // 입력 파일 경로 추가 opt.addDataSource(new FileDataSource(inputPath)); // 출력 파일 경로 설정 opt.addSaveDataSource(new FileDataSource(outputPath)); // 변환 프로세스 시작 ResultContainer results = converter.process(opt);

이 예제는 PS/EPS 파일을 파일 출력으로 이미지로 변환하는 방법을 보여줍니다.

// PsConverter 생성 PsConverter converter = new PsConverter(); // JPEG 대상 이미지 형식으로 PsConverterToImageOptions 생성. 결과 이미지의 기본 형식은 PNG입니다. // 또한 결과 이미지의 크기, 해상도, 스무딩 모드 및 JPEG 결과 이미지 형식의 JPEG 품질 수준을 설정할 수 있습니다. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // 입력 파일 경로 추가 opt.addDataSource(new FileDataSource(inputPath)); // 입력 PS 파일이 다중 페이지인 경우 결과는 이름이 [\"outputPath\" without extension][pageNumber started from 0].[extension from \"outputPath\"]인 이미지 파일 집합이 됩니다. opt.addSaveDataSource(new FileDataSource(outputPath)); // 변환 프로세스 시작 converter.process(opt);

이 예제는 PS/EPS 파일을 바이트 배열 출력으로 이미지로 변환하는 방법을 보여줍니다.

바이트 배열 출력 데이터소스(byte[][])에서 하나의 바이트 배열은 한 페이지의 이미지를 포함합니다. 따라서, 한 페이지 문서의 경우 결과는 [1][] 배열을 포함하고, 다중 페이지 문서의 경우 결과는 [입력 PS 문서의 페이지 수][] 배열을 포함합니다. // PsConverter 생성 PsConverter converter = new PsConverter(); // JPEG 대상 이미지 형식으로 PsConverterToImageOptions 생성. 결과 이미지의 기본 형식은 PNG입니다. // 또한 결과 이미지의 크기, 해상도, 스무딩 모드 및 JPEG 결과 이미지 형식의 JPEG 품질 수준을 설정할 수 있습니다. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // 입력 파일 경로 추가 opt.addDataSource(new FileDataSource(inputPath)); // 입력 PS 파일이 다중 페이지인 경우 결과는 이름이 [\"outputPath\" without extension][pageNumber started from 0].[extension from \"outputPath\"]인 이미지 파일 집합이 됩니다. opt.addSaveDataSource(new ByteArrayDataSource()); // 변환 프로세스 시작 converter.process(opt); // 결과 바이트 배열 가져오기 byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [dispose()](#dispose--) | IDisposable 구현. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | 지정된 매개변수로 PsConverter 처리를 시작합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverter() {#PsConverter--}
```
public PsConverter()
```


### dispose() {#dispose--}
```
public final void dispose()
```


IDisposable 구현.

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




### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public final ResultContainer process(IPluginOptions options)
```


지정된 매개변수로 PsConverter 처리를 시작합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | PsConverter에 대한 지침을 포함하는 옵션 객체입니다. |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the operation.
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

