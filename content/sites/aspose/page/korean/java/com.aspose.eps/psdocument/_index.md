---
title: "PsDocument"
second_title: "Aspose.Page용 Java API 참조"
description: "이 클래스는 PS/EPS 문서를 캡슐화합니다."
type: docs
weight: 16
url: /ko/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

이 클래스는 PS/EPS 문서를 캡슐화합니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [PsDocument()](#PsDocument--) | 초기화된 페이지와 함께 빈 PsDocument를 초기화합니다. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | 초기화된 페이지와 함께 빈 PsDocument를 초기화합니다. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | 초기화된 페이지와 함께 빈 PsDocument를 초기화합니다. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | 빈 PsDocument를 초기화합니다. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | 빈 PsDocument를 초기화합니다. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Postscript 문서 페이지 수를 미리 알 경우 빈 PsDocument를 초기화합니다. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Postscript 문서 페이지 수를 미리 알 경우 빈 PsDocument를 초기화합니다. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | 입력 PS/EPS 파일로 PsDocument를 초기화합니다. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | PS/EPS 파일 스트림으로 PsDocument를 초기화합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | 현재 그래픽 상태에 클립을 추가합니다. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | 현재 그래픽 상태에 클립을 추가하고 "newpath" 연산자를 기록합니다. |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | 현재 그래픽 상태에 클리핑 사각형을 추가합니다. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | 주어진 글꼴의 지정된 텍스트 윤곽선에서 클립을 추가합니다. |
| [closePage()](#closePage--) | 현재 페이지를 완료합니다. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Type 1 글꼴을 TrueType으로 변환합니다. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Type 3 글꼴을 TrueType으로 변환합니다. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Type 3 글꼴을 TrueType으로 변환합니다. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | 주어진 PsDocument를 EPS 파일로 잘라냅니다. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | 임의의 경로를 그립니다. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | 마스크된 이미지를 그립니다. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | 이미지를 그립니다. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | 배경이 있는 변환된 이미지를 그립니다. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | 배경이 있는 변환된 투명 이미지를 그립니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | EPS 파일을 읽고 %%BoundingBox 주석에서 EPS 이미지의 경계 상자를 추출하거나, 존재하지 않을 경우 기본 페이지 크기 (0, 0, 595, 842)의 경계를 사용합니다. |
| [extractEpsSize()](#extractEpsSize--) | EPS 파일을 읽고 %%BoundingBox 주석에서 EPS 이미지의 크기를 추출하거나, 존재하지 않을 경우 기본 페이지 크기 (595, 842)를 사용합니다. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | PS 파일에서 텍스트를 추출합니다. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | 임의의 경로를 채웁니다. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | 글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | 글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | 글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | 글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | 결과 PDF 문서의 페이지 수를 가져옵니다. |
| [getPaint()](#getPaint--) | 현재 그래픽 상태의 페인트를 가져옵니다. |
| [getStroke()](#getStroke--) | 현재 그래픽 상태의 스트로크를 가져옵니다. |
| [getXmpMetadata()](#getXmpMetadata--) | PS/EPS 파일을 읽고 XmpMetadata가 이미 존재하면 추출하고, 존재하지 않으면 새로 추가합니다. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Aspose.Page for Java 제품 라이선스에 접근했는지 및 유효한지 여부를 나타냅니다. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | PS/EPS 파일을 장치에 병합합니다. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | PS/EPS 파일을 장치에 병합합니다. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | PS/EPS 파일을 장치에 병합합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | 새 페이지를 만들고 현재 페이지로 설정합니다. |
| [openPage(String pageName)](#openPage-java.lang.String-) | 문서 크기로 새 페이지를 만들고 현재 페이지로 설정합니다. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | 주어진 PsDocument를 EPS 파일로 크기 조정합니다. |
| [rotate(float angleRadians)](#rotate-float-) | 원점을 기준으로 반시계 방향 회전을 현재 그래픽 상태에 추가합니다 (현재 행렬을 회전시킵니다). |
| [rotate(int angleDegrees)](#rotate-int-) | 원점을 기준으로 반시계 방향 회전을 현재 그래픽 상태에 추가합니다 (현재 행렬을 회전시킵니다). |
| [save()](#save--) | 주어진 PsDocument를 PS 또는 EPS 파일로 저장합니다. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | PS/EPS 파일을 장치에 저장합니다. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | 주어진 PsDocument를 스트림에 저장합니다. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | 주어진 PsDocument를 EPS 파일로 저장합니다. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | PS/EPS 파일을 이미지 파일로 저장합니다. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | PS/EPS 파일을 지정된 디렉터리와 파일 이름으로 이미지 파일에 저장합니다. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | PS/EPS 파일을 이미지 바이트 배열로 저장합니다. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | PS/EPS 파일을 출력 PDF 스트림에 저장합니다. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | PS/EPS 파일을 PDF 파일로 저장합니다. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | BufferedImage 객체를 EPS 파일로 저장합니다. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | BufferedImage 객체를 EPS 파일로 저장합니다. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | 입력 스트림의 PNG/JPEG/BMP/GIF 이미지를 EPS 출력 스트림으로 저장합니다. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | 파일의 PNG/JPEG/BMP/GIF 이미지를 EPS 파일로 저장합니다. |
| [scale(float xScale, float yScale)](#scale-float-float-) | 현재 그래픽 상태에 스케일을 추가합니다 (현재 행렬을 스케일). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | 입력 스트림을 지정합니다. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | 페이지 장치 매개변수를 설정합니다 (연산자 "setpagedevice" PostScript 사양을 참조). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | 페이지 크기를 설정합니다. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | 현재 그래픽 상태에 페인트를 설정합니다. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | 현재 그래픽 상태에 스트로크를 설정합니다. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | 현재 변환을 이것으로 설정합니다. |
| [shear(float shx, float shy)](#shear-float-float-) | 현재 그래픽 상태에 전단 변환을 추가합니다 (현재 행렬을 전단). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | 현재 그래픽 상태에 변환을 추가합니다 (이 행렬을 현재 행렬과 연결). |
| [translate(float x, float y)](#translate-float-float-) | 현재 그래픽 상태에 평행 이동을 추가합니다 (현재 행렬을 평행 이동). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | 현재 그래픽 상태 복원을 기록합니다 (연산자 "grestore"에 대한 PostScript 사양을 참조). |
| [writeGraphicsSave()](#writeGraphicsSave--) | 현재 그래픽 상태 저장을 기록합니다 (연산자 "gsave"에 대한 PostScript 사양을 참조). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


빈 PsDocument를 초기화된 페이지와 함께 초기화합니다. 이 생성자는 PostScript 파일과 관련되지 않은 추가 작업, 예를 들어 글꼴 변환 등에만 사용됩니다.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


초기화된 페이지와 함께 빈 PsDocument를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 출력 PS/EPS 파일 경로입니다. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript 파일 저장을 제어하는 매개변수 집합입니다. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


초기화된 페이지와 함께 빈 PsDocument를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS 파일을 저장할 스트림입니다. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript 파일 저장을 제어하는 매개변수 집합입니다. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


빈 PsDocument를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 출력 PS/EPS 파일 경로입니다. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript 파일 저장을 제어하는 매개변수 집합입니다. |
| multipaged | boolean | false인 경우 페이지가 초기화되지 않습니다. 이 경우 페이지 초기화는 명시적인 "openPage(width, height)" 호출을 통해 수행되어야 합니다. |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


빈 PsDocument를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS 파일을 저장할 스트림입니다. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript 파일 저장을 제어하는 매개변수 집합입니다. |
| multipaged | boolean | false인 경우 페이지가 초기화되지 않습니다. 이 경우 페이지 초기화는 명시적인 "openPage(width, height)" 호출을 통해 수행되어야 합니다. |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Postscript 문서 페이지 수를 미리 알 경우 빈 PsDocument를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 출력 PS/EPS 파일 경로입니다. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript 파일 저장을 제어하는 매개변수 집합입니다. |
| numberOfPages | int | PostScript 문서의 페이지 수입니다. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Postscript 문서 페이지 수를 미리 알 경우 빈 PsDocument를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS 파일을 저장할 스트림입니다. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript 파일 저장을 제어하는 매개변수 집합입니다. |
| numberOfPages | int | PostScript 문서의 페이지 수입니다. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


입력 PS/EPS 파일로 PsDocument를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| psFilePath | java.lang.String | PS/EPS 파일 경로입니다. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


PS/EPS 파일 스트림으로 PsDocument를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| psStream | java.io.InputStream | PS/EPS 파일의 스트림입니다. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


현재 그래픽 상태에 클립을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| s | java.awt.Shape | 클리핑 경로. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


현재 그래픽 상태에 클립을 추가하고 "newpath" 연산자를 기록합니다. 이 클리핑 경로와 "charpath" 연산자로 윤곽이 그려진 글리프와 같은 이후 경로들의 결합을 피하기 위해 필요합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| s | java.awt.Shape | 클리핑 경로. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


현재 그래픽 상태에 클리핑 사각형을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D.Float | 클리핑 사각형. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


주어진 글꼴의 지정된 텍스트 윤곽선에서 클립을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 텍스트. |
| font | java.awt.Font | 폰트. |
| x | float | 텍스트 위치의 X 좌표. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


현재 페이지를 완료합니다.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Type 1 폰트를 TrueType으로 변환합니다. 변환된 TTF 폰트 파일의 이름은 입력 Type 1 폰트와 동일하게 ".ttf" 확장자를 붙인 이름이 됩니다. TTF 파일은 지정된 출력 디렉터리에 저장됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Type 1 폰트 파일 경로.. |
| outputDir | java.lang.String | 결과 TrueType 폰트를 저장할 출력 디렉터리. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Type 3 폰트를 TrueType으로 변환합니다. TTF 파일은 제공된 출력 스트림에 저장됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Type 3 폰트 파일 경로. |
| outputStream | java.io.OutputStream | 결과 TrueType 폰트를 저장할 출력 스트림. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Type 3 폰트를 TrueType으로 변환합니다. 변환된 TTF 폰트 파일의 이름은 입력 Type 3 폰트와 동일하게 ".ttf" 확장자를 붙인 이름이 됩니다. TTF 파일은 지정된 출력 디렉터리에 저장됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Type 3 폰트 파일 경로.. |
| outputDir | java.lang.String | 결과 TrueType 폰트를 저장할 출력 디렉터리. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


주어진 PsDocument를 EPS 파일로 잘라냅니다. 기존 %%BoundingBox를 업데이트하거나 새로 생성된 %%BoundingBox와 함께 초기 EPS 파일을 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | 크롭 박스 (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


임의의 경로를 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| shape | java.awt.Shape | 채우기 경로. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


마스크된 이미지를 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | 그릴 이미지. 24bpp RGB 이미지 형식이어야 합니다. |
| alphaMask1bpp | java.awt.image.BufferedImage | 이미지 마스크. 1bpp 이미지 형식이어야 합니다. |
| transform | java.awt.geom.AffineTransform | 이미지를 변환할 행렬. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


이미지를 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 그릴 이미지. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


배경이 있는 변환된 이미지를 그립니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 그릴 이미지. |
| transform | java.awt.geom.AffineTransform | 이미지를 변환할 행렬. |
| bkg | java.awt.Color | 이미지의 배경. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


배경과 함께 변환된 투명 이미지를 그립니다. 이미지에 알파 채널이 없으면 불투명 이미지로 그려집니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 그릴 이미지. |
| transform | java.awt.geom.AffineTransform | 이미지를 변환할 행렬. |
| transparencyThreshold | int | 투명도를 완전 투명으로 해석할 픽셀 값의 기준값을 정의하는 임계값입니다. 이 임계값 이하의 모든 값은 완전 불투명으로 해석됩니다. |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


EPS 파일을 읽고 %%BoundingBox 주석에서 EPS 이미지의 경계 상자를 추출하거나, 존재하지 않을 경우 기본 페이지 크기 (0, 0, 595, 842)의 경계를 사용합니다.

**Returns:**
int[] - EPS 이미지의 경계 상자.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


EPS 파일을 읽고 %%BoundingBox 주석에서 EPS 이미지의 크기를 추출하거나, 존재하지 않을 경우 기본 페이지 크기 (595, 842)를 사용합니다.

**Returns:**
java.awt.Dimension - EPS 이미지의 크기.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


PS 파일에서 텍스트를 추출합니다. TrueType 글꼴(Type 42) 또는 TrueType 글꼴로 구성된 복합 글꼴(Type 0)로 작성된 텍스트에만 작동합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 저장 옵션. |
| startPage | int | 텍스트 추출을 시작할 포함 페이지. |
| endPage | int | 텍스트를 포함하여 추출할 페이지. |

**Returns:**
java.lang.String - 선택된 PS 파일 페이지에 포함된 텍스트.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


임의의 경로를 채웁니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| shape | java.awt.Shape | 채우기 경로. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| drFont | com.aspose.foundation.drawing.DrFont | 텍스트를 그리는 데 사용될 DrFont. 사용자 지정 폴더에 위치한 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fillPaint | java.awt.Paint | 글리프 내부를 채우는 데 사용되는 fill. |
| strokePaint | java.awt.Paint | 글리프 외곽선을 그리는 데 사용되는 java.awt.Paint. JDK의 java.awt.Paint 클래스의 모든 하위 클래스가 될 수 있습니다. |
| stroke | java.awt.Stroke | 글리프 윤곽선을 그리는 데 사용되는 stroke. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| advances | float[] | 글리프 너비 배열. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| drFont | com.aspose.foundation.drawing.DrFont | 텍스트를 그리는 데 사용될 DrFont. 사용자 지정 폴더에 위치한 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fillPaint | java.awt.Paint | 글리프 내부를 채우는 데 사용되는 fill. |
| strokePaint | java.awt.Paint | 글리프 외곽선을 그리는 데 사용되는 java.awt.Paint. JDK의 java.awt.Paint 클래스의 모든 하위 클래스가 될 수 있습니다. |
| stroke | java.awt.Stroke | 글리프 윤곽선을 그리는 데 사용되는 stroke. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. advances 글리프 너비 배열. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| advances | float[] |  |
| font | java.awt.Font | 텍스트를 그리는 데 사용될 시스템 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fillPaint | java.awt.Paint | 글리프 내부를 채우는 데 사용되는 fill. |
| strokePaint | java.awt.Paint | 글리프 외곽선을 그리는 데 사용되는 java.awt.Paint. JDK의 java.awt.Paint 클래스의 모든 하위 클래스가 될 수 있습니다. |
| stroke | java.awt.Stroke | 글리프 윤곽선을 그리는 데 사용되는 stroke. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


글리프 내부를 채우고 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| font | java.awt.Font | 텍스트를 그리는 데 사용될 시스템 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fillPaint | java.awt.Paint | 글리프 내부를 채우는 데 사용되는 fill. |
| strokePaint | java.awt.Paint | 글리프 외곽선을 그리는 데 사용되는 java.awt.Paint. JDK의 java.awt.Paint 클래스의 모든 하위 클래스가 될 수 있습니다. |
| stroke | java.awt.Stroke | 글리프 윤곽선을 그리는 데 사용되는 stroke. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


글리프 내부를 채워 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| drFont | com.aspose.foundation.drawing.DrFont | 텍스트를 그리는 데 사용될 DrFont. 사용자 지정 폴더에 위치한 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


글리프 내부를 채워 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| drFont | com.aspose.foundation.drawing.DrFont | 텍스트를 그리는 데 사용될 DrFont. 사용자 지정 폴더에 위치한 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fill | java.awt.Paint | 글리프를 그리는 데 사용되는 fill. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


글리프 내부를 채워 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| advances | float[] | 글리프 너비 배열. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| drFont | com.aspose.foundation.drawing.DrFont | 텍스트를 그리는 데 사용될 DrFont. 사용자 지정 폴더에 위치한 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


글리프 내부를 채워 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| advances | float[] | 글리프 너비 배열. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| drFont | com.aspose.foundation.drawing.DrFont | 텍스트를 그리는 데 사용될 DrFont. 사용자 지정 폴더에 위치한 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fill | java.awt.Paint | 글리프를 그리는 데 사용되는 fill. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


글리프 내부를 채워 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| advances | float[] | 글리프 너비 배열. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| font | java.awt.Font | 텍스트를 그리는 데 사용될 시스템 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


글리프 내부를 채워 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| advances | float[] | 글리프 너비 배열. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| font | java.awt.Font | 텍스트를 그리는 데 사용될 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fill | java.awt.Paint | 글리프를 그리는 데 사용되는 fill. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


글리프 내부를 채워 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| font | java.awt.Font | 텍스트를 그리는 데 사용될 시스템 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


글리프 내부를 채워 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| font | java.awt.Font | 텍스트를 그리는 데 사용될 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fill | java.awt.Paint | 글리프를 그리는 데 사용되는 fill. |

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getInputStream() {#getInputStream--}
```
public InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getNumberOfPages() {#getNumberOfPages--}
```
public int getNumberOfPages()
```


결과 PDF 문서의 페이지 수를 가져옵니다.

**Returns:**
int - 페이지 수.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


현재 그래픽 상태의 페인트를 가져옵니다.

**Returns:**
java.awt.Paint - 현재 paint.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


현재 그래픽 상태의 스트로크를 가져옵니다.

**Returns:**
java.awt.Stroke - 현재 스트로크.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


PS/EPS 파일을 읽고 XmpMetadata가 이미 존재하면 추출하고, 존재하지 않으면 새로 추가합니다.

**Returns:**
[XmpMetadata](../../com.aspose.eps.xmp/xmpmetadata) - existing or new instance of XMP metadata.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Aspose.Page for Java 제품 라이선스에 접근했는지 및 유효한지 여부를 나타냅니다.

**Returns:**
boolean - boolean 값
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


PS/EPS 파일을 장치에 병합합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | 이 파일과 병합하여 출력 장치에 사용할 PS/EPS 파일. |
| device | [Device](../../com.aspose.page/device) | 출력 장치. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 변환 중 발생한 오류의 출력을 지정하는 플래그를 포함합니다. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


PS/EPS 파일을 장치에 병합합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | 출력 PDF 스트림. |
| filesForMerge | java.lang.String[] | 이 파일과 병합하여 출력 장치에 사용할 PS/EPS 파일. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 변환 중 발생한 오류의 출력을 지정하는 플래그를 포함합니다. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


PS/EPS 파일을 장치에 병합합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 출력 PDF 파일 경로. |
| filesForMerge | java.lang.String[] | 이 파일과 병합하여 출력 장치에 사용할 PS/EPS 파일. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 변환 중 발생한 오류의 출력을 지정하는 플래그를 포함합니다. |

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
public void openPage(float width, float height)
```


새 페이지를 만들고 현재 페이지로 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 너비 | float | 새 페이지의 너비. |
| 높이 | float | 새 페이지의 높이. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


문서 크기로 새 페이지를 만들고 현재 페이지로 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| pageName | java.lang.String | 새 페이지의 이름. null인 경우 페이지 이름은 페이지의 순번이 됩니다. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| drFont | com.aspose.foundation.drawing.DrFont | 텍스트를 그리는 데 사용될 DrFont. 사용자 지정 폴더에 위치한 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| drFont | com.aspose.foundation.drawing.DrFont | 텍스트를 그리는 데 사용될 DrFont. 사용자 지정 폴더에 위치한 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| outlinePaint | java.awt.Paint | 글리프 외곽선을 그리는 데 사용되는 java.awt.Paint. JDK의 java.awt.Paint 클래스의 모든 하위 클래스가 될 수 있습니다. |
| stroke | java.awt.Stroke | 글리프 윤곽선을 그리는 데 사용되는 stroke. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| advances | float[] | 글리프 너비 배열. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| drFont | com.aspose.foundation.drawing.DrFont | 텍스트를 그리는 데 사용될 DrFont. 사용자 지정 폴더에 위치한 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| advances | float[] | 글리프 너비 배열. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| drFont | com.aspose.foundation.drawing.DrFont | 텍스트를 그리는 데 사용될 DrFont. 사용자 지정 폴더에 위치한 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| outlinePaint | java.awt.Paint | 글리프 외곽선을 그리는 데 사용되는 java.awt.Paint. JDK의 java.awt.Paint 클래스의 모든 하위 클래스가 될 수 있습니다. |
| stroke | java.awt.Stroke | 글리프 윤곽선을 그리는 데 사용되는 stroke. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| advances | float[] | 글리프 너비 배열. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| font | java.awt.Font | 텍스트를 그리는 데 사용될 시스템 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| advances | float[] | 글리프 너비 배열. 길이는 문자열의 글리프 수와 일치해야 합니다. |
| font | java.awt.Font | 텍스트를 그리는 데 사용될 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| outlinePaint | java.awt.Paint | 글리프 외곽선을 그리는 데 사용되는 java.awt.Paint. JDK의 java.awt.Paint 클래스의 모든 하위 클래스가 될 수 있습니다. |
| stroke | java.awt.Stroke | 글리프 윤곽선을 그리는 데 사용되는 stroke. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| font | java.awt.Font | 텍스트를 그리는 데 사용될 시스템 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


글리프 윤곽선을 그려 텍스트 문자열을 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| text | java.lang.String | 추가할 텍스트. |
| font | java.awt.Font | 텍스트를 그리는 데 사용될 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| outlinePaint | java.awt.Paint | 글리프 외곽선을 그리는 데 사용되는 java.awt.Paint. JDK의 java.awt.Paint 클래스의 모든 하위 클래스가 될 수 있습니다. |
| stroke | java.awt.Stroke | 글리프 윤곽선을 그리는 데 사용되는 stroke. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


주어진 PsDocument를 EPS 파일로 크기 조정합니다. 이 메서드는 EPS 크기를 추출한 후에만 사용됩니다. 기존 %%BoundingBox를 업데이트한 초기 EPS 파일을 저장하거나 새 파일이 생성됩니다. 페이지 변환 행렬도 설정됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | 지정된 단위의 EPS 이미지 새 크기. |
| units | [Units](../../com.aspose.page/units) | 새 크기의 단위. 포인트, 인치, 밀리미터, 센티미터 및 초기 크기의 백분율이 될 수 있습니다. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


원점을 기준으로 반시계 방향 회전을 현재 그래픽 상태에 추가합니다 (현재 행렬을 회전시킵니다).

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| angleRadians | float | 라디안 단위의 회전 각도. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


원점을 기준으로 반시계 방향 회전을 현재 그래픽 상태에 추가합니다 (현재 행렬을 회전시킵니다).

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| angleDegrees | int | 도 단위의 회전 각도. |

### save() {#save--}
```
public void save()
```


주어진 PsDocument를 PS 또는 EPS 파일로 저장합니다. 이 메서드는 PsDocument가 처음부터 생성된 경우에만 사용됩니다.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


PS/EPS 파일을 장치에 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | 출력 장치. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 변환 중 발생한 오류의 출력을 지정하는 플래그를 포함합니다. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


주어진 PsDocument를 스트림에 저장합니다. 이 메서드는 XMP 메타데이터를 업데이트한 후에만 사용됩니다. 기존 메타데이터를 업데이트한 초기 EPS 파일을 저장하거나 getMetadata 메서드를 호출하면서 새 파일을 생성합니다. 마지막 경우에는 필요한 모든 PostScript 코드와 EPS 주석이 추가됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| epsStream | java.io.OutputStream | 출력 EPS 파일 스트림. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


주어진 PsDocument를 EPS 파일로 저장합니다. 이 메서드는 XMP 메타데이터를 업데이트한 후에만 사용됩니다. 기존 메타데이터를 업데이트한 초기 EPS 파일을 저장하거나 getMetadata 메서드를 호출하면서 새 파일을 생성합니다. 마지막 경우에는 필요한 모든 PostScript 코드와 EPS 주석이 추가됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | 출력 EPS 파일 경로.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


PS/EPS 파일을 이미지 파일로 저장합니다. 출력 디렉터리와 파일 이름은 입력 PS 파일과 동일합니다. 파일 확장자는 "options" 매개변수의 이미지 형식에 따라 결정됩니다. 문서가 FileInputStream에서 파생되지 않은 스트림으로 초기화된 경우, 이미지 파일은 기본 파일 이름 템플릿을 사용하여 현재 폴더에 저장됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | 이미지를 저장하기 위한 필수 매개변수와 변환 중 발생한 오류의 출력을 지정하는 플래그를 포함합니다. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


지정된 디렉터리와 지정된 파일 이름으로 PS/EPS 파일을 이미지 파일로 저장합니다. 파일 확장자는 "options" 매개변수의 이미지 형식에 따라 결정됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | 이미지를 저장하기 위한 필수 매개변수와 변환 중 발생한 오류의 출력을 지정하는 플래그를 포함합니다. |
| outDir | java.lang.String | 이미지 파일이 저장될 출력 디렉터리입니다. |
| fileNameTemplate | java.lang.String | 이미지의 파일 이름 템플릿(확장자 제외)입니다. 입력 PS/EPS 파일이 1페이지인 경우 정확히 파일 이름이 사용되며, 그렇지 않은 경우 "\_[n]" 형태가 되며, 여기서 "n"은 0부터 시작하는 페이지 번호이며, 이 뒤에 접미사가 추가됩니다. 파일 확장자는 "option" 매개변수의 이미지 형식에 따라 결정됩니다. |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


PS/EPS 파일을 이미지 바이트 배열로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | 이미지를 저장하기 위한 필수 매개변수와 변환 중 발생한 오류의 출력을 지정하는 플래그를 포함합니다. |

**Returns:**
byte[][] - 이미지 바이트. 페이지당 하나의 바이트 배열입니다.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


PS/EPS 파일을 출력 PDF 스트림에 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | 출력 PDF 스트림. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | 변환 중 발생한 오류의 출력을 지정하는 플래그를 포함합니다. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


PS/EPS 파일을 PDF 파일로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 출력 PDF 파일 경로. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | 변환 중 발생한 오류의 출력을 지정하는 플래그를 포함합니다. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


BufferedImage 객체를 EPS 파일로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 이미지. |
| epsStream | java.io.OutputStream | EPS 출력 스트림. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 변환 중 발생한 오류의 출력을 지정하는 매개변수를 포함합니다. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


BufferedImage 객체를 EPS 파일로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 이미지. |
| epsFilePath | java.lang.String | EPS 파일 경로. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 변환 중 발생한 오류의 출력을 지정하는 매개변수를 포함합니다. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


입력 스트림의 PNG/JPEG/BMP/GIF 이미지를 EPS 출력 스트림으로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| imageStream | java.io.InputStream | 이미지 입력 스트림. |
| epsStream | java.io.OutputStream | EPS 출력 스트림. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 변환 중 발생한 오류의 출력을 지정하는 매개변수를 포함합니다. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


파일의 PNG/JPEG/BMP/GIF 이미지를 EPS 파일로 저장합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| imageFilePath | java.lang.String | 이미지 파일 경로. |
| epsFilePath | java.lang.String | EPS 파일 경로. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 변환 중 발생한 오류의 출력을 지정하는 매개변수를 포함합니다. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


현재 그래픽 상태에 스케일을 추가합니다 (현재 행렬을 스케일).

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| xScale | float | X 축의 스케일. |
| yScale | float | Y 축의 스케일. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


입력 스트림을 지정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| is | java.io.InputStream | PS/EPS 파일의 입력 스트림. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


페이지 장치 매개변수를 설정합니다(연산자 "setpagedevice" PostScript 사양을 참조). 여기에는 페이지 크기, 색상 등과 같은 매개변수가 포함될 수 있습니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | 페이지의 매개변수입니다. 이 사전에는 페이지 크기와 색상 등이 포함될 수 있습니다. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


페이지 크기를 설정합니다. 하나의 문서에서 서로 다른 크기의 페이지를 만들려면 이 메서드 바로 뒤에  setPageDevice  메서드를 사용하십시오.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 너비 | float | 결과 PostScript 파일에서 페이지의 너비입니다. |
| 높이 | float | 결과 PostScript 파일에서 페이지의 높이입니다. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


현재 그래픽 상태에 페인트를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| paint | java.awt.Paint | 페인트입니다. JDK에 존재하는  Paint  클래스의 모든 하위 클래스가 될 수 있습니다. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


현재 그래픽 상태에 스트로크를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| stroke | java.awt.Stroke | 스트로크입니다. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


현재 변환을 이것으로 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | 변환입니다. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


현재 그래픽 상태에 전단 변환을 추가합니다 (현재 행렬을 전단).

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| shx | float | X 축의 전단입니다. |
| shy | float | Y 축의 전단입니다. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(AffineTransform matrix) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform matrix)
```


현재 그래픽 상태에 변환을 추가합니다 (이 행렬을 현재 행렬과 연결).

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | 변환입니다. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


현재 그래픽 상태에 평행 이동을 추가합니다 (현재 행렬을 평행 이동).

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| x | float | X 방향의 이동입니다. |
| y | float | Y 방향의 이동입니다. |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


현재 그래픽 상태 복원을 기록합니다 (연산자 "grestore"에 대한 PostScript 사양을 참조).

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


현재 그래픽 상태 저장을 기록합니다 (연산자 "gsave"에 대한 PostScript 사양을 참조).

