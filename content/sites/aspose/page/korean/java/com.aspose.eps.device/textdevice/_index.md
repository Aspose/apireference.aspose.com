---
title: "TextDevice"
second_title: "Aspose.Page용 Java API 참조"
description: 
type: docs
weight: 13
url: /ko/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## 필드

| 필드 | 설명 |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | 현재 장치 버전입니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | 경로를 그립니다. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | 호를 그립니다. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | 지정된 변환 및 배경을 사용하여 이미지를 그립니다. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | 선분을 그립니다. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | 타원을 그립니다. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | 다각형을 그립니다. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | 다각형을 그립니다. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | 폴리라인을 그립니다. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | 폴리라인을 그립니다. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | 사각형을 그립니다. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | 라운드 사각형을 그립니다. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | 경로를 채웁니다. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | 호를 채웁니다. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | 타원을 채웁니다. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | 다각형을 채웁니다. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | 다각형을 채웁니다. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | 사각형을 채웁니다. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | 라운드 사각형을 그립니다. |
| [getBackground()](#getBackground--) | 페이지의 현재 배경을 가져옵니다. |
| [getCharTM()](#getCharTM--) | 현재 문자 변환을 가져옵니다. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | 결과 장치 출력의 생성자를 가져옵니다. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | 현재 글꼴을 가져옵니다. |
| [getOpacity()](#getOpacity--) | 현재 불투명도를 가져옵니다. |
| [getOpacityMask()](#getOpacityMask--) | 현재 불투명도 마스크를 가져옵니다. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | 현재 페인트를 가져옵니다. |
| [getProperties()](#getProperties--) | 메타데이터를 포함한 장치 속성을 가져옵니다. |
| [getProperty(String key)](#getProperty-java.lang.String-) | 문자열 속성 값을 가져옵니다. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | 색상 속성 값을 가져옵니다. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | 실수 속성 값을 가져옵니다. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | 정수 속성 값을 가져옵니다. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | 여백 속성 값을 가져옵니다. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | 행렬 속성 값을 가져옵니다. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | 사각형 속성 값을 가져옵니다. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | 크기 속성 값을 가져옵니다. |
| [getSaveOptions()](#getSaveOptions--) | 저장 옵션을 반환합니다. |
| [getSize()](#getSize--) | 페이지의 크기를 가져옵니다. |
| [getStroke()](#getStroke--) | 현재 스트로크를 가져옵니다. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | 현재 텍스트 렌더링 모드를 가져옵니다. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | 현재 텍스트 스트로크 너비를 가져옵니다. |
| [getTransform()](#getTransform--) | 현재 변환을 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | 디바이스의 클립을 초기화합니다. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | 불리언 속성의 값을 가져옵니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | 현재 변환 행렬을 회전시킵니다. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | 현재 변환 행렬을 점을 중심으로 회전시킵니다. |
| [scale(double x, double y)](#scale-double-double-) | 현재 변환 행렬을 스케일링합니다. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | 페이지의 현재 배경을 지정합니다. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | 문자 변환을 지정합니다. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | 디바이스의 클립을 지정합니다. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | 결과 디바이스 출력의 제작자를 지정합니다. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | 글꼴을 지정합니다. |
| [setOpacity(float opacity)](#setOpacity-float-) | 불투명도를 지정합니다. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | 불투명도 마스크를 지정합니다. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | 페인트를 지정합니다. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | 메타데이터를 포함한 디바이스 속성을 지정합니다. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | 렌더링 프로세스 관리를 위한 옵션을 지정합니다. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | 스트로크를 지정합니다. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | 텍스트 렌더링 모드를 지정합니다. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | 텍스트 스트로크 너비를 지정합니다. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | 현재 변환을 지정합니다. |
| [shear(double shx, double shy)](#shear-double-double-) | 현재 변환 행렬을 전단합니다. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | 현재 변환 행렬을 변환합니다. |
| [translate(double x, double y)](#translate-double-double-) | 현재 변환 행렬을 평행 이동합니다. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | 주석을 작성합니다. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | 지정된 글꼴로 문자열을 출력합니다. |
| [writeWarning(String warning)](#writeWarning-java.lang.String-) |  |
### TextDevice() {#TextDevice--}
```
public TextDevice()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final Dimension DEFAULT_SIZE
```


### EMIT_ERRORS {#EMIT-ERRORS}
```
public static final String EMIT_ERRORS
```


### EMIT_WARNINGS {#EMIT-WARNINGS}
```
public static final String EMIT_WARNINGS
```


### VERSION {#VERSION}
```
public static String VERSION
```


현재 장치 버전입니다.

### closePage() {#closePage--}
```
public void closePage()
```


페이지가 렌더링된 후 장치에 필요한 준비를 수행합니다.

### create() {#create--}
```
public Device create()
```


이 장치의 복사본을 생성합니다.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


장치를 해제합니다.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


경로를 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| path | java.awt.Shape | 그릴 경로입니다. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


호를 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | float | 호의 중심 X 좌표입니다. |
| y | float | 호의 중심 Y 좌표입니다. |
| 너비 | float | 외접 사각형의 너비입니다. |
| 높이 | float | 외접 사각형의 높이입니다. |
| startAngle | float | 호의 시작 각도입니다. |
| arcAngle | float | 호의 각도입니다. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


지정된 변환 및 배경을 사용하여 이미지를 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 그릴 이미지입니다. |
| transform | java.awt.geom.AffineTransform | 변환입니다. |
| bkg | java.awt.Color | 배경 색상입니다. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


선분을 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x1 | float | 세그먼트 시작점의 X 좌표입니다. |
| y1 | float | 세그먼트 시작점의 Y 좌표입니다. |
| x2 | float | 세그먼트 끝점의 X 좌표입니다. |
| y2 | float | 세그먼트 끝점의 Y 좌표입니다. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


타원을 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | float | 타원의 중심 X 좌표입니다. |
| y | float | 타원의 중심 Y 좌표. |
| 너비 | float | 외접 사각형의 너비입니다. |
| 높이 | float | 외접 사각형의 높이입니다. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


다각형을 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| xPoints | float[] | 점들의 X 좌표. |
| yPoints | float[] | 점들의 Y 좌표. |
| nPoints | int | 포인트 수. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


다각형을 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| xPoints | int[] | 점들의 X 좌표. |
| yPoints | int[] | 점들의 Y 좌표. |
| nPoints | int | 포인트 수. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


폴리라인을 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| xPoints | float[] | 점들의 X 좌표. |
| yPoints | float[] | 점들의 Y 좌표. |
| nPoints | int | 포인트 수. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


폴리라인을 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| xPoints | int[] | 점들의 X 좌표. |
| yPoints | int[] | 점들의 Y 좌표. |
| nPoints | int | 포인트 수. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


사각형을 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | float | 사각형의 왼쪽 위 모서리 X 좌표. |
| y | float | 사각형의 왼쪽 위 모서리 Y 좌표. |
| 너비 | float | 사각형의 너비. |
| 높이 | float | 사각형의 높이. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


라운드 사각형을 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | float | 사각형의 왼쪽 위 모서리 X 좌표. |
| y | float | 사각형의 왼쪽 위 모서리 Y 좌표. |
| 너비 | float | 사각형의 너비. |
| 높이 | float | 사각형의 높이. |
| arcWidth | float | 사각형의 각을 둥글게 만드는 호의 외접 사각형 너비. |
| arcHeight | float | 사각형의 각을 둥글게 만드는 호의 외접 사각형 높이. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


주어진 점에 문자열을 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


문서가 렌더링된 후 장치를 위한 필요한 준비를 수행합니다.

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
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


경로를 채웁니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| path | java.awt.Shape | 채워질 경로. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


호를 채웁니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | float | 호의 중심 X 좌표입니다. |
| y | float | 호의 중심 Y 좌표입니다. |
| 너비 | float | 외접 사각형의 너비입니다. |
| 높이 | float | 외접 사각형의 높이입니다. |
| startAngle | float | 호의 시작 각도입니다. |
| arcAngle | float | 호의 각도입니다. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


타원을 채웁니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | float | 타원의 중심 X 좌표입니다. |
| y | float | 타원의 중심 Y 좌표. |
| 너비 | float | 외접 사각형의 너비입니다. |
| 높이 | float | 외접 사각형의 높이입니다. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


다각형을 채웁니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| xPoints | float[] | 점들의 X 좌표. |
| yPoints | float[] | 점들의 Y 좌표. |
| nPoints | int | 포인트 수. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


다각형을 채웁니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| xPoints | int[] | 점들의 X 좌표. |
| yPoints | int[] | 점들의 Y 좌표. |
| nPoints | int | 포인트 수. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


사각형을 채웁니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | float | 사각형의 왼쪽 위 모서리 X 좌표. |
| y | float | 사각형의 왼쪽 위 모서리 Y 좌표. |
| 너비 | float | 사각형의 너비. |
| 높이 | float | 사각형의 높이. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


라운드 사각형을 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | float | 사각형의 왼쪽 위 모서리 X 좌표. |
| y | float | 사각형의 왼쪽 위 모서리 Y 좌표. |
| 너비 | float | 사각형의 너비. |
| 높이 | float | 사각형의 높이. |
| arcWidth | float | 사각형의 각을 둥글게 만드는 호의 외접 사각형 너비. |
| arcHeight | float | 사각형의 각을 둥글게 만드는 호의 외접 사각형 높이. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


페이지의 현재 배경을 가져옵니다.

**Returns:**
java.awt.Color - 페이지의 현재 배경
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


현재 문자 변환을 가져옵니다.

**Returns:**
java.awt.geom.AffineTransform - 현재 문자 변환.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreator() {#getCreator--}
```
public String getCreator()
```


결과 장치 출력의 생성자를 가져옵니다.

**Returns:**
java.lang.String - 생성자 값.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


현재 페이지 번호를 가져옵니다.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


현재 글꼴을 가져옵니다.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


현재 불투명도를 가져옵니다.

**Returns:**
float - 현재 불투명도.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


현재 불투명도 마스크를 가져옵니다.

**Returns:**
java.awt.Paint - 현재 불투명도 마스크.
### getPages() {#getPages--}
```
public List<String> getPages()
```




**Returns:**
java.util.List<java.lang.String>
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


현재 페인트를 가져옵니다.

**Returns:**
java.awt.Paint - 현재 paint.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


메타데이터를 포함한 장치 속성을 가져옵니다.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


문자열 속성 값을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 키 | java.lang.String | 속성의 이름. |

**Returns:**
java.lang.String - 속성 값.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


색상 속성 값을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 키 | java.lang.String | 속성의 이름. |

**Returns:**
java.awt.Color - 속성 값.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


실수 속성 값을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 키 | java.lang.String | 속성의 이름. |

**Returns:**
double - 속성 값.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


정수 속성 값을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 키 | java.lang.String | 속성의 이름. |

**Returns:**
int - 속성 값.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


여백 속성 값을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 키 | java.lang.String | 속성의 이름. |

**Returns:**
java.awt.Insets - 속성 값.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


행렬 속성 값을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 키 | java.lang.String | 속성의 이름. |

**Returns:**
java.awt.geom.AffineTransform - 속성 값.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


사각형 속성 값을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 키 | java.lang.String | 속성의 이름. |

**Returns:**
java.awt.Rectangle - 속성 값.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


크기 속성 값을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 키 | java.lang.String | 속성의 이름. |

**Returns:**
java.awt.Dimension - 속성 값.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


저장 옵션을 반환합니다.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


페이지의 크기를 가져옵니다.

**Returns:**
java.awt.Dimension - 페이지 크기.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


현재 스트로크를 가져옵니다.

**Returns:**
java.awt.Stroke - 현재 스트로크.
### getText() {#getText--}
```
public String getText()
```




**Returns:**
java.lang.String
### getText(int startPage, int endPage) {#getText-int-int-}
```
public String getText(int startPage, int endPage)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


현재 텍스트 렌더링 모드를 가져옵니다.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


현재 텍스트 스트로크 너비를 가져옵니다.

**Returns:**
float - 현재 텍스트 스트로크 너비.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


현재 변환을 가져옵니다.

**Returns:**
java.awt.geom.AffineTransform - 현재 변환.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### initClip() {#initClip--}
```
public void initClip()
```


디바이스의 클립을 초기화합니다.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


렌더링할 페이지 수를 초기화합니다.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


디바이스가 직접 RGB 모드, 즉 RGB를 사용하는지 여부를 나타냅니다.

**Returns:**
boolean
### isMainDocument() {#isMainDocument--}
```
public boolean isMainDocument()
```




**Returns:**
boolean
### isProperty(String key) {#isProperty-java.lang.String-}
```
public boolean isProperty(String key)
```


불리언 속성의 값을 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 키 | java.lang.String | 속성의 이름. |

**Returns:**
boolean - 속성 값.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### openPage(float width, float height) {#openPage-float-float-}
```
public boolean openPage(float width, float height)
```


페이지 렌더링 전에 디바이스에 필요한 준비를 수행합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 너비 | float |  |
| 높이 | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


페이지 렌더링 전에 디바이스에 필요한 준비를 수행합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 제목 | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


전체 문서에 대해 디바이스를 초기 상태로 재설정합니다. 출력 스트림을 재설정하는 데 사용됩니다.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


페이지에 대해 디바이스를 초기 상태로 재설정합니다.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


현재 변환 행렬을 회전합니다. writeTransform(Transform)를 호출합니다. 양의 각도 theta로 회전하면 양의 x축상의 점이 양의 y축 방향으로 회전합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| theta | double | 회전할 라디안 단위 각도. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


현재 변환 행렬을 점을 중심으로 회전시킵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| theta | double | 라디안 단위 회전 각도. |
| x | double | 점의 X 좌표. |
| y | double | 점의 Y 좌표. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


현재 변환 행렬을 스케일합니다. writeTransform(Transform)를 호출합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | double | X 축의 스케일. |
| y | double | Y 축의 스케일. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


페이지의 현재 배경을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| background | java.awt.Color | 페이지의 배경. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


문자 변환을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421haracters 변환. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


디바이스의 클립을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| clipPath | java.awt.Shape | 클리핑 경로. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


결과 디바이스 출력의 제작자를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| creator | java.lang.String | 제작자 값. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


글꼴을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | 폰트. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


불투명도를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| opacity | float | 불투명도. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


불투명도 마스크를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| opacityMask | java.awt.Paint | 불투명도 마스크. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


페인트를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| paint | java.awt.Paint | 페인트. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


메타데이터를 포함한 디바이스 속성을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | 디바이스 속성. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


렌더링 프로세스 관리를 위한 옵션을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 렌더링 프로세스를 관리하기 위한 옵션. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


페이지 크기를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 크기 | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


스트로크를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| stroke | java.awt.Stroke | 스트로크. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


텍스트 렌더링 모드를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | 텍스트 렌더링 모드. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


텍스트 스트로크 너비를 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| textStrokeWidth | float | 텍스트 스트로크 너비. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


현재 변환을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | 변환.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


현재 변환 행렬을 전단합니다. writeTransform(Transform)를 호출합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| shx | double | X축 전단. |
| shy | double | Y축 전단. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


문서 렌더링을 시작하기 전에 장치를 위한 필요한 준비를 수행합니다.

### toString() {#toString--}
```
public String toString()
```


장치 유형의 이름을 반환합니다.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


현재 변환 행렬을 변환합니다. writeTransform(Transform)를 호출합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | 적용될 변환. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


현재 변환 행렬을 평행 이동합니다. writeTransform(Transform)를 호출합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | double | X축 평행 이동. |
| y | double | Y축 평행 이동. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


다른 다중 페이지 장치에서 페이지 매개변수를 업데이트합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) |  |

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

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


주석을 작성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 주석 | java.lang.String | 작성될 주석. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


지정된 글꼴로 문자열을 출력합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | 지정된 글꼴. |
| str | java.lang.String | 문자열. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 경고 | java.lang.String |  |

