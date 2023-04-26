---
title: Aspose.Page.XPS.XpsMetadata
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.Xps.Xps메타데이터 네임스페이스는 XPS 문서의 메타데이터를 설명하는 클래스를 제공합니다.
type: docs
weight: 110
url: /ko/net/aspose.page.xps.xpsmetadata/
---
**Aspose.Page.Xps.Xps메타데이터** 네임스페이스는 XPS 문서의 메타데이터를 설명하는 클래스를 제공합니다.

## 클래스

| 수업 | 설명 |
| --- | --- |
| [Collate](./collate/) | 의 기본 클래스[`DocumentCollate`](../aspose.page.xps.xpsmetadata/documentcollate/) 그리고[`JobCollateAllDocuments`](../aspose.page.xps.xpsmetadata/jobcollatealldocuments/) 기능 클래스. |
| [CompositePrintTicketElement](./compositeprintticketelement/) | 복합 인쇄 스키마 요소(예: 다른 요소 포함)일 수 있는 클래스의 기본 클래스. |
| [DecimalValue](./decimalvalue/) | PrintTicket 문서에서 Decimal 값을 캡슐화하는 클래스입니다. |
| [DocumentBannerSheet](./documentbannersheet/) | 특정 문서에 대해 출력할 배너 시트를 설명합니다. 배너 시트는 default 에 출력되어야 합니다.[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/) 그리고 기본값을 사용하여[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) . 배너 시트는 작업의 나머지 부분과도 분리되어야 합니다. 이는 마무리 또는 처리 옵션(예: [`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/) ,[`DocumentStaple`](../aspose.page.xps.xpsmetadata/documentstaple/) , 또는[`DocumentBinding`](../aspose.page.xps.xpsmetadata/documentbinding/)) 는 배너 시트를 포함하지 않아야 합니다. 배너 시트는 작업의 나머지 부분과 분리될 수도 있고 분리되지 않을 수도 있습니다. 이는 모든 작업 완료 또는 처리 옵션에 문서 배너 시트가 포함될 수 있음을 의미합니다. 배너 시트는 문서의 첫 번째 시트로 나타나야 합니다. https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet |
| [DocumentBannerSheetSource](./documentbannersheetsource/) | 사용자 정의 배너 시트의 소스를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheetsource |
| [DocumentBinding](./documentbinding/) | 바인딩 방법을 설명합니다. 각 문서는 별도로 바인딩됩니다. DocumentBinding 및 JobBindAllDocuments는 상호 배타적입니다. 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding |
| [DocumentBindingGutter](./documentbindinggutter/) | 바인딩 여백의 너비를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbindinggutter |
| [DocumentCollate](./documentcollate/) | 출력의 조합 특성을 설명합니다. 각 개별 문서의 모든 페이지가 정렬됩니다. DocumentCollate 및 JobCollateAlldocuments는 상호 배타적입니다. 이 두 키워드 중 하나만 구현되는지 여부의 동작 및 구현은 드라이버에 맡겨져 있습니다. |
| [DocumentCopiesAllPages](./documentcopiesallpages/) | 문서의 사본 수를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcopiesallpages |
| [DocumentCoverBack](./documentcoverback/) | 뒤(끝) 표지를 설명합니다. 각 문서에는 별도의 시트가 있습니다. 표지는 용지에 인쇄해야 합니다.[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/) 그리고[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) 는 문서의 마지막 페이지에 사용됩니다. 표지는 처리 옵션 (예:[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/) ,[`DocumentNUp`](../aspose.page.xps.xpsmetadata/documentnup/) ) 지정된 옵션으로 표시됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback |
| [DocumentCoverBackSource](./documentcoverbacksource/) | 사용자 정의 뒷표지의 소스를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverbacksource |
| [DocumentCoverFront](./documentcoverfront/) | 앞(시작) 표지를 설명합니다. 각 문서에는 별도의 시트가 있습니다. 표지는 용지에 인쇄해야 합니다.[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/) 그리고[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) 는 문서의 첫 페이지에 사용됩니다. 표지는 처리 옵션 (예:[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/) ,[`DocumentNUp`](../aspose.page.xps.xpsmetadata/documentnup/) ) 지정된 옵션으로 표시됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront |
| [DocumentCoverFrontSource](./documentcoverfrontsource/) | 사용자 지정 앞표지의 소스를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfrontsource |
| [DocumentDuplex](./documentduplex/) | 출력의 이중 특성을 설명합니다. 양면 인쇄 기능을 사용하면 용지 양면에 for 인쇄가 가능합니다. 각 문서는 별도로 이중화됩니다. DocumentDuplex 및 JobDuplexAllDocumentsContiguously는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/ documentduplex |
| [DocumentHolePunch](./documentholepunch/) | 출력의 홀 펀칭 특성을 설명합니다. 각 문서는 별도로 펀칭됩니다. The[`JobHolePunch`](../aspose.page.xps.xpsmetadata/jobholepunch/) 그리고[`DocumentHolePunch`](../aspose.page.xps.xpsmetadata/documentholepunch/) 키워드는 상호 배타적입니다. PrintTicket 또는 인쇄 기능 문서에서 둘 다 동시에 지정하면 안 됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch |
| [DocumentID](./documentid/) | 문서의 고유 ID를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentid |
| [DocumentImpositionColor](./documentimpositioncolor/) | 지정된 명명된 색상으로 레이블이 지정된 응용 프로그램 콘텐츠는 모든 색상 분판에 나타나야 합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentimpositioncolor |
| [DocumentInputBin](./documentinputbin/) | 장치에 설치된 입력 빈 또는 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. The[`JobInputBin`](../aspose.page.xps.xpsmetadata/jobinputbin/) ,[`DocumentInputBin`](../aspose.page.xps.xpsmetadata/documentinputbin/) , 그리고[`PageInputBin`](../aspose.page.xps.xpsmetadata/pageinputbin/) 키워드는 상호 배타적입니다. 둘 다 PrintTicket 또는 인쇄 기능 문서에서 동시에 지정하면 안 됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin |
| [DocumentName](./documentname/) | 문서를 설명하는 이름을 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentname |
| [DocumentNUp](./documentnup/) | 단일 물리적 시트에 대한 여러 논리적 페이지의 출력 및 형식을 설명합니다. 각 문서는 개별적으로 컴파일됩니다. 그리고[`JobNUpAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/) 는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup |
| [DocumentOutputBin](./documentoutputbin/) | 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. 문서별로 output bin을 지정할 수 있습니다. 그만큼[`JobOutputBin`](../aspose.page.xps.xpsmetadata/joboutputbin/) ,[`DocumentOutputBin`](../aspose.page.xps.xpsmetadata/documentoutputbin/) and [`PageOutputBin`](../aspose.page.xps.xpsmetadata/pageoutputbin/) 키워드는 상호 배타적이며 오직 하나만 PrintTicket 또는 인쇄 기능 문서에 지정되어야 합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin |
| [DocumentPageRanges](./documentpageranges/) | 문서의 출력 범위를 페이지 단위로 설명합니다. 매개변수 값은 다음 구조를 따라야 합니다. - PageRangeText: "PageRange" 또는 "PageRange,PageRange" - PageRange: "PageNumber" 또는 "PageNumber-PageNumber" - PageNumber: 1~N, 여기서 N은 PageNumber &gt; N이면 PageNumber = N입니다. 문자열의 공백은 무시해야 합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges |
| [DocumentPrintTicket](./documentprintticket/) | 문서 수준 인쇄 티켓을 캡슐화하는 클래스입니다. |
| [DocumentRollCut](./documentrollcut/) | 롤 용지 절단 방법을 설명합니다. 각 문서는 개별적으로 처리됩니다. 지정된 옵션은 롤 컷의 다양한 방법을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentrollcut |
| [DocumentSeparatorSheet](./documentseparatorsheet/) | 문서의 구분 시트 사용을 설명합니다. 구분 시트는 아래 지정된 옵션에 표시된 대로 출력에 나타나야 합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentseparatorsheet |
| [DocumentStaple](./documentstaple/) | 출력의 스테이플링 특성을 설명합니다. 각 문서는 별도로 스테이플됩니다. The[`JobStapleAllDocuments`](../aspose.page.xps.xpsmetadata/jobstaplealldocuments/) 그리고[`DocumentStaple`](../aspose.page.xps.xpsmetadata/documentstaple/)키워드는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple |
| [DocumentURI](./documenturi/) | 문서에 대한 URI(Uniform Resource Identifier)를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documenturi |
| [Duplex](./duplex/) | 의 기본 클래스[`JobDuplexAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobduplexalldocumentscontiguously/) 그리고[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/) 기능 클래스. |
| [Feature](./feature/) | 일반적인 인쇄 스키마 기능을 캡슐화하는 클래스입니다. 모든 스키마 정의 기능의 기본 클래스입니다. A 요소에는 전체 목록이 포함되어 있습니다.[`Option`](../aspose.page.xps.xpsmetadata/option/) 그리고[`Property`](../aspose.page.xps.xpsmetadata/property/) 장치 속성, 작업 형식 설정 또는 기타 관련 특성을 완전히 설명하는 요소. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature |
| [HolePunch](./holepunch/) | 의 기본 클래스[`JobHolePunch`](../aspose.page.xps.xpsmetadata/jobholepunch/) 그리고[`DocumentHolePunch`](../aspose.page.xps.xpsmetadata/documentholepunch/) 기능 클래스. |
| [IDProperty](./idproperty/) | 의 기본 클래스[`JobID`](../aspose.page.xps.xpsmetadata/jobid/) 그리고[`DocumentID`](../aspose.page.xps.xpsmetadata/documentid/)속성 클래스. |
| [InputBin](./inputbin/) | 의 기본 클래스[`JobInputBin`](../aspose.page.xps.xpsmetadata/jobinputbin/) ,[`DocumentInputBin`](../aspose.page.xps.xpsmetadata/documentinputbin/) 및[`PageInputBin`](../aspose.page.xps.xpsmetadata/pageinputbin/) 기능 클래스. |
| [IntegerParameterInit](./integerparameterinit/) | 모든 정수 매개변수 이니셜라이저의 기본 클래스. |
| [IntegerValue](./integervalue/) | PrintTicket 문서에서 Integer 값을 캡슐화하는 클래스입니다. |
| [JobAccountingSheet](./jobaccountingsheet/) | 작업에 대해 출력할 회계 시트를 설명합니다. 회계 시트는 default 에 출력되어야 합니다.[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/) 그리고 기본값을 사용하여[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) . 회계 시트는 작업의 나머지 부분에서 to 격리되어야 합니다. 즉, 마무리 또는 처리 옵션(예: , , 또는 ) 회계 시트를 포함해서는 안 됩니다. 회계 시트는 구현자의 재량에 따라 작업의 첫 페이지 또는 마지막 페이지로 나타날 수 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet |
| [JobBindAllDocuments](./jobbindalldocuments/) | 바인딩 방법을 설명합니다. 작업의 모든 문서가 함께 묶여 있습니다. [`JobBindAllDocuments`](../aspose.page.xps.xpsmetadata/jobbindalldocuments/) 그리고[`DocumentBinding`](../aspose.page.xps.xpsmetadata/documentbinding/) 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobbindalldocuments |
| [JobBindAllDocumentsGutter](./jobbindalldocumentsgutter/) | 바인딩 여백의 너비를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobbindalldocumentsgutter |
| [JobCollateAllDocuments](./jobcollatealldocuments/) | 출력의 조합 특성을 설명합니다. 각 개별 작업의 모든 문서가 정렬됩니다. [`DocumentCollate`](../aspose.page.xps.xpsmetadata/documentcollate/) 그리고[`JobCollateAllDocuments`](../aspose.page.xps.xpsmetadata/jobcollatealldocuments/)상호 배타적입니다. 이러한 키워드 중 하나만 구현되는지 여부의 동작 및 구현은 드라이버에 맡겨집니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobcollatealldocuments |
| [JobComment](./jobcomment/) | 작업과 관련된 설명을 지정합니다. 예: "완료되면 1234호로 배달해 주십시오.". https://docs.microsoft.com/en-us/windows/win32/printdocs/jobcomment |
| [JobCopiesAllDocuments](./jobcopiesalldocuments/) | 작업 사본 수를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobcopiesalldocuments |
| [JobDeviceLanguage](./jobdevicelanguage/) | 드라이버에서 물리적 장치로 데이터를 보내는 데 지원되는 장치 언어를 설명합니다. 이것은 종종 "페이지 설명 언어"라고 합니다. 이 키워드는 드라이버 및 물리적 장치에서 지원하는 페이지 description 언어를 정의합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobdevicelanguage |
| [JobDigitalSignatureProcessing](./jobdigitalsignatureprocessing/) | 전체 작업에 대한 디지털 서명 처리 구성을 설명합니다. 디지털 서명이 포함된 콘텐츠에만 적용됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobdigitalsignatureprocessing |
| [JobDuplexAllDocumentsContiguously](./jobduplexalldocumentscontiguously/) | 출력의 이중 특성을 설명합니다. 양면 인쇄 기능을 사용하면 용지 양면에 인쇄할 수 있습니다. 작업의 모든 문서가 연속적으로 함께 양면 인쇄됩니다. [`JobDuplexAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobduplexalldocumentscontiguously/) 그리고[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/)상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobduplexalldocumentscontiguously |
| [JobErrorSheet](./joberrorsheet/) | 오류 시트 출력을 설명합니다. 전체 작업에는 단일 오류 시트가 있습니다. 오류 sheet 가 기본값으로 출력되어야 합니다.[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/) 그리고 기본값을 사용하여[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) . 오류 시트는 작업의 나머지 부분과 분리되어야 합니다. 즉, 마무리 또는 처리 옵션(예: , , 또는 ) 는 오류 시트를 포함하지 않아야 합니다. 오류 시트는 작업의 최종 시트로 발생해야 합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet |
| [JobErrorSheetSource](./joberrorsheetsource/) | 사용자 지정 오류 시트의 소스를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheetsource |
| [JobHolePunch](./jobholepunch/) | 출력의 홀 펀칭 특성을 설명합니다. 모든 문서가 함께 펀칭됩니다. The[`JobHolePunch`](../aspose.page.xps.xpsmetadata/jobholepunch/) 그리고[`DocumentHolePunch`](../aspose.page.xps.xpsmetadata/documentholepunch/)키워드는 상호 배타적입니다. PrintTicket 또는 인쇄 기능 문서에서 둘 다 동시에 지정하면 안 됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobholepunch |
| [JobID](./jobid/) | 작업의 고유 ID를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobid |
| [JobInputBin](./jobinputbin/) | 장치에 설치된 입력함 또는 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. 작업별로 입력함을 지정할 수 있습니다. 그만큼[`JobInputBin`](../aspose.page.xps.xpsmetadata/jobinputbin/) ,[`DocumentInputBin`](../aspose.page.xps.xpsmetadata/documentinputbin/) , 및[`PageInputBin`](../aspose.page.xps.xpsmetadata/pageinputbin/) 키워드는 상호 배타적입니다. 둘 다 PrintTicket 또는 인쇄 기능 문서에서 동시에 지정하면 안 됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobinputbin |
| [JobName](./jobname/) | 작업에 대한 설명 이름을 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobname |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/) | 단일 물리적 시트에 대한 여러 논리적 페이지의 출력을 설명합니다. job 의 모든 문서는 연속적으로 함께 컴파일됩니다.[`JobNUpAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/) 그리고[`DocumentNUp`](../aspose.page.xps.xpsmetadata/documentnup/) 는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously |
| [JobOptimalDestinationColorProfile](./joboptimaldestinationcolorprofile/) | 주어진 현재 장치 구성에 따라 최적의 색상 프로필을 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/joboptimaldestinationcolorprofile |
| [JobOutputBin](./joboutputbin/) | 장치에 설치된 출력 빈 또는 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. The[`JobOutputBin`](../aspose.page.xps.xpsmetadata/joboutputbin/) ,[`DocumentOutputBin`](../aspose.page.xps.xpsmetadata/documentoutputbin/) 그리고[`PageOutputBin`](../aspose.page.xps.xpsmetadata/pageoutputbin/) keywords 는 상호 배타적이며 하나만 PrintTicket 또는 인쇄 기능 문서에 지정해야 합니다. |
| [JobOutputOptimization](./joboutputoptimization/) | 지정된 옵션에 표시된 대로 특정 사용 시나리오에 대한 출력을 최적화하기 위한 작업 처리를 설명합니다. |
| [JobPageOrder](./jobpageorder/) | 출력에 대한 물리적 페이지의 순서를 정의합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobpageorder |
| [JobPrimaryBannerSheet](./jobprimarybannersheet/) | 작업에 대해 출력할 배너 시트를 설명합니다. 배너 시트는 default 에 출력되어야 합니다.[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/) 그리고 기본값을 사용하여[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) . 배너 시트는 작업의 나머지 부분과 분리되어야 합니다. 이는 마무리 또는 처리 옵션(예: [`JobDuplexAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobduplexalldocumentscontiguously/) ,[`JobStapleAllDocuments`](../aspose.page.xps.xpsmetadata/jobstaplealldocuments/) , 또는[`JobBindAllDocuments`](../aspose.page.xps.xpsmetadata/jobbindalldocuments/) ) 는 배너 시트를 포함하지 않아야 합니다. 배너 시트는 작업의 첫 번째 시트로 나타나야 합니다. |
| [JobPrimaryBannerSheetSource](./jobprimarybannersheetsource/) | 작업에 대한 기본 사용자 정의 배너 시트의 소스를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarybannersheetsource |
| [JobPrimaryCoverBack](./jobprimarycoverback/) | 뒤(끝) 표지를 설명합니다. 각 작업에는 별도의 기본 시트가 있습니다. 표지는[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/) 그리고[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) 는 작업의 마지막 페이지에 사용됩니다. 표지는 처리 옵션 (예:[`JobDuplexAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobduplexalldocumentscontiguously/) ,[`JobNUpAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/) ) 는 지정된 옵션으로 표시됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverback |
| [JobPrimaryCoverBackSource](./jobprimarycoverbacksource/) | 작업에 대한 사용자 정의 뒷표지 기본 시트의 소스를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverbacksource |
| [JobPrimaryCoverFront](./jobprimarycoverfront/) | 앞(시작) 표지를 설명합니다. 전체 작업에는 단일 기본 시트가 있습니다. 표지는[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/) 그리고[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) 는 작업의 첫 번째 페이지에 사용됩니다. 표지는 처리 옵션 (예:[`JobDuplexAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobduplexalldocumentscontiguously/) ,[`JobNUpAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/) ) 는 지정된 옵션으로 표시됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverfront |
| [JobPrimaryCoverFrontSource](./jobprimarycoverfrontsource/) | 작업에 대한 사용자 정의 앞표지 기본 시트의 소스를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverfrontsource |
| [JobPrintTicket](./jobprintticket/) | 작업 수준 인쇄 티켓을 캡슐화하는 클래스입니다. |
| [JobRollCutAtEndOfJob](./jobrollcutatendofjob/) | 롤 용지 절단 방법을 설명합니다. 작업이 끝나면 롤을 절단해야 합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobrollcutatendofjob |
| [JobStapleAllDocuments](./jobstaplealldocuments/) | 출력의 스테이플링 특성을 설명합니다. 작업의 모든 문서가 함께 스테이플됩니다. The[`JobStapleAllDocuments`](../aspose.page.xps.xpsmetadata/jobstaplealldocuments/) 그리고[`DocumentStaple`](../aspose.page.xps.xpsmetadata/documentstaple/) 키워드는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobstaplealldocuments |
| [JobURI](./joburi/) | 문서에 대한 URI(Uniform Resource Identifier)를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/joburi |
| [NameProperty](./nameproperty/) | 의 기본 클래스[`JobName`](../aspose.page.xps.xpsmetadata/jobname/) 그리고[`DocumentName`](../aspose.page.xps.xpsmetadata/documentname/)속성 클래스. |
| [NUp](./nup/) | 의 기본 클래스[`JobNUpAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/) 그리고[`DocumentNUp`](../aspose.page.xps.xpsmetadata/documentnup/) 기능 클래스. |
| [Option](./option/) | 공통 PrintTicket을 구현하는 클래스 . 모든 스키마 정의 옵션의 기본 클래스입니다. Option 요소에는[`Property`](../aspose.page.xps.xpsmetadata/property/) and [`ScoredProperty`](../aspose.page.xps.xpsmetadata/scoredproperty/) 이 옵션과 관련된 요소. https://docs.microsoft.com/en-us/windows/win32/printdocs/option |
| [OutputBin](./outputbin/) | 의 기본 클래스[`JobOutputBin`](../aspose.page.xps.xpsmetadata/joboutputbin/) ,[`DocumentOutputBin`](../aspose.page.xps.xpsmetadata/documentoutputbin/) 그리고[`PageOutputBin`](../aspose.page.xps.xpsmetadata/pageoutputbin/) 기능 클래스. |
| [PageBlackGenerationProcessing](./pageblackgenerationprocessing/) | CMYK 분판에 대한 검정색 생성 동작을 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblackgenerationprocessing |
| [PageBlackGenerationProcessingBlackInkLimit](./pageblackgenerationprocessingblackinklimit/) | 지정된 명명된 색상으로 레이블이 지정된 응용 프로그램 콘텐츠는 모든 색상 분판에 나타나야 합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblackgenerationprocessingblackinklimit |
| [PageBlackGenerationProcessingGrayComponentReplacementExtent](./pageblackgenerationprocessinggraycomponentreplacementextent/) | GCR이 적용하는 중간색(유채색)을 넘어서는 범위를 설명합니다. 0% = 균일한 구성 요소 교체, 100% = 회색 구성 요소 교체. https://docs.microsoft.com/en-us/windows/win32/printdocs /pageblackgenerationprocessinggraycomponentreplacementextent |
| [PageBlackGenerationProcessingGrayComponentReplacementLevel](./pageblackgenerationprocessinggraycomponentreplacementlevel/) | 수행할 회색 구성 요소 교체 비율을 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblackgenerationprocessinggraycomponentreplacementlevel |
| [PageBlackGenerationProcessingGrayComponentReplacementStart](./pageblackgenerationprocessinggraycomponentreplacementstart/) | GCR이 시작되어야 하는 "하이라이트에서 섀도우" 범위의 지점을 설명합니다(가장 어두운 100%). https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblackgenerationprocessinggraycomponentreplacementstart |
| [PageBlackGenerationProcessingTotalInkCoverageLimit](./pageblackgenerationprocessingtotalinkcoveragelimit/) | 이미지의 네 가지 잉크 적용 범위의 최대 허용 합계를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblackgenerationprocessingtotalinkcoveragelimit |
| [PageBlackGenerationProcessingUnderColorAdditionLevel](./pageblackgenerationprocessingundercoloradditionlevel/) | GCR/UCR이 생성한 영역에 추가할 유채색 잉크의 양(회색 구성 요소 비율)을 설명합니다. .com/en-us/windows/win32/printdocs/pageblackgenerationprocessingundercoloradditionlevel |
| [PageBlackGenerationProcessingUnderColorAdditionStart](./pageblackgenerationprocessingundercoloradditionstart/) | 아래에서 UCA가 적용될 그림자 수준을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblackgenerationprocessingundercoloradditionstart |
| [PageBlendColorSpace](./pageblendcolorspace/) | 혼합 작업에 사용해야 하는 색상 공간을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblendcolorspace |
| [PageBlendColorSpaceICCProfileURI](./pageblendcolorspaceiccprofileuri/) | 블렌딩에 사용해야 하는 색상 공간을 정의하는 ICC 프로필에 대한 상대 URI 참조를 지정합니다. &lt;Uri&gt;는 패키지 루트에 상대적인 절대 part_name입니다. https://docs.microsoft.com/en-us /windows/win32/printdocs/pageblendcolorspaceiccprofileuri |
| [PageBorderless](./pageborderless/) | 이미지 콘텐츠를 미디어의 물리적 가장자리에 인쇄해야 하는 경우를 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageborderless |
| [PageColorManagement](./pagecolormanagement/) | 현재 페이지에 대한 색상 관리를 구성합니다. SHIM - DM_ICMMethod 시스템 추가에서 자동으로 간주됩니다. 색상 관리를 수행해야 하는 구성 요소(예: 드라이버)를 설명합니다. https://docs.microsoft.com/en-us/windows /win32/printdocs/pagecolormanagement |
| [PageCopies](./pagecopies/) | 페이지의 복사본 수를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagecopies |
| [PageDestinationColorProfile](./pagedestinationcolorprofile/) | 대상 색상 프로필의 특성을 정의합니다. 응용 프로그램 또는 드라이버가 사용할 대상 색상 프로필을 선택하는지 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedestinationcolorprofile |
| [PageDestinationColorProfileEmbedded](./pagedestinationcolorprofileembedded/) | 포함된 대상 색상 프로필을 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedestinationcolorprofileembedded |
| [PageDestinationColorProfileURI](./pagedestinationcolorprofileuri/) | XPS 문서에 포함된 ICC 프로필에 대한 상대 URI 참조를 지정합니다. 이 옵션의 처리는 PageDeviceColorSpaceUsage 기능의 설정에 따라 다릅니다. 해당 프로필을 사용하는 모든 요소는 이미 적절한 장치 색 공간, 드라이버나 장치에서 색상이 관리되지 않습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedestinationcolorprofileuri |
| [PageDeviceColorSpaceProfileURI](./pagedevicecolorspaceprofileuri/) | XPS 문서에 포함된 ICC 프로필에 대한 패키지 루트에 대한 상대 URI를 지정합니다. 이 옵션의 처리는 PageDeviceColorSpaceUsage 기능의 설정에 따라 다릅니다. 해당 프로필을 사용하는 모든 요소는 이미 적절한 장치 색상에 있는 것으로 간주됩니다. space, 및 드라이버 또는 장치에서 색상을 관리하지 않습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedevicecolorspaceprofileuri |
| [PageDeviceColorSpaceUsage](./pagedevicecolorspaceusage/) | 와 함께[`PageDeviceColorSpaceProfileURI`](../aspose.page.xps.xpsmetadata/pagedevicecolorspaceprofileuri/) 매개변수, 이 매개변수는 장치 색상 공간에 표시되는 요소의 렌더링 동작을 정의합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedevicecolorspaceusage |
| [PageDeviceFontSubstitution](./pagedevicefontsubstitution/) | 장치 글꼴 대체의 활성화/비활성화 상태를 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedevicefontsubstitution |
| [PageForceFrontSide](./pageforcefrontside/) | 출력이 미디어 시트의 전면에 나타나도록 합니다. 각 면에 서로 다른 표면이 있는 미디어 시트와 관련이 있습니다. 이 기능이 처리 옵션(예: [`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/) ), 기능이 적용되는 specific 페이지에 우선합니다. |
| [PageICMRenderingIntent](./pageicmrenderingintent/) | ICC v2 사양에 정의된 렌더링 의도를 설명합니다. 이미지 또는 그래픽 요소에 렌더링 의도를 지정하는 내장된 프로필 가 있는 경우 이 값을 무시해야 합니다. https://docs.microsoft.com/en-us/ windows/win32/printdocs/pageicmrenderingintent |
| [PageImageableSize](./pageimageablesize/) | 레이아웃 및 렌더링을 위한 이미지 캔버스를 설명합니다. 이것은 on 를 기준으로 보고됩니다.[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/) 그리고[`PageOrientation`](../aspose.page.xps.xpsmetadata/pageorientation/) . https://docs.microsoft.com/en-us/windows/win32/printdocs/pageimageablesize |
| [PageInputBin](./pageinputbin/) | 장치에 설치된 입력함 또는 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. 페이지별로 입력함을 지정할 수 있습니다. 그만큼[`JobInputBin`](../aspose.page.xps.xpsmetadata/jobinputbin/) ,[`DocumentInputBin`](../aspose.page.xps.xpsmetadata/documentinputbin/) and [`PageInputBin`](../aspose.page.xps.xpsmetadata/pageinputbin/) 키워드는 상호 배타적입니다. PrintTicket 또는 인쇄 기능 문서에서 동시에 를 지정하면 안 됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin |
| [PageMediaColor](./pagemediacolor/) | 미디어 색상 옵션 및 각 옵션의 특성을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediacolor |
| [PageMediaSize](./pagemediasize/) | 출력에 사용되는 물리적 미디어 크기를 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasize |
| [PageMediaSizeMediaSizeHeight](./pagemediasizemediasizeheight/) | 치수를 지정합니다. 사용자 정의 방향 option. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizemediasizeheight |
| [PageMediaSizeMediaSizeWidth](./pagemediasizemediasizewidth/) | 치수를 지정합니다. 사용자 정의 방향 option. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizemediasizewidth |
| [PageMediaSizePSHeight](./pagemediasizepsheight/) | 피드 방향과 평행한 페이지 높이를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizepsheight |
| [PageMediaSizePSHeightOffset](./pagemediasizepsheightoffset/) | 피드 방향과 평행한 오프셋을 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizepsheightoffset |
| [PageMediaSizePSOrientation](./pagemediasizepsorientation/) | 피드 방향 방향에 상대적인 방향을 지정합니다 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizepsorientation |
| [PageMediaSizePSWidth](./pagemediasizepswidth/) | 피드 방향에 수직인 페이지 너비를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizepswidth |
| [PageMediaSizePSWidthOffset](./pagemediasizepswidthoffset/) | 피드 방향에 수직인 오프셋을 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizepswidthoffset |
| [PageMediaType](./pagemediatype/) | 설명 옵션 및 각 옵션의 특성. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediatype |
| [PageMirrorImage](./pagemirrorimage/) | 출력의 미러링 설정을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemirrorimage |
| [PageNegativeImage](./pagenegativeimage/) | 출력의 음수 설정을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagenegativeimage |
| [PageOrientation](./pageorientation/) | 물리적 미디어 시트의 방향을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageorientation |
| [PageOutputBin](./pageoutputbin/) | 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. 페이지별로 출력함을 지정할 수 있습니다. The[`JobOutputBin`](../aspose.page.xps.xpsmetadata/joboutputbin/) ,[`DocumentOutputBin`](../aspose.page.xps.xpsmetadata/documentoutputbin/) 그리고[`PageOutputBin`](../aspose.page.xps.xpsmetadata/pageoutputbin/) 키워드는 상호 배타적입니다. PrintTicket 또는 인쇄 기능 문서에는 하나만 지정해야 합니다. |
| [PageOutputColor](./pageoutputcolor/) | 출력에 대한 색상 설정의 특성을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputcolor |
| [PageOutputQuality](./pageoutputquality/) | 출력의 음수 설정을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputquality |
| [PagePhotoPrintingIntent](./pagephotoprintingintent/) | 사진 인쇄 설정 채우기를 위해 드라이버에 대한 높은 수준의 의도를 나타냅니다. 이러한 설정은 사용자가 사진을 인쇄할 때 지정할 수 있는 예상 출력 품질을 처리합니다. https://docs.microsoft.com/en-us/windows /win32/printdocs/pagephotoprintingintent |
| [PagePoster](./pageposter/) | 단일 페이지의 출력을 여러 물리적 미디어 시트로 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageposter |
| [PagePrintTicket](./pageprintticket/) | 페이지 수준 인쇄 티켓을 캡슐화하는 클래스입니다. |
| [PageResolution](./pageresolution/) | 인쇄 출력의 페이지 해상도를 질적 값이나 인치당 도트 수 또는 둘 다로 정의합니다. |
| [PageScaling](./pagescaling/) | 출력의 크기 조정 특성을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescaling |
| [PageScalingOffsetHeight](./pagescalingoffsetheight/) | 에서 스케일링 오프셋을 지정합니다. 사용자 지정 크기 조정 방향. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescalingoffsetheight |
| [PageScalingOffsetWidth](./pagescalingoffsetwidth/) | 에서 스케일링 오프셋을 지정합니다. 사용자 지정 크기 조정 방향. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescalingoffsetwidth |
| [PageScalingScale](./pagescalingscale/) | 사용자 정의 사각형 배율 조정을 위한 배율 인수를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescalingscale |
| [PageScalingScaleHeight](./pagescalingscaleheight/) | 에서 배율 인수를 지정합니다. 사용자 정의 배율 방향. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescalingscaleheight |
| [PageScalingScaleWidth](./pagescalingscalewidth/) | 에서 배율 인수를 지정합니다. 사용자 지정 크기 조정 방향. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescalingscalewidth |
| [PageSourceColorProfile](./pagesourcecolorprofile/) | 원본 색상 프로필의 특성을 정의합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagesourcecolorprofile |
| [PageSourceColorProfileEmbedded](./pagesourcecolorprofileembedded/) | 포함된 소스 색상 프로필을 지정합니다. |
| [PageSourceColorProfileURI](./pagesourcecolorprofileuri/) | 색상 프로파일의 소스를 지정합니다. |
| [PageTrueTypeFontMode](./pagetruetypefontmode/) | 사용할 TrueType 글꼴 처리 방법을 설명합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagetruetypefontmode |
| [PageWatermark](./pagewatermark/) | 출력의 워터마크 설정 및 워터마크 특성을 설명합니다. watermarks apply 는 물리적 페이지가 아닌 논리적 페이지에 적용됩니다. 예를 들어,[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/) 활성화되면 각각에 워터마크가 나타납니다. 각 시트의 페이지. 만약에[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/) , =2이면 각 시트에 2개의 워터마크가 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark |
| [PageWatermarkOriginHeight](./pagewatermarkoriginheight/) | 워터마크의 원본을 기준으로 워터마크의 원본을 지정합니다.. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarkoriginheight |
| [PageWatermarkOriginWidth](./pagewatermarkoriginwidth/) | 워터마크의 원본을 기준으로 워터마크의 원본을 지정합니다. . https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarkoriginwidth |
| [PageWatermarkTextAngle](./pagewatermarktextangle/) | 워터마크 텍스트의 각도를 지정합니다. direction. 각도는 시계 반대 방향으로 측정됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktextangle |
| [PageWatermarkTextColor](./pagewatermarktextcolor/) | 워터마크 텍스트의 sRGB 색상을 정의합니다. 형식은 ARGB: #AARRGGBB. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktextcolor |
| [PageWatermarkTextFontSize](./pagewatermarktextfontsize/) | 워터마크 텍스트에 사용 가능한 글꼴 크기를 정의합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktextfontsize |
| [PageWatermarkTextText](./pagewatermarktexttext/) | 워터마크의 텍스트를 지정합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktexttext |
| [PageWatermarkTransparency](./pagewatermarktransparency/) | 워터마크의 투명도를 지정합니다. 완전히 불투명한 값은 0. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktransparency |
| [ParameterInit](./parameterinit/) | 공통 PrintTicket 매개변수 이니셜라이저를 구현하는 클래스입니다. 모든 스키마 정의 매개변수 이니셜라이저의 기본 클래스입니다. 요소. A 요소는 a에 의해 만들어진 참조의 대상입니다.[`ParameterRef`](../aspose.page.xps.xpsmetadata/parameterref/) element. https://docs.microsoft.com/en-us/windows/win32/printdocs/parameterinit |
| [ParameterRef](./parameterref/) | 공통 PrintTicket 매개변수 참조를 구현하는 클래스입니다. A 요소는 a에 대한 참조를 정의합니다.[`ParameterInit`](../aspose.page.xps.xpsmetadata/parameterinit/)요소. A[`ScoredProperty`](../aspose.page.xps.xpsmetadata/scoredproperty/) ParameterRef 요소를 포함하는 요소는 명시적으로 설정되지 않은 [`Value`](../aspose.page.xps.xpsmetadata/value/) 요소. 대신,[`ScoredProperty`](../aspose.page.xps.xpsmetadata/scoredproperty/) element 는[`ParameterInit`](../aspose.page.xps.xpsmetadata/parameterinit/) 참조하는 요소 element. https://docs.microsoft.com/en-us/windows/win32/printdocs/parameterref |
| [PrintTicket](./printticket/) | 모든 범위의 공통 PrintTicket을 구현하는 클래스입니다. 작업, 문서 및 페이지 수준 인쇄 티켓의 기본 클래스입니다. A요소는 PrintTicket 문서의 루트 요소입니다. A 요소에는 작업을 출력하는 데 필요한 모든 작업 형식 정보가 포함되어 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/printticket |
| [PrintTicketElement](./printticketelement/) | 인쇄 스키마 요소일 수 있는 클래스의 기본 클래스입니다. |
| [Property](./property/) | 공통 PrintTicket을 구현하는 클래스 . 모든 스키마 정의 속성의 기본 클래스. A 요소는 장치, 작업 형식 또는 이름 속성에 의해 이름이 제공되는 기타 관련 property 를 선언합니다. ㅏ[`Value`](../aspose.page.xps.xpsmetadata/value/) 요소는 assign 값을. A 복잡할 수 있으며 여러 하위 속성을 포함할 수 있습니다. 하위 속성은 다음으로도 표시됩니다. elements. https://docs.microsoft.com/en-us/windows/win32/printdocs/property |
| [QNameValue](./qnamevalue/) | PrintTicket 문서에서 QName 값을 캡슐화하는 클래스입니다. |
| [RollCut](./rollcut/) | 의 기본 클래스[`JobRollCutAtEndOfJob`](../aspose.page.xps.xpsmetadata/jobrollcutatendofjob/) 그리고[`DocumentRollCut`](../aspose.page.xps.xpsmetadata/documentrollcut/) 기능 클래스. |
| [ScoredProperty](./scoredproperty/) | 공통 PrintTicket을 구현하는 클래스 . 모든 스키마 정의 채점 속성의 기본 클래스입니다. A 요소는 an 에 고유한 속성을 선언합니다.[`Option`](../aspose.page.xps.xpsmetadata/option/) 정의. 이러한 속성은 평가 할 때 비교되어야 합니다.[`Option`](../aspose.page.xps.xpsmetadata/option/) 장치 지원과 일치[`Option`](../aspose.page.xps.xpsmetadata/option/) . https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty |
| [SelectionType](./selectiontype/) | SelectionType PrintTicket 속성에 대한 편의 클래스입니다. |
| [Staple](./staple/) | 의 기본 클래스[`JobStapleAllDocuments`](../aspose.page.xps.xpsmetadata/jobstaplealldocuments/) 그리고[`DocumentStaple`](../aspose.page.xps.xpsmetadata/documentstaple/) 기능 클래스. |
| [StringParameterInit](./stringparameterinit/) | 모든 문자열 매개변수 이니셜라이저의 기본 클래스. |
| [StringValue](./stringvalue/) | PrintTicket 문서에서 문자열 값을 캡슐화하는 클래스입니다. |
| [URIProperty](./uriproperty/) | 의 기본 클래스[`JobURI`](../aspose.page.xps.xpsmetadata/joburi/) 그리고[`DocumentURI`](../aspose.page.xps.xpsmetadata/documenturi/)속성 클래스. |
| [Value](./value/) | 를 캡슐화하는 기본 클래스[`Property`](../aspose.page.xps.xpsmetadata/property/) 또는[`ScoredProperty`](../aspose.page.xps.xpsmetadata/scoredproperty/) PrintTicket 문서의 값. 값 요소는 리터럴을 유형과 연결합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/value |
## 인터페이스

| 상호 작용 | 설명 |
| --- | --- |
| [IDocumentPrintTicketItem](./idocumentprintticketitem/) | 문서 접두어 인쇄 티켓 항목의 인터페이스입니다. |
| [IFeatureItem](./ifeatureitem/) | 인쇄 스키마일 수 있는 클래스의 기본 인터페이스[`Feature`](../aspose.page.xps.xpsmetadata/feature/) 항목. |
| [IJobPrintTicketItem](./ijobprintticketitem/) | 작업 접두사 인쇄 티켓 항목의 인터페이스입니다. |
| [IOptionItem](./ioptionitem/) | 인쇄 스키마일 수 있는 클래스의 인터페이스[`Option`](../aspose.page.xps.xpsmetadata/option/) 항목. |
| [IPagePrintTicketItem](./ipageprintticketitem/) | 페이지 접두사 인쇄 티켓 항목의 인터페이스입니다. |
| [IPrintTicketElementChild](./iprintticketelementchild/) | 인쇄 스키마 요소의 하위 요소에 대한 기본 인터페이스입니다. |
| [IPrintTicketItem](./iprintticketitem/) | 될 수 있는 클래스의 기본 인터페이스[`PrintTicket`](../aspose.page.xps.xpsmetadata/printticket/) 루트 요소 항목. 범위 지정 접두사를 정의하는 인터페이스의 기본 인터페이스이기도 합니다. |
| [IPropertyItem](./ipropertyitem/) | PrintTicket일 수 있는 클래스의 기본 인터페이스[`Property`](../aspose.page.xps.xpsmetadata/property/) 항목. |
| [IScoredPropertyItem](./iscoredpropertyitem/) | PrintTicket일 수 있는 클래스의 기본 인터페이스[`ScoredProperty`](../aspose.page.xps.xpsmetadata/scoredproperty/) 항목. |


