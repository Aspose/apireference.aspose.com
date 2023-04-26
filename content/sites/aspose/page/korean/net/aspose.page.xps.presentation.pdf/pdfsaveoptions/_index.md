---
title: Class PdfSaveOptions
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.Presentation.Pdf.PdfSaveOptions 수업. XPSasPDF 저장 옵션 클래스.
type: docs
weight: 450
url: /ko/net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class

XPS-as-PDF 저장 옵션 클래스.

```csharp
public class PdfSaveOptions : SaveOptions
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | 옵션의 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | 변환기가 입력 문서의 글꼴을 찾아야 하는 추가 폴더를 지정합니다. 기본 폴더는 OS가 내부 요구에 맞는 글꼴을 찾는 표준 글꼴 폴더입니다. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | 디버그 정보를 표준 출력 스트림으로 인쇄해야 하는지 여부를 지정합니다. |
| [EncryptionDetails](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/encryptiondetails/) { get; set; } | 암호화 세부 정보를 가져오거나 설정합니다. 설정하지 않으면 암호화가 수행되지 않습니다. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | 억제된 변환 오류 목록을 반환합니다.!:SuppressErrors 사실이다. |
| [ImageCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/imagecompression/) { get; set; } | 문서의 모든 이미지에 사용할 압축 유형을 지정합니다. 기본값은Auto . |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | 품질 범주는 이미지의 압축 수준을 지정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축률이 높아지므로 이미지 품질이 낮아집니다. 값이 0이면 이미지 품질이 가장 낮고 100이면 최고입니다. |
| [OutlineTreeExpansionLevel](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeexpansionlevel/) { get; set; } | 뷰어에서 PDF 파일을 열 때 문서 개요를 확장해야 하는 수준을 지정합니다. 1 - 첫 번째 수준 개요 항목만 표시됩니다. 2 - 첫 번째 및 두 번째 수준 개요 항목만 표시됩니다. 및 기본값은 1입니다. |
| [OutlineTreeHeight](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeheight/) { get; set; } | 저장할 문서 개요 트리의 높이를 지정합니다. 0 - 개요 트리가 변환되지 않음, 1 - 첫 번째 수준 개요 항목만 변환됨, 등. 기본값은 10 |
| [PageNumbers](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/pagenumbers/) { get; set; } | 변환할 페이지 수의 배열을 가져오거나 설정합니다. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | 오류를 억제해야 하는지 여부를 지정합니다. true인 경우 억제된 오류가 다음에 추가됩니다.[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. 거짓이면 첫 번째 오류가 프로그램을 종료합니다. |
| [TextCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/textcompression/) { get; set; } | 이미지를 제외한 모든 콘텐츠 스트림에 사용할 압축 유형을 지정합니다. 기본값은Flate . |

### 또한보십시오

* class [SaveOptions](../../aspose.page/saveoptions/)
* 네임스페이스 [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* 집회 [Aspose.Page](../../)


