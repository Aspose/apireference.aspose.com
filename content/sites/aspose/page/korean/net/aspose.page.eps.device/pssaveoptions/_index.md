---
title: Class PsSaveOptions
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.EPS.Device.PsSaveOptions 수업. 이 클래스에는 문서를 PostScriptPS 또는 Encapsulated PostScriptEPS 파일로 변환하는 프로세스를 관리하는 데 필요한 옵션이 포함되어 있습니다.
type: docs
weight: 80
url: /ko/net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

이 클래스에는 문서를 PostScript(PS) 또는 Encapsulated PostScript(EPS) 파일로 변환하는 프로세스를 관리하는 데 필요한 옵션이 포함되어 있습니다.

```csharp
public class PsSaveOptions : SaveOptions
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | 의 새 인스턴스를 초기화합니다.`PsSaveOptions` 플래그에 대한 기본값 가 있는 클래스!:SuppressErrors (참) 및!:Debug (거짓). |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | 의 새 인스턴스를 초기화합니다.`PsSaveOptions` 플래그에 대한 기본값이 있는 클래스!:Debug (거짓). |

## 속성

| 이름 | 설명 |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | 변환기가 입력 문서의 글꼴을 찾아야 하는 추가 폴더를 지정합니다. 기본 폴더는 OS가 내부 요구에 맞는 글꼴을 찾는 표준 글꼴 폴더입니다. |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | 배경색입니다. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | 디버그 정보를 표준 출력 스트림으로 인쇄해야 하는지 여부를 지정합니다. |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | 사용된 글꼴을 PS 문서에 포함할지 여부를 나타냅니다. |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | PS 문서에 포함되는 글꼴의 종류. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | 억제된 변환 오류 목록을 반환합니다.!:SuppressErrors 사실이다. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | 품질 범주는 이미지의 압축 수준을 지정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축률이 높아지므로 이미지 품질이 낮아집니다. 값이 0이면 이미지 품질이 가장 낮고 100이면 최고입니다. |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | 페이지 여백입니다. |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | 페이지의 크기입니다. |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | 결과 파일의 저장 형식입니다. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | 오류를 억제해야 하는지 여부를 지정합니다. true인 경우 억제된 오류가 다음에 추가됩니다.[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. 거짓이면 첫 번째 오류가 프로그램을 종료합니다. |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | 배경이 투명한지 여부를 나타냅니다. |

### 또한보십시오

* class [SaveOptions](../../aspose.page/saveoptions/)
* 네임스페이스 [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* 집회 [Aspose.Page](../../)


