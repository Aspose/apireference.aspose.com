---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions 클래스"
linktitle: "PdfSaveOptions"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions 클래스. C++에서 XPS를 PDF로 저장하기 위한 옵션 클래스."
type: docs
weight: 300
url: /ko/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


XPS를 PDF로 저장하기 위한 옵션 클래스.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | 노드 간에 전달할 페이지 부분의 크기를 지정합니다. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | 저장되기 직전에 [XPS](../../aspose.page.xps/) 페이지를 수정하는 이벤트 핸들러 컬렉션입니다. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | 암호화 세부 정보를 가져옵니다. 설정되지 않으면 암호화가 수행되지 않습니다. |
| [get_ImageCompression](./get_imagecompression/)() const | 문서의 모든 이미지에 사용될 압축 유형을 지정합니다. 기본값은 [PdfImageCompression::Auto](../pdfimagecompression/)입니다. |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | PDF 파일을 뷰어에서 열었을 때 문서 개요가 확장될 최대 레벨을 지정합니다. 1 - 첫 번째 레벨 항목만 표시, 2 - 첫 번째와 두 번째 레벨 항목이 표시되는 식입니다. 기본값은 1입니다. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | 저장할 문서 개요 트리의 높이를 지정합니다. 0 - 개요 트리가 변환되지 않으며, 1 - 첫 번째 레벨 항목만 변환되고, 이후로도 마찬가지입니다. 기본값은 10입니다. |
| [get_PageNumbers](./get_pagenumbers/)() override | 변환할 페이지 번호 배열을 가져오거나 설정합니다. |
| [get_PreserveText](./get_preservetext/)() override | [XPS](../../aspose.page.xps/)에서 일부 텍스트 요소는 글꼴의 문자 코드와 일치하지 않는 대체 글리프 형태에 대한 참조를 포함할 수 있습니다. 이 플래그가 true로 설정되면 해당 [XPS](../../aspose.page.xps/) 요소의 텍스트가 그래픽 형태로 변환됩니다. 그러면 텍스트 자체는 위에 투명하게 표시되지만, 해당 요소의 텍스트는 선택할 수 있게 됩니다. 그러나 부작용으로 출력 파일이 원본보다 훨씬 커질 수 있습니다. 이 플래그가 false로 설정되면 대체 형태로 표시되어야 할 문자는 다른 문자로 대체되어 대체 글리프 형태에 매핑됩니다. 따라서 텍스트는 여전히 선택 가능하지만 수정되어 읽기 어려워질 가능성이 있습니다. 기본값은 false입니다. |
| [get_TextCompression](./get_textcompression/)() const | 문서 개요에서 [ApsBookmark](../) 객체를 표시할 레벨을 지정합니다. 0 - 표시되지 않음. 1 - 첫 번째 레벨에서 표시되고 이후에도 마찬가지입니다. 기본값은 0입니다. |
| [PdfSaveOptions](./pdfsaveoptions/)() | 옵션의 새 인스턴스를 생성합니다. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | 노드 간에 전달할 페이지 부분의 크기를 지정합니다. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | 암호화 세부 정보를 설정합니다. 설정되지 않으면 암호화가 수행되지 않습니다. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | 문서의 모든 이미지에 사용될 압축 유형을 지정합니다. 기본값은 [PdfImageCompression::Auto](../pdfimagecompression/)입니다. |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | PDF 파일을 뷰어에서 열었을 때 문서 개요가 확장될 최대 레벨을 지정합니다. 1 - 첫 번째 레벨 항목만 표시, 2 - 첫 번째와 두 번째 레벨 항목이 표시되는 식입니다. 기본값은 1입니다. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | 저장할 문서 개요 트리의 높이를 지정합니다. 0 - 개요 트리가 변환되지 않으며, 1 - 첫 번째 레벨 항목만 변환되고, 이후로도 마찬가지입니다. 기본값은 10입니다. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | 변환할 페이지 번호 배열을 가져오거나 설정합니다. |
| [set_PreserveText](./set_preservetext/)(bool) override | [XPS](../../aspose.page.xps/)에서 일부 텍스트 요소는 글꼴의 문자 코드와 일치하지 않는 대체 글리프 형태에 대한 참조를 포함할 수 있습니다. 이 플래그가 true로 설정되면 해당 [XPS](../../aspose.page.xps/) 요소의 텍스트가 그래픽 형태로 변환됩니다. 그러면 텍스트 자체는 위에 투명하게 표시되지만, 해당 요소의 텍스트는 선택할 수 있게 됩니다. 그러나 부작용으로 출력 파일이 원본보다 훨씬 커질 수 있습니다. 이 플래그가 false로 설정되면 대체 형태로 표시되어야 할 문자는 다른 문자로 대체되어 대체 글리프 형태에 매핑됩니다. 따라서 텍스트는 여전히 선택 가능하지만 수정되어 읽기 어려워질 가능성이 있습니다. 기본값은 false입니다. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | 문서 개요에서 [ApsBookmark](../) 객체를 표시할 레벨을 지정합니다. 0 - 표시되지 않음. 1 - 첫 번째 레벨에서 표시되고 이후에도 마찬가지입니다. 기본값은 0입니다. |
## 또 보기

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
