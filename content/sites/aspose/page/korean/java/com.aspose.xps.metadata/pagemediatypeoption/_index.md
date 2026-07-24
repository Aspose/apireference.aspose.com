---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Aspose.Page용 Java API 참조"
description: "PageMediaType 기능 옵션을 설명합니다."
type: docs
weight: 13
url: /ko/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

PageMediaType 기능 옵션을 설명합니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | 새 인스턴스를 생성합니다. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | 이 옵션 인스턴스를 복제합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| [Archival](#Archival) | 보관용 고품질 매체를 지정합니다. |
| [AutoSelect](#AutoSelect) | 미디어가 자동으로 선택됨을 지정합니다. |
| [BackPrintFilm](#BackPrintFilm) | 특수 백프린팅 필름 미디어를 지정합니다. |
| [Bond](#Bond) | 표준 본드 미디어를 지정합니다. |
| [CardStock](#CardStock) | 표준 카드 스톡 미디어를 지정합니다. |
| [Continous](#Continous) | 연속 공급 미디어를 지정합니다. |
| [EnvelopePlain](#EnvelopePlain) | 표준 봉투 미디어를 지정합니다. |
| [EnvelopeWindow](#EnvelopeWindow) | 창이 있는 봉투 미디어를 지정합니다. |
| [Fabric](#Fabric) | 패브릭 미디어를 지정합니다. |
| [HighResolution](#HighResolution) | 특수 고해상도 미디어를 지정합니다. |
| [Label](#Label) | 라벨 미디어를 지정합니다. |
| [MultiLayerForm](#MultiLayerForm) | 첨부된 다중 파트 양식 미디어를 지정합니다. |
| [MultiPartForm](#MultiPartForm) | 분리된 다중 파트 양식 미디어를 지정합니다. |
| [None](#None) | 알 수 없거나 목록에 없는 미디어를 지정합니다. |
| [Photographic](#Photographic) | 표준 사진 미디어를 지정합니다. |
| [PhotographicFilm](#PhotographicFilm) | 필름 사진 미디어를 지정합니다. |
| [PhotographicGlossy](#PhotographicGlossy) | 광택 사진 미디어를 지정합니다. |
| [PhotographicHighGloss](#PhotographicHighGloss) | 고광택 사진 미디어를 지정합니다. |
| [PhotographicMatte](#PhotographicMatte) | 무광 사진 미디어를 지정합니다. |
| [PhotographicSatin](#PhotographicSatin) | 새틴 사진 미디어를 지정합니다. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | 반광택 사진 미디어를 지정합니다. |
| [Plain](#Plain) | 표준 종이 미디어를 지정합니다. |
| [Screen](#Screen) | 연속 형태로 출력 디스플레이에 출력을 지정합니다. |
| [ScreenPaged](#ScreenPaged) | 페이지 형태로 출력 디스플레이에 출력을 지정합니다. |
| [Stationary](#Stationary) | 특수 문구류 미디어를 지정합니다. |
| [TShirtTransfer](#TShirtTransfer) | 특수 티셔츠 전사 미디어를 지정합니다. |
| [TabStockFull](#TabStockFull) | 미리 절단되지 않은 탭 재고 미디어(단일 탭)를 지정합니다. |
| [TabStockPreCut](#TabStockPreCut) | 미리 절단된 탭 재고 미디어(다중 탭)를 지정합니다. |
| [Transparency](#Transparency) | 투명 미디어를 지정합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | 이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | 옵션에  IPageMediaTypeOptionItem  인스턴스 배열을 추가합니다. |
| [clone()](#clone--) | 이 옵션 인스턴스를 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 요소 이름을 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) |   Weight  점수 속성 값을 설정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


새 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| optionName | java.lang.String | 옵션 이름입니다. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | 임의의  IPageMediaTypeOptionItem  인스턴스 배열입니다. |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


이 옵션 인스턴스를 복제합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | 복제할 인스턴스. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


보관용 고품질 매체를 지정합니다.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


미디어가 자동으로 선택됨을 지정합니다.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


특수 백프린팅 필름 미디어를 지정합니다.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


표준 본드 미디어를 지정합니다.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


표준 카드 스톡 미디어를 지정합니다.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


연속 공급 미디어를 지정합니다.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


표준 봉투 미디어를 지정합니다.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


창이 있는 봉투 미디어를 지정합니다.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


패브릭 미디어를 지정합니다.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


특수 고해상도 미디어를 지정합니다.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


라벨 미디어를 지정합니다.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


첨부된 다중 파트 양식 미디어를 지정합니다.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


분리된 다중 파트 양식 미디어를 지정합니다.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


알 수 없거나 목록에 없는 미디어를 지정합니다.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


표준 사진 미디어를 지정합니다.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


필름 사진 미디어를 지정합니다.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


광택 사진 미디어를 지정합니다.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


고광택 사진 미디어를 지정합니다.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


무광 사진 미디어를 지정합니다.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


새틴 사진 미디어를 지정합니다.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


반광택 사진 미디어를 지정합니다.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


표준 종이 미디어를 지정합니다.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


연속 형태로 출력 디스플레이에 출력을 지정합니다.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


페이지 형태로 출력 디스플레이에 출력을 지정합니다.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


특수 문구류 미디어를 지정합니다.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


특수 티셔츠 전사 미디어를 지정합니다.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


미리 절단되지 않은 탭 재고 미디어(단일 탭)를 지정합니다.

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


미리 절단된 탭 재고 미디어(다중 탭)를 지정합니다.

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


투명 미디어를 지정합니다.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. 각 항목은 ScoredProperty 또는 Property 인스턴스여야 합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 추가할 항목 목록. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


옵션에  IPageMediaTypeOptionItem  인스턴스 배열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | 임의의  IPageMediaTypeOptionItem  인스턴스 배열입니다. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


이 옵션 인스턴스를 복제합니다. 복제 생성자에 대한 바로 가기.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
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




### setWeight(int weight) {#setWeight-int-}
```
public PageMediaType.PageMediaTypeOption setWeight(int weight)
```


  Weight  점수 속성 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 무게 | int |   Weight  점수 속성 값입니다. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This option instance.
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

