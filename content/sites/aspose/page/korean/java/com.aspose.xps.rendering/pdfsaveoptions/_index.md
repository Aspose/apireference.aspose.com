---
title: "PdfSaveOptions"
second_title: "Aspose.Page용 Java API 참조"
description: "XPS-as-PDF 저장 옵션에 대한 클래스."
type: docs
weight: 14
url: /ko/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

XPS-as-PDF 저장 옵션에 대한 클래스.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | 옵션의 새 인스턴스를 생성합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | 변환기가 입력 문서의 글꼴을 찾을 수 있는 추가 글꼴 폴더를 반환합니다. |
| [getBatchSize()](#getBatchSize--) | 노드에서 노드로 전달할 페이지 부분의 크기를 반환합니다. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | 저장되기 직전에 XPS 페이지를 수정하는 이벤트 핸들러 컬렉션을 반환합니다. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 비 TrueType 글꼴을 TTF로 저장해야 하는지 표시하는 플래그를 가져옵니다. |
| [getEncryptionDetails()](#getEncryptionDetails--) | 암호화 세부 정보를 반환합니다. |
| [getExceptions()](#getExceptions--) | 비치명적 오류 목록을 반환합니다. |
| [getImageCompression()](#getImageCompression--) | 문서의 모든 이미지에 사용될 압축 유형을 반환합니다. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 이미지 압축 수준을 지정하는 값을 반환합니다. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | PDF 파일을 뷰어에서 열었을 때 문서 개요가 확장될 최대 수준을 가져옵니다. 1 - 첫 번째 수준 개요 항목만 표시되고, 2 - 첫 번째와 두 번째 수준 개요 항목만 표시되며, 이하 동일. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | 저장할 문서 개요 트리의 높이를 가져옵니다. 0 - 개요 트리가 변환되지 않으며, 1 - 첫 번째 수준 개요 항목만 변환되고, 이하 동일. |
| [getPageNumbers()](#getPageNumbers--) | 렌더링할 페이지 번호 배열을 가져옵니다. |
| [getSize()](#getSize--) | 페이지 또는 이미지의 크기를 가져옵니다. |
| [getTextCompression()](#getTextCompression--) | 이미지를 제외한 모든 콘텐츠 스트림에 사용될 압축 유형을 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 변환 중 경고 및 메시지 출력을 허용하는 플래그를 가져옵니다. |
| [isSupressErrors()](#isSupressErrors--) | 변환 중 오류가 억제될지 여부를 나타내는 값을 반환합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | XPS에서는 일부 텍스트 요소가 글꼴의 문자 코드와 일치하지 않는 대체 글리프 형태에 대한 참조를 포함할 수 있습니다. |
| [preserveText(boolean value)](#preserveText-boolean-) | XPS에서는 일부 텍스트 요소가 글꼴의 문자 코드와 일치하지 않는 대체 글리프 형태에 대한 참조를 포함할 수 있습니다. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | 변환기가 입력 문서의 글꼴을 찾을 수 있는 추가 글꼴 폴더를 지정합니다. |
| [setBatchSize(int value)](#setBatchSize-int-) | 노드에서 노드로 전달할 페이지 부분의 크기를 설정합니다. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 비 TrueType 글꼴을 TTF로 저장할지 여부를 지정합니다. |
| [setDebug(boolean debug)](#setDebug-boolean-) | 변환 중 경고 및 메시지 출력을 허용하는 플래그를 지정합니다. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | 암호화 세부 정보를 설정합니다. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | 문서의 모든 이미지에 사용될 압축 유형을 설정합니다. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 이미지 압축 수준을 지정하는 값을 설정합니다. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | PDF 파일을 뷰어에서 열었을 때 문서 개요가 확장될 최대 수준을 설정합니다. 1 - 첫 번째 수준 개요 항목만 표시되고, 2 - 첫 번째와 두 번째 수준 개요 항목만 표시되며, 이하 동일. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | 저장할 문서 개요 트리의 높이를 설정합니다. 0 - 개요 트리가 변환되지 않으며, 1 - 첫 번째 수준 개요 항목만 변환되고, 이하 동일. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | 렌더링할 페이지 번호 배열을 설정합니다. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | 페이지 또는 이미지의 크기를 지정합니다. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 변환 중 오류가 억제될지 여부를 나타내는 플래그를 지정합니다. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | 이미지를 제외한 모든 콘텐츠 스트림에 사용될 압축 유형을 설정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


옵션의 새 인스턴스를 생성합니다.

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


노드에서 노드로 전달할 페이지 부분의 크기를 반환합니다.

**Returns:**
int - 노드에서 노드로 전달할 페이지 부분의 크기.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


저장되기 직전에 XPS 페이지를 수정하는 이벤트 핸들러 컬렉션을 반환합니다.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - 저장되기 직전에 XPS 페이지를 수정하는 이벤트 핸들러 컬렉션.
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


암호화 세부 정보를 반환합니다. 설정되지 않은 경우 암호화가 수행되지 않습니다.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


비치명적 오류 목록을 반환합니다.

**Returns:**
java.util.List<java.lang.Exception> - 예외 목록
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


문서의 모든 이미지에 사용될 압축 유형을 반환합니다. 기본값은 PdfImageCompression.Auto 입니다.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


이미지 압축 수준을 지정하는 값을 반환합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축이 높아지고 따라서 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를 생성하고, 100은 가장 높은 품질을 생성합니다.

**Returns:**
int - 이미지 압축 수준을 지정하는 값입니다.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


PDF 파일을 뷰어에서 열었을 때 문서 개요가 확장될 최대 수준을 가져옵니다. 1 - 첫 번째 수준 개요 항목만 표시되고, 2 - 첫 번째와 두 번째 수준 개요 항목만 표시되며, 이하 동일.

**Returns:**
int - 개요 트리 확장 수준.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


저장할 문서 개요 트리의 높이를 가져옵니다. 0 - 개요 트리가 변환되지 않으며, 1 - 첫 번째 수준 개요 항목만 변환되고, 이하 동일합니다. 기본값은 10입니다.

**Returns:**
int - 개요 트리 높이.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


렌더링할 페이지 번호 배열을 가져옵니다.

**Returns:**
int[] - 페이지 수.
### getSize() {#getSize--}
```
public Dimension getSize()
```


페이지 또는 이미지의 크기를 가져옵니다.

**Returns:**
java.awt.Dimension - 페이지 또는 이미지의 크기.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


이미지를 제외한 모든 콘텐츠 스트림에 사용될 압축 유형을 반환합니다. 기본값은 PdfTextCompression.Flate 입니다.

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


XPS에서는 일부 텍스트 요소가 글꼴의 어떤 문자 코드와도 일치하지 않는 대체 글리프 형태에 대한 참조를 포함할 수 있습니다. 이 플래그가 true로 설정되면 해당 XPS 요소의 텍스트가 그래픽 형태로 변환됩니다. 그런 다음 텍스트 자체는 위에 투명하게 표시됩니다. 이렇게 하면 해당 요소의 텍스트를 선택할 수 있게 됩니다. 그러나 부작용으로 출력 파일이 원본보다 훨씬 커질 수 있습니다. 이 플래그가 false로 설정되면 대체 형태로 표시되어야 하는 문자가 다른 문자로 교체되어 대체 글리프 형태에 매핑됩니다. 따라서 텍스트는 여전히 선택 가능하지만 수정되어 읽기 어려워질 가능성이 높습니다.

**Returns:**
boolean - 플래그 값.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


XPS에서는 일부 텍스트 요소가 글꼴의 어떤 문자 코드와도 일치하지 않는 대체 글리프 형태에 대한 참조를 포함할 수 있습니다. 이 플래그가 true로 설정되면 해당 XPS 요소의 텍스트가 그래픽 형태로 변환됩니다. 그런 다음 텍스트 자체는 위에 투명하게 표시됩니다. 이렇게 하면 해당 요소의 텍스트를 선택할 수 있게 됩니다. 그러나 부작용으로 출력 파일이 원본보다 훨씬 커질 수 있습니다. 이 플래그가 false로 설정되면 대체 형태로 표시되어야 하는 문자가 다른 문자로 교체되어 대체 글리프 형태에 매핑됩니다. 따라서 텍스트는 여전히 선택 가능하지만 수정되어 읽기 어려워질 가능성이 높습니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | boolean | 플래그 값. |

### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


컨버터가 입력 문서의 글꼴을 찾을 추가 글꼴 폴더를 지정합니다. 기본 폴더는 운영 체제가 내부 용도로 글꼴을 찾는 표준 글꼴 폴더입니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | 글꼴 폴더 배열. |

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


노드에서 노드로 전달할 페이지 부분의 크기를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | int | 노드 간에 전달되는 페이지 일부의 크기. |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


암호화 세부 정보를 설정합니다. 설정되지 않으면 암호화가 수행되지 않습니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | 암호화 세부 정보. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


문서의 모든 이미지에 사용될 압축 유형을 설정합니다. 기본값은 PdfImageCompression.Auto 입니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | 압축 유형. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


이미지 압축 수준을 지정하는 값을 설정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축이 높아지고 따라서 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를 생성하고, 100은 가장 높은 품질을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | int | 이미지 압축 수준을 지정하는 값입니다. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


PDF 파일을 뷰어에서 열었을 때 문서 개요가 확장될 최대 수준을 설정합니다. 1 - 첫 번째 수준 개요 항목만 표시되고, 2 - 첫 번째와 두 번째 수준 개요 항목만 표시되며, 이하 동일.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | int | 개요 트리 확장 수준. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


저장할 문서 개요 트리의 높이를 설정합니다. 0 - 개요 트리가 변환되지 않으며, 1 - 첫 번째 수준 개요 항목만 변환되고, 이하 동일.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | int | 개요 트리 높이. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


렌더링할 페이지 번호 배열을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | int[] | 페이지 수. |

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

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


이미지를 제외한 모든 콘텐츠 스트림에 사용될 압축 유형을 설정합니다. 기본값은 PdfTextCompression.Flate 입니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | 압축 유형. |

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

