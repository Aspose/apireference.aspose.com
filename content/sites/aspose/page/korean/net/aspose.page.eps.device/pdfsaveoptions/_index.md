---
title: Class PdfSaveOptions
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.EPS.Device.PdfSaveOptions 수업. 이 클래스에는 입력 및 출력 스트림과 변환 프로세스 관리에 필요한 기타 옵션이 포함되어 있습니다.
type: docs
weight: 70
url: /ko/net/aspose.page.eps.device/pdfsaveoptions/
---
## PdfSaveOptions class

이 클래스에는 입력 및 출력 스트림과 변환 프로세스 관리에 필요한 기타 옵션이 포함되어 있습니다.

```csharp
public class PdfSaveOptions : SaveOptions
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/#constructor)() | 의 새 인스턴스를 초기화합니다.`PdfSaveOptions` 플래그에 대한 기본값 가 있는 클래스!:SuppressErrors (참) 및!:Debug (거짓). |
| [PdfSaveOptions](pdfsaveoptions/#constructor_1)(bool) | 의 새 인스턴스를 초기화합니다.`PdfSaveOptions` 플래그에 대한 기본값이 있는 클래스!:Debug (거짓). |

## 속성

| 이름 | 설명 |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | 변환기가 입력 문서의 글꼴을 찾아야 하는 추가 폴더를 지정합니다. 기본 폴더는 OS가 내부 요구에 맞는 글꼴을 찾는 표준 글꼴 폴더입니다. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | 디버그 정보를 표준 출력 스트림으로 인쇄해야 하는지 여부를 지정합니다. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | 억제된 변환 오류 목록을 반환합니다.!:SuppressErrors 사실이다. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | 품질 범주는 이미지의 압축 수준을 지정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축률이 높아지므로 이미지 품질이 낮아집니다. 값이 0이면 이미지 품질이 가장 낮고 100이면 최고입니다. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | 오류를 억제해야 하는지 여부를 지정합니다. true인 경우 억제된 오류가 다음에 추가됩니다.[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. 거짓이면 첫 번째 오류가 프로그램을 종료합니다. |

### 또한보십시오

* class [SaveOptions](../../aspose.page/saveoptions/)
* 네임스페이스 [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* 집회 [Aspose.Page](../../)


