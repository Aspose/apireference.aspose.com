---
title: "SaveOptions"
second_title: "Aspose.Page용 Java API 참조"
description: "이 클래스는 변환 프로세스를 관리하는 데 필요한 옵션을 포함합니다."
type: docs
weight: 16
url: /ko/java/com.aspose.page/saveoptions/
---
**Inheritance:**
java.lang.Object
```
public class SaveOptions
```

이 클래스는 변환 프로세스를 관리하는 데 필요한 옵션을 포함합니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [SaveOptions()](#SaveOptions--) | 새 SaveOptions 인스턴스를 초기화하고 플래그 suppressErrors (true)와 debug (false)의 기본값을 사용합니다. |
| [SaveOptions(boolean supressErrors)](#SaveOptions-boolean-) | 새 SaveOptions 인스턴스를 초기화하고 플래그 debug (false)의 기본값을 사용합니다. |
| [SaveOptions(Dimension size)](#SaveOptions-java.awt.Dimension-) | 지정된 크기로 새 SaveOptions 인스턴스를 초기화합니다. |
| [SaveOptions(boolean supressErrors, Dimension size)](#SaveOptions-boolean-java.awt.Dimension-) | 플래그 debug (false)의 기본값과 지정된 크기로 새 SaveOptions 인스턴스를 초기화합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | 변환기가 입력 문서의 글꼴을 찾을 수 있는 추가 글꼴 폴더를 반환합니다. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 비 TrueType 글꼴을 TTF로 저장해야 하는지 표시하는 플래그를 가져옵니다. |
| [getExceptions()](#getExceptions--) | 비치명적 오류 목록을 반환합니다. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 이미지 압축 수준을 지정하는 값을 반환합니다. |
| [getSize()](#getSize--) | 페이지 또는 이미지의 크기를 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 변환 중 경고 및 메시지 출력을 허용하는 플래그를 가져옵니다. |
| [isSupressErrors()](#isSupressErrors--) | 변환 중 오류가 억제될지 여부를 나타내는 값을 반환합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | 변환기가 입력 문서의 글꼴을 찾을 수 있는 추가 글꼴 폴더를 지정합니다. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 비 TrueType 글꼴을 TTF로 저장할지 여부를 지정합니다. |
| [setDebug(boolean debug)](#setDebug-boolean-) | 변환 중 경고 및 메시지 출력을 허용하는 플래그를 지정합니다. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 이미지 압축 수준을 지정하는 값을 설정합니다. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | 페이지 또는 이미지의 크기를 지정합니다. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 변환 중 오류가 억제될지 여부를 나타내는 플래그를 지정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### SaveOptions() {#SaveOptions--}
```
public SaveOptions()
```


새 SaveOptions 인스턴스를 초기화하고 플래그 suppressErrors (true)와 debug (false)의 기본값을 사용합니다.

### SaveOptions(boolean supressErrors) {#SaveOptions-boolean-}
```
public SaveOptions(boolean supressErrors)
```


새 SaveOptions 인스턴스를 초기화하고 플래그 debug (false)의 기본값을 사용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| supressErrors | boolean | true이면 비치명적 오류에도 불구하고 변환이 계속됩니다. |

### SaveOptions(Dimension size) {#SaveOptions-java.awt.Dimension-}
```
public SaveOptions(Dimension size)
```


지정된 크기로 새 SaveOptions 인스턴스를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 크기 | java.awt.Dimension | 크기입니다. |

### SaveOptions(boolean supressErrors, Dimension size) {#SaveOptions-boolean-java.awt.Dimension-}
```
public SaveOptions(boolean supressErrors, Dimension size)
```


플래그 debug (false)의 기본값과 지정된 크기로 새 SaveOptions 인스턴스를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| supressErrors | boolean | true이면 비치명적 오류에도 불구하고 변환이 계속됩니다. |
| 크기 | java.awt.Dimension | 크기입니다. |

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


컨버터가 입력 문서의 글꼴을 찾을 추가 글꼴 폴더를 반환합니다. 기본 폴더는 운영 체제가 내부 용도로 글꼴을 찾는 표준 글꼴 폴더입니다.

**Returns:**
java.lang.String[] - 글꼴 폴더 배열.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


비 TrueType 글꼴을 TTF로 저장해야 하는지 표시하는 플래그를 가져옵니다.

**Returns:**
boolean - 플래그 값.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


비치명적 오류 목록을 반환합니다.

**Returns:**
java.util.List<java.lang.Exception> - 예외 목록
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


이미지 압축 수준을 지정하는 값을 반환합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축이 높아지고 따라서 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를 생성하고, 100은 가장 높은 품질을 생성합니다.

**Returns:**
int - 이미지 압축 수준을 지정하는 값입니다.
### getSize() {#getSize--}
```
public Dimension getSize()
```


페이지 또는 이미지의 크기를 가져옵니다.

**Returns:**
java.awt.Dimension - 페이지 또는 이미지의 크기.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


변환 중 경고 및 메시지 출력을 허용하는 플래그를 가져옵니다.

**Returns:**
boolean - 디버그 값.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


변환 중 오류가 억제될지 여부를 나타내는 값을 반환합니다.

**Returns:**
boolean - boolean 값
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


컨버터가 입력 문서의 글꼴을 찾을 추가 글꼴 폴더를 지정합니다. 기본 폴더는 운영 체제가 내부 용도로 글꼴을 찾는 표준 글꼴 폴더입니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | 글꼴 폴더 배열. |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


TrueType이 아닌 글꼴을 TTF로 저장할지 여부를 지정합니다. 이는 PS에서 PDF 변환 시 결과 문서의 용량을 크게 줄이고, TrueType이 아닌 글꼴이 많이 포함된 PS 파일을 어떤 출력 형식으로든 변환할 때 속도를 높입니다. 그러나 PostScript 파일을 이미지로 변환할 때 텍스트가 약간 수직으로 이동하는 현상이 있습니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | boolean | 플래그 값. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


변환 중 경고 및 메시지 출력을 허용하는 플래그를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| debug | boolean | Boolean 값. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


이미지 압축 수준을 지정하는 값을 설정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축이 높아지고 따라서 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를 생성하고, 100은 가장 높은 품질을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | int | 이미지 압축 수준을 지정하는 값입니다. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


페이지 또는 이미지의 크기를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 크기 | java.awt.Dimension | 페이지 또는 이미지의 크기. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


변환 중 오류가 억제될지 여부를 나타내는 플래그를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| supressErrors | boolean | Boolean 값. |

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

